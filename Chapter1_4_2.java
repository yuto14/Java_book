// 配列の書き方

// ステップ１ 配列変数の宣言
// 要素の型[] 配列変数名
例）int[] array;

// ステップ２ 要素の作成と代入
// 配列変数名　= new データ型[要素の数]
例） array = new int[5];

// ステップ１、２を同時に行う
// 要素の型[] 配列変数名 = new 要素の型[要素の数]
例） int[] array = new int[5];

// 配列の要素数の取得
// 配列変数名.length
例）array.length

public class Chapter1_4_2 {
    public static void main(String[] args){
        int[] scores = new int[5];
        int num = scores.length;
        System.out.println("要素の数は" + num);
    }
}

// 配列に値を代入
public class Chapter1_4_2 {
    public static void main(String[] args){
        int[] scores = new int[5];
        scores[1] = 30; //２つ目の要素に代入
        System.out.println(scores[1]);
    }
}
// 実行結果　３０

//　配列の初期化
// 配列の要素は自動的に初期化されint型の場合全て0が代入される。boolean型の場合はfalse、String型はnullが代入。


// 配列の省略記法
// 要素の型[] 配列変数名 = new 要素の型[] {値１,値２,値３など}
例）　int[] array = new int[] {10,20,30};

// 要素の型[] 配列変数名 = {値１,値２,値３など}
例）　int[] array = {10,20,30};