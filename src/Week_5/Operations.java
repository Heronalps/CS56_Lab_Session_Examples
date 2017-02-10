public Operations{
    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            int sum = a ^ b;
            int carryover = (a & b) << 1;
            return add(sum, carryover);
        }
    }
    
    public static int subtract(int a, int b){
        return add(a, add(~b,1));
    }

    public static int multiply(int a, int b){
        int sum = 0;
        for(int i = 0; i < b; i++) {
            sum = add(sum, a);
        }
        return sum;
    }

    public static int divide(int a, int b) {
        int counter = 0;
        while(a >= b) {
            a = subtract(a, b);
            counter++;
        }
        return counter;
    }
}
