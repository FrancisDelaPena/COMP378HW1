class Power {
    public static double power(double x, int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        if (n % 2 == 0){
            double half = power(x, n/2);
            return half * half;
        }
        else{
            double half = power(x, (n -1)/2);
            return x * half * half;
        }
    }

    public static void main(String [] args){
        double x = 2;
        int n = 0;
    
        System.out.println("x = 2");
    
        double answer = power(x, n);
        System.out.println(answer);
    
        n = 1;
    
        System.out.println("n = 1");
    
        answer = power(x, n);
        System.out.println(answer);
    
        n = 2;
    
        System.out.println("n = 2");
    
        answer = power(x, n);
        System.out.println(answer);
    
        n = 3;
    
        System.out.println("n = 3");
    
        answer = power(x, n);
        System.out.println(answer);
}
}