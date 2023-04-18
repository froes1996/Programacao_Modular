import java.util.Scanner;

public class Aula07ex01 {
    public static int CalculaPotencia(int base, int expoente){
        int potencia = 1;
        for(int i = 0; i < expoente; i++){
            potencia = potencia * base;

        }
        return potencia;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma base e um expoente");
        int base = in.nextInt();
        int expoente = in.nextInt();
        int resultado = 0;

        resultado = CalculaPotencia(base, expoente);

        System.out.println(resultado);

    }
}
