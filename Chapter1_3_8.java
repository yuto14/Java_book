// 練習問題

//3-1
① weight == 60
② (age1 + age2) * 2 > 60
③ age / 2 != 0
④ name.equals("湊")

//3-2
C、D、E

//3-3
public class Chapter1_3_8 {
    public static void main(String[] args){
        int isHungry = 0;
        String food = "bread";
        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}

//3-4
public class Chapter1_3_8 {
    public static void main(String[] args){
        boolean tenki = true;
        if(tenki == true){
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
        }
    }
}

//3-5
public class Chapter1_3_8 {
    public static void main(String[] args){
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 ");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch(selected){
            case 1:
                System.out.println("「検索します」");
                break;
            case 2:
                System.out.println("「登録します」");
                break;
            case 3:
                System.out.println("「削除します」");
                break;
            case 4:
                System.out.println("「変更します」");
                break;
        }
    }
}

//3-6
public class Chapter1_3_8 {
    public static void main(String[] args){
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for(int i = 1; i < 6; i++){
            System.out.println("０〜９の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(ans == num){
                System.out.println("当たり");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}