// 暗黙の継承

// あるクラスを継承する時、extendsで親クラスを指定しなければ、java.lang.Objectを
// 親クラスとして継承したと見なされる。

// java.lang.Objectクラスは全てのクラスの親クラスになり以下のメソッドが定義されている。
equals() あるインスタンスを自分自身と同じか調べる
toString() 自分自身の内容の文字列表現を返す

// 例）
public class Empty {}

public class Main {
    public static void main(String[] args){
        Empty e = new Empty();
        String s = e.toString();
        System.out.println(s);
    }
}
// 実行可能

Objectクラスの存在価値
①多態性を利用できるため
// 　　全てのクラスがObjectクラスが先祖になるためObject型の変数にはどんなインスタンスも代入できる。
public class Main {
    public static void main(String[] args){
        Object o1 = new Enpty();
        Object o2 = new Hero();
        Object o3 = "こんにちは";
    }
}
// また引数としてObject型を用いることで何型でもいいからインスタンスを渡せるメソッドを作成可能
public class Main {
    public void printAnything(Object o){
        //　何型でもいいから引数１つ受け取り画面に表示
        System.out.println(o.toString());
    }
}

// Object型の変数は参照型の変数を格納できる。int、longなどは不可。

②全てのクラスが最低限備えるべきメソッドを定義できる。
// インスタンス同士の内容が同じかどうか、インスタンスの内容がどのような
// ものか文字情報として表示するなど。


// デフォルトのtoString()
public class Hero {
    String name;
    int hp;
}

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        System.out.println(h.toString());
    }
}
// 実行結果　Hero＠３４８７acc
//　※toString()は　型名@数字の形で情報を表示する

// toString()メソッドで名前、HPを表示したい場合オーバーライドする必要がある
public class Hero {
    public String toString(){
        return "名前" + this.name + "HP" + this.hp;
    }
}

// equals()の使い方  例）二人の勇者の比較
public class Main {
    public static void main(String[] args){
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "ミナト";
        h2.hp = 100;
        if (h1.equals(h2) == true) {
            System.out.println("同じ内容です");
        } else {
            System.out.println("違う内容です");
        }
    }
}

等価と等値
等値：同一の存在であること　(if h1 == h2)
等価：同じ内容であること (if h.equals(h2) == true)

equals()を使用する際は何をもって同じものとみなすのかを
オーバーライドで指定しないといけない
// Objectクラスのequals()の大まかな処理内容
public boolean equals(Object o){
    if(this == o){
        return true;
    } else {
        return false;
}

// 名前が同じなら同じ勇者とするequals()を定義
public class Hero {
    String name;
    int hp;

    public boolean equals(Object o){
        if (this == o){
            // 等値なら等価
            return true;
        }
        if (o instanceof Hero) {
            Hero h = (Hero)o;
        }
        if(this.name.equals(h.name)){
            // 名前が等しければ等価
            return true;
        }
        return false;
    }
}

// 新しくクラスを開発したらtoString()、equals()を
// オーバーライドする必要性がないかを検討する。
