// 練習問題１３

// 練習１３−１
public class Wand {
    private String name; //杖の名前
    private double power; //杖の魔力
}

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;  //基本回復ポイント
        int recovPoint = int()(basePoint * this.wand.gpower);　//　杖による増幅
        h.setHp(h.getHp() + recovPoint);  // 勇者のHPを回復
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    }
}

// 練習13-2
wandのpowerを取得できない。原因はpowerにアクセス制限をつけたから


//　練習13-3
public class Wand {
    private String name;
    private double power;
    public String getName(){
        return this.name;
    }
    public void setName(Stirng name) {
        return this.name;
    }
    public double getPower(){
        return this.power;
    }
    public void setPower(double power){
        return this.power;
    }
}

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = int()(basePoint * this.wand.gpower);
        // 勇者のHPを回復
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        return this.hp;
    }
    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        return this.mp;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        return this.name;
    }
    public Wand getWand(){
        return this.wand;
    }
    public void setWand(Wand wand){
        return this.wand;
    }
}

// 練習１３−４
public class Wand {
    private String name;
    private double power;
    public String getName(){
        return this.name;
    }
    public void setName(Stirng name) {
        // ①
        if ( name == null || name.length() <= 3){
            throw new IllegalArgument Exceprtion
            ("杖の名前が短すぎます。中断します。")
        }
        return this.name = name;
    }
    public double getPower(){
        return this.power;
    }
    public void setPower(double power){
        if (power < 0.5 || power > 100){
            throw new IllegalArgument Exceprtion
            ("杖の増幅率は0.5~100で設定してください。中断します。");
        }
        return this.power = power;
    }
}

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = 
        // ②
        int()(basePoint * this.wand.power);
        
        // 勇者のHPを回復
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        // ④
        if (hp < 0){
            return hp = 0;
        }
        return this.hp　= hp;
    }
    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        // ④
        if(mp < 0 ){
            throw new IllegalArgument Exceprtion
            ("mpは0以上で設定してください");
        }
        return this.mp = mp;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        // ①
        if(name == null || name.length() <= 3){
            throw new IllegalArgument Exceprtion
            ("魔法使いの名前が短すぎます。中断します。")
        }
        return this.name = name;
    }
    public Wand getWand(){
        return this.wand;
    }
    public void setWand(Wand wand){
        // ③
        if(wand == null){
            throw new IllegalArgument Exceprtion
            ("杖が設定されていません。中断します。");
        }
        return this.wand = wand;
    }
}

// 同一クラス内でもアクセサ（getter、setter）経由でアクセスする。
// 同一クラス内のフィールドに値を設定する場合もsetterを利用するのがよい。
// this.name = "奏";とするより this.setName("奏");とする方が
// setterによる不正値チェックを活用することができるため。
// フィールド値の取得は直接フィールドから取得することが一般的だが
// 将来的な柔軟性を考えgetterにて取得していることもある。