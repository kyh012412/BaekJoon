import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());

        int realArr[] = new int[l+1];

        int u = Integer.parseInt(br.readLine());

        StringTokenizer st;

        //최대길이 예상
        int expectedLength =-1;
        int expectedUser = -1;

        //실제 길이 와 유저
        int realLenth = -1;
        int realUser = -1;

        for(int i=0;i<u;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 현재 유저의 번호 i+1
            if(b-a+1>expectedLength) {
                expectedLength = b-a+1;
                expectedUser = i+1;
            }

            int curUserCnt = 0;

            for(int j=a;j<=b;j++) {
                if(realArr[j]==0) {
                    realArr[j]=i+1;
                    curUserCnt++;
                }
            }

            if(realLenth<curUserCnt) {
                realLenth=curUserCnt;
                realUser=i+1;
            }
        }

        bw.write(expectedUser+"\n"+realUser);

        br.close();
        bw.close();
    }
}