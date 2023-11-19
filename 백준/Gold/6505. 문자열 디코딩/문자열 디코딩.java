
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	static int arr[];
	static int peri[];
	
	public static String encoding(String s) {
		
		return s;
	}
	
	public static int getdest(int a,int round) {
		while(round!=0) {
			a=arr[a];
			round--;
		}
		return a;
	}
	
	public static String decoding(String d,String s,int round) {
		int nperi[] = new int[peri.length];
		for(int i=1;i<peri.length;i++) {
			nperi[i] = round%peri[i];
		}
//		System.out.println("nperi : "+Arrays.toString(nperi));
		String n="";
		TreeMap<Integer,Character> map = new TreeMap<Integer, Character>();
		for(int i=0;i<s.length();i++) {
			map.put(getdest(i+1, nperi[i+1]), s.charAt(i));
		}
		for(Map.Entry<Integer, Character> entry: map.entrySet()) {
			n+=entry.getValue();
		}		
		return n;
	}
	
	public static void setarr(String a) {
		String v[] = a.split(" ");
		arr = new int[v.length+1];
		for(int i=1;i<arr.length;i++) {
			arr[i]=Integer.parseInt(v[i-1]);
		}
		setperi();
	}
	public static void setperi() {
		peri = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			int fidx=arr[i];
			int count=1;
			while(fidx!=i) {
				fidx = arr[fidx];
				count++;
			}
			peri[i]=count;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		
		String v[];
		while(true) {
			v= br.readLine().split(" ");
			if(v[0].equals("0")) break;
			int r = Integer.parseInt(v[1]);
			String d = br.readLine();
			setarr(d);
			String s = br.readLine();
			bw.write(decoding(d,s,r));
			bw.newLine();
		}
		

		bw.close();
		br.close();
	}
}