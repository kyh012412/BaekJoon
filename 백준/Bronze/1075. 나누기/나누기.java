import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int div = Integer.parseInt(br.readLine()); 
        
        str = str.substring(0,str.length()-2)+"00";
        
        int newnum = Integer.parseInt(str);

        int remain = newnum%div;
        
        int need = div-remain;
        
        if(remain==0) {
        	bw.write("00");
        }else if(need>=10) {        	
            bw.write(need+"");            
        }else {
            bw.write("0"+need);
        }

        br.close();
        bw.close();
    }
}