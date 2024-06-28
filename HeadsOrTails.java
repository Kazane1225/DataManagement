import java.util.Random;
public class HeadsOrTails {
    public static void main(String[] args){
        Random random = new Random();
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
        // 勝利メッセージを追加
        if (count_heads > count_tails) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
