// ソースファイルを分割する

// １つのクラス内に多数のメソッドがあると全体を把握するのが困難になる
// Javaでは複数のソースファイルに分割して記述できる仕組みがある。
// 複数のクラスに分けることでわかりやすくなるだけでなくファイルごとに開発を分担し、
// それぞれが並行して開発を進められるというメリットもある。
// 上記のように１つのプログラムを複数の部品に分けることを部品化するという。

// 例）計算プログラム
public class Chapter1_6_1 {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = tasu(a,b);
        int delta = hiku(a,b);
        System.out.println("足すと" + total + "引くと" + delta);
    }

    public static int tasu(int a, int b){
        return (a + b);
    }

    public static int hiku(int a, int b){
        return (a - b);
    }
}
// mainメソッドはtasu()、hiku()を表示、tasu()、hiku()は計算処理をするメソッドに
// なるのでmainとその他をクラス分けする。

//分けると
public class Chapter1_6_1 {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = Chapter1_6_1(Calc).tasu(a,b);
        int delta = Chapter1_6_1(Calc).hiku(a,b);
        System.out.println("足すと" + total + "引くと" + delta);
    }
}

public class Chapter1_6_1(Calc) {
    public static int tasu(int a, int b){
        return (a + b);
    }

    public static int hiku(int a, int b){
        return (a - b);
    }
}
// となる。そのままではmainメソッドからtasu()、hiku()メソッドを
// 呼び出せないためmainメソッドの呼び出しにクラス名Chapter1_6_1(Calc)と.を加える。
// .は〜のという意味になる。