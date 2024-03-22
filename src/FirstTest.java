public class FirstTest {

    public void PrintName(String n){
        System.out.println("Hamid");
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

 
  

    public static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }  

       public static String reverseString(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
    }  


}
    
