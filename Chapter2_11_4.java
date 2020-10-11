// インターフェース

// 抽象階層を上に辿ると
// ①抽象メソッドが増える。
//    内容は確定できないが存在するという抽象メソッドが現れる。
// ②抽象メソッド、フィールドがへる 
//    クラスに定義してある抽象メソッドやフィールドが減ってくる

// 最上流クラスになると抽象メソッドのみになったりするため抽象クラスの中の抽象クラス
// がでてくる。そのようなクラスを特別扱いするクラスがある。

// インターフェースとして特別扱いできる条件
// ①全てのメソッドは抽象メソッドである。
// ②基本的に１つもフィールドを持たない

// 例)クリーチャークラス
public abstract class Creature {
    public abstract void run();
}
// 上記クラスをインターフェースとして定義可能

インターフェースの宣言
public interface インターフェース名　{

}

// 例）クリーチャークラスをインターフェース化
public interface Creature {
    void run();
}
// インターフェースに宣言されたメソッドは自動的に
// publicかつabstractになるため省略可能

// インターフェースはクラスの仲間で抽象クラスの親玉みたいなもの

// インターフェースにおける定数宣言
// インターフェースは基本的にフィールドを持たないが
// public static finalがついたフィールドは宣言可能。
// さらに上記は省略可能。つまりインターフェース内にフィールドを
// 宣言すると自動的に定数になる。
// 例）円周率
public interface Circle {
    double PI = 3.141592;
}
// 自動的にpublic static finalが補われる。

インターフェースの実装
public class クラス名 implements インターフェース名 {

}
//例）クリーニング店
public interface CleaningService {
    Shirt washshirt(Shirt s);
    Towl washTowl(Towl t);
    Coat washCoat(Coat c);
}
// インターフェース
public class KyotoCleaningShop implements CleaningService {
    String ownerName;
    String address;
    String phone;
    public Shirt washShirt(Shirt s) {
        return s;
    }
    public Towl washTowl(Towl t) {
        return t;
    }
    public Coat washCoat(Coat c) {
        return c;
    }
}

// インターフェースの実装はクラス図では点線の矢印で表す。

インターフェースの効果
①同じインターフェースをimplementsする複数の子クラスたちに共通のメソッド群を実装するよう強制できる。
②あるクラスがインターフェースを実装していれば少なくともそのインターフェースが定めたメソッドは持っている
　ことが保証される。

クラスにはないインターフェースの特権
複数の親インターフェースを親クラスにして子クラスを生み出す多重継承が認められる
// ※本来は複数の親クラスで同名のメソッドが存在しうるため禁止されているがインターフェース
// どうしの場合同名メソッドでも抽象メソッドになるためオーバーライドが必要になり処理を
//  子クラスで設定できる。

インターフェースによる多重継承
public class クラス名　implements 親インターフェース名１,親インターフェース名２ {

}
// ３つ以上のインターフェースを実装することも可能。
// 例）
public class PrincessHero implements Hero, Peincess, Character {
}
// ヒーロー、プリンセス、キャラクターインターフェースを継承したプリンセスヒーロークラス


インターフェースの継承
public interface インターフェース名 extends 親インターフェース {
    
}
// 例）
public interface Human extends Creature {
    void talk();
    void watch();
    void hear();
    // 親インターフェースからrun()メソッドを継承している
}
// 上記は親インターフェースのメソッドをオーバーライドして処理内容を確定
// させているわけではないためimplementsではなくextendsを使う。
// 継承元と継承先が同種どうしならextends、異種ならimplementsを使う。


extendsとimplementsを一緒に使う。(継承と実装を同時に行う)
public class クラス名 extends 親クラス
    implements 親インターフェース1, 親インターフェース2 {

    }
// 例）
public class Fool extends Character implements Human {
    //キャラクタークラスからhp、nameなどのフィールドを継承
    //キャラクラークラスから継承した抽象メソッドattack()を実装
    public void attack(Matango m){
        System.out.prinltn(this.name + "は戦わずに遊んでいる");
    }
    // さらにHumanから継承した抽象メソッドを実装
    public void talk(){

    }
    public void watch(){

    }
    public void hear(){

    }
    public run(){

    }
}


// Java８からインターフェースでデフォルト処理を定義した抽象メソッドの作成が可能になった
default 戻り値　メソッド名（引数）{
    処理のデフォルト実装
}
//　もし継承先でオーバーライドされなかった場合デフォルト処理を実行。多重継承によるデフォルト実装
//　の衝突には注意。インターフェースの基本は実装を持たず定義のみを持つことに変わりない。
