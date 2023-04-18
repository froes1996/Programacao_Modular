import java.util.Scanner;
public class Aula07ex02 {
    public static boolean isMultiple(int v1, int v2){
        boolean multiplo = false;
        if(v1 % v2 == 0){
            multiplo = true;
        }
        return multiplo;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe quantos pares deseja testar");
        int quantidade = in.nextInt();
        int v1 = 0;
        int v2 = 0;
        boolean resultado;

        for(int i = 0; i < quantidade; i++){
            System.out.println("Informe 2 valores");
            v1 = in.nextInt();
            v2 = in.nextInt();
            resultado = isMultiple(v1,v2);
            System.out.println(resultado);
        }
    }
}
