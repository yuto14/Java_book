// 練習問題 12

// 練習１２−１
(1)Swordインスタンス
剣を生成したがざっくりとアイテムとみなす

(2)Monster a = new Slime();
スライムインスタンス
ざっくりとモンスターとみなす

// 練習１２−２
public final class A extends Y {
    public void a(){ System.out.println("Aa");}
    public void b(){ System.out.println("Ab");}
    public void c(){ System.out.println("Ac");}
}

public class B extends Y {
    public void a(){ System.out.println("Ba");}
    public void b(){ System.out.println("Bb");}
    public void c(){ System.out.println("Bc");}
}

public interface X {
    void a();
}

public abstract class Y implements X {
    public abstract void a();
    public abstract void b();
}

①　a()のみ
②　y1.a() →　Aa　　y2.a() →　Ba


// 練習12-3
①　Y[]型
②
public class Main {
    public static void main(string[] args) {
        Y[] array = new Y[2];
        array[0] = new A();
        array[1] = new B();

        for(Y y : array ){
            y.b();
        }
    }
}