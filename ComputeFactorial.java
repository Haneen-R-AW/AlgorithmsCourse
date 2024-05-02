
package computefactorial;
public class ComputeFactorial {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int num = 5 ;
        System.out.println("the factorial " + num + " is :" +Factorial(num) );
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.print("executionTime is :" + executionTime);
    }
    static int Factorial(int n ){
        int num = 1 ;
        if (n == 0 || n == 1){
            return num ;
        }else{
            num = n * Factorial(n - 1 );        
        }
        return num ;
    }
    
}
