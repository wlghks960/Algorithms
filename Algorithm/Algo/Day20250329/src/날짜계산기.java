import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산기 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(in.readLine());
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(in.readLine());
            int res1 = 0;
            int res2 = 0;
            int answer = 0;
            int mon1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int mon2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            for(int i=1; i< mon1; i++){
                res1 += days[i];
            }

            for(int i=1; i<mon2; i++){
                res2 += days[i];
            }

            res1 += day1;
            res2 += day2;

            answer = Math.abs(res2 - res1) + 1;
            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }
        System.out.print(sb.toString());
    }
}
