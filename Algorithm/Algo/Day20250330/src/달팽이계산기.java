import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class 달팽이계산기 {
    public static void funcUp(int[][] matrix) {

        for(int i = matrix.length- 1; i >= n; i--){
            if(matrix[i][n] > 0) continue;
            else matrix[i][n] = ++element;
        }
    }
    public static void funcDown(int[][] matrix) {
        for(int i = n; i < matrix.length; i++){
            if(matrix[i][matrix.length - n -1 ] > 0) continue;
            else matrix[i][matrix.length - n - 1] = ++element;
        }
    }

    public static void funcLeft(int[][] matrix) {
        for(int i = matrix.length - 1; i >= n; i--){
            if(matrix[matrix.length - n - 1 ][i] > 0) continue;
            else matrix[matrix.length - n - 1][i] = ++element;
        }
    }
    public static void funcRight(int[][] matrix) {
        if(matrix[n][n] > 0){
            ++n;
        }

        for(int i = n; i < matrix.length; i++){
            if(matrix[n][i] > 0) continue;
            else matrix[n][i] = ++element;
        }
    }

    private static int n, element;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(in.readLine());
            int[][] matrix = new int[N][N];
            element = 0;
            n = 0;
            sb.append("#").append(tc).append("\n");
            while(element < N*N){
                funcRight(matrix);
                funcDown(matrix);
                funcLeft(matrix);
                funcUp(matrix);
            }


            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    sb.append(matrix[j][k]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}