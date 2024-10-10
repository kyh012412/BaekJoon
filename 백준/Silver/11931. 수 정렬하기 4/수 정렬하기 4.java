import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n-->0) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i:list) {
            bw.write(i+"\n");
        }

        br.close();
        bw.close();
    }
}