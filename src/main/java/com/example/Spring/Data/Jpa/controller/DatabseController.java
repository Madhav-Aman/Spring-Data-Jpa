package com.example.Spring.Data.Jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/db")
public class DatabseController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/getTables")
    public List<String> getTables(){

        List<String> tableNames = new ArrayList<>();

        try(Connection connection = dataSource.getConnection()){
            DatabaseMetaData metaData = connection.getMetaData();

            ResultSet resultSet = metaData.getTables(null,null,"%",new String[]{"TABLE"});
            while(resultSet.next()){
                tableNames.add(resultSet.getString("TABLE_NAME"));
            }

            return tableNames;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @GetMapping("/tables/columns")
    public Map<String,List<String>> getTableAndColumns()throws SQLException{
        Map<String, List<String>> tableAndColumn = new HashMap<>();

        try(Connection connection = dataSource.getConnection()){
            DatabaseMetaData metaData = connection.getMetaData();

            ResultSet resultSet = metaData.getTables(null,null,"%",new String[] {"TABLE"});
            while(resultSet.next()){
                String tableName = resultSet.getString("TABLE_NAME");

                ResultSet resultSet1 = metaData.getColumns(null,null,tableName,null);
                List<String> columnName = new ArrayList<>();
                while(resultSet1.next()){
                    columnName.add(resultSet1.getString("COLUMN_NAME"));
                }

                tableAndColumn.put(tableName,columnName);
            }
            return tableAndColumn;
        }
    }
}
