// カプセル化の目的とメリット


// カプセル化とは具体的にはフィールドへの読み書き、メソッドの呼び出しを制限する機能。
//　例えばこのメソッドはAクラスから呼び出し可でBクラスから呼び出し不可、
//  フィールドの内容は誰でも読めるけど、書き換えは不可など。

// 例）アクセス制御されない怖さ
public class Hero {
    int hp;
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

// 宿屋クラス
public class Inn {
    public void checkIn(Hero h) {
        h.hp = -100;
    }
}

// Heroクラスを使ったゲームのテスト中に一度もモンスターと戦っていないのに
// 勇者のHPがー１００になることに気づく
// 宿屋で間違ってヒーロのHPを-100にしている。

public class King {
    public void talk(Hero h){
        System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ");
        System.out.println("王様：長旅疲れたであろう");
        System.out.println("王様：まずは城下町を見てくるとよい。また会おう");
    }
    h.die();
}
// 上記ではヒーローが王様と話すと突然ゲームオーバーになってしまう
// 誤ってヒーローのdieメソッドを呼び出してしまっているため

// これらは
// ・Heroクラス以外からは勇者のHPフィールドに値を設定できない。
// ・dieメソッドを呼べるのはHeroクラスだけ
// というアクセス制御をしていれば防げる
