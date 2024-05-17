import java.io.*;
import java.util.*;

public class p12100 {
    static int N;
    static int Max = 0;
    static int [][] map;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

//        for (int i = 0; i < 4; i++) {
//            SearchMap(1,map);
//        }
        int [][] test;
        test = map;

        test = Upper(test);
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(test[i]));
        }

        test = map;

        test = Down(test);
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(test[i]));
        }
    }

    public static void SearchMap (int number, int [][] resultMap) {
        for (int i = 0; i < 4; i++) {

        }
    }

    public static int[][] Upper (int [][] baseMap) {
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N; j++) {
                if(baseMap[i][j] == baseMap[i+1][j]){
                    baseMap[i][j] *= 2;
                    baseMap[i+1][j] = 0;
                }
                else if(baseMap[i][j] == 0) {
                        baseMap[i][j] = baseMap[i+1][j];
                        baseMap[i+1][j] = 0;
                }
            }
        }
        return baseMap;
    }

    public static int[][] Down (int [][] baseMap) {
        for (int i = N-1; i > 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if(baseMap[i][j] == baseMap[i-1][j]){
                    baseMap[i][j] *= 2;
                    baseMap[i-1][j] = 0;
                }
                else if(baseMap[i][j] == 0) {
                    baseMap[i][j] = baseMap[i-1][j];
                    baseMap[i-1][j] = 0;
                }
            }
        }
        return baseMap;
    }


    public static void FindMax(int[][] resultMap) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(Max < resultMap[i][j])
                    Max = resultMap[i][j];
            }
        }
    }
}
