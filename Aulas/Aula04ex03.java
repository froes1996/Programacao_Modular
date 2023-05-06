package Aulas;
public class Aula04ex03 {
    public static void main(String[] args) {
        int [] [] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int [] v = new int[3];

        for(int i = 0; i < m.length; i++){
            int soma = 0;
            for(int j = 0; j < m.length; j++){
                soma += m [j][i];
            }
            v[i] = soma;
        }
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + ", ");
        }
    }
}
