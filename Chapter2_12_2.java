// ざっくりと捉える方法

//　多態性を定義するための特別な文法はなく　代入の文法を使う。


// 前提　Characterクラス ←　Heroクラス ←　SuperHeroクラス
// のSuperHeroインスタンスを通常生成
SuperHero sh = new SuperHero();
//　この時SuperHero型変数の中にはSuperHeroインスタンスが入っている。
// これを　ざっくり Character として捉えると
Charcter c = new SuperHero();
// 上記はCharcter型変数の中にSuperHeroインスタンスが入っている。
//　そのため本当はSuperHeroインスタンスだがCharcterとして捉えることができる。

// 多態性を活用するには箱の型（変数の型）、中身の型（インスタンスの型）の２つ方が関係してくる。
// そしてあるインスタンスをどのように捉えるかはどの型のどの変数に代入するか
//（箱の型）で決まる。

//　できる代入とできない代入があり、代入可能なのは
//  子クラスのインスタンスを親クラスにいれること。
//  ※箱の型と中身の型を絵にして嘘にならなければ問題ない。

// 例)
float f = new SuperHero();
// ×　小数の箱にスーパーヒーロは嘘
Item i =new SuperHero();
// ×　アイテムの箱にスーパーヒーロは嘘
SuperHero sh = new Hero();
// ×　スーパーヒーローの箱にただのヒーローは嘘

// extendsやimplementsでis-aの関係を結んでいないと代入は不可能

// 抽象クラス、インターフェースからインスタンスを生み出すことはできないが
// それらの型を利用することは可能。
// 例）新たにLifeインターフェースを実装後、Life型の箱にWizardインスタンスをいれる
public class Main {
    public static void main(String[] args) {
        Life lf = new Wizard();
        // wizardはLifeの一種
    }
}
