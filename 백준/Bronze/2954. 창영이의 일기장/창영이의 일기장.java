import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int index=0;
        outer:while(true) {
            try {
                switch(str.charAt(index)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        if(str.charAt(index+1)=='p') {
                            str = str.substring(0,index) + str.substring(index+2);
                            index++;
                            continue outer;
                        }
                        break;
                    default :
                        index++;
                        break;
                }
            } catch (Exception e) {
                break;
            }
        }

        bw.write(str);

        br.close();
        bw.close();
    }
}