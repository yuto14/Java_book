// インスタンスの利用方法

// Mainクラスの作り方
public class Main {
    public static void main(String[] args) {
        処理内容
    }
}

// インスタンスの生成
クラス名　変数名　＝　new クラス名();

//　勇者インスタンスを作成
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        // ヒーロークラスからインスタンスを生成し変数hに入れる
    }
}

// フィールドへの値の代入
変数名.フィールド名 = 値;

// ヒーローの名前、HPを代入
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        system.out.println("勇者" + h.name + "を生み出しました。");
    }
}

// インスタンスのメソッド呼び出し
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました。");

        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}
// Heroクラスは　Chapter2_8_2に記述

// 実行結果 勇者ミナトを生み出しました。
//         ミナトは５秒座った。
//         HPが５ポイント回復した
//  　　　　ミナトは転んだ
// 　　　　 5のダメージ
//　　　　　ミナトは２５秒座った。
//         HPが２５ポイント回復した。

// お化けきのこ（敵）クラスの定義
public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    public void run(){
        System.out.println("お化けきのこ" + this.suffix + "は逃げ出した");
    }
}

// 仮想世界にお化けきのこ２体を追加
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}
// 実行結果
// ミナトは、転んだ！
// ５のダメージ
// お化けきのこAは逃げ出した
// お化けきのこBは逃げ出した
// ミナトは逃げ出した
// GAMEOVRE
// 最終HPは95でした