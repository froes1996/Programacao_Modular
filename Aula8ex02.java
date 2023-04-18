public class Aula8ex02 {
    public static int contar(String parameto){
        int resultado = 0;
        resultado = parameto.length();
        return resultado;
    }
    public static int contar(char [] v){
        int resultado = v.length;
        return resultado;
    }
    public static void main(String[] args) {
        String m1= "Jefferson";
        System.out.println(contar(m1));

        char [] v1 = {'j', 'e', 'f', 'f'};
        
        System.out.println(contar(v1));
    }
}
