import java.util.Scanner;
public class aula05ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tel;

        do{
            System.out.println("Informe um telefone");
            tel = in.nextLine();
        }while(!(tel.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")));

        String [] token = tel.split("[\\s-]");
        token[0] = token[0].replaceAll("[\\(\\)]","");
        
        for(int i = 0; i < token.length; i++){
            System.out.print(token[i]);
        }
    }
}
