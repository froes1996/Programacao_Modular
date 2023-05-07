package Aulas;
import java.util.Scanner;
public class Aula05ex02 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    String usuario, cpf ;
    
    do{
        System.out.println("Informe o usuário");
        usuario = in.next();
        }while(!(usuario.matches("[A-Z] [a-z]+")));

       
       
     do{
        System.out.println("Informe o CPF");
        cpf = in.next();
        System.out.println(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}"));
        }while(!(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")));

        System.out.println("Usuario: " + usuario);
        System.out.println("CPF: " + cpf);
   } 
}
