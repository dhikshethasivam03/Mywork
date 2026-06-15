import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i <= n; i += 2)
        sum = sum + i;
        System.out.println(sum);
        
    }
}
