package weeklytest3;

import java.sql.*;

public class UseJdbc {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
            String user = "root";
            String password = "1234";

            try(Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement("SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39");
                ResultSet res = pstmt.executeQuery()){

                while(res.next()) {
                    String name = res.getString("name");
                    int age = res.getInt("age");
                    String address = res.getString("address");

                    System.out.printf("Name: %s, Age: %d, Address: %s\n", name, age, address);
                }
            } catch(SQLException e) {
                System.out.println("SQL 오류 발생: " + e.getMessage());
            }
        } catch(Exception e) {
            System.out.println("드라이버를 불러오지 못 했습니다.");
        }
    }
}
