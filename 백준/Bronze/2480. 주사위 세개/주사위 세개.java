import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[3];
		for(int i=0;i<3;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		if(a[0]==a[1]&&a[1]==a[2]) {
			System.out.println(a[0]*1000+10000);
		}else if(a[0]==a[1]&&a[1]!=a[2]) {
			System.out.println(a[0]*100+1000);
		}else if(a[1]==a[2]&&a[0]!=a[1]) {
			System.out.println(a[1]*100+1000);
		}else
			System.out.println(a[2]*100);
	}
}