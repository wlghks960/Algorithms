import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 쉬운거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        int tc = 1;
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            /**
             * 0 : 50,000원 카운트
             * 1 : 10,000원
             * 2 : 5,000원
             * 3 : 1,000원
             * 4 : 500원
             * 5 : 100원
             * 6 : 50원
             * 7 : 10원
             * */
            int[] money = new int[8];
            money[0] = 50000;
            money[1] = 10000;
            money[2] = 5000;
            money[3] = 1000;
            money[4] = 500;
            money[5] = 100;
            money[6] = 50;
            money[7] = 10;
            int[] moneyCount = new int[8];

            for (int i = 0; i < money.length; i++) {
                if(N >= money[i] ) {
                    moneyCount[i] = N / money[i];
                    N %= money[i];
                }
            }

            sb.append("#").append(tc).append("\n");
            for(int i = 0; i < moneyCount.length; i++) {
                sb.append(moneyCount[i]).append(" ");
            }
            sb.append("\n");
            tc++;
        }
        System.out.println(sb);

    }
}
