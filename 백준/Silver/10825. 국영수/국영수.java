import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	
	
	@Override
	public int compareTo(Student o) {
        if (this.kor != o.kor)
            return o.kor - this.kor;
        else if (this.eng != o.eng)
            return this.eng -o.eng;
        else if(this.math != o.math)
            return o.math - this.math;
        else
        	return name.compareTo(o.name);
	}
	
	public Student(String str) {
		StringTokenizer st= new StringTokenizer(str);
		name = st.nextToken();
		kor = Integer.parseInt(st.nextToken());
		eng = Integer.parseInt(st.nextToken());
		math = Integer.parseInt(st.nextToken());				
	}
}

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=0;i<n;i++) {
			list.add(new Student(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i=0;i<n;i++) {
			bw.write(list.get(i).name+"\n");;
		}
		
		br.close();
		bw.close();
	}
}