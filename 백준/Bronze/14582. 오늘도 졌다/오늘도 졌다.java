import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean yeokjeon = false;

        int scoreboard[][] = new int[2][9];

        int a,b;
        a=b=0;

        //초기화
        for(int i=0;i<2;i++) {
            String v[] = br.readLine().split(" ");
            for(int j=0;j<9;j++) {              
                scoreboard[i][j] = Integer.parseInt(v[j]);
            }
        }
        for(int j=0;j<9;j++) {
            for(int i=0;i<2;i++) {
                switch(i) {
                case 0:
                    a+=scoreboard[i][j];
                    break;
                case 1:
                    b+=scoreboard[i][j];
                    break;
                }
                if(a>b) {
                    yeokjeon = true;
                }
            }
        }

        if(yeokjeon) {
            bw.write("Yes");
        }else {
            bw.write("No");
        }

        br.close();
        bw.close();
    }
}