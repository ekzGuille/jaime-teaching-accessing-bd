package com.jaime.models;

public class Visita {

    private Integer idVisita;
    private String numPaciente;
    private String motivo;
    private String medico;

    public Visita() {
    }

    public Visita(Integer idVisita, String numPaciente, String motivo, String medico) {
        this.idVisita = idVisita;
        this.numPaciente = numPaciente;
        this.motivo = motivo;
        this.medico = medico;
    }

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public Visita idVisita(Integer idVisita) {
        this.idVisita = idVisita;
        return this;
    }

    public String getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(String numPaciente) {
        this.numPaciente = numPaciente;
    }

    public Visita numPaciente(String numPaciente) {
        this.numPaciente = numPaciente;
        return this;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Visita motivo(String motivo) {
        this.motivo = motivo;
        return this;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Visita medico(String medico) {
        this.medico = medico;
        return this;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", numPaciente='" + numPaciente + '\'' +
                ", motivo='" + motivo + '\'' +
                ", medico='" + medico + '\'' +
                '}';
    }
}
