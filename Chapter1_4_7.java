// 多次元の配列

// 配列には[0]などの１次元配列だが、[1][0]などの２次元配列がある。
// ２次元以上の配列も存在しまとめて多次元配列という。
// ※多次元配列は業務システムではあまり使用されないが科学技術計算などでは多く利用される。

// 2次元配列の宣言
// 要素の型[][] 配列変数名 = new 要素の型[行数][列数];

// ２次元配列の要素の利用
// 配列変数名[行の添え字][列の添え字];

public class Chapter1_4_7 {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        scores[0][0] = 40;
        scores[0][1] = 50;
        scores[0][2] = 60;
        scores[1][0] = 70;
        scores[1][1] = 80;
        scores[1][2] = 90;
        System.out.println(scores[1][1]);
    }
}
// 実行結果　80
// 上記のコードは２行×３列のイメージだが実際は配列の配列になる。

// 親配列と子配列を表示
public class Chapter1_4_7 {
    public static void main(String[] args){
        int[][] scores = {{40, 50, 60}, {70, 80, 90}};
        System.out.println(scores.length);
        // 実行結果 2 (親配列の要素数)
        )
        System.out.println(scores[0].length);
        // 実行結果 3 (子配列の要素数)
    }
}