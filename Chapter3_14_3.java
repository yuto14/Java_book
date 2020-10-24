// 静的メンバ

// 静的メンバとは static　キーワードがついたフィールド、メソッドのこと。

// 同じクラスから生成されたインスタンスでフィールドを共有したい場合、
// フィールドの先頭に static をつける
// 例）ゲームのパーティで複数の勇者で財布を共有する

静的フィールドの３つの特徴
①フィールド変数の実体がクラスに準備される
　　//通常フィールドが格納される箱（変数）は個々のインスタンスごとに用意されるが
　　//静的フィールドの箱はクラスに１つのみ
　　静的フィールドへのアクセス方法１
　　クラス名.静的フィールド名
// 例）静的フィールドmoneyへのアクセス
public class Hero {
    String name;
    int hp;
    static int money; 
}
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        System.out.println(h1.hp);
        System.out.pritnln(Hero.money);
        // ヒーロークラスのマネーフィールドへアクセス。
    }
}

②全インスタンスに、箱の分身が準備される。
  //　h1.money、h2.money、Hero.moneyはどれも同一の箱をさす。
　静的フィールドへのアクセス方法２
　インスタンス変数名.静的フィールド名
public class Hero {
    String name;
    int hp;
    static int money; 
}
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero.money = 100;
        System.out.pritnln(Hero.money);// 結果　100
        System.out.println(h1.money); // 結果 100
        h1.money = 200;
        System.out.println(h2.money) // 結果　200(moneyフィールドをインスタンス全体で共有しているため)
        // ヒーロークラスのマネーフィールドへアクセス。
    }
}
③インスタンスを１つも生み出さなくても共有の箱が利用可能になる。
  // Hero.moneyは金型（クラス）の上に作られる箱になるため実体（インスタンス）
  // が生み出されていない状況であっても利用できる。
public class Main {
    // 何もHeroインスタンスを実体化させていない状態で
    Hero.money = 100;
    System.out.println(Hero.money);
}
// 静的フィールドはクラス（金型に）フィールド（箱）が所属するため　クラス変数　と言われる。

// 多くの場合staticはfinalやpublicと一緒に指定され変化しない定数を各インスタンスで共有するために利用される。


// 静的メソッド
// staticがついているメソッドは静的メソッドと言われる。またはクラスメソッドと呼ばれ、静的フィールドとあわせて
// 静的メンバと言われる。

静的メソッドの効果
①メソッド自体がクラスに属するようになる。
　　実体がインスタンスでなくクラスに属するためクラス名で呼び出せる。
②インスタンスにメソッドの分身が準備される。
　　インスタンス変数名からも呼び出せる
③インスタンスを１つも生み出すことなく呼び出せる

// 静的メソッドの呼び出し
// クラス名.静的メソッド名();
// インスタンス変数名.静的メソッド名();

// 静的メソッドの例
public class Hero {
    String name;
    static int money;
    public static void setRandomMoney(){
        Hero.money = (int)(Math.random() * 1000);
    }
}

// インスタンスなしでの静的メソッドの呼び出し
public class Main {
    public static void main(String[] args){
        Hero.setRanomMonet();
        System.out.println(Hero.money) // ランダムな額を表示
        Hero h1 = new Hero();
        System.out.println(h1.money);　// Hero.moneyと同じ額を表示
    }
}

// 静的メソッドの制約
// 　静的メソッドの中に記述するコードでは同一クラス内のstaticがついていないフィールド、メソッドは利用できない。
// 例）静的メソッドから非静的メンバ（フィールド、メソッド）を利用　→　エラー
public class {
    String name;
    int hp;
    static int money;
    public static void setRandonMoney(){
        Hero.money = (int)(Math.random() * 1000);
        System.out.println(this.name + "たちの所持金を初期化しました。");
        // this.nameでエラーが起きる（非静的フィールドのため）
    }
}


// 静的メンバのデメリット
// ①静的フィールドの内容を意図せず他のインスタンスから書き換えられることもある。
// ②同時アクセスで破壊されることもある。

// Java APIで静的メンバを備えている理由
//　①newせずに手軽に呼び出すため
//　②newではなく静的メソッドを使ってインスタンスを生成するため
//    APIクラスの中にはコンストラクタがprivate宣言されており外部からインスタンス化
//    できないものがあるため、そういったものはインスタンス生成を担う静的メソッドからインスタンス化する。


// 静的メンバのまとめ
// ①インスタンスではなくクラスに実体が準備される。
// ②クラス名、インスタンス名のどちらからでも同じ実体にアクセスできる。
// 自分の開発で静的メンバを作る機会はあまりないがjavaAPIを通して利用することがある。