public class fibonacci {
    public static void main (String arg[]){
        int num= 1000;
        int t1=0,t2=1;
        while(t1<=num){
         
         System.out.print( t1+"+" );
         int sum = t1+t2;
         t1=t2;
         t2=sum;
            
        }
        
    }
    
}
