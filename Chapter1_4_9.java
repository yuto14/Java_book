// 練習問題 P176

// 練習４−１
① int[] points = new int[4];
② double[] weights = new double[5];
③ boolean[] answers = new boolean[3];
④ String[] names = new String[3];

// 練習４−２
public class Chapter1_4_9 {
    public static void main(String[] args){
        int[] moneyList = {121902, 8302, 55100};
        for(int i=0; i < moneyList.length; i++){
            System.out.println(moneyList[i]);
        }
        for(int number : moneyList){
            System.out.println(number);
        }
    }
}

// 練習4-3
５行目　nullにより参照ができなくなっている（NullPointerExceptionエラー)
６行目  2の要素が存在しない(ArrayIndexOUtOfBoundsExceptionエラー)

// 練習4-4
public class Chapter1_4_9 {
    public static void main(String[] args){
        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int i=0; i < numbers.length; i++){
            switch(input){
                case 3:
                    System.out.println("アタリ！");
                    break;
                case 4:
                    System.out.println("アタリ！");
                    break;
                case 9:
                    System.out.println("アタリ！");
                    break;
            }
        }
    }
}

//　4-4模範解答
public class Chapter1_4_9 {
    public static void main(String[] args){
        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int n : numbers){
            if(n == input){
                System.out.println("アタリ！");
            }
        }
    }
}