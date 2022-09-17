package PrimeirosPassos;

import java.util.Scanner;

public class MostrarNome {


    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        String meuNome = nome.nextLine();
        System.out.println("Olá " + meuNome);
    }
}
