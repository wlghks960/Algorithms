import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이숫자_deltaIndex {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        int tc = 1;
        while(T-->0){
            int N = Integer.parseInt(in.readLine());
            int x = 0, y = 0;
            int d = 0;
            int[][] matrix = new int[N][N];
            int element = 1;
            while(element <= N * N){
                matrix[x][y] = element++;
                int nextX = x + dx[d];
                int nextY = y + dy[d];
                if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= N || matrix[nextX][nextY] != 0){
                    d = (d + 1) % 4;
                    nextX = x + dx[d];
                    nextY = y + dy[d];

                }
                x = nextX;
                y = nextY;
            }
            sb.append("#").append(tc).append("\n");
            for(int r=0;r<N;r++){
                for(int c=0;c<N;c++){
                    sb.append(matrix[r][c]).append(" ");
                }
                sb.append("\n");
            }
            tc++;
        }
        System.out.println(sb.toString());
    }
}
