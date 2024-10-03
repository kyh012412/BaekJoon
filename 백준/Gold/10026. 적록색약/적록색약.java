import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};

    public static String turned(String str) {
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!='G')
                sb.append(str.charAt(i));
            else
                sb.append('R');
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String s[] = new String[n];

        for(int i=0;i<n;i++) {
            s[i] = br.readLine();
        }

        int no=0,abno=0;

        boolean nov[][] = new boolean[n][n];

        Deque<int[]> dq = new LinkedList<int[]>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(!nov[i][j]) {
                    no++;
                    nov[i][j]= true;
                    dq.add(new int[] {i,j,s[i].charAt(j)});
                    while(!dq.isEmpty()) {
                        int polled[] = dq.poll();
                        char tc = (char)polled[2];
                        for(int k=0;k<4;k++) {
                            int nr = polled[0]+dy[k];
                            int nc = polled[1]+dx[k];

                            if(nr<0 || nc<0 || nr>=n || nc>=n) continue;
                            if(nov[nr][nc]) continue;

                            if(tc!=s[nr].charAt(nc)) continue;

                            nov[nr][nc] = true;
                            dq.add(new int[] {nr,nc,s[nr].charAt(nc)});
                        }
                    }
                }
            }
        }

        for(int i=0;i<n;i++) {
            s[i] = turned(s[i]);
        }

        nov = new boolean[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(!nov[i][j]) {
                    abno++;
                    nov[i][j]= true;
                    dq.add(new int[] {i,j,s[i].charAt(j)});
                    while(!dq.isEmpty()) {
                        int polled[] = dq.poll();
                        char tc = (char)polled[2];
                        for(int k=0;k<4;k++) {
                            int nr = polled[0]+dy[k];
                            int nc = polled[1]+dx[k];

                            if(nr<0 || nc<0 || nr>=n || nc>=n) continue;
                            if(nov[nr][nc]) continue;

                            if(tc!=s[nr].charAt(nc)) continue;

                            nov[nr][nc] = true;
                            dq.add(new int[] {nr,nc,s[nr].charAt(nc)});
                        }
                    }
                }
            }
        }

        bw.write(no+" "+abno);

        bw.close();
        br.close();
    }
}