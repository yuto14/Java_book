// 練習問題１１　P453

// 練習11-1
// 元のBookクラス
public class Book {
    String name;
    int price;
    String color;
    String isbn;
    // コンストラクタ
    public Book(String name, int price, String color, String isbn){
        this.name = name;
        this.name = color;
        this.isbn = isbn;
    }
    // メソッド
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public String getIsbn(){
        return this.isbn;
    }
}

// 元のComputerクラス
public class Computer {
    String name;
    int price;
    String color;
    String makerName;
    //　コンストラクタ
    public Computer(String name, int price, String color, String makerName) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.makerName = makerName;
    }
    // メソッド
    public String getName() {
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public String getMakerName(){
        return this.makerName;
    }
}

// 有形資産クラス
public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    // コンストラクタ
    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    // メソッド
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
}

// Bookクラス
public class Book extends TangibleAsset {
    String isbn;

    // コンストラクタ
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
        
    }

    // メソッド
    public String getIsbn(){
        return this.isbn;
    }
}

// Computerクラス
public class Computer extends TangibleAsset {
    String makerName;

    // コンストラクタ
    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    // メソッド
    public String getMakerName(){
        return this.makerName;
    }
}

// 練習11-2
ア）資産（Asset)　　　イ）無形資産（IntangibleAsset)　　　ウ）特許権（Patent)

ア）の資産クラス
public abstract class Asset {
    String name;
    int price;

    public Asset(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public price getPrice(){
        return this.price;
    }
}

TangibleAssetクラス
public abstract class TangibleAsset extends Asset {
    String color;

    // コンストラクタ
    public TangibleAsset(String name,int price, String color) {
        super(name, price);
        this.color = color;        
    }

    // メソッド
    public String getColor(){
        return this.color;
    }
}

// 練習11-3
public interface Thing {
    double getWeight();
    void setWeight(double weight);
}

// 練習11-4
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    // コンストラクタ
    public TangibleAsset(String name,int price, String color,double setWeight, double getWeight) {
        super(name, price);
        this.color = color;
    }

    // メソッド
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public void double setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }
}