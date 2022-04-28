class Factorial{
    static int findFactorial(int n){
        if(n == 0)
          return 1;
        return n * findFactorial(n-1);
    }

    public static void main(String[] args){
        int n = 6;
        int result = findFactorial(n);
        System.out.println(result);
    }
}

// output = 720