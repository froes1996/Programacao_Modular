/*
• Elabore um programa para ler do teclado o primeiro nome do usuário
e seu CPF.
• O programa deve verificar se o nome e o CPF estão no formato
correto: a primeira letra do nome é maiúscula e as demais são letras
minúsculas (não pode ter números) e o CPF tem o seguinte formato
000.000.000-00 (incluindo os pontos e hífen).
• Caso o digite algum dado em formato inválido, o programa deve
solicitar que o usuário digite novamente.
• O programa deve imprimir na tela o nome e CFP digitado pelo
usuário.
 */
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        String cpf;

        do{
            System.out.println("Informe seu nome completo");
            nome = in.next();
        }while(!(nome.matches("[A-Z][a-z]+")));
        
        do{
            System.out.println("Informe seu CPF");
            cpf = in.next();
        }while(!(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")));
        

        System.out.println("Usuário: " + nome);
        System.out.println("CPF: " + cpf);

    }
}
