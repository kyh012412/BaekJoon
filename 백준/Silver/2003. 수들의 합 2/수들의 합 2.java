import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int n,m;
    public static int[] a;

    public static int front=0;
    public static int back=0;
    public static int sum=0;
    public static int count=0;

    public static void add() {
        if(front<a.length) {
            sum+=a[front];
            front++;
            check();
        }else {
            delete();
        }
    }

    public static void check() {
        if(sum==m) {
            count++;
        }
        next();
    }

    public static void next() {
        if(sum<m) {
            add();
        }else{
            delete();
        }
    }

    public static void delete() {
        if(back<a.length) {
            sum-=a[back];
            back++;
            check();
        }else {
            return;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        add();

        bw.write(count+"");

        bw.close();
        br.close();
    }
}