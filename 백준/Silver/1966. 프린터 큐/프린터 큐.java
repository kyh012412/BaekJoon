import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static int targetIndex;
	public static int targetPriority;
	public static int ans;
	public static Deque<Integer> q = new LinkedList<Integer>();
	public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	public static int waitcount=0;
	
	public static void next() {
		q.addLast(q.pollFirst());
		nextTargetIndex();
	}
	
	public static void nextTargetIndex() {
		targetIndex = (targetIndex-1<0)?q.size()-1:targetIndex-1;		
	}
	
	public static void print() {
		q.poll();
		pq.poll();
		ans++;
		nextTargetIndex();
	}


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        while(tc-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	targetIndex = Integer.parseInt(st.nextToken());
        	
        	st = new StringTokenizer(br.readLine());
        	q.clear();
        	pq.clear();
        	ans=0;
        	int index=0;
        	while(st.hasMoreTokens()) {
        		int temp = Integer.parseInt(st.nextToken());
        		q.add(temp);
        		pq.add(temp);
        		if(index==targetIndex) {
        			targetPriority = temp;
        		}
        		index++;
        	}
        	
        	outer:while(true) {
        		if(q.peek()!=pq.peek()) { // 뽑을 수 없음 (최고우선순위 아님)
        			next();
        		}else if(q.peek()!=targetPriority) { //뽑을 수 있음 최고 우선순위임 / 목표타겟이 아니면
        			print();
        		}else if(targetIndex!=0) {// 뽑는 숫자가 목표우선순위임 다만 원하는 목표우선순위는 아닌 다른 우선순위임
        			print();
        		}else {
        			print();
        			break;
        		}
        	}
        	
        	bw.write(ans+"\n");
        }
        
        br.close();
        bw.close();
    }
}