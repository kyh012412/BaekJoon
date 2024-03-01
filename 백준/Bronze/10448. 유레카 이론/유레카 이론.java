import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    static ArrayList<Integer> list;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        list = new ArrayList<Integer>();

        int i = 1;
        while (true) {
            int Sn = (i + 1) * i / 2;

            if (Sn > 1000) {
                break;
            }

            list.add(Sn);
            i++;
        } // 삼각수들을 list에 미리 추가 최대값 1000이하만

        HashSet<Integer> set = new HashSet<Integer>();
        // 삼각수 3개의 합을 담아 놓은 해쉬셋;

        int sum = 0;
        for (i = 0; i < list.size() - 2; i++) {
            sum += list.get(i);
            for (int j = i; j < list.size() - 1; j++) {
                sum += list.get(j);
                for (int k = j; k < list.size(); k++) {
                    sum +=list.get(k);

                    if(sum<=1000) {
                        set.add(sum);
                    }

                    sum-=list.get(k);
                }
                sum -= list.get(j);
            }
            sum -= list.get(i);
        } 

        int tc = Integer.parseInt(br.readLine());

        for(i=0;i<tc;i++) {
            int target = Integer.parseInt(br.readLine());
            if(set.contains(target)) {
                bw.write("1\n");
            }else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.close();
    }
}