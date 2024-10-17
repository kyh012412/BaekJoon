import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main { 

    public static String[] names;
    public static String target;
    public static int n;

    public static HashMap<Character, Integer> fromTarget = new HashMap<Character, Integer>();

    public static int getWinnable(String str) {
        String LOVE = "LOVE";
        int gop=1;
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(int i=0;i<LOVE.length()-1;i++) {
            for(int j=i+1;j<LOVE.length();j++) {
                int f = charMap.computeIfAbsent(LOVE.charAt(i),key->getCharCount(str, key));
                int s = charMap.computeIfAbsent(LOVE.charAt(j),key->getCharCount(str, key));
//              int beforeGop = gop;
                gop = gop*(f+s) % 100;
//              System.out.println(gop + "="+beforeGop+"*("+f+"+"+s+") % 100 ");
            }
        }
        charMap.clear();
        return gop;
    }

    public static int getCharCount(String str,char c) {
        int count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==c) {
                count++;
            }
        }
        count +=getCharCountFromTarget(c);
//      System.out.println(str+"과 "+target+"에서 등장한"+c+"의 개수:"+count);
        return count;
    }

    public static int getCharCountFromTarget(char c) {

        return fromTarget.computeIfAbsent(c, (key)->{
            int count=0;
            for(int i=0;i<target.length();i++) {
                if(target.charAt(i)==c) {
                    count++;
                }
            }
            return count;
        });
    }   

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        target = br.readLine();
        n = Integer.parseInt(br.readLine());

        names = new String[n];

        for(int i=0;i<n;i++) {
            names[i] = br.readLine();
        }

        int curWinnable= -1;
        String curName = "";

        for(int i=0;i<n;i++) {
            int thisWinnable = getWinnable(names[i]);
//          System.out.println(names[i]+"winnable:"+thisWinnable);
            if(thisWinnable>curWinnable || (thisWinnable==curWinnable && names[i].compareTo(curName)<0)) {
                curWinnable = thisWinnable;
                curName = names[i];
            }
        }

        bw.write(curName);
//        System.out.println(curName);
        br.close();
        bw.close();
    }
}
