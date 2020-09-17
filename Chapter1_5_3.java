// 戻り値の利用

// 呼び出されたメソッドから呼び出し元のメソッドへ値を返すことを値を戻すといい
// 戻される値を戻り値という。

// 値の戻し方
public static 戻り値の型 メソッド名(引数リスト){
    処理
    return 戻り値;
}
// returnの後ろに書かれた値を呼び出し元に戻すことができる。
// 例）　return　100;　return "Hello"; return 変数名;


// 戻り値を受け取る
// メソッドを呼び出し、戻り値を受け取る
// 型　変数名　＝　メソッド名（引数リスト）;
// ＝があるため右辺が先に実行され、メソッドが実行されreturnがあれば
// 評価された値として帰ってくる
// 戻り値は１つしか用意できない

// 戻り値の例
public class Chapter1_5_3 {
    public static int add(int x, int y){
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args) {
        int ans = add(100,10);
        System.out.println("100+10=" + ans);
    }
}

// 戻り値をそのまま使う
public class Chapter1_5_3 {
    public static int add(int x, int y){
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(add(add(100,200),add(1000,2000)));
    }
}
// 出力結果 3300
// addメソッドを３つ呼び出しており、まずadd(100,200)、add(1000,2000)が実行される
// そしてそれぞれの計算結果300,3000が戻り値として呼び出し元(main)に返される.
// その後、300、3000の引数を持って、addメソッドが実行され結果3300がmainメソッドに返される

// return文の注意点
// returnはメソッドを終了するため、returnより下に記述した内容は実行されない。