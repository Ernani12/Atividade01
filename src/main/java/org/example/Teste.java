package org.example;

import java.util.Scanner;

/* Ernani Batista Serafim */

public class Teste {
    /* Classe principal com instância de veículos e
       método que define o motor */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Scanner para entradas */
        Veiculo[] veiculos = new Veiculo[5];

        /* 5 veiculos  */
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro do veiculo " + (i + 1));

            System.out.print("Placa: ");
            String placa = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Cor: ");
            String cor = scanner.nextLine();

            System.out.print("Velocidade Maxima: ");
            float velocMax = scanner.nextFloat();

            System.out.print("Quantidade de Rodas: ");
            int qtdRodas = scanner.nextInt();

            System.out.print("Quantidade de Pistoes do Motor: ");
            int qtdPistao = scanner.nextInt();

            System.out.print("Potencia do Motor: ");
            int potencia = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha pendente

            // Criar o veículo
            Veiculo veiculo = new Veiculo();
            veiculo.setPlaca(placa);
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setCor(cor);
            veiculo.setVelocMax(velocMax);
            veiculo.setQtdRodas(qtdRodas);

            // Criando e configurando o motor
            veiculo.getMotor().setQtdPist(qtdPistao);
            veiculo.getMotor().setPotencia(potencia);

            veiculos[i] = veiculo;
        }

        // Exibir veículos e qualidades
        System.out.println("\nVeiculos cadastrados:");
        for (Veiculo v : veiculos) {
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Velocidade Maxima: " + v.getVelocMax());
            System.out.println("Quantidade de Rodas: " + v.getQtdRodas());
            System.out.println("Motor - Quantidade de Pistoes: " + v.getMotor().getQtdPist());
            System.out.println("Motor - Potencia: " + v.getMotor().getPotencia());
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
