import java.util.Scanner;

public class QUESTION1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter No.of elements you want to enter : ");
        int n= in.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int result=1;
        for(int i=0;i<a.length;i++){
            result=result*a[i];
            a[i]=result;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
