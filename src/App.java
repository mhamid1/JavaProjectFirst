public class App {
    public static void main(String[] args) throws Exception {


        int a = 10;
        String name = "Hamid";
        String reverseName = "dimah";
    
       FirstTest firstTest = new FirstTest();  
        firstTest.PrintName(name);

       
        System.out.println(firstTest.sum(10, 20));

        System.out.println(firstTest.multiply(5, 10));

        System.out.println(firstTest.divide(30, 10));

        System.out.println(firstTest.reverseString(reverseName));

        System.out.println(FirstTest.factorial(a));
       
    }

    
          
}
