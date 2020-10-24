// 練習問題14

// 練習問題14-1
public class Account {
    String accountNumber; //口座番号
    int balance; // 残高

    public String toString(){
        return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        } if (o instanceof Account){
            Account a = (Account)o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
        } if (an1.equals(an2)) {
            return true;
        }
            return false;
        }

    }
}

// 練習問題14-2
public class Cleric {
    static final int MAXHP = 50;
    int mp = 10;
    static final int MAXMP = 10;

}

// staticインポート文
// あるクラスの静的メンバをインポートすることも可能
import static パッケージ名.クラス名.静的メンバ名;
※　import static パッケージ名.クラス名でクラスに含まれる全ての静的メンバをimport可能。

