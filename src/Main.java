import java.util.Scanner;

public class Main {
    //Function
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
            }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                }
            }
        return true;
        }
    public static void main(String[] args) {
        //Function work check
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}