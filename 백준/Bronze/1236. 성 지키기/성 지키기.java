import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x,y;

        String v[] = br.readLine().split(" ");

        x = Integer.parseInt(v[0]);
        y = Integer.parseInt(v[1]);

        char [][] map = new char[x][y];

        boolean[] needx = new boolean[x];//기본값 false 등장후 true 모두 true가 됨이 필요
        boolean[] needy = new boolean[y];

        for(int i=0;i<x;i++) {
            String str = br.readLine();
            for(int j=0;j<y;j++) {
                map[i][j]=str.charAt(j);
                if(str.charAt(j)=='.') continue;
                if(!needx[i]) {
                    needx[i]=true;
                }
                if(!needy[j]) {
                    needy[j]=true;
                }
            }
        }
        int ansx =0;
        int ansy =0;
        for(boolean xx: needx) {
            if(!xx) {
                ansx++;
            }
        }
        for(boolean yy: needy) {
            if(!yy) {
                ansy++;
            }
        }
        bw.write(Math.max(ansx,ansy)+"");

        br.close();
        bw.close();
    }
}