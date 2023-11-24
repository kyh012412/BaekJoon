import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = a/4;
		String str="";
		for(int i=0;i<b;i++) {
			str+="long ";
		}
		str+="int";
		System.out.println(str);
	}
}
