/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author CEO
 */
public class Conexion {
    public DriverManagerDataSource Conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/registro");
        dataSource.setUsername("springboot");
        dataSource.setPassword("SpringBoot.21");
        return dataSource;
    }
}
