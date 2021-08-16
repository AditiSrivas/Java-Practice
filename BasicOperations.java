public class BasicOperations{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        int c=a+b; //Addition
	int d=a-b; //Subtraction
	int e=a*b; //Multiplication
	int f=a/b; //Division
	
        System.out.println("Addition of two no is:"+c);
	System.out.println("Substraction of two no is:"+d);
	System.out.println("Multiplication of two no is:"+e);
	System.out.println("Division of two no is:"+f);
    }
}
