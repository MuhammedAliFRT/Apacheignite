package org.example;

import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.FieldsQueryCursor;
import org.apache.ignite.cache.query.SqlFieldsQuery;
import org.apache.ignite.client.ClientConnectionException;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.configuration.ClientConfiguration;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args){
        String jdbcURL = "jdbc:ignite:thin://127.0.0.1:32772/";


        try {
            Class.forName("org.apache.ignite.IgniteJdbcThinDriver");
            Connection connection = DriverManager.getConnection(jdbcURL);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM SUBSCRIBER");

            while (resultSet.next()){
                int subscId = resultSet.getInt("SUBSC_ID");
                String subsc_Name = resultSet.getString("SUBSC_NAME");
                String subsc_Surname = resultSet.getString("SUBSC_SURNAME");
                int tarıff_id = resultSet.getInt("TARIFF_ID");



                System.out.println(subscId + " " + subsc_Name + " " + subsc_Surname +" "+tarıff_id );
            }

        }catch(Expectation e){
            e.printStackTrace();
        } 
    }
}