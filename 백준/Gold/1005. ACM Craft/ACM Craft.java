import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(reader.readLine());
            // T가 0이 아닐 때
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                // 건물의 개수 N
                int N = Integer.parseInt(st.nextToken());
                // 규칙의 개수 K
                int K = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(reader.readLine());
                int count = st.countTokens();
                Building[] buildings = new Building[count];
                for (int j = 0; j < count; j++) {
                    buildings[j] = (new Building(Integer.parseInt(st.nextToken())));
                }
                // 규칙의 개수만큼 연산하기
                for (int j = 0; j < K; j++) {
                    st = new StringTokenizer(reader.readLine());
                    int startB = Integer.parseInt(st.nextToken()) - 1;
                    int arriveB = Integer.parseInt(st.nextToken()) - 1;
                    buildings[arriveB].put(buildings[startB]);
                }
                int resultB = Integer.parseInt(reader.readLine()) - 1;
                System.out.println(buildings[resultB].getSec());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Building {
    // 기본 건설 시간
    int sec;
    // 해당 건물을 짓기 위해 필요한 건물들
    ArrayList<Building> bList;
    int total = -1;

    public Building(int sec) {
        this.sec = sec;
        this.bList = new ArrayList<>();
    }

    public int getSec() {
        if (total != -1) {
            return total;
        }
        int s = 0;
        for (Building b : bList) {
            s = Math.max(b.getSec(), s);
        }
        total = sec + s;
        return total;
    }

    public void put(Building building) {
        bList.add(building);
    }
}