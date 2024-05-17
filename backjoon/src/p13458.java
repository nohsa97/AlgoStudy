import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13458 {
    public static void main(String[] args) throws IOException {
        int N;
        long [] room;
        long B,C;
        long sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        room = new long[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            if(room[i] <= B) {
                sum++;
            }
            else {
                room[i] -= B;
                sum++;
                double tmp = room[i] / (double)C;
                tmp = Math.ceil(tmp);
                sum = (long)(sum + tmp);
            }
        }

        System.out.println(sum);

    }


}


/*
    N개의 시험장.
    I번에 있는 피험자는 AI.
    총감독관은 B명 감시. 부감독관은 C명 감시 1시험장에서만
    응시생 모두를 감시해야하는 경우 필요한감독관 수의 최솟값

    총감독관은 무조건 1명/ 부감독관은 여러명 가능.


    첫줄에 시험장 갯수
    둘째줄 시험장의 응시자수
    셋째줄에 B와 C 값 주어짐.

   3개의 방.
   3(2) / 4(2) / 5(3)
   2 / 2의 경우

   필요 값 = 총감독관 1명이 처리한 값 + 나머지 필요 감독관 값 도출?

   5
   10 9 10 9 10
   7 20
   3 / 2 / 3 / 2 / 3
 */