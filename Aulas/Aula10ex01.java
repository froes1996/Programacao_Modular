package Aulas;
import java.util.Scanner;
public class Aula10ex01 {
    public static int calculaFatorial(int n){
        int fatorial = 1;
        for(int i = 1; i <= n; i++){
            fatorial = fatorial*i;
        }
        return fatorial;
    }
    public static double converteEmRadianos(double graus){
        double radianos = 0;
        radianos = (graus * Math.PI) / 180;
        return radianos;
    }

    public static double calculaSeno(double G){
        double seno = 0;
        double r = converteEmRadianos(G);
        for(int i = 0; i <=5; i++){
            seno = seno + Math.pow(-1, i) / (calculaFatorial(2*i+1)) * Math.pow(r, 2*i+1);
        }
        return seno;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um numero");
        int valor = in.nextInt();
        System.out.println(calculaFatorial(valor));

        System.out.println("Informe um valor em graus");
        double graus = in.nextDouble();
        System.out.println(converteEmRadianos(graus));

        System.out.println("Informe um angulo");
        int G = in.nextInt();
        System.out.println(calculaSeno(G));
    }
    
}
