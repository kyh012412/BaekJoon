import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static int n,k;

    public static ArrayList<Integer> list=new ArrayList<Integer>();

    public static ArrayList<Integer> temp=new ArrayList<Integer>();

    public static int arr[];

    public static void merge_sort(int p,int r) {
        if(p<r) {
            int q = (p+r)/2;
            merge_sort(p,q);
            merge_sort(q+1,r);
            merge(p,q,r);
        }
    }

    public static void merge(int p,int q, int r) {
        int i=p,j=q+1,t=p;
        temp.clear();
        while(i<=q && j<=r) {
            if(arr[i]<=arr[j]) {
                temp.add(arr[i++]);
            }else {
                temp.add(arr[j++]);
            }
        }
        while(i<=q) {
            temp.add(arr[i++]);
        }
        while(j<=r) {
            temp.add(arr[j++]);
        }
        i=p;
        t=0;
        while(i<=r) {
            int num =temp.get(t++);
            arr[i++]=num;
            list.add(num);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(0,n-1);

        if(list.size()-1>=k) {
            bw.write(list.get(k-1)+"");
        }else {
            bw.write("-1");
        }

        br.close();
        bw.close();
    }
}