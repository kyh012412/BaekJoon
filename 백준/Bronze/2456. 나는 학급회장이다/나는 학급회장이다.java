import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    int index;
    int points[] = new int[4];
    int total=0;

    @Override
    public int compareTo(Person o) {
        if(total!=o.total) {
            return o.total-total;
        }else if(o.points[3]!=points[3]) {
            return o.points[3]-points[3];
        }else if(o.points[2]!=points[2]) {
            return o.points[2]-points[2];
        }
        return 0;
    }

    @Override
    public String toString() {
        return index+" "+total;
    }

    public boolean compareTo(Person o1,Person o2) {
        if(this.compareTo(o1)<0 && this.compareTo(o2)<0) {
            return true;
        }
        return false;
    }

    public int getBestTotal(Person ...arr) {
        int max=-1;
        for(Person p : arr) {
            if(p.total>max) {
                max=p.total;
            }
        }
        return max;
    }
}

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Person[] person = new Person[4];
        for(int i=0;i<4;i++) {
            person[i] = new Person();
            person[i].index=i;
        }

        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<4;j++) {
                int num= Integer.parseInt(st.nextToken());
                person[j].points[num]++;
                person[j].total+=num;
            }
        }
        if(person[1].compareTo(person[2], person[3])) {
            bw.write(person[1].toString());
        }else if(person[2].compareTo(person[1], person[3])) {
            bw.write(person[2].toString());
        }else if(person[3].compareTo(person[1],person[2])) {
            bw.write(person[3].toString());
        }else {
            bw.write("0 "+person[1].getBestTotal(person));
        }

        bw.close();
        br.close();
    }
}