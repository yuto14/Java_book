// // 配列とfor文
// // 配列を表示する際、添え字に変数を利用できる。

public class Chapter1_4_4 {
     public static void main(String[] args){
         int[] scores = {10,20,30,40,50};
         for(int i=1; i < scores.length; i++){
             System.out.println(scores[i]);
        }
    }
}
// //実行結果 20 30 40 50

// //配列は添え字に変数を利用することが多い（以下定石パターン）
// // ①ループによる全要素の利用
// for(int i=0; i < 配列変数名.length; i++){
//     配列変数名[i]を使った処理
// }
// // ②ループによる集計
public class Chapter1_4_4 {
    public static void main(String[] args){
        int[] scores = {20,30,40,50};
        int sum = 0;
        for(int i = 0;i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("合計点" + sum);
    }
}
// // ③添え字に対応した情報の利用
// // 例）50点以上の科目の数を調べる
public class Chapter1_4_4 {
    public static void main(String[] args){
        int scores[] = {20,30,40,50};
        int count = 0;
        for(int i = 0;i < scores.length; i++){
            if(scores[i] >= 50){
                count++;
            }
        }
        System.out.println("50点以上の科目は" + count);
    }
}

// 添え字を利用した情報の利用（応用）
// ０〜３の整数がランダムに格納された１０個の要素を持つ配列seqがある。画面には
// ０、１、２、３ではなくA、T、G、Cと表示させたい
public class Chapter1_4_4 {
    public static void main(String[] args){
        int seq[] = new int[10];
        for(int i = 0;i < seq.length; i++){
            seq[i] = new java.util.Random().nextInt(4);
            }
        for(int i = 0;i < seq.length; i++){
            switch(seq[i]){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("T");
                break;
            case 2:
                System.out.println("G");
                break;
            case 3:
                System.out.println("C");
            }
        }
    }
}

// 上記のswitch文55~65行目は下記２行に書き換え可能
// char[] base = { 'A', 'T', 'G', 'C'};
// System.out.println(base[seq[i]] + " ");

public class Chapter1_4_4 {
    public static void main(String[] args){
        int seq[] = new int[10];
        for(int i = 0;i < seq.length; i++){
            seq[i] = new java.util.Random().nextInt(4);
            }
        for(int i = 0;i < seq.length; i++){
            char[] base = { 'A', 'T', 'G', 'C'};
            System.out.println(base[seq[i]] + " ");
        }
    }
}

// 拡張for文
// 拡張for文で配列を回す
// for(要素の型 任意の変数 : 配列変数名) {
//    ...
// }
// 拡張for文では任意の変数名に指定した変数に配列の要素の内容が格納される
public class Chapter1_4_4 {
    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50};
        for(int value : scores){
            System.out.println(value);
        }
    } 
}
// 拡張for文では　ループ変数や配列の添え字を記述する必要がないためコードがスッキリ見える