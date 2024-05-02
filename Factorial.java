
package factorial;
public class Factorial {
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
        for(int i = 1 ; i <= n ; i++){
            num *= i ;
        }
        return num ;
    }
}
