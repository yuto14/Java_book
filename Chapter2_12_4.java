// 捉え方を変更する方法

// キャラクター型の箱に入れた魔法使いでfireball()を使う方法を考える
Charcter c = new Wizard();
Wizard w = c;
// ５行目がエラーになる。
// コンパイラはプログラムを１行ずつ解釈、翻訳するためcに何が入っているか判断できない。
// cにHeroなどが入っている可能性がありそれは嘘になるので失敗の可能性がある代入は
// はエラーで拒否される。

// 強制的に捉えたい場合
Character c = new Wizrad();
Wizard w = (Wizard)c;
//　キャスト演算子という。曖昧な型に入っている中身を厳密な型に代入するのは
//　ダウンキャストと言われる。

// キャストの失敗
// キャストによる強制代入によりコンパイルは通ったが実行すると
// 嘘の構図になる場合　Class Cast Exception　というエラーが発生する。
// 例）Hero型にWizardインスタンスを代入
Character c = new Wizard();
Hero h = (Hero)c;

// 安全にキャストできるか判断する方法
変数 instanceof 型名
※変数を型名の箱に代入可能ならばtrueがかえる。

// instanceofは指定の型に代入しても嘘にならないかを判定
// 例）
if (c instanceof SuperHero){
    // もしcの中身がSuperHeroとみなして大丈夫なら）
    SuperHero h = (SuperHero)c;
    // SuperHeroとみなせ
    h.fly();
}