// 型の変換
// Javaは式を評価する過程で型変換を自動で行なっている。
// 仕組みは３つで


// ・代入時の自動型変換
//    値が小さな型の値を大きな型の変数に代入する場合に限って変換される。
public class Chapter1_2_5 {
    public static void main(String[] args){
        float a = 3;
        double b = a;
        System.out.println(a);
        //実行結果 3.0
        System.out.println(b);
        //実行結果 3.0
    }
}
// ※char型は文字を扱う型だが、0~65535の範囲の数値として情報を管理しているため厳密には整数型の一種。
// そのため算術演算子も使用でき自動型変換も行われる。


// ・強制的な型変換
//  　 代償（入りきらないデータの破損など）があるためなるべくしようしない）
public class Chapter1_2_5{
    public static void main(String[] args){
        int age = (int)3.2;
        System.out.println(age);
        //実行結果　3
        //(int)部分を強制的な型変換を明示するキャスト演算子という。
    }
}


// ・演算時の自動型変換
//    算術演算子などによって計算が行われる場合左右の型は同じにする必要があり、大きな型に統一されてから演算が行われる。
public class Chapter1_2_5{
    public static void main(String[] args){
        double a = 9.0 / 2;
        long b = 5 + 2L;
        System.out.println(a);
        // 実行結果 4.5
        System.out.println(b);
        //　実行結果　7(long型)
    }
}

//    オペランドが数値型、文字列型の組み合わせの場合、他方も文字列に変換して連結される。
public class Chapter1_2_5{
    public static void main(String[] args){
        String message = "私の年齢は" + 23 + "歳です。";
        System.out.println(message);
        // 実行結果 私の年齢は23歳です。
    }
}