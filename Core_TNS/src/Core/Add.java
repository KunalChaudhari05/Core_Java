package Core;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int c=a+b;
		System.out.println("Your Addition is: "+c);

	}

}
