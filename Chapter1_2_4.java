//　演算子

// インクリメント、デクリメント演算子は基本他の演算子と一緒に使用しない

public class Chapter1_2_4 {
    public static void main(String[] args){
        int a = 10;
        a++;
        System.out.println(a);
        // 実行結果101


        int aa = 10;
        int bb = 10;
        System.out.println(++aa + 50);
        //実行結果61
        System.out.println(bb++ + 50);
        //実行結果60
        //bb＋５０した後にbb+1を実行
    }
}
