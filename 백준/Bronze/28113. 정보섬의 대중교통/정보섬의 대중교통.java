import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String v[] = br.readLine().split(" ");
        int a[] = new int[v.length];
        for(int i=0;i<a.length;i++) {
            a[i] = Integer.parseInt(v[i]);
        }
        int Bus=a[1];
        int Subway=Math.max(a[0], a[2]);
        if(Subway<Bus) {
            bw.write("Subway");
        }else if(Subway==Bus) {
            bw.write("Anything");
        }else {
            bw.write("Bus");
        }

		bw.close();
		br.close();
	}
}