package com.jaime.dao;

import com.jaime.connection.MotorImpl;
import com.jaime.connection.MotorMySQL;
import com.jaime.models.Paciente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDaoImpl implements Dao<Paciente, String> {

    private PreparedStatement pst;
    private MotorImpl motor;

    /* Comienzo patron singleton */
    private static PacienteDaoImpl d;

    private PacienteDaoImpl() {
        motor = new MotorMySQL();
    }

    public static PacienteDaoImpl getInstance() {
        if (d == null) {
            d = new PacienteDaoImpl();
        }
        return d;
    }
    /* Fin patron singleton */

    @Override
    public int create(Paciente bean) {
        String sql = "INSERT INTO `paciente` (`num_seg_soc`, `nombre`, `total_visitas`) VALUES (?, ?, ?)";
        int response = 0;

        try {
            pst = this.motor.connect().prepareStatement(sql);
            pst.setString(1, bean.getNumSegSoc());
            pst.setString(2, bean.getNombre());
            pst.setInt(3, bean.getTotalVisitas());

            response = this.motor.execute(pst);
        } catch (SQLException e) {

        } finally {
            motor.disconnect();
        }

        return response;
    }

    @Override
    public ArrayList<Paciente> findAll() {
        String sql = "SELECT * FROM `paciente`";
        ArrayList<Paciente> lstPacientes = null;

        try {

            pst = this.motor.connect().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            lstPacientes = new ArrayList<>();

            while (rs.next()) {
                Paciente p = new Paciente();
                p.setNumSegSoc(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setTotalVisitas(rs.getInt(3));

                lstPacientes.add(p);
            }

        } catch (SQLException e) {

        } finally {
            motor.disconnect();
        }

        return lstPacientes;
    }

    @Override
    public Paciente findById(String id) {
        return null;
    }

    @Override
    public int update(Paciente bean) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }
}
