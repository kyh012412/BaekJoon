
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int DPmaxDescendingsequence(int A[],int MaxV,int MinV) {
		int DPdesc[][]= new int[A.length+1][MaxV+2];
		for(int i=0;i<A.length+1;i++) {
			for(int l=MaxV+1;l>=0;l--) { //두번째 인자 최소무게
				if(i==0 || l==MaxV+1) {
					DPdesc[i][l]=0;
				}else if(A[i-1]>=l) {
					DPdesc[i][l]=Math.max(1+DPdesc[i-1][A[i-1]+1], DPdesc[i-1][l]);
				}else {
					DPdesc[i][l]=DPdesc[i-1][l];
				}
			}
		}
		return DPdesc[A.length][0];
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int MaxV = -1;
			int MinV = 1001;
			int N = Integer.parseInt(br.readLine());
			int A[] = new int[N];
			String v[] = br.readLine().split(" ");
			for(int i=0;i<N;i++) {
				A[i] = Integer.parseInt(v[i]);
				if(MaxV<A[i]) {
					MaxV=A[i];
				}
				if(MinV>A[i]) {
					MinV=A[i];
				}
			}
			bw.write(""+DPmaxDescendingsequence(A,MaxV,MinV));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}