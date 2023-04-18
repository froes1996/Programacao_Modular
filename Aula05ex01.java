import java.util.Scanner;
public class Aula05ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String s = in.next();
        char  c = in.next().charAt(0);
        int cont = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==c){
                cont++;
            }
        }
        System.out.println(cont);

        

    }
}
