package co.edu.uniquindio.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String baseDatos="tucarrouq";
    String url="jdbc:mysql://localhost:3306/";
    String user="admin";
    String password="eeW3bc[i@)IZFiBr";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection connection;


    public Conexion(String baseDatos) {
        this.baseDatos=baseDatos;

    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            connection=DriverManager.getConnection(url+baseDatos, user, password);
            System.out.println("Conexion a base de datos exitosa" + " Bienvenido a la base de:" +baseDatos);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Problemas al conectar con base de datos");
        }
        return connection;

    }

    public void desconectar(){
        try {
            connection.close();
            System.out.println("Desconexion existosa");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problemas con desconectar la base de datos");
            
        }
    }

    public static void main(String[] args) {
        Conexion conexion=new Conexion("TuCarroUQ");
        conexion.conectar();
    }
}
