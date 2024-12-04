public static void addExpense(Scanner scanner) {
    Connection conn = connectToDatabase();
    if (conn != null) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO expenses (date, category, description, amount) VALUES (?, ?, ?, ?);")) {
            System.out.print("Enter date (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter description (optional): ");
            String description = scanner.nextLine();
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            stmt.setString(1, date);
            stmt.setString(2, category);
            stmt.setString(3, description);
            stmt.setDouble(4, amount);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Expense added successfully.");
            } else {
                System.out.println("Error adding expense.");
            }
        } catch (SQLException e) {
            System.err.println("Error adding expense: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}