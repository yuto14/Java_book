// 制御構文の応用

//　分岐、繰り返しの制御構造はその中に別の制御構造を含むことができる。
//　例）分岐の中に分岐、繰り返しの中に分岐　が可能でこの多重構造を入れ子、ネストという。

public class Chapter1_3_6 {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }  
    }
}

//　繰り返しの中断
// for文、while文の繰り返しの途中で処理を中断する場合
for(int i = 1; i < 3; i++){
    if(i==2){
        break;
    }
    System.out.println(i);
    //実行結果　1
}
// break文（繰り返し自体を中止）、continue文（その時の周だけ中止）の２種類ある
for(int i = 1; i < 3; i++){
    if(i==2){
        continue;
    }
    System.out.println(i);
    // 実行結果 1 3
}


// 意図的に無限ループを作成する場合下記が一般的
// ① while(true){処理}
// ② for(;;){処理}