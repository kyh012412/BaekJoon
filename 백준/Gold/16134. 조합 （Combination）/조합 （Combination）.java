
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static long n,r; // 0부터 최대 1000000
		
	static long getxpowyremainderp(long x,long y,long p) {
		long ans=1;
		while(y>0) {
			if(y%2!=0) {
				ans*=x;
				ans%=p;
			}
			x *=x;
			x %=p;
			y/=2;
		}
		return ans;
	}	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Long.parseLong(v[0]);
		r = Long.parseLong(v[1]);
		long p = 1000000007L;
		
		r = r<n-r?r:n-r;
		
		long a = 1; // n!%p 값
		long b = 1; // r!%p값 연산후 이어서 (n-r)!%p값 연산
		// 모든 연산후 a*(b*c)^(m-2) 한후 %p가 정답인 상황
		
		for(int i=1;i<=n;i++) {
			a*=i;
			a%=p;
		}
		
		for(int i=1;i<=r;i++) {
			b*=i;
			b%=p;
		}
		
		for(int i=1;i<=n-r;i++) {
			b*=i;
			b%=p;
		}
		
		b = getxpowyremainderp(b, p-2, p);
		
		bw.write(a*b%p+"");

//		System.out.println(getncr(n, r));
//		bw.write(getncr2(n,r)+"");
		
		bw.close();
		br.close();
	}
}