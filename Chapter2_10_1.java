// 継承の基礎

// Javaで大きなプログラムを作り始めると以前作ったクラスと似通ったクラスを作る必要に迫られることがある。
// 例）ヒーロークラス、スーパーヒーロクラスがあり、スーパーヒーロークラスはヒーロー全ての行動ができるなど。
// その際それぞれのクラスで同じコードを記述すると、以下のデメリットが生じる
//  ・追加、修正に時間がかかる。（ヒーローを変更するとスーパーヒーローも変更が必要）
//  ・把握、管理が難しくなる。（コード量が増え全体を見渡しずらくなる）

// 例）ヒーロークラス
public class Hero {
    String name = "ミナト";
    int hp = 100;
    //闘う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた!");
    }
    //逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した!");
    }
}

// スーパーヒーロークラス
public class SuperHero {
    String name = "ミナト";
    int hp = 100;
    boolean flying;
    //闘う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた!");
    }
    //逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した!");
    }
    //飛ぶ
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった!");
    }
    //着地する
    public void land(){
        this.flying = false;
        System.out.pritnln("着地した!");
    }
}


//  上記のコードを継承の機能を利用すると
public class SuperHero extends Hero {
    // extends HeroでHeroクラスを継承
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった!");
    }
    public void land(){
        this.flying = false;
        System.out.println("着地した!");
    }
}

継承を用いたクラスの定義
class クラス名 extends 元となるクラス名 {
    親クラスとの差分メンバ
}

//　上記の例ではHeroクラスを継承してSuperHeroクラスを作成したがHeroクラスをスーパークラス、親クラス、基底クラスといい
//  SuperHeroクラスをサブクラス、派生クラス、子クラスという。
//  また継承関係を図で表すと　Heroクラス　←　SuperHeroクラスになる ※　←で間違いない

//　継承は１つのクラスをベースとして複数の小クラスや孫クラス、ひ孫クラスを作ることも可能。
//　ただし複数の親クラスを持つ子クラスは作成できない。（多重継承という）


//　SuperHeroクラスのみrun()などの動きを変えたい場合
//  SuperHeroクラスにrun()を再定義することができる。
public class SuperHero extends Hero {
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった!");
    }
    public void land(){
        this.flying = false;
        System.out.println("着地した!");
    }
    public void run(){
        // 親クラス（Heroクラス）にも定義してあるが子クラスで再定義（上書き）できる
        System.out.println(this.name + "は撤退した。");
        
    }
}

// 上記は親クラスで定義したものを子クラスで再定義している。
// 親クラスを継承して子クラスを宣言する際に親クラスのメンバを子クラスで上書きすることを
// オーバーライド　という

// 継承を用いて子クラスに宣言されたメンバの扱い
// ①親クラスに同じメンバがなければそのメンバは追加になる。
// ②親クラスに同じメンバがあればそのメンバは上書き保存される。

// 継承やオーバーライドの禁止
// ①クラス宣言時に final をつけると継承禁止
// ②メソッド宣言次に final をつけるとオーバーライド禁止になる。

// フィールドはオーバーライドしない（親クラス、子クラスに同名のフィールドを
// 宣言すると意図しない動きをすることがある。