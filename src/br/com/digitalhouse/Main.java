package br.com.digitalhouse;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;


import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Integer primeiroNum;
        Integer segundoNum;
        Integer numImpar;
        Integer numPar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite primeiro numero");
        primeiroNum = scanner.nextInt();
        System.out.println("digite segundo numero");
        segundoNum = scanner.nextInt();
if (primeiroNum < segundoNum){
    System.out.println("true");
}
if (primeiroNum > segundoNum){
    System.out.println("false");
}
    }
}