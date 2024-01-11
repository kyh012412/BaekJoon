import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        int count=0;

        while(true) {
            str = br.readLine();
            if(str.equals("#")) {
                break;
            }
            count =0;
            for(int i=0;i<str.length();i++) {
                switch(str.charAt(i)) {
                case 'a':
                case 'e': 
                case 'i': 
                case 'o':
                case 'u':
                case 'A':
                case 'E': 
                case 'I':
                case 'O':
                case 'U':
                    count++;
                }
            }
            bw.write(count+"\n");
        }

        br.close();
        bw.close();
    }
}