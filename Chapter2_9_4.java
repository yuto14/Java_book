// 練習問題　P364

// 練習9-1
public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    public Thief(String name, int hp) {
        this(name, hp, 5);
    }
    public Thief(String name) {
        this(name, 40);
    }
}

// 練習９−２
public class Main {
    public static void heal(int hp){
        hp += 10;
    }
    public static void heal(Thief thief){
        thief.hp += 10;
    }
    public static void main(String[] args){
        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp){
            System.out.println(baseHp + ":" + t.hp);
            heal(baseHp);
            heal(t);
            System.out.println(baseHp + ":" + t.hp);
        }
    }
}
実行結果
25:25
25:35
baseHpは２５で定義しているおり、tインスタンスのhpは引数２つのコンストラクタを参照しbaseHpになるため
25:25を表示
baseHpはhealメソッドで上書きされない。しかし、tインスタンスはクラス型のため参照渡しとなり、hpに１０を足しているため
２５:35となる。


//　フィールド初期値の設定手段
クラスのフィールドに初期値を設定したい場合次の４種類がある。
①フィールド宣言時に初期値を指定
②静的初期化ブロックでフィールドに値を代入。
③初期化ブロックでフィールドに値を代入。
④コンストラクタでフィールドに値を代入。
一般的には①か④を使用。混乱を避けるためルールを統一するのが良い。