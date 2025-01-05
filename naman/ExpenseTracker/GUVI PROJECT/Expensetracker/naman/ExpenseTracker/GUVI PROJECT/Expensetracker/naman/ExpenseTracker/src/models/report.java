public static void viewExpenses() {
    Connection conn = connectToDatabase();
    if (conn != null) {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM expenses;")) {
            System.out.println("Expenses:");
            System.out.println("----------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String date = rs.getString("date");
                String category = rs.getString("category");
                String description = rs.getString("description");
                double amount = rs.getDouble("amount");
                System.out.println("ID: " + id + ", Date: " + date + ", Category: " + category + ", Description: " + description + ", Amount: " + amount);
            }
            System.out.println("----------------------------------------");
        } catch (SQLException e) {
            System.err.println("Error retrieving expenses: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}