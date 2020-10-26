// 基本的な文字列操作

Stringクラスに備わる文字列調査メソッド
・内容が等しいか調べる　public boolean equals(Object o) 
・大文字、小文字を区別せず内容が等しいか調べる public boolean equalsIgnoreCase(String s)
・文字列長を調べる　public int length()
・空文字か（長さが0か）を調べる public boolean isEmpty()
// ※大文字、小文字の区別を文字のケースと呼ぶ

// 上記の例
public class Main {
    public static void main(String[] args){
        String s1 = "スッキリJava";
        String s2 = "java";
        String s3 = "JAVA";

        if(s2.equals(s.3)){
            System.out.println("s2とs3は等しい");
        }
        if(s2.equalsIgnoreCase(s.3)){
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s１の長さは" + s1.length() + "です。");
        if(s2.isEmpty()){
            System.out.println("s1は空文字です");
        }
    }
}


// 文字列の検索
// 文字列の内部から別の文字列を探すためのメソッドも複数準備されているが下記２種類に分類される。
// ①含まれるか否かだけを判定するもの
// ②文字列のどこに含まれているかという位置情報を返すもの

Stringクラスに備わる文字列検索のメソッド
・一部に文字列sを含むか調べる public boolean contains(String s)
・文字列sで始まるかを調べる public boolean startsWith(String s)
・文字列sで終わるかを調べる public boolean endsWith(String s)
・文字列ch（又は文字列str)が最初に登場する位置を調べる　
　　public int indexOf(int cd)  、　　public int indexOf(String str)
・文字列chを後ろから検索して最初に登場する位置を調べる
   public int lastIndexOf(int ch)
   public int lastIndexOf(String str)
// ※先頭位置は１文字目ではなくは0文字目になる。
// indexOf、lastIndexOf()で引数で指定した文字列を部分文字列という。

//　上記の例
public class Main {
    public static void main(String[] args){
        String s1 = "Java and JavaScript";
        if(s1.contains("Java")){
            System.out.prinltln("文字列s１はJavaを含んでいます。");
        }
        if(s1.endsWith("Java")){
            System.out.prinltn("文字列s1はJavaが末尾にあります。");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        System.out.println("文字列s１で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    }
}


Stringクラスに備わる文字列を切り出すメソッド
・指定位置の１文字を切り出す　public char charAt(int index)
・指定位置から始まる文字列を任意の長さだけ切り出す
public String substring(int index)
public String (int index, int endindex)
// substring()で引数を１つ指定すると指定位置より後ろの文字列すべてを返す
// 引数を２つ指定した場合は2つ指定位置の間にある部分文字列が返される。

// 上記の例
public class Main {
    public static void main(String[] args) {
        String s1 = "Java programming";
        System.out.println("文字列s１の４文字目以降は" + s1.substring(3));
        System.out.println("文字列s1の５文字目から８文字目は" + s1.substring(4,8));
    }
}

文字列の変換
・大文字を小文字にかえる public String toLowerCase();
・小文字を大文字にかえる public Stirng toUpperCase();
・前後の空白を除去する public String trim();
・文字列を置き換える public String replace(String before,String after);
// trim()はよく使用されるが全角の空欄は除去されない
