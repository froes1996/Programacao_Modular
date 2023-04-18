import java.util.Scanner;
public class Aula08ex01 {
    public static int somaElementosVetor(int [] a){
        int soma = 0;
        for(int i = 0; i < a.length; i++){
            soma = soma + a[i];
        }
        return soma;
    }
    public static int multiplicaElementosVetor(int [] b){
        int multiplica = 1;
        for(int i = 0; i < b.length; i++){
            multiplica = multiplica * b[i];
        }
        return multiplica;
    }
    public static int calculaMaior(int [] c){
        int maior = c[0];
        for(int i = 0; i < c.length; i++){
            if (maior < c[i]){
                maior = c[i];
            }
        }
        return maior;
    }
    public static int numeroRepeticaoMaior(int [] d){
        int cont = 0;
        for(int i = 0; i < d.length; i++){
            if(d[i] == calculaMaior(d)){
                cont ++;
            }  
        }
        return cont;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor");
        int tamanho = in.nextInt();
        
        int [] array = new int[tamanho];

        for(int i = 0; i < array.length; i++){
            System.out.println("Informe o valor: " + i);
            array[i] = in.nextInt();
        }

        int soma = somaElementosVetor(array);
        System.out.println(" A soma é: "+soma);

        int multiplica = multiplicaElementosVetor(array);
        System.out.println("A multiplicação é: "+multiplica);

        int maior = calculaMaior(array);
        System.out.println("O maior é: "+maior);

        int repeticao = numeroRepeticaoMaior(array);
        System.out.println("Repetiu: "+repeticao);
    }
}

