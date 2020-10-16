// 多態性のメリット

// ざっくり捉えることのメリット
// 例）５人のキャラクターが（Hero2人、Thief一人、Wizardが二人）で旅をするゲーム
// 　　５人はパーティで宿屋に泊まってHP５０を回復する。（通常の書き方）
public class Main{
    public static void main(String[] args){
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Trief t1 = new Trief();
        Wizard w1 = new Wizard();
        Wizard w2 = new Wizard();

        h1.hp += 50;
        h2.hp += 50;
        t1.hp += 50;
        w1.hp += 50;
        w2.hp += 50;
        // 前提としてHero、Wizard、Thiefは抽象クラスCharacterを継承している
        // Characterはnameとhpフィールド、attack()、run()メソッドを持つ。
    }
}
// 上記コードの問題点
//　・コードの重複
//  ・将来的に多くの修正が必要（パーティが増減した場合）

// 上記コードを多態性、配列を使用すると下記になる
public class Main {
    Character[] c = new character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Trief();
    c[3] = new Wizard();
    c[4] = new Wizard();

    for(Charcter ch : c){
        ch.hp += 50;
    }
}
// それぞれをざっくりCharacterとみなすことで配列として回すことができる。


// 同一視してざっくりとした引数で受け取る
// 例）通常のattack()
public class Hero extends Character {
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10のダメージを与えた");
        m.hp -= 10;
    }
    public void attack(Slime s){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10のダメージを与えた");
        s.hp -= 10;
    }
    //　敵の種類ごとにメソッドを用意しなければならない
}
// 下記に修正することが可能
public class Hero extends Character {
    public void attack(Monster m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に１０ポイントのダメージ");
        m.hp -= 10;
    }
}
// 攻撃する敵をざっくりとモンスターという引数にすることでモンスターを継承
// していればどのような敵も受け入れる

多態性のメリット
・ざっくり捉えてまとめて扱う（配列など）
・引数をざっくりまとめて扱う

// 同じ指示で異なる動作をさせることができる
public class Main {
    public static void main(String[] args){
        Monster[] monsters = new Monster[3];
        monsters[0] = new slime();
        monsters[1] = new Goblin();
        monsters[2] = new DeathBat();
        for(Monster m : monsters){
            m.run();
        }
    }
    // 実行結果
    // スライムは体をうねらせて逃げ出した
    // ゴブリンは腕をふって逃げ出した
    // 地獄コウモリは、羽ばたいて逃げ出した

//　上記のように呼び出しがわは相手を同一視し、同じように呼び出すのに、呼び出される側は
//　きちんと自分に決められた動きをする。