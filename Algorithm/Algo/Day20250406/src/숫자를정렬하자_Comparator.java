import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 숫자를정렬하자_Comparator {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(in.readLine());
        int tc = 1;
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            st = new StringTokenizer(in.readLine(), " ");
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < N; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 < o2 ? -1 : 1;
                }
            });

            sb.append("#").append(tc).append(" ");
            for(int j = 0; j < N; j++){
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
            tc++;
        }

        System.out.println(sb.toString());
    }
}
