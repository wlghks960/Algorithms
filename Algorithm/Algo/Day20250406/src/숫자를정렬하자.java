import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class 숫자를정렬하자 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int tc = 1;
            int N = Integer.parseInt(in.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(in.readLine(), " ");

            for(int i = 0; i < N; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list);

            sb.append("#").append(tc).append(" ");
            for(int i = 0; i < N; i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
            tc++;
        }
        System.out.println(sb.toString());
    }
}