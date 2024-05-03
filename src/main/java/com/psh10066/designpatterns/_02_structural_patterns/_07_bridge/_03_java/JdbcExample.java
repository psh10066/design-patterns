package com.psh10066.designpatterns._02_structural_patterns._07_bridge._03_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {

        // Driver 구현체
        Class.forName("org.h2.Driver");

        // Bridge 패턴의 추상화. 새로운 DB가 생겨도 JDBC의 핵심적인 API가 바뀌지 않는다.
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = "CREATE TABLE  ACCOUNT " +
                "(id INTEGER not NULL, " +
                " email VARCHAR(255), " +
                " password VARCHAR(255), " +
                " PRIMARY KEY ( id ))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
