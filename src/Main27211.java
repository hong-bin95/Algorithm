import java.util.*;
import java.io.*;
public class Main27211 {

    static int[] mx = {-1,1,0,0};
    static int[] my = {0,0,-1,1};

    static char ch = 'a';

    static int N,M;
    static boolean visited[][];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        int[][] arr = new int[N][M];

        for(int i = 0 ; i < N; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0 ; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1)
                    visited[i][j] = true;
            }
        }

        int answer = 0;

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
               if(visited[i][j] == false){
                   visited[i][j] = true;
                   answer += 1;
                   search(i,j);
               }
            }
        }

        System.out.println(answer);
    }

    private static void search(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});

        while(q.isEmpty() == false){
            int now[] = q.poll();
            for(int k = 0; k < 4; k++){
                int nx = now[0] + mx[k];
                int ny = now[1] + my[k];
                if(nx == -1){
                    nx = N-1;
                }
                if(ny == -1){
                    ny = M-1;
                }
                if(nx == N){
                    nx = 0;
                }
                if(ny == M){
                    ny = 0;
                }
                if(nx >= 0 && nx < N && ny >= 0 && ny < M
                    && visited[nx][ny] == false){
                    visited[nx][ny] = true;
                    q.add(new int[] {nx,ny});
                }
            }
        }
    }


}
