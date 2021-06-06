package com.jaime;

import com.jaime.dao.PacienteDaoImpl;
import com.jaime.models.Paciente;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    PacienteDaoImpl pDao = PacienteDaoImpl.getInstance();
    List<Paciente> pList = pDao.findAll();
    for (Paciente p : pList) {
      System.out.println(p);
    }
  }
}
