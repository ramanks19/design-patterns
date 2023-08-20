public class DatabaseManager {

    private static DatabaseManager instance;
    private String connectionString;

    private DatabaseManager(String connectionString) {
        this.connectionString = connectionString;
    }

    public static synchronized DatabaseManager getInstance(String connectionString) {
        if (instance == null) {
            instance = new DatabaseManager(connectionString);
        }
        return instance;
    }

    public void executeQuery(String query) {
        //Execute the query using the database connection
        System.out.println("Executing query: " + query);
    }

    //Other database related methods...
}