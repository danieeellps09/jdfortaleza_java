package PrimeirosPassos;

import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
        Scanner numinfo = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer num = numinfo.nextInt();
        System.out.printf("Onumero informado foi" + num);

    }
}
