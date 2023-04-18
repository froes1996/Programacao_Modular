public class L08ex04 {
    public static void main(String[] args) {
        int [] v = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < v.length; i++){
            if(v[i] % 2 != 0){
                System.out.println(v[i] + " Eh impar");
            }   
        }
        for(int i = 0; i < v.length; i++){
            if(v[i] % 2 == 0){
                System.out.println(v[i] + " Eh par");
            }
        }
    }
}
