// 配列の内部処理について

public class Chapter1_4_5 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        int[] arrayB;
        arrayB = arrayA;
        arrayB[0] = 100;
        System.out.println(arrayA[0]);
    }
}
// 実行結果　100


// メモリと変数
// 配列はコンピュータのメモリに記録され、碁盤の目のように区画整理されている。
// 各区画には住所（アドレス）がふられる。
// 配列変数の住所の場合、要素の先頭のみが代入される。
// 例）　int[] scores = new int[5];の場合。
// ①int型の要素を5つ持つ配列がメモリ上に作成される。
// ②int[]型の配列変数scoresがメモリ上に作成される
// ③配列変数scoresに配列の先頭要素のアドレスが代入される。

// scores[n]の場合
// ①scoresから番地を取り出し、配列（先頭要素を見つける）
// ②見つけた配列の先頭要素からn個後ろの要素の区画を読み書きする。


// 配列scoresは「配列の実体は〇〇番地にある」と示していることになるがこれを参照と呼ぶ。
// メモリ上の番地を代入する変数のことを参照型変数（reference type)といい、
// int型、boolean型は基本型変数（primitive types)と呼ぶ。