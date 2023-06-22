package Try_Catch;
import java.util.Scanner;
public class ex03 {
    public static void validaNome(String nome)throws NomeInvalidoException{
        if(! nome.matches("^[a-zA-Z ]+$")){
            throw new NomeInvalidoException();
        }
    }
    public static int contarPalavras(String nome, int n)throws StringVaziaException{
        if(nome.length() == 0){
            throw new StringVaziaException();
        }else{
            String token[] = nome.split("\s");
            n = token.length;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nome = "";
        int n = 0;
        while(true){
            System.out.println("informe seu nome completo");
            try {
                nome = in.nextLine();
                validaNome(nome);
                System.out.println(contarPalavras(nome, n));
                break;
            } catch (NomeInvalidoException e) {
                System.out.println("Erro: o nome contém caracteres inválidos");
            }catch(StringVaziaException e){
                System.out.println("Erro: o nome não pode estar vazio");
            }
        }
    }
}
class NomeInvalidoException extends Exception{

}
class StringVaziaException extends Exception{

}