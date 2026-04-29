import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = rand.nextInt(100) + 1; // 1〜100
        int guess = 0;
        int count = 0;
        int maxAttempts = 8; //回数制限

        System.out.println("数当てゲーム！1〜100の数字を当ててね");
        System.out.println(+ maxAttempts + "回以内に数字を当てたら成功"); //回数制限機能をつける時に入れる文

        while (guess != answer) {
            count++;
            if(count < maxAttempts){
                System.out.println("現在の回数: " + count);
            }else if (count == maxAttempts) {
                System.out.println("現在の回数: " + count + "　ラストチャンス！");
            }


            System.out.print("予想を入力: ");
            guess = scanner.nextInt();

            if (guess < answer && count < maxAttempts) {
                System.out.println("もっと大きい！");
            } else if (guess > answer && count < maxAttempts) {
                System.out.println("もっと小さい！");
            } else if (guess == answer){
                System.out.println("正解！ " + count + "回で当たりました！");
            }

            if (count == maxAttempts){ //解答回数が制限と同じ値になったらwhileから抜け出す
                break;
            }
        }

        if(guess != answer){
            System.out.println("残念！正解は　" + answer + "でした！");
        }
        //抜け出した先で答えと入力値が違った時だけ、正解の値を表示。

        scanner.close();
    }
}