/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eduardoflx.att1lista3ed1;

/**
 *
 * @author eduardo
 */
public class Att1Lista3ED1 {

    // Calcular a média
    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    // Notas acima da média
    public static int contarAcimaMedia(double[] notas, double media) {
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                contador++;
            }
        }

        return contador;
    }

    // Encontrar a maior nota
    public static double encontrarMaior(double[] notas) {
        double maior = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double media = calcularMedia(notas);
        int acimaMedia = contarAcimaMedia(notas, media);
        double maiorNota = encontrarMaior(notas);

        System.out.println("Media das notas: " + media);
        System.out.println("Quantidade acima da media: " + acimaMedia);
        System.out.println("Maior nota: " + maiorNota);
    }
}