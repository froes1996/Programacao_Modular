package Revisão2;
/*
 Escreva um método void validarData que receba por parâmetro uma
data. Esse método verifica se a data é válida, ou seja, está no formato
"dd/mm/aaaa“ e é uma data existente. Caso não esteja, ele deve
lançar uma exceção do tipo DataInvalidaException. Se a data estiver
vazia, ele deve lançar uma exceção do tipo DataVaziaException.
• void validarData(String data) throws DataVaziaException, DataInvalidaException
• O método main deve ler via teclado uma data, chamar o método
criado e imprimir "Data válida!“ se não ocorreu nenhum erro.
• Caso contrário, ele deve tratar as exceções lançadas com as seguintes
mensagens de erro: “Erro: A data não pode estar vazia” ou "Erro: A
data fornecida não está no formato correto“
 */
import java.util.Scanner;
public class Ex04 {
    public static void validaData(String data)throws DataVaziaException, DataInvalidaException{
        if(data.equals("")){
            throw new DataVaziaException();
        }else if(! data.matches("\\d{2}/\\d{2}/\\d{4}")){
            throw new DataInvalidaException();
        }
        String[]token = data.split("/");

        
        if(Integer.parseInt(token[0])> 31 || Integer.parseInt(token[0]) < 1){
            throw new DataInvalidaException();
        }if(Integer.parseInt(token[1])> 12 || Integer.parseInt(token[1]) < 1){
            throw new DataInvalidaException();
        }if(Integer.parseInt(token[2]) < 1){
            throw new DataInvalidaException();
        }    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a data");
        String data = in.nextLine();

        try {
            validaData(data);
            System.out.println("Data valida");
        } catch (DataVaziaException e) {
            System.out.println("A data não pode ser vazia");
        }catch(DataInvalidaException e){
            System.out.println("Data invalida");
        }
    }
}
class DataVaziaException extends Exception{

}
class DataInvalidaException extends Exception{

}
