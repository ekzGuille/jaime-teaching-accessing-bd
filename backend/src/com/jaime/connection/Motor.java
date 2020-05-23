package com.jaime.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface Motor {
    public Connection connect();

    public int execute(PreparedStatement pst);

    public ResultSet executeQuery(PreparedStatement pst);

    public void disconnect();

}