class SumOfDigits{
    static int sum =0;

    static int sumOfDigit(int n){
        if(n>0){
            int rem = n%10;
            n=n/10;
            sum+=rem;
            sumOfDigit(n);
        }
        return sum;
    }

    public static void main(String[] args){
        int n= 1235674;
        int result = sumOfDigit(n);
        System.out.println(result);
    }
}