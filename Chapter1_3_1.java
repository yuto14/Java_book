// プログラムの流れ
// 文を実行させる順番を制御構造といい、・順次・分岐・繰り返しの３つがある。

// 条件分岐（if)
public class Chapter1_3_1 {
    public static void main(String[] args){
        boolean tenki = true;
        if(tenki == true){
            System.out.println("洗濯をします。");
        } else {
            System.out.println("DVDをみます。");
        }
    }
}
// 実行結果　洗濯をします。


// 繰り返し処理(while)
public class Chapter1_3_1 {
    public static void main(String[] args){
        boolean doorClose = true;
        while(doorClose == true){
            Sytem.out.println("ノックして１分待つ");
        }
    }
}
// ノックして１分待つ　が永遠にループする。


// if,whileのような制御構造を表す文を制御構文といい下記２つからなる。
// 条件式：分岐条件や繰り返しを続ける条件を示した式
// ブロック：分岐や繰り返しで実行する一連の文の集まり