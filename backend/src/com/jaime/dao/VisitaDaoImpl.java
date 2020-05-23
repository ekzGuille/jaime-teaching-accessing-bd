package com.jaime.dao;

import com.jaime.connection.MotorImpl;
import com.jaime.connection.MotorMySQL;
import com.jaime.models.Visita;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class VisitaDaoImpl implements Dao<Visita, Integer> {

    private PreparedStatement pst;
    private MotorImpl motor;

    /* Comienzo patron singleton */
    private static VisitaDaoImpl d;

    private VisitaDaoImpl() {
        motor = new MotorMySQL();
    }

    public static VisitaDaoImpl getInstance() {
        if (d == null) {
            d = new VisitaDaoImpl();
        }
        return d;
    }
    /* Fin patron singleton */

    @Override
    public int create(Visita bean) {
        String sql = "INSERT INTO  `visita` (`id_visita`, `num_paciente`, `motivo`, `medico`) VALUES (?, ?, ?, ?)";
        int response = 0;

        try {
            this.motor.connect().prepareStatement(sql);
            pst.setInt(1, bean.getIdVisita());
            pst.setString(2, bean.getNumPaciente());
            pst.setString(3, bean.getMotivo());
            pst.setString(4, bean.getMedico());

            response = this.motor.execute(pst);

        } catch (SQLException e) {

        } finally {
            this.motor.disconnect();
        }

        return response;
    }

    @Override
    public ArrayList<Visita> findAll() {
        return null;
    }

    @Override
    public Visita findById(Integer id) {
        return null;
    }

    @Override
    public int update(Visita bean) {
        String sql = "";
        int response = 0;

        try {
            this.motor.connect().prepareStatement(sql);

        } catch (SQLException e) {

        } finally {
            this.motor.disconnect();
        }

        return response;
    }

    @Override
    public int delete(Integer id) {
        String sql = "";
        int response = 0;

        try {
            this.motor.connect().prepareStatement(sql);

        } catch (SQLException e) {

        } finally {
            this.motor.disconnect();
        }

        return response;
    }
}
