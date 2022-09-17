package PrimeirosPassos;

import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {
        System.out.println("Digite as 4 notas bimestrais para fazer a média");
        Scanner nota = new Scanner(System.in);
        Integer nota1 = nota.nextInt();
        Integer nota2 = nota.nextInt();
        Integer nota3 = nota.nextInt();
        Integer nota4 = nota.nextInt();
        Integer soma = nota1 + nota2 + nota3 + nota4;
        Integer media = soma/4;
        System.out.println("A media bimestral dos alunos foram " +  media);


    }
}
