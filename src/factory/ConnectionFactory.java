/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        
        Connection conexao;
        try {
            return conexao = DriverManager.getConnection("jdc:mysql//localhost:8089/banco", "usuario", "senha");
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        
    }
    
}
