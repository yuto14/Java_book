// 配列と例外
// 存在しない要素をコード内で使用するとArrayINdexOutOfBoundsExceptionエラー(例外）が起きる

public class Chapter1_4_3 {
    public static void main(String[] args){
        int[] scores = {10,20,30,40,50};
        int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
        int avg = sum / scores.length;
        System.out.println("合計点" + sum);
        System.out.println("平均点" + avg); 
    }
}
// 実行結果
// 要素５がないため　Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5が表示