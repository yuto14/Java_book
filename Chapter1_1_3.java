// p51
// データ型 浮動小数点方式には真に厳密な計算ができない。
// （誤差は小さいが金額計算などは float, doubleは使用しない方が良い

// p53
// 定数の宣言
// final データ型 定数名 = 初期値;
public class Chapter1_1_3 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println( pie * pie * PI);
    }
}