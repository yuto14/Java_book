// クラスの定義方法

//クラスには属性、操作を記述していく。
//クラスの設計内藤を上から一覧として並べる書き方を　クラス図　といい
//世界共通の設計図として定められた　UML　で定められている図の一つ。

//例)
public class Hero {
    public static void main(String[] args) {
        String name;
        int hp;
        // 上記が属性の定義
        public void attack(){...}
        public void sleep(){...}
        public void sit(int sec){...}
        public void slip(){...}
        public void run(){...}
        // 上記が操作の定義
    }
}
// 属性を宣言するにはクラスブロックの中に変数宣言を記述する。

// フィールド宣言時初期化も可能
public class Hero {
    public static void main(String[] args) {
        String name;
        int level = 10;
    }
}
// フィールド宣言の先頭にfinalをつけると定数フィールドになる。
// 名前はわかりやすいように大文字で設定
public class Hero {
    public static void main(String[] args) {
        String name;
        final int LEVEL = 10;
    }
}

// 操作の定義
// まず操作の名前、必要な情報の一覧、操作の結果として指示もとに返す情報、処理内容
// の４つを考える必要がある。
// 例）sleep操作
// 名前　sleep
// 必要な情報　なし
// 結果　なし
// 処理内容　眠ったあとはHPが100回復する
// 上記を記述すると
public void slip()　{
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
}
// thisとは特別な変数で自分自身のインスタンスを意味する。

// フィールド、メソッドは合わせてメンバと言われる。
// クラス名、メンバ名の一般的な命名
クラス名　名詞　単語の頭が大文字　Heroなど
フィールド名　名詞　最初以外の単語の頭が大文字 levle itemListなど
メソッド名　動詞　最初以外の単語の頭が大文字　attack findWeakPointなど

// Heroクラスに座る、転ぶ、逃げるメソッドを追加
public class Hero {
    String name;
    int hp = 100;
    // 上記が属性の定義
    public void attack(){...}
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip()　{
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
　      System.out.println("５のダメージ");
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した");
        System.out.println("GAMEOVRE");
        System.out.println("最終HPは" + this.hp + "でした");
    }
        // 上記が操作の定義
}
// 同じクラス内のフィールドにアクセスするときthisを省略しても動作するが、ローカル変数、引数にもhp
// という変数があるとそちらが優先されるなど予想外の動作をするためthisは省略しない