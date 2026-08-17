public class StrongNum {
    public static void main(String[] args) {
        int num = 145;
        System.out.println(strong(num));
    }
    
    public static boolean strong(int num){
        int sum = 0;
        int ori_num = num;

        while(num != 0){
            int lastDig = num%10;
            sum += fact(lastDig);
            num /= 10;
        }if(sum == ori_num)
            return true;
        return false;
    }

    public static int fact(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial *= i;
        }return factorial;
    }
}
