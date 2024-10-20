import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static String target;

    public static char cal(char main,char sub) {
        if(main==sub) return main;
        if(main=='A') {
            if(sub == 'G') return 'C';
            if(sub == 'C') return 'A';
            if(sub == 'T') return 'G';
        }
        if(main == 'G') {
            if(sub == 'A') return 'C';
            if(sub == 'C') return 'T';
            if(sub == 'T') return 'A';
        }

        if(main == 'C') {
            if(sub == 'A') return 'A';
            if(sub == 'G') return 'T';
            if(sub == 'T') return 'G';
        }

        if(main == 'T') {
            if(sub == 'A') return 'G';
            if(sub == 'G') return 'A';
            if(sub == 'C') return 'G';
        }
        return main;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String temp = br.readLine();

        Deque<Character> dq = new LinkedList<Character>();

        for(int i=0;i<n;i++) {
            dq.addLast(temp.charAt(i));
        }

        char main = dq.pollLast();
        while(dq.size()>0) {
            char sub = dq.pollLast();
            main = cal(main,sub);
        }

        bw.write(main+"");

        bw.close();
        br.close();
    }
}