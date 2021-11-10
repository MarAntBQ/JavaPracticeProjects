package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/diario?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("springboot");
        dataSource.setPassword("SpringBoot.21");
        return dataSource;
    }
}