import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		int count=0;
		int c=sc.nextInt();
		for(int i:b) {
			if(i==c)count++;
		}
		System.out.println(count);
	}
}