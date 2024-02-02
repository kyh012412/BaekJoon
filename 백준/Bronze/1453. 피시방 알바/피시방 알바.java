import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
				
		int n = Integer.parseInt(br.readLine());
        int arr[] = new int[101];
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            if(arr[num]==0){
                arr[num]++;
            }else{
                count++;
            }
        }
        bw.write(count+"");
		
		br.close();
		bw.close();
	}
}