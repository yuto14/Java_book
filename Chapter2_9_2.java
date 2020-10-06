// コンストラクタ

// newでインスタンスを生成した直後の初期値
int,short,long型などの数値の型　0
char型　¥u0000
boolean型　false
int[]型などの配列型 null
String型などのクラス型 null


// Javaではインスタンスが生まれた直後に自動実行される処理を予め定義できるようになっている
// 例）
public class Hero {
    String name;
    int hp;
    public void attack() {

    }
    public Hero() {
        this.hp = 100;
        // hpフィールドを１００で初期化
    }
}
// attackメソッドの通常メソッドは誰かから呼び出す必要があるが、Heroはnewされた直後に自動的に実行される
// という特別な性質を持っている。このようなメソッドを　コンストラクタ　という。

// コンストラクタが定義されたHeroを生み出す
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.hp);
        // 実行結果 100
    }
}
// コンストラクタは開発者が直接呼び出すことはできない。
// 開発者は Hero h = new Hero();のようにインスタンスを生成するだけで良い。
// Hero()はJVMが実行してくれる。

コンストラクタと見なされる条件
①メソッド名がクラス名と完全に等しい。
②メソッド宣言に戻り値が記述されていない（voidも不可）

コンストラクタの定義
public class クラス名 {
    クラス名() {
        自動実行する処理;
    }
}

// コンストラクタに情報を渡す
public class Hero {
    String name;
    int hp;
    public Hero(String name) {
        // String nameで引数として文字列を受け取る
        this.hp = 100;
        // hpフィールドを１００で初期化
        this.name = name;
        // 引数の値でnameフィールドを初期化
    }
}
// コンストラクタに引数を渡す時はnew時に指定する
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");
        // インスタンス生成後JVMがコンストラクタを呼び出す際　ミナト　を渡してもらえる
        System.out.println(h.hp);
        // 実行結果 100
        System.out.println(h.name);
        // 実行結果 ミナト
    }
}

// ２つ以上の同名コンストラクタを定義する
// 上記のHeroインスタンスは生成時に必ず文字列型の引数が１つ必要になり、なければエラーになる。
// 引数を受け取らないコンストラクタを同時に定義することでこれを解決できる。

// 例）コンストラクタのオーバーロード
public class Hero {
    String name;
    int hp;
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public Hero(){
        // 引数の数を変えることでHeroメソッドを定義できる
        this.hp = 100;
        this.name = "ダミー";
    }
}

// 複数のコンストラクタが定義されている場合
// newする時に渡した引数の型・数・順番に一致するコンストラクタが動作する。
// 動作するコンストラクタは１つのみ


暗黙のコンストラクタ
Javaでは全てのクラスはインスタンス化に際して必ず何らかのコンストラクタを実行することになっている。
そのため本来全てのクラスは最低１つ以上のコンストラクタ定義を持っていなければならない。

コンストラクタの特例
クラスに１つもコンストラクタが定義されていない場合に限って引数なし、処理内容なしのコンストラクタ
（デフォルトコンストラクタ）がコンパイル時に追加される。

// 他のコンストラクタを呼び出す
// ２つのコンストラクタの記述に重複する部分がある場合一方のインスタンスからもう一方を呼び出すことで
// 重複を避けることができる。
// 例）
public class Hero {
    String name;
    int hp;
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public Hero(){
        this("ダミー");
        // コンストラクタ①を呼び出すようにJVMに依頼。
        // this.Heroではエラー（開発者は呼び出せない）
    }
}

this(引数)
同一クラスの別コンストラクタを呼び出す。