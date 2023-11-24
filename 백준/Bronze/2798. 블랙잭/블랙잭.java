import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.TreeSet;

//블랙잭

public class Main {
	
	public static int getlistsum(ArrayList<Integer> list) {
		int sum=0;
		for(int a: list) {
			sum+=a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		ArrayList<Integer> deck = new ArrayList<Integer>();
		ArrayList<Integer> pick = new ArrayList<Integer>();
		TreeSet<Integer> set= new TreeSet<Integer>();
		
		
		try {
			String str = br.readLine();
			int numcount = Integer.parseInt(str.split(" ")[0]);
			int max = Integer.parseInt(str.split(" ")[1]);
			
			str= br.readLine();
			String vals[] = str.split(" ");
			for(String a : vals) {
				deck.add(Integer.parseInt(a));
			}
			
			outer:for(int i=0;i<deck.size()-2;i++) {
				pick.add(deck.get(i));
				for(int j=i+1;j<deck.size()-1;j++) {
					pick.add(deck.get(j));
					for(int k=j+1;k<deck.size();k++) {
						pick.add(deck.get(k));
						int sum = getlistsum(pick);
						if(sum<=max) {
							set.add(sum);
							if(sum==max) {
								break outer;
							}
						}
						pick.remove(2);
					}
					pick.remove(1);
				}
				pick.remove(0);
			}
			
			bw.write(""+set.pollLast());
			
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}