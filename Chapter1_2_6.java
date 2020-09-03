// 命令実行の文
// Javaが準備してくれている様々な命令を呼び出すための文。
// 記述方法　呼び出す命令の名前（引数）;


// ・改行せずに画面に文字を表示する命令　System.out.print(引数);
public class Chapter1_2_6 {
    public static void main(String[] args){
        String name = "すがわら";
        System.out.print("私の名前は");
        System.out.print(name);
        System.out.print("です");
        // 実行結果　私の名前はすがわらです。
    }
}

// ・２つの値を比較して大きい数値を代入する命令　Math.max  例）int m = Math.max(引数１, 引数２);
public class Chapter1_2_6 {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int m = Math.max(a,b);
        System.out.println( a + "と" + b +"の数値を比較して大きいのは" + m );
        //　実行結果　10と5の数値を比較して大きいのは10
    }
}

// ・文字列を数値に変換
// 例　int n = Integer.parseInt(引数);
public class Chapter1_2_6 {
    public static void main(String[] args){
        String age = "20";
        int n = Integer.parseInt(age);
        System.out.println("あなたは来年、" + (n + 1) + "歳になります。");
        //あなたは来年、21歳になります。
    }
}
// 文字列１０を数値に変換することで計算ができる

// ・乱数を発生させる
// 　　int r = new java.util.Random().nextInt(①);
//    ※①は発生させる乱数の上限値
public class Chapter1_2_6{
    public static void main(String[] args){
        int r = new java.util.Random().nextInt(10);
        System.out.println("あなたに多分" + r + "回会ったことがある");
        // あなたに多分（１〜９）回会ったことがある）
    }
}

// ・キーボードから１行の文字列の入力を受け付ける
//   String s = new java.util.Scanner(System.in).nextLine();

// ・キーボードから１つの整数の入力を受け付ける
//   int input = new java.util.Scanner(System.in).nextInt();
public class Chapter1_2_6 {
    public static void main(String[] args){
        System.out.println("あなたの年齢を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println("あなたの名前を入力してください");
        String s = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの名前は" + name + "年齢は" + age); 
        // 実行結果　あなたの名前は（入力した文字）、年齢は（入力した数値）
    }
}
