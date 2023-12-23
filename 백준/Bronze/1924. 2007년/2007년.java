
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Calendar c = Calendar.getInstance();

        int x,y;
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        c.set(2007, x-1, y);

        switch(c.get(Calendar.DAY_OF_WEEK)) {
        case 1:
            bw.write("SUN");
            break;
        case 2:
            bw.write("MON");
            break;
        case 3:
            bw.write("TUE");
            break;
        case 4:
            bw.write("WED");
            break;
        case 5:
            bw.write("THU");
            break;
        case 6:
            bw.write("FRI");
            break;
        case 7:
            bw.write("SAT");
        }

        br.close();
        bw.close();
    }
}