package Revisão;

import java.util.Scanner;

public class Ex06 {
    public static int calculaFatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static double converteEmRadianos(int radi) {
        double radianos;
        radianos = (radi / 180.0) * Math.PI;

        return radianos;
    }

    public static double calculaCosseno(int grau) {
        double cosseno = 0;
        double r = converteEmRadianos(grau);
        for (int i = 0; i <= 15; i++) {
            cosseno = cosseno + (Math.pow(-1, i)) / (calculaFatorial(2 * i)) * Math.pow(r, 2 * i);
        }
        return cosseno;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor do angulo em graus");
        int graus = in.nextInt();

        System.out.println("O cosseno de " + graus + " é " + calculaCosseno(graus));
    }
}
