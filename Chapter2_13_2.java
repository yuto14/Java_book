// メンバに対するアクセス制御

// Javaではそれぞれのメンバ（フィールド、メソッド）に対してアクセス制御をおこなえる
// しかしそれぞれのメンバに細かく設定すると手間のため４段階のレベルから制御を選ぶ
// ような仕組みになっている。

　　名称　　　　        指定方法　　　　　アクセス許可する範囲
・　private           private   　　　自分自身のクラスのみ
・　package private   (何も書かない)　　自分自身と同じパッケージに属するクラス
・　protected         protected      自分と同じパッケージに属するか自分を継承した子クラス
・　public            public         全てのクラス

// private、protectedはアクセス修飾子と言われ、フィールド、メソッド宣言時に
// 先頭に記述することでアクセス制御が可能

フィールドのアクセス制御
アクセス修飾子 フィールド宣言;

メソッドのアクセス制御
アクセス修飾子　メソッド宣言(){

}

// HeroクラスのHPをアクセス制御する
public class Hero {
    private int hp;
    String name;
    Sword sword;

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
}

// 宿屋の呼び出しを変更
public class Inn {
    h.sleep();
    // hpがprivateになったので宿屋クラスから変更できないためHeroクラスのsleepメソッドを呼び出す
}

// Heroクラスのdieメソッドもアクセス制御する
public class Hero {
    private int hp;
    String name;
    Sword sword;

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
    // privateにすることにより他クラスから呼び出し不可
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
}

メンバ（フィールド、メソッド）に関するアクセス修飾子の決め方（定石）
・フィールドは全てprivate
・メソッドは全てpublic 
// まずは上記で設定しあとで微調整するのがよい

クラスに関するアクセス修飾子の決め方（定石）
　特に理由がない限りpublicで修飾するのが一般
