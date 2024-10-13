import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
    String name;
    int dd;
    int mm;
    int yyyy;

    @Override
    public int compareTo(Student o) {
        if(yyyy!=o.yyyy) {
            return yyyy-o.yyyy;
        }else if(mm!=o.mm){
            return mm-o.mm;
        }else {
            return dd-o.dd;
        }
    }

    public Student(String str) {
        StringTokenizer st = new StringTokenizer(str);
        name = st.nextToken();
        dd =Integer.parseInt(st.nextToken());
        mm = Integer.parseInt(st.nextToken());
        yyyy = Integer.parseInt(st.nextToken());
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<Student>(); 
        while(n-->0) {
            list.add(new Student(br.readLine()));
        }

        // 정렬후 출력
        Collections.sort(list);

        bw.write(list.get(list.size()-1).name+"\n");
        bw.write(list.get(0).name+"");

        br.close();
        bw.close();
    }
}