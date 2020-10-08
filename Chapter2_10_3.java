// 継承とコンストラクタ

// 全てのコンストラクタは先頭で必ず内部インスタンス部分（親クラス）のコンストラクタ
// を呼び出さなければならないというルールがある。

public class Hero {
    public Hero(){
        System.out.println("Heroのコンストラクタが動作");
    }
}

public class SuperHero extends Hero {
    public SuperHero(){
        System.out.println("SuperHeorのコンストラクタが動作");
    }
}

public class Main {
    public static void main(String[] args){
        SuperHero sh = new SuperHero()
    }
}
// 実行結果　Heroのコンストラクタが動作
//         SuperHeorのコンストラクタが動作


親クラスのコンストラクタの呼び出し
super(引数);
※コンストラクタの先頭に必ず記述する必要がある。

// 本来のSuperHeroコンストラクタの書き方
public SuperHero(){
    Super();
}
// もしsuperを記述しなければ自動的に挿入される。

//　以下はエラーとなる
public class Item {
    String name;
    int price;
    public Item(String name) {
        // 引数１つのコンストラクタ
        this.neme = name;
        this.price = 0
    }
    public Item(String name, int price) {
        // 引数２つのコンストラクタ
        this.neme = name;
        this.price = price;
    }
}
public class Weapon extends Item {
    public Weapon(){
    }
}
public class Main {
    public static void main(String[] args) {
        Weapon w = new Weapon();
        // 引数１つの親クラスコンストラクタを呼び出す
    }
}
// weaponコンストラクタから内部のItemインストラクタを呼び出すが引数なしのコンストラクタはないためエラーになる


// 内部インスタンスの初期化を行うコンストラクタに引数を与える必要がある場合はsuperの呼び出し時に明示的に引数を渡す。
public class Weapon extends Item {
    public weapon() {
        super("ななしの剣");
    }
}

// super()に与える引数の数、型によって親クラス部分が初期化されるときに利用されるコンストラクタを明示的に指定できる。