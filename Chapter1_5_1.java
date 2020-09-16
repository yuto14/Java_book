// メソッド

// プログラミング言語は１つのプログラムを複数の部品に分けて作ることができる仕組みを備えており
// メソッドは複数の文をまとめそれを１つの処理として名前をつけたもので部品の最小単位になる。
// メリット
// 　・プログラムがみやすくなり全体を把握しやすくなる
// 　・機能単位に記述するため修正範囲を限定できる
// 　・同じ処理を１つのメソッドにまとめることで作業効率が上がる

// メソッドの定義
public static 戻り値の値 メソッド名（引数リスト） {
    メソッドが呼び出された時の具体的な処理
}

// 例
public class Chapter1_5_1 {
    public static void Hello(){
        System.out.println("こんにちは");
    }
}
// Helloがメソッド名
// Helloの後ろの{}をメソッドブロックとよぶ。

// メソッドの呼び出し
メソッド名（引数リスト）

// Helloメソッドの呼び出し
public class Chapter1_5_1 {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        Hello();
        System.out.println("メソッドの呼び出しが終わりました");
    }
    public static void Hello(){
        System.out.println("こんにちは");
    }
}
// 実行結果　メソッドを呼び出します。
//         こんにちは
//         メソッドの呼び出しが終わりました。

// Mainメソッド(Chapter1_5_1)以外からメソッドを呼び出す。
public class Chapter1_5_1 {
    public static void methodA() {
        System.out.println("メソッドA");
        methodB();
    }
    public static void methodB() {
        System.out.println("メソッドB");
    }
    public static void main(String[] args) {
        methodA();
    }
}
// 実行結果　メソッドA
//         メソッドB

// メソッドの実行順序
// ソースコード中のメソッドは順序を入れ替えても動作に影響はない
// 同列の存在として扱われる。（上に書いても先に実行される訳ではない）
// mainメソッドを基準にどう呼び出されるかで決まる。
プログラムは必ずmainメソッドから動き始める!

// メソッド名の後ろの()は変数と区別するためにつけている。
// 引数なしでも()は必ずつける