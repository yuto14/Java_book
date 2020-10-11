// インスタンスの姿

// インスタンスの多重構造
//  SuperHeroインスタンスは内部にはHeroクラスを含んでおり２重構造になっている。

// メソッドの呼び出し
// インスタンスの外部からメソッドを呼び出すと極力外側にある子クラスのインスタンス部分
// のメソッドで対応しようとする。
// 例）Hero、 SuperHero共に存在するメソッドの場合SuperHeroのメソッドを実行。
//    Heroにしかないメソッドの場合はHeroクラスのメソッドを実行。

// オーバーライドしても親クラスの内容は消える訳ではない。

// 親インスタンス部分のフィールドを用いる
super.フィールド名

// 親インスタンス部分のメソッドを呼び出す
super.メソッド名(引数)

// superとは今より１つ内側のインスタンス部分を表す予約語


// 親クラスのattack()を呼び出す
public class SuperHero extends Hero {
    public void attack(Matango m){
        super.attack(m);
        //　親インスタンス部分のattack()を呼び出し
        if(this.flying) {
            super.attack(m);
            //　親インスタンス部分のattack()を呼び出し
        }
    }
}
// 親の親インスタンス部分へのアクセスは不可能