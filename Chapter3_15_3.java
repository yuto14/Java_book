// 文字列の連結

// 文字列どうしを+演算子で繋ぐ方法もあるが他の方法があり
// そちらの方が圧倒的に処理速度が早い

// ＋演算子
Stirng s1 = "スッキリ" + "Java";

StringBuilderを用いた連結
// ＋演算子よりも高い性能を発揮する。
// StringBuilderインスタンスは内部に連結した文字列を蓄えるメモリ領域を持っている。
// 下記の手順で行うのが一般的
①appendメソッドを読んでバッファに文字列を追加していく（必要に応じた回数呼び出す）
②最後に１回だけtoString()をよび、完成した連結済の文字列を取り出す。

// 例）Javaという文字列を1万回連結して文字列にする。
public class Main {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 10000; i++){
            sb.append("Java")
            // バッファにJavaを追加
        }
        String s = sb.toString();
        // 連結した文字列を取り出して変数Sに格納
    }
}

// Stringクラスの特別な配慮
//　・危険な拡張を防ぐためにfinalにより継承禁止
//　・Stringインスタンスが保持する文字情報はインスタンス化した際に初期化され、以後二度と変化することはない
//　　　※Stringクラスに限らずインスタンス化の後に内容が変化しないように設計されたクラスを不変（immutable)
//　　　 不変なクラスは参照、スレッドという技術に対して関連したある種の複雑な不具合が起こり得ない。

// ＋演算子が遅い理由
// ＋演算子を用いるとその度に新しいインスタンスがnewにより生成されるためJVMに負荷がかかり遅くなる。
String s = "a";
s = "b"; // 変数Sを上書きするのではなく、新たにnewが行われている
// ただ数回程度の文字列連結であれば速度に違いはほとんどない。


// String、char配列、byte配列の相互置換
//  通常文字列情報はStrigインスタンスで利用するのが一般的だがchar配列、 byte配列形式で扱うこともある。
//  ・char配列 文字列に含まれる文字を１文字づつ分解しchar型配列の各要素に格納した状態。
//            １文字づつゆっくり表示する際などに使用。
//    Stringインスタンスからの変換
String str = "こんにちは";
char[] = str.toCharArray();

//  ・byte配列 文字列の情報を文字コード対応表を用いてバイト型に変換し１バイトづつ配列に格納。
//            文字列情報を指定した文字コードでファイルに書き込んだりする場合に利用。
//    Stringインスタンスからの変換
String str = "こんにちは";
byte[] = str.getBytes("utf-8");
byte[] = str.getBytes(); // デフォルト文字コードを利用

// char[]、byte[]をstringインスタンスに変換するには
new String(data)// のようにコンストラクタの引数に渡す