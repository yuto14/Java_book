// 練習問題 P329

// 練習８−１
public class Cleric {

}

// 練習８−２
public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
}

// 練習８−３
public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void selfAid(){
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが最大まで回復した");
    }
    
}

// 練習８−４
public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void selfAid(){
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int sec, int cure){
        System.out.println(this.name + "は" + sec + "秒、祈った");
        cure = this.MAX_MP - this.mp
        sec += new java.util.Random().nextInt(3)
        this.mp += sec
        if (this.mp > this.MAX_MP) {
           this.mp = this.MAX_MP;
           System.out.println("MPが" + cure + "ポイント回復した");
           return cure;
        }
        System.out.println("MPが" + sec +　"ポイント回復した");
        return sec;
    }
}