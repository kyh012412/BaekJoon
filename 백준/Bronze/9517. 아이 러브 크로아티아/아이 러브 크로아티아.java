import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int BombIndex = Integer.parseInt(br.readLine());
        int QA = Integer.parseInt(br.readLine());
        int GameOverTime =210;
        int CurrentTime = 0;
        for(int i=0;i<QA;i++) {
            String v[] = br.readLine().split(" ");
            CurrentTime += Integer.parseInt(v[0]);

            if(CurrentTime>=GameOverTime) {
                break;
            }
            switch(v[1]) {
                case "T":
                    BombIndex = BombIndex!=8?BombIndex+1:1;
                break;
            }
        }

        bw.write(BombIndex+"");

        br.close();
        bw.close();
    }
}