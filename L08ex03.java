public class L08ex03{
    public static void main(String[] args) {
        
        float [] v = {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f,1.9f,2.0f};
        float soma = 0f;
        float resultado = 0f;
        for(int i = 0; i < v.length; i++){
            soma = soma + v[i];
        }
        resultado = soma / 10;
        System.out.println(resultado);
    }
}