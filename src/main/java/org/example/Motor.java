package org.example;

/*Ernani Batista Serafim*/

public class Motor {
    private int qtdPistao;
    private int potencia;

    // Construtor padrão
    public Motor() {
        this.qtdPistao = 0;
        this.potencia = 0;
    }

    public Motor(int qtdPistao, int potencia) {
        this.qtdPistao = qtdPistao;
        this.potencia = potencia;
    }

    public int getqtdPistao() {
        return qtdPistao;
    }

    public int getpotencia() {
        return potencia;
    }

    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    public void setpotencia(int potencia) {
        this.potencia = potencia;
    }
}


