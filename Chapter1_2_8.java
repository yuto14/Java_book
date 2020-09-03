
// 練習２−１
// public class Chapter1_2_8 {
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 10;
//         String ans = "x＋yは" + (x + y);
//         System.out.println(ans);
//     }
// }

// 練習２−２
// ②、④、⑤、⑦

// 練習２−３
public class Chapter1_2_8 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        ++fortune;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("１：大吉　２：中吉　３：小吉 ４：凶");
    }
}