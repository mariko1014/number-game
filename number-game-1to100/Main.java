import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = rand.nextInt(100) + 1; // 1〜100
        int guess = 0;
        int count = 0;
        int maxAttempts = 5;

        System.out.println("数当てゲーム！1〜100の数字を当ててね");

        while (guess != answer) {
            System.out.print("予想を入力: ");
            guess = scanner.nextInt();
            count++;
            System.out.println("現在の回数: " + count);

            if (guess < answer) {
                System.out.println("もっと大きい！");
            } else if (guess > answer) {
                System.out.println("もっと小さい！");
            } else {
                System.out.println("正解！ " + count + "回で当たりました！");
            }

            if (count == maxAttempts){
                break;
            }
        }

        if(guess != answer){
            System.out.println("残念！正解は　" + answer + "でした！");
        }

        scanner.close();
    }
}