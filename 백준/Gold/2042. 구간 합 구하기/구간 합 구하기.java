
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int k;
	static long arr[];
	static long tree[];

	public static void settree() {
		settree(1, 1, n);
	}

	public static void settree(int treeidx, int arridx1, int arridx2) {
		if (arridx1 == arridx2) {
			tree[treeidx] = arr[arridx1];
			return;
		}
		int mid = arridx1 + (arridx2 - arridx1) / 2;
		settree(treeidx * 2, arridx1, mid);
		settree(treeidx * 2 + 1, mid + 1, arridx2);
		tree[treeidx] = tree[treeidx * 2] + tree[treeidx * 2 + 1];
	}

	public static long getsum(int l, int r) {
		return getsum(l, r, 1, 1, n);
	}

	public static long getsum(int l, int r, int nodeidx, int coverl, int coverr) {
		if (coverr < l || r < coverl) {
			return 0;
		}
		if (l <= coverl && coverr <= r) {
			return tree[nodeidx];
		}
		int mid = coverl + (coverr - coverl) / 2;
		return getsum(l, r, nodeidx * 2, coverl, mid) + getsum(l, r, nodeidx * 2 + 1, mid + 1, coverr);

	}

	public static void reset(int arridx, long newval) {
		reset(arridx, newval, 1, 1, n);
	}

	public static void reset(int arridx, long newval, int treeidx, int nl, int nr) {
		if (arridx < nl || nr < arridx) {
			return;
		}
		if (nl == nr) {
			tree[treeidx] = newval;
			return;
		}
		int mid = nl + (nr - nl) / 2;
		reset(arridx, newval, treeidx * 2, nl, mid);
		reset(arridx, newval, treeidx * 2 + 1, mid + 1, nr);
		tree[treeidx] = tree[treeidx * 2] + tree[treeidx * 2 + 1];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		k = Integer.parseInt(v[1]) + Integer.parseInt(v[2]);

		arr = new long[n + 1];
		tree = new long[4 * n];

		for (int i = 1; i < n + 1; i++) {
			arr[i] = Long.parseLong(br.readLine());
//			System.out.println("배열값" + i + "번째" + arr[i]);
		}

		settree();

//		for (int i = 1; i < tree.length; i++) {
//			System.out.println("트리값" + i + "번째" + tree[i]);
//		}

		for (int i = 0; i < k; i++) {
			v = br.readLine().split(" ");
			int b = Integer.parseInt(v[1]);
			long c = Long.parseLong(v[2]);
			switch (v[0]) {
			case "1":
				arr[b] = c;
				reset(b, c);
				break;
			case "2":
				bw.write(getsum(b, (int)c) + "");
				bw.newLine();
				break;
			default:
				break;
			}
		}

		bw.close();
		br.close();
	}
}