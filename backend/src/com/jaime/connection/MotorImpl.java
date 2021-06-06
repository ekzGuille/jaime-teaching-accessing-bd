package com.jaime.connection;

import java.sql.*;

public abstract class MotorImpl implements Motor {

  private Connection con;
  private ResultSet rs;
  private PreparedStatement pst;

  protected String urlDB;
  protected String userDB;
  protected String passDB;
  protected String driverDB;

  public MotorImpl() {
  }

  public MotorImpl(String urlDB, String userDB, String passDB, String driverDB) {
    this.urlDB = urlDB;
    this.userDB = userDB;
    this.passDB = passDB;
    this.driverDB = driverDB;
  }

  @Override
  public Connection connect() {
    try {
      Class.forName(driverDB);
      con = DriverManager.getConnection(urlDB, userDB, passDB);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return con;
  }

  @Override
  public int execute(PreparedStatement pst) {
    int resp = 0;

    try {
      resp = pst.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return resp;
  }

  @Override
  public ResultSet executeQuery(PreparedStatement pst) {
    try {
      rs = pst.executeQuery();
    } catch (SQLException e) {

    }
    return rs;
  }

  @Override
  public void disconnect() {
    try {
      if (rs != null) {
        rs.close();
      }
      if (pst != null) {
        pst.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {

    }
  }
}
