import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double prices[] = {350.34,230.90,190.55,125.30,180.90};

        for(int i=0;i<n;i++) {
            double total = 0;
            String v[] = br.readLine().split(" ");
            for(int j=0;j<5;j++) {
                int temp = Integer.parseInt(v[j]);
                total += temp*prices[j];
            }

            bw.write(String.format("$%.2f\n", total));
        }

        br.close();
        bw.close();
    }
}