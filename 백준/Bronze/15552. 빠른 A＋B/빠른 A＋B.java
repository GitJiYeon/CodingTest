import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 방식 최적화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 입력 받기

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            bw.write((A + B) + "\n"); // 합을 BufferedWriter를 통해 출력
        }

        bw.flush(); // 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}