package com.jaime.connection;

public class MotorMySQL extends MotorImpl {

  private final String DRIVER = "jdbc:mysql://";
  private final String HOST = "localhost:3306";
  private final String BDNAME = "hospital";
  private final String TIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

  public MotorMySQL() {
    this.urlDB = DRIVER + HOST + "/" + BDNAME + TIMEZONE;
    this.userDB = "root";
    this.passDB = "admin";
    this.driverDB = "com.mysql.jdbc.Driver";
  }
}
