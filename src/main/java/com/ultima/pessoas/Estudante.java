package com.ultima.pessoas;

public class Estudante extends Pessoa {
    private  String matricula;
    private double[] notas = new double[4];

    public Estudante(String nome) {
        super(nome);
    }
    public void consolidar (int unidade, double nota) {

    }

    public double calcularMediaFinal() {
        //TODO IMPLEMENTA
        return 0 ;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override // interface 
    public String verSituacao(int mes) {
        return null;
    }

    @Override // inteface
    public String relatorio() {
        return null;
    }


}
