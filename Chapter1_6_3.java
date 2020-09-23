// パッケージの利用

// クラスファイルが20個を超えるなどすると管理が大変になってくる。
// そのような時、Javaには各クラスを　パッケージ　というグループに
// 分けて分類、管理できるような仕組みがある。

// クラスをパッケージに所属させる。
pakege 所属させたいパッケージ名;
// パッケージ名はソースコードの先頭に記述する必要がある。
// パッケージ名はJavaの識別子に従っていれば自由に定めることが可能だが
// 先頭は小文字が一般的。またcalc.main、calc.logicなど.で区切られたものも
// 多く用いられる。

// 例）
pakege calcapp.main;
public class Chapter1_6_3(Calc){
    ...
}

pakege calcapp.logic;
public class Chapter1_6_3(CalcLogic){
    ...
}
// パッケージには親子関係、階層関係はない。

// デフォルトパッケージ
// pakege文が無いソースコードはどのパッケージにも所属していない。
// これを無名パッケージ、デフォルトパッケージに属しているという。
// また、デフォルトパッケージはimportすることはできない。

// 別パッケージのクラスをよび出すには所属パッケージ名を添えたクラス名
// を指定する必要がある。

// 別パッケージのクラスの呼び出し
pakege calcapp.main;
public class Chapter1_6_1 {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = calcapp.logics.Chapter1_6_1(Calc).tasu(a,b);
        int delta = clacapp.logics.Chapter1_6_1(Calc).hiku(a,b);
        // パッケージ名.クラス名.メソッド名
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
// 上記のような完全なクラス名のことを完全限定クラス、完全修飾クラスまたはFOQNという。

// 完全限定クラス名（FOQN）
パッケージ名.クラス名

// 完全限定クラス名（FOQN）の入力を軽減する方法として import文がある。
import パッケージ名.クラス名
// import文はソースコードの先頭に記述。ただしpakege文より後に記述・

// import　例
pakege calcapp.main;
import calcapp.logic.CalcLogic;
// ClacLogicがあればcalcapp.logics.CalcLogicだと解釈させる。
public class Chapter1_6_3 {
    public static void main(String[] args) {
        ...
        int total = CalcLogic.tasu(a,b);
        // 完全限定クラス名を省略
        int delta = clacapp.logics.CalcLogic.hiku(a,b);
        // 完全限定クラス名で記述しても良い。
        ...
    }
}

// パッケージに所属するクラスを全てimportしたい場合
pakege calcapp.main;
import calcapp.logics.*;
...

// import文はあくまで入力軽減機能
// Javaでは宣言することなくJVMが扱える全てのクラスを常時使用できるがその際にはFOQNを
// 使用しなければならないためこれを省力する方法としてimport文がある。
// 従って機能が増えたりするものではない。