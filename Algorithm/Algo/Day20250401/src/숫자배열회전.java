import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class 숫자배열회전 {
    public static int[][] rotate(int[][] matrix, int N) {
        int[][] result = new int[matrix.length][matrix.length];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                result[j][N-i-1] = matrix[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T  = Integer.parseInt(in.readLine());
        for(int t = 1; t <= T; t++){
            int N = Integer.parseInt(in.readLine());
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(in.readLine());
                for(int j = 0; j < N; j++){
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] matrix_90 = rotate(matrix, N);
            int[][] matrix_180 = rotate(matrix_90, N);
            int[][] matrix_270 = rotate(matrix_180, N);

            sb.append("#").append(t).append("\n");

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    sb.append(matrix_90[i][j]);
                }

                sb.append(" ");

                for(int j = 0; j < N; j++){
                    sb.append(matrix_180[i][j]);
                }

                sb.append(" ");

                for(int j = 0; j < N; j++){
                    sb.append(matrix_270[i][j]);
                }

                sb.append("\n");
            }

        }
        System.out.println(sb.toString());

    }
}