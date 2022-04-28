class CountDigitInNum{
    static int count =0;

    static int countDigit(int n){
        if(n>0){
            n = n/10;
            count++;
            countDigit(n);
        }
        return count;
    }

    public static void main(String[] args){
        int n = 12343456;
        int result = countDigit(n);
        System.out.println(result);
    }
}