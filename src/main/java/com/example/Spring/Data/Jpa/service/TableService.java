package com.example.Spring.Data.Jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TableService {

    @Autowired
    DataSource dataSource;

    public Map<String, List<String>> getAllTablesAndColumns() throws SQLException {
        Map<String, List<String>> tableColumnsMap = new HashMap<>();

        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();

            ResultSet resultSet = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                List<String> columnNames = new ArrayList<>();

                ResultSet columnsResultSet = metaData.getColumns(null, null, tableName, null);
                while (columnsResultSet.next()) {
                    String columnName = columnsResultSet.getString("COLUMN_NAME");
                    columnNames.add(columnName);
                }

                tableColumnsMap.put(tableName, columnNames);
            }
        }

        return tableColumnsMap;
    }
}
