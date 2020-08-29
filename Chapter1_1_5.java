//練習１−１
//Javaでプログラムを開発するためにはコンパイラとインタプリタというソフトウェアが必要です。
//コンパイラは渡したいtがJavaの文法に剃って記述したソースコードをバイトコードに変換してくれる。
//インタプリタは内部に持っているJVMの仕組みを使ってこれを解釈しマシン語に変換してCPUに送りCPUは命令を実行する。

//練習１−２
public class Chapter1_1_5 {
    public static void main(String[] ags) {
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅３、横幅５の長方形の面積は" + c);
    }
}

//練習1-3
① boolean question = true;
② String char = '駆';
③ double pi = 3.14;
④ Long pi2 = 314159265853079L;
⑤ String sentence = "ミナトの攻撃！ 敵に１５ポイントのダメージを与えた。";
