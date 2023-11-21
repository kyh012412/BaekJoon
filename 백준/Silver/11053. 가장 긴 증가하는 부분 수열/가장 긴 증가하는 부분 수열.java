
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int DPmaxaddsequence(int A[],int MaxV) {
		int DPmaxaddsequenceArr[][] = new int[A.length+1][MaxV+1];
		for(int i=0;i<A.length+1;i++) {
			for(int l=0;l<MaxV+1;l++) {
				if(i==0 || MaxV==0) {
					DPmaxaddsequenceArr[i][l]=0;
				}else if(A[i-1]<=l) {
					DPmaxaddsequenceArr[i][l]= Math.max(1+DPmaxaddsequenceArr[i-1][A[i-1]-1], DPmaxaddsequenceArr[i-1][l]);
				}else {
					DPmaxaddsequenceArr[i][l]=  DPmaxaddsequenceArr[i-1][l];
				}
			}
		}
		return DPmaxaddsequenceArr[A.length][MaxV]; 
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int MaxV = -1;
			int N = Integer.parseInt(br.readLine());
			String v[] = br.readLine().split(" ");
			int A[] = new int[N];
			for(int i=0;i<N;i++) {
				A[i] = Integer.parseInt(v[i]);
				if(MaxV<A[i]) {
					MaxV=A[i];
				}
			}
			bw.write(""+DPmaxaddsequence(A,MaxV));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}