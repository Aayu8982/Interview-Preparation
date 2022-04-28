class SumOfNNumbers{
    static int sum =0;

    static int SumOfNumber(int num){
        if(num>0){
            sum+=num;
            SumOfNumber(num-1);
        }
        return sum;
    }

    public static void main(String[] args){
        int n = 9;
        int result = SumOfNumber(n);
        System.out.println(result);
    }
}