package PrimeirosPassos;

import java.util.Scanner;

public class NumerosSuc {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("digite um número ");
        Double numero = num.nextDouble();
        Double suc = numero + 1;
        Double ant = numero - 1;

        System.out.println("O numero é " + numero + " Seu antecessor é " + ant + " seu sucessor é " + suc);

    }
}
