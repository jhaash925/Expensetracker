public static Connection connectToDatabase() {
    try {
        return DriverManager.getConnection(DB_URL);
    } catch (SQLException e) {
        System.err.println("Error connecting to database: " + e.getMessage());
        return null;
    }
}