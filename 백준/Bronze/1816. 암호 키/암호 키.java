import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static String target;

    public static final int MaxValue = 1000000;

    public static boolean che[] = new boolean[MaxValue+1];

    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static boolean isSafe(long n) {      
        for(int i=0;i<list.size();i++) {
            if(n%list.get(i)==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // make che
        int index=2;
        while(index<=MaxValue) {
            if(!che[index]) { // 이게 소수면
                list.add(index);
//              System.out.println(index+"은 소수임!!");
                int num = index;
                int nextNum = num*num;
                while(nextNum<=MaxValue && nextNum>0) {
                    che[nextNum]=true;
//                  System.out.println(nextNum+"은 소수가아님");
                    nextNum+=num;
                }
            }
            index++;
        }

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            bw.write(isSafe(Long.parseLong(br.readLine()))?"YES":"NO");         
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}