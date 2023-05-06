package Aulas;
import java.util.Scanner;

public class Aula09ex03 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int [][] m = new int [2][2];

    for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m.length; j++){
            m[i][j] = in.nextInt();
        }
    }
    
    for(int i = 0; i < m.length; i++){
        for(int j = 2; j < m.length; j++){
            m[i][j] = m[j][i];
        }
    }

    for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m.length; j++){
            System.out.print(m[i][j] + " ");
        }
        System.out.println();
    }
}
}
