// 正規表現の活用

// 例）ゲームプレイヤー名の条件 ①8文字でA〜Z、０〜９しか使用不可　②最初の文字に数字不可
public boolean isValidplayerName(String name){
    if(name.length() ! = 8){
        return false; // 文字数が８文字であること
    }
    char first = name.charAt(0);
    if(!(first >= 'A' && first <= 'Z'){
        return false; // 最初の文字はA~Z
    }
    for(int i=0; i < 8; i++){
        char c = name.charAt(i);
        if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= 9))){ //以降の文字はA~Zか０〜９
            return false;
        }
    }
    return true;
}

// 上記をStirngクラスのmatchesメソッドを使用すると
public boolean isValidplayerName {
    reutrn name.matches("[A-Z][A-Z0-9]{7}")
}
// 引数で与えている[A-Z][A-Z0-9]{7}は文字列パターンと言われ正規表現と言われる方法
// で記述されている。またmatchesメソッドのように文字列がパターンに従った形式を
// 満たしているか照合する処理をパターンマッチングという。

正規表現の基本文法
①通常の文字：その文字でなければならない。
　　Stirng s = "JAVA";
　　s.maches = "JAVA"; // true
　　s.maches = "Java"; // false
②ピリオド：任意の１文字であればよい。
　　"JAVA".matches("J.VA"); //true （２文字目は何でも良い１文字目はJ、３はV、４はA）
③アスタリスク：直前の文字の０回以上の繰り返し
//　　パターン中に*含まれていた場合その直前の文字の０回以上の繰り返しを意味する。
//　　例）"AB*"は１文字目がA、２文字目がBでそれ以降Bが何文字続いても良い。
　　"Jaaaaava".matches("Ja*va"); //true
   "あいうxx019".matches(".*"); // true
   // .*という正規表現は任意の１文字を〇回以上繰り返す意味なのですべての文字列を許す。
   // .*の活用
   s.matches("MA.*"); // Maで始まる任意の文字
   s.matches(".*ful"); // fulで終わる任意の文字

④波カッコ{}:指定回数の繰り返し
// 例　Hel{3}oはHellloという意味になる
    正規表現における繰り返し回数の指定方法
    {n} 直前の文字のn回の繰り返し
    {n,} 直前の文字のn回以上の繰り返し
    {n,m} 直前の文字のn回以上m回以下の繰り返し
    ? 直前の文字の０回または１回の繰り返し
    + 直前の文字の一回以上の繰り返し

⑤角カッコ[]：いずれかの文字
    //例 "UR[LIN]"は１文字目がU、２文字目がR、３文字目がL、I、Nのどれか
⑥角カッコ内のハイフン[-]：指定範囲のいずれか
    //例　[a-z]はa~zまでのいずれかの文字を表す。
    "url".matches([a-z]{3}); // ture 
    // すべての数字など多用されるパターンは¥で始まる文字クラスとして定義されている。
    定義済の文字クラス
    ¥d いずれかの数字 [0-9]と同じ意味
    ¥w　英字、数字、アンダーバー　[a-zA-Z_0-9]と同じ意味
    ¥s　空白文字（スペース、タブ入力、改行文字など）
⑦ハットとダラー^＄：先頭と末尾
//　^は先頭 $は文字列の末尾を表す。
//　例）^j.p$ は先頭がj、最後の文字がpで長さは任意


正規表現を用いた他の処理
splitメソッド：文字の分割
public class Main {
    public static void main(String[] args){
        String s = "abc,def:ghi";
        String[] words = s,spilit("[,:]");
        for(String w: words){
            System.out.println(w + "->");
        }
    }
}
// 結果　abc->def->ghi

