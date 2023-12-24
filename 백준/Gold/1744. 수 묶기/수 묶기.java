import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static ArrayList<Integer> list = new ArrayList<Integer>();	
	static Deque<Integer> list2;	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int total = 0;
		
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		list2 = new LinkedList<Integer>(list);
		synchronized (list2) {
			while(list2.size()>1 && list2.peekLast()>1) {
				int a = list2.pollLast();
				if(list2.peekLast()>1) {
					total += a*list2.pollLast();
					continue;
				}else {
					total += a;
					break;
				}
			}
			while(list2.contains(1)) {
				total+=1;
				list2.remove(1);
			}
			while(list2.size()>1) {
				total+= list2.pollFirst()*list2.pollFirst();
			}
			if(list2.size()==1) {
				total+=list2.poll();
			}
		}
		
		bw.write(total+"");		
		
		br.close();
		bw.close();
	}
}