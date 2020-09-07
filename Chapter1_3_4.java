// 条件分岐のバリエーション
// ifには３種類の構文がある。
// ・if-else構文（基本形）
//if (height == 180){
//    size = L;
//} else {
//    size = S or M;
//}
// ・if-else,if-else構文（false時さらに別条件で分岐）
// if (height == 180){
//     size = L;
// } else if(height > 180) {
//     size = LL;
// } else {
//     size = S or M;
// }
//    ルール ①elseifブロックは複数記述できるが、ifブロックより後ろ、elseブロックより前に記述
//          ②最後のelseブロックは中身が空ならelseごと省略可能

// ・ifのみの構文（false時は何もしない）
// if (height == 180){
//     size = L;
// } 

// switch文による分岐（ifから書き換えることができる条件）
// ・全ての条件式が右辺＝＝左辺のように一致するかを比較する式の場合
// ・比較する値が整数、文字列、文字の型であり小数、真偽値でない場合
public class Chapter1_3_4 {
    public static void main(String[] args){
        int fortune = 1;
        switch(fortune){
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("小吉");
                break;
            default:
                System.out.println("凶")
        }
    }
}
// swich文の注意点
// ・swithの直後に条件ではなく変数を書く
// ・caseの横に値を書き後ろに:を記述。（caseラベル、ラベルという）
// ・case以降の処理の末尾にbreak;を忘れずに記述
// ・default:は条件に一致しない場合の処理、なくても良い。

//　switch文は条件に一致するcaseラベルまで処理をジャンプさせる命令のため
//  break文で明示的に処理を中断しないと順次進行から次のcase文に進む

//  あえてbreakを省略する書き方
public class Chapter1_3_4 {
    public static void main(String[] args){
        System.out.println("あなたの運勢を占います。");
        int fortune = new java.util.Random().nextInt(6);
        switch(fortune){
            case 1:
            case 2:
                System.out.println("いいね");
                break;
            case 3:
                System.out.println("普通");
                break;
            case 4:
            case 5:
              System.out.println("うーん…");
        }
    }
}
// 実行結果　数値が１、２ならいいね、3なら普通、４、５ならうーん