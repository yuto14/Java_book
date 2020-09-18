// オーバーロード

// 同じ名前のメソッドを例外的に複数定義することをオーバーロード(多重定義）という。
// プログラムが大きくなると似たような処理を行うメソッドが複数出てくるが
// 基本的に同じメソッド名はつけることができない。
// しかし仮引数の型、個数が異なれば同じ名前のメソッドを複数定義することができる。
// メソッドを呼び出す際にJVMは引数の型、個数を比較して一致するもものを呼び出す。
// 引数は同じで戻り値の型だけが異なるものは定義できない。

// // 例 仮引数の型違い
// public class Chapter1_5_4 {
//     public static int add(int x, int y){
//         return x + y;
//     }
//     public static double add(double x, double y){
//         return x + y;
//     }
//     public static String add(String x, String y){
//         return x + y;
//     }
//     public static void main(String[] args){
//         System.out.println(add(10,20));
//         // 実行結果 30
//         System.out.println(add(10.0,20.0));
//         // 実行結果　30.0
//         System.out.println(add("10","20"));
//         // 実行結果 1020
//     }
// }

//　例　個数違い
public class Chapter1_5_4 {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        // 実行結果　30
        System.out.println(add(10,20,30));
        // 実行結果 60
    }
}