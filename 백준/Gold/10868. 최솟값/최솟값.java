
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static int n;
	static int k;
	static int arr[];
	static int btree[];
	static int stree[];

	public static void settree() {
		settree(1, 1, n);
	}

	public static void settree(int treeidx, int arridx1, int arridx2) {
		if (arridx1 == arridx2) {
			btree[treeidx] = arr[arridx1];
			stree[treeidx] = arr[arridx1];
			return;
		}
		int mid = arridx1 + (arridx2 - arridx1) / 2;
		settree(treeidx * 2, arridx1, mid);
		settree(treeidx * 2 + 1, mid + 1, arridx2);
		btree[treeidx] = Math.max(btree[treeidx * 2], btree[treeidx * 2 + 1]);
		stree[treeidx] = Math.min(stree[treeidx * 2], stree[treeidx * 2 + 1]);
	}

	public static int getbval(int l, int r) {
		return getbval(l, r, 1, 1, n);
	}
	
	public static int getsval(int l, int r) {
		return getsval(l, r, 1, 1, n);
	}

	public static int getbval(int l, int r, int nodeidx, int coverl, int coverr) {
		if (coverr < l || r < coverl) {
			return 0;
		}
		if (l <= coverl && coverr <= r) {
			return btree[nodeidx];
		}
		int mid = coverl + (coverr - coverl) / 2;
		return Math.max(getbval(l, r, nodeidx * 2, coverl, mid), getbval(l, r, nodeidx * 2 + 1, mid + 1, coverr)); 
	}
	
	public static int getsval(int l, int r, int nodeidx, int coverl, int coverr) {
		if (coverr < l || r < coverl) {
			return 1000000001;
		}
		if (l <= coverl && coverr <= r) {
			return stree[nodeidx];
		}
		int mid = coverl + (coverr - coverl) / 2;
		return Math.min(getsval(l, r, nodeidx * 2, coverl, mid), getsval(l, r, nodeidx * 2 + 1, mid + 1, coverr)); 
	}
//	public static void reset(int arridx, long newval) {
//		reset(arridx, newval, 1, 1, n);
//	}
//
//	public static void reset(int arridx, long newval, int treeidx, int nl, int nr) {
//		if (arridx < nl || nr < arridx) {
//			return;
//		}
//		if (nl == nr) {
//			btree[treeidx] = newval;
//			return;
//		}
//		int mid = nl + (nr - nl) / 2;
//		reset(arridx, newval, treeidx * 2, nl, mid);
//		reset(arridx, newval, treeidx * 2 + 1, mid + 1, nr);
//		btree[treeidx] = btree[treeidx * 2] + btree[treeidx * 2 + 1];
//	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		k = Integer.parseInt(v[1]);

		arr = new int[n + 1];
		btree = new int[4 * n];
		stree = new int[4 * n];
		Arrays.fill(stree, 1000000001);

		for (int i = 1; i < n + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
//			System.out.println("배열값" + i + "번째" + arr[i]);
		}

		settree();

//		for (int i = 1; i < btree.length; i++) {
//			System.out.println("b트리값" + i + "번째" + btree[i]);
//		}
//		for (int i = 1; i < btree.length; i++) {
//			System.out.println("s트리값" + i + "번째" + stree[i]);
//		}

		for (int i = 0; i < k; i++) {
			v = br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			bw.write(getsval(a, b)+"");
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}