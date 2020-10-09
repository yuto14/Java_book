// 練習問題10 P401

// 練習１０−１
②、③、⑤

// 練習１０−２
ア　contact
イ  iphonne
ウ  vechile
エ  toyota
オ  book
カ　english dictionary

// 練習１０ー３
public class Matango {
    int hp = 50;
    char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    public void attack(Hero h){
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("１０のダメージ");
        h.hp -= 10;
    }
}

public class PoisonMatango extends Matango {
    int poisonAttackCount = 5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    public void Attack(Hero h){
        super.attack(h);
        if(this.poisonAttackCount >= 0) {
            System.out.println("さらに毒の胞子をばらまいた!");
            int damege = h.hp / 5
            h.hp -= damege;
            System.out.println(damege + "のダメージ!");
            this.poisonAttackCount--;
        }
    }
}

// コンストラクタは継承されない
// コンストラクタはそれぞれのクラスに固有のものであり、継承はされないもの。
// 必ず内部のコンストラクタを呼び出しているだけで継承しているわけではない？