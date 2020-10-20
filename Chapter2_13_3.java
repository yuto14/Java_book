// getterとsetter

// 外部からのフィールドにアクセスする際にはメソッドを経由する。
// 例）Chapter2_13_2.javaのHeroクラスのHPにはattack()メソッド、
// 　　sleep()メソッドを経由すれば変更可能

// 単純にフィールド値を取り出すだけのメソッド
// Heroクラスのnameフィールドはよく他クラスからも利用される
// しかしprivete修飾子をつけると他クラスからアクセスできない
// 下記が解決策
public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    public void die() {
        System.out.println(this.name + "は死んでしまった!");
        System.out.println("ゲームオーバーです");
    }
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        ...
        System.out.prinltn("お化けきのこ" + m.suffix + "から２ポイントの反撃を受けた");
        this.hp -= 2; 
        if (this.hp <= 0) {
            this.die();
        }
    }
    public String getName(){
        // 名前を返すメソッドを定義
        return this.name;
    }
}

// Heroの名前の利用
public class King {
    public void talk(Hero h){
        System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ");
        // getNameメソッドを呼び出す
        System.out.println("王様：長旅疲れたであろう");
        System.out.println("王様：まずは城下町を見てくるとよい。また会おう");
    }
}
// getNameメソッドはattackメソッドなどと異なり、単にnameフィールドの中身を呼び出し元に返すだけの
// 単純なメソッドになり　getter(ゲッター)メソッド　と言われる。

getterメソッドの定石
public フィールドの型　getフィールド名(){
    return this.フィールド名;
}

// 単純にフィールドに値を代入するだけのメソッド
// getterとは逆に、ある特定のフィールドに指定された値を代入するだけのメソッドを setter という。


setterメソッドの定石
public void setフィールド名(フィールドの型　任意の変数名){
    this.フィールド名 = 任意の変数名;
}

// 例）Heroクラスのnameフィールドにsetterメソッドを追加
public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    public void die() {
        System.out.println(this.name + "は死んでしまった!");
        System.out.println("ゲームオーバーです");
    }
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        ...
        System.out.prinltn("お化けきのこ" + m.suffix + "から２ポイントの反撃を受けた");
        this.hp -= 2; 
        if (this.hp <= 0) {
            this.die();
        }
    }
    public void setName(String name){
        // 名前をセットするメソッドを定義
        this.name = name;
    }
}

// getter、setterの存在価値
// getter、setterはアクセサと総称されることもあり重要な存在価値がある
// メリット１　読むだけ、書くだけのフィールドを実現できる。（外部から読めるが変更できないなど）
// メリット２　フィールドの名前など、クラスの内部設計を自由に変更できる
//           例えば将来nameフィールドの名前を変更する場合getter、setterを使用していない場合
//           他の開発者にnameの呼び出し名を変えてもらわないといけない
// メリット３　フィールドへのアクセスを検査できる。（setterで設定されようとしている値を検査できる）

// メリット３の例）
private String name;
public void setName(String name) {
    if( name == null) {
        throw new IllegalArgumentException
        ("名前がnullである。処理を中断");
    } if (name.length() <= 1) {
        throw new IllegalArgumentException
        ("名前が短すぎる。処理を中断。");
    } if (name.length() >= 8) {
        throw new IllegalArgumentException
        ("名前が長すぎる処理を中断");
    }
    this.name = name;
}