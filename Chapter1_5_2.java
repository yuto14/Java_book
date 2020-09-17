// 引数の利用

// メソッドを呼び出す際に呼び出し元から値を渡すことができるがこの値を引数という。

public class Chapter1_5_2 {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        hello("ミナト");
        hello("アスカ");
        hello("スガワラ");
        System.out.println("呼び出しを終了します。");
    }
    public static void hello(String name){
        // helloメソッドが呼び出された際に文字列変数nameに引数が代入される
        System.out.println(name + "さん、こんにちは");
    } 
}
//　実行結果 メソッドを呼び出します。
//        　ミナトさん、こんにちは
//          アスカさん、こんにちは
//          スガワラさん、こんにちは
//          呼び出しを終了します。


// 複数の引数を渡す場合
// 値を,で区切って渡す。この際引数として渡す型と、受け取る変数の型、順番に注意。
// String型の値をint型で受け取れないなど。
public class Chapter1_5_2 {
    public static void main(String[] args) {
        add(100, 20);
        add(200, 50);
    }
    public static void add(int x,int y){
        int ans = x + y;
        System.out.println(x + "＋" + y + "＝" + ans);
    }
}
// 実行結果　100 + 20 = 120
//         200 + 50 = 250


//引数の渡し方
// 何も渡さない場合 メソッド名()
// 値を１つ渡す場合 メソッド名(値)
// 値を複数渡す場合 メソッド名(値, 値, ...)
// ※値には変数名を指定することもできる

// 引数は渡す値を実引数、受け取る変数のことを仮引数という。

// 引数を使わずに値を渡せないのか？
public class Chapter1_5_2 {
    public static void main(String[] args) {
        int x = 100;
        int y = 10;
        add();
    }

    public static add(){
        int ans = x + y;
        System.out.println(x "+" + y + "=" + ans);
    }
}
// 上記はコンパイルできない(x、yはmainメソッド内でしか使用できないから（スコープ））

// main()、add()などメソッド内で宣言した変数をローカル変数という。
// ローカル変数はその変数が属するメソッドないだけで有効になり、別のメソッドに属する
// 同名のローカル変数とは全くの別物
// 例）main()の変数x、add()の変数xは互いに無関係