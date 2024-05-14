import java.io.*;
import java.util.*;

public class p1260_re {
    static int [][] map;
    static int [] visited;
    public static void main(String[] args) throws IOException {
        int N,M,V;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new int[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int second = Integer.parseInt(st.nextToken()) - 1;

            map[first][second] = 1;
            map[second][first] = 1;
        }
        DFS(V-1,N);
        System.out.println();

        visited = new int[N];
        BFS(V-1,N);
    }
    public static void DFS(int start, int N) {
        int out = start + 1;
        System.out.print(out + " ");
        visited[start] = 1;
        for (int i = 0; i < N; i++) {
            if (map[start][i] == 1 && visited[i] != 1){
                DFS(i, N);
            }
        }
    }


    public static void BFS(int start, int N) {
        Queue que = new LinkedList<Integer>();
        que.add(start);
        visited[start] = 1;
        while(!que.isEmpty()) {
            start = (int)que.poll();
            int out = start + 1;
            System.out.print(out + " ");
            for (int i = 0; i < N; i++) {
                if(map[start][i] == 1 && visited[i] != 1) {
                    que.add(i);
                    visited[i] = 1;
                }
            }

        }


    }
}

// 전임자 1 인 경우,
