public class factorial {
    public static void main(String arg[]){
        
        int num = 5;
        int fact=1;
        for(int i=0;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial = "+ fact);

    }
}
