import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;

    public DatabaseHandler() {
        createConnection();
        createPlayerTable();
    }

    public static DatabaseHandler getHandler(){
        if(handler == null){
            handler = new DatabaseHandler();
            return handler;
        }else{
            return handler;
        }
    }


    /**
     * Create Table "PlayerStats" to store data in, catch IOException
     */
    private void createPlayerTable() {
        String TABLE_NAME = "PLAYERSTATS";
        //Name,Team,Gamesplayed,Atbats, runs, hits, doubles, triples, homeruns, rbis
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + " ("
                        + "Name varchar(50) primary key, \n"
                        + "Team varchar(50), \n"
                        + "Gamesplayed Integer, \n"
                        + "AtBats Integer, \n"
                        + "runs Integer, \n"
                        + "hits Integer, \n"
                        + "doubles Integer, \n"
                        + "triples Integer, \n"
                        + "homeruns Integer, \n"
                        + "rbis Integer)";
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
     * Execute insert Statement
     * @param insertSQL
     * @return
     */
    public boolean insertAction(String insertSQL) {
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
     * Return Results from query passed in
     * @param query
     * @return
     */
    public ResultSet selectResults(String query){
        ResultSet resultSet;
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        return resultSet;
    }
}