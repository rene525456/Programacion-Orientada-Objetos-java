package unl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import unl.conexionBD.Conexion;

public class ConversacionImplementacion implements ConversacionDao {

    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConverscionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionA) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public void registrarConverscionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionB) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }


}