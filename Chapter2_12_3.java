// ざっくりとらえたものに命令を送る

// ざっくり捉えることと厳密に捉えることの違い
// 紙幣という紙を旧石器時代の人に渡すと絵と捉えて、何かに使うことはないと思われるが
// 現代の人に渡すと紙を眺めることもできるがお店で商品と交換することもできる。

// 全く同じものであっても複数の異なる捉え方ができ、利用する人が何と捉えるかによって
// 利用方法が変わる。あいまいで抽象的なほど用途は限定され具体的になるほど用途が
// 増える。

// Javaでは捉え方が変わると呼びさせるメソッドが変わる。
// 例）Characterを継承して定義されたWizard
public abstract class Character {
    String name;
    int hp;
    public void run(){}
    public abstract void attack(Matango m);
} 

public class Wizard extends Character {
    int mp;
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に３ポイントのダメージ");
        m.hp -= 3;
    }
    public void fireball(Matango m){
        System.out.println(this.name + "は火の玉を放った");
        System.out.println("敵に２０ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
}
// Wizardクラスを通常の方法でインスタンス化
public class Main {
    public static void main(String[] args){
        Wizard w = new Wizard();
        Matango m = new Matango();
        w.name = "アサカ";
        w.attack(m);
        w.fireball(m);
    }
}
// Wizardにfireball()を使わせる　※エラー
public class Main {
    public static void main(String[] args){
        Wizard w = new Wizard();
        Character c = w;
        // character型の箱にwizardインスタンスを代入。
        Matango m = new Matango();
        c.name = "アサカ";
        c.attack(m);
        c.fireball(m);
        // この行でエラー
    }
}
// 箱の中身をざっくりと捉えているため中身はWizardと忘れている

// 48行目に代入を行った瞬間、中身がわからなくなり確実に言えるのはWizardは
// characterの一種ということ。そのためattack()は呼び出せて
// fireball()が呼び出せない。
// （characterは全て攻撃はできるため）

// インスタンス（B)を捉えているクラス（A)のメソッドしか呼び出すことができない。
// 上記の場合はcharcterが持っているメソッドしか実行できない。


// メソッドを呼び出せた場合に動く処理
// 例）モンスター、スライムの逃げ方
public abstract class Monster {
    public void run(){
        System.out.println("モンスターは逃げ出した");
    }
}
public class Slime extends Monster {
    public void run(){
        System.out.println("スライムはささっと逃げ出した");
    }
}
public class Main {
    public static void main(String[] args) {
        Slime s = new Slime();
        Monster m = new Slime();
        s.run();
        m.run();
    }
}
// 実行結果
// スライムはささっと逃げ出した。
// スライムはささっと逃げ出した。

// 実際に動くメソッドの中身はインスタンスの型によって決まる。それがどの型の
// 箱に入っているかは関係ない。

箱の型　どのメソッドを呼び出せるか決める
中身の型　メソッドが呼ばれたらどう動くか決める