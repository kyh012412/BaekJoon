import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> list = new LinkedList<Integer>();
		try {
			int tc = Integer.parseInt(br.readLine());
			for (int i = 0; i < tc; i++) {
				String temp = br.readLine();
				switch (temp.split(" ")[0]) {
				case "push":
					list.add(Integer.parseInt(temp.split(" ")[1]));
					break;
				case "top":
					if(list.peekLast()!=null) {
						bw.write("" + list.peekLast());
					}else {
						bw.write("-1");
					}
					bw.newLine();
					break;
				case "size":
					bw.write("" + list.size());
					bw.newLine();
					break;
				case "empty":
					if (list.isEmpty()) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					bw.newLine();
					break;
				case "pop":
					if(list.peekLast()!=null) {
						bw.write("" + list.pollLast());
					}else {
						bw.write("-1");
					}
					bw.newLine();
					break;
				default:
					break;
				}
			}

			bw.flush();
			br.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}