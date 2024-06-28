import java.util.Random;
import java.util.Scanner;
public class HeadsOrTails {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Who are you?\n>");
        String name;
        name = sc.nextLine();
        System.out.printf("Hello, %s!", name);
        int count_heads = 0;
        int count_tails = 0;
        for(int i = 0; i < 3; i++){
            System.out.printf("Round %d: ", i + 1);
            int toss = random.nextInt(2);
            if (toss == 0){
                System.out.println("heads");
                count_heads++;
            } else {
                System.out.println("tails");
                count_tails++;
            }
        }
        System.out.printf("Heads: %d, Tails: %d\n", count_heads, count_tails);
        // ユーザー名を含む勝利メッセージを追加
        if (count_heads > count_tails) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }
}
