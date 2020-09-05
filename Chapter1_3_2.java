// ブロックの書き方
// ブロックとは複数の文をひとまとまりとして扱うためのもの。２つのルールがある。
// ・内容が１文しかなければ{}は省略できるが、実際は推奨されない。
public class Chapter1_3_2 {
    public static void main(String[] args){
        boolean tenki = true;
        if(tenki == true){
            System.out.println("洗濯をします。");
        } else //{}を省略
            System.out.println("DVDをみます。");
    }
}
// ・ブロック内で宣言した変数はそのブロックが終わると同時に消滅する。

// 変数が利用可能な場所の範囲をスコープという。

