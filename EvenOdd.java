//Write a JAVAprogram to check whether a number is even or odd.
import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd Number");
        }
    }
}