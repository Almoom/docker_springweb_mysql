//package com.example.servingwebcontent;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.List;
//
//public class DbHandler {
//
//    static JdbcTemplate jdbcTemplate;
//
//    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
//    public static void createConnection() throws SQLException
//    {
//        jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(mysqlDataSource());
////        jdbcTemplate.execute("SHOW DATABASES;");
////        List<Test> tests = jdbcTemplate.query("SHOW DATABASES;", new BeanPropertyRowMapper(Test.class));
////        for (Test t : tests) { System.out.println(t.field); }
//        jdbcTemplate.execute("create schema public;");
//        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS public.t2 (" +
//                "                    c1 INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
//                "                    c2 VARCHAR(100)," +
//                "                    c3 VARCHAR(100) );");
//
//        jdbcTemplate.execute("DROP TABLE IF EXISTS public.t1;");
//
//        jdbcTemplate.execute("INSERT INTO public.t2 (c2,c3) VALUES('Sasha','Dima');");
//    }
//
//    public static DataSource mysqlDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
////        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
//        dataSource.setUrl("jdbc:mysql://192.168.99.105:3306/public");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//
////    public static void main(String[] args) throws SQLException {
////        createConnection();
////    }
//}
