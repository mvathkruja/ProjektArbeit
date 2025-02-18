import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres?user=postgres.rikskdytghgmivyurgyt";
        String username = "postgres.rikskdytghgmivyurgyt";
        String password = "1Schueler";

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from books order by title asc");

        while (resultSet.next())
        {
            String columnValue = resultSet.getString("title");
            System.out.println("Column Value: " + columnValue);
        }

    }
}