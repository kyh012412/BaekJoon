import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        boolean flag=false;
        Deque<String> dq = new LinkedList<String>();
        int num=-1;
        outer:while(!(str=br.readLine()).equals("=")) {
            if(!flag) {
                num =Integer.parseInt(str);
                flag=true;
                continue;
            }

            switch(str) {
            case "+":
            case "-":
            case "*":
            case "/":
                dq.addLast(str);
                continue;
            default:
                switch(dq.pollFirst()) {
                    case "+":
                        num += Integer.parseInt(str);
                        continue outer;
                    case "-":
                        num -= Integer.parseInt(str);
                        continue outer;
                    case "*":
                        num *= Integer.parseInt(str);
                        continue outer;
                    case "/":
                        num /= Integer.parseInt(str);
                        continue outer;
                }
            }           
        }

        bw.write(num+"");

        br.close();
        bw.close();
    }
}