// 引数や戻り値に配列を使用

// メソッドの引数には配列が使用可能
// 例
public class Chapter1_5_5 {
    public static void printArray(int[] array){
        for(int element : array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        printArray(array);
    }
}

// 配列の値そのものを引数として渡しているのではなくアドレス情報を渡している。

// メソッドを呼び出す際引数として変数を指定した場合、渡されるのは変数ではなく、変数に入っている値。
// このように値そのものが渡される呼び出しを値渡しと呼ぶ。

// 基本型変数をメソッド呼び出しで使用
// 1 呼び出し元の変数の内容が呼び出し先の引数にコピーされる。
// 2 呼び出し先で引数の内容を書き換えても呼び出しもとの変数は変化しない。

// 配列変数をメソッド呼び出しで渡すと
// 引数としてアドレスを渡すことを参照渡しという。
// 参照渡しの場合、呼び出し先で加えた変更が呼び出し元にも影響する。
// 同じ配列を参照していることの確認
public class Chapter1_5_5 {
    public static void incArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            array[i]++;
        }
    } 
    public static void main(String[] args) {
        int[] array = {1,2,3};
        incArray(array);
        for(int i : array){
            System.out.println(i);
        }
    }
}
// 実行結果　2 3 4

//　戻り値に配列を用いる
public class Chapter1_5_5 {
    public static int[] makeArray(int size){
        int[] newArray = new int[size];
        for(int i=0; i < newArray.length; i++) {
            newArray[i]++;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for(int i : array){
            System.out.println(i);
        }
    }
}
// 実行結果 1 2 3