package com.jaime.models;

public class Paciente {
  private String numSegSoc;
  private String nombre;
  private Integer totalVisitas;

  public Paciente() {

  }

  public Paciente(String numSegSoc, String nombre, Integer totalVisitas) {
    this.numSegSoc = numSegSoc;
    this.nombre = nombre;
    this.totalVisitas = totalVisitas;
  }

  public String getNumSegSoc() {
    return numSegSoc;
  }

  public void setNumSegSoc(String numSegSoc) {
    this.numSegSoc = numSegSoc;
  }

  public Paciente numbSegSoc(String numSegSoc) {
    this.numSegSoc = numSegSoc;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Paciente nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public Integer getTotalVisitas() {
    return totalVisitas;
  }

  public void setTotalVisitas(Integer totalVisitas) {
    this.totalVisitas = totalVisitas;
  }

  public Paciente totalVisitas(Integer totalVisitas) {
    this.totalVisitas = totalVisitas;
    return this;
  }

  @Override
  public String toString() {
    return "Paciente{" +
      "numSegSoc='" + numSegSoc + '\'' +
      ", nombre='" + nombre + '\'' +
      ", totalVisitas=" + totalVisitas +
      '}';
  }
}
