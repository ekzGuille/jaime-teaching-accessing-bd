package com.jaime.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface Motor {
  Connection connect();

  int execute(PreparedStatement pst);

  ResultSet executeQuery(PreparedStatement pst);

  void disconnect();

}
