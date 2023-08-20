public class SingletonExample {
    
    public static void main(String[] args) {
        DatabaseManager dbManager1 = DatabaseManager.getInstance("jdbc:mysql://localhost:3306/mydb");
        DatabaseManager dbManager2 = DatabaseManager.getInstance("jdbc:postgresql://localhost:5432/mydb");

        dbManager1.executeQuery("SELECT * FROM users");
        dbManager2.executeQuery("SELECT * FROM products");
    }
}
