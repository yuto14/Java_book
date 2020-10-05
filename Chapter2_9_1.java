// クラス型と参照

// これまで仮想世界と表現していたものは実際には PCのメモリ領域　になる。
// JVMが大量にメモリ領域（数百MB〜数GB）を使って準備するもので　ヒープ
// と言われる。
// new を用いてインスタンスを生成する旅にヒープの一部の領域(数十〜数百MB)を確保され
// インスタンスの情報を格納するため利用される。
// インスタンスとはヒープの中に確保されたメモリ領域にすぎない

// インスタンス生成時のPCの内部処理
public class Main {
    public static void main(String[] args) {
        Hero h;
        h = new Hero();
        h.hp = 100;
    }
}
// ①13行目によりJVMはHero型の変数hをメモリ内に準備する。
// その際JVMはヒープ領域から使用されていない場所に確保する。

// ②14行目は代入分になるため右辺から評価される。Heroインスタンスを
// hとば別場所で確保する。
// ③14行目左辺に入るのは右辺Heroインスタンスで確保した番地の先頭番号になる。
// そのため変数hにはHeroインスタンスではなく番地が入る。
// このことから変数hに入っている情報を　参照　という。
// int[]、String[]のような配列型もクラス型も合わせて参照型と言われる。

// ④変数hを調べ番地がわかる。番地を調べて13行目の変数h情報を書き換える。
// このように変数から番地情報を取り出し、その次にその番地にアクセスするJVMの
// 動きを　参照の解決、アドレス解決　という。

// 同じクラスから生まれた異なるインスタンスはお互いに影響を受けない。
// これをインスタンスの独立性という。　

public class Main {
    public static void main(String[] args) {
        Hero h1;
        h1 = new Hero();
        h1.hp = 100;
        Hero h2;
        h2 = h1;
        h2.h1 = 200;
        System.out.println(h1.hp);
    }
}
// 実行結果　100
// h2=h1でh1の先頭番地をh2にコピーしている（インスタンスをコピーしている訳ではない）
// そのためh2、h1はどちらも同じインスタンスをさす。
// また、基本的にnewでしかインスタンスは生み出せないためnewが出てきた回数がインスタンスの数。

//　クラス型の変数をフィールドに使用することも可能
public class Sword {
    String name;
    int damage;
}
public class Hero {
    public static void main(String[] args) {
        String name;
        int hp;
        Sword sword;
        public void attack(){
            System.out.println(this.name + "は攻撃した");
            System.out.println("敵に５ポイントのダメージを与えた");
        }
    }
}
// HeroクラスにSwordクラス型のsword変数を定義。
// このようにあるクラスが別のクラスをフィールドとして利用している関係を　has-a という
// Hero hasーa Sword　（ヒーローが剣を持っている）

// 実際の例）
public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damege = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        h.Sword = s;
        System.out.prinltn("現在の武器は" + h.Sword.name);
    }
} 

// クラス型はフィールドの型としてだけでなくメソッドの引数、戻り値の型として利用できる。
// 例）回復魔法を使えるWizardクラス
public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
        h.hp = 10;
        System.out.println(h.name + "のHPを10回復した");
    }
}

// 上記を利用
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        // ミナトを回復させる（HP100 →　110)
        w.heal(h2);
        // アサカを回復させる（HP100 →　110)
        w.heal(h2);
        // アサカを回復させる（HP110 →　120)
    }
} 

// String型はクラス型になる。JVM上では変数の先頭番地しか記録していない
// JVA APIの中にStringクラスが含まれるため自身で定義しなくてもStringクラスが利用可能。
// またStringクラスはjava.langパッケージに含まれるためimport文を記述しなくても良い