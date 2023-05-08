/*
 Elabore um programa para ler do teclado um número de telefone como
uma String no formato (555) 555-5555
• O programa deve validar o telefone e caso não esteja no formato correto,
um novo número deve ser solicitado
• Depois utilize o método split para extrair o código de área como um token,
os três primeiros dígitos do número de telefone como um segundo token e
os últimos quatro dígitos do número de telefone como um terceiro token
• O array retornado pelo método split deve ter 3 elementos
• Remova os parênteses do primeiro token utilizando o método replaceAll
• Imprima na tela o telefone concatenando todos os tokens: 5555555555
 */

import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tel;

        do{
            System.out.println("Informe um telefone");
            tel = in.nextLine();
        }while(! (tel.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")));

        String [] token = tel.split("[\\s-]");
        token[0] = token[0].replaceAll("[\\(\\)]","");

        for(int i = 0; i < token.length; i++){
            System.out.print(token[i]);
        }

    }
}
