package com.brendan.module5;

import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;

    public DatabaseHandler() {
        createConnection();
        createUserTable();

    }

    public static DatabaseHandler getHandler() {
        if(handler == null){
            handler = new DatabaseHandler();
            return handler;
        }else{
            return handler;
        }
    }


    /**
     * Create a table that stores user data.
     */
    private void createUserTable() {
        String TABLE_NAME = "USERTABLE";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + " ("
                        + "ID varchar(50) primary key, \n"
                        + "Password varchar(50))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Connect to Database
     */
    private void createConnection() {
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * insert a user to the database with given id and password
     * @param ID
     * @param Password
     * @return
     */
    public boolean addUser(String ID, String Password) {
        String insertSQL = "INSERT INTO USERTABLE VALUES (" +
                "'" + ID + "'," + "'" + Password + "'" + ")";

        try {
            stmt = conn.createStatement();
            stmt.execute(insertSQL);
            return true;

        } catch (SQLException throwables) {
            System.out.println(throwables);
            System.out.println("Did not enter data");
        }
        return false;
    }

    /**
     * CHeck if user id and password exist
     * @param ID
     * @param Password
     * @return
     * @throws SQLException
     */
    public boolean checkLogin(String ID, String Password) throws SQLException {
        ResultSet resultSet;
        String query = "SELECT * FROM USERTABLE WHERE ID = '" + ID + "' AND PASSWORD = '" + Password + "'";
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        int size = 0;
        while (resultSet.next()) {
            size++;
        }
        if (size == 0) {
            return false;
        } else {
           return true;
        }
    }
}