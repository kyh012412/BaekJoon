import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());

        int date = Integer.parseInt(br.readLine());

        int targetMonth = 2;
        int targetDate = 18;

        if(month==targetMonth) {
            if(date==targetDate) {
                bw.write("Special");
            }else if(date>targetDate) {
                bw.write("After");
            }else {
                bw.write("Before");
            }
        }else if(month>targetMonth){
            bw.write("After");
        }else {
            bw.write("Before");
        }

        br.close();
        bw.close();
    }
}