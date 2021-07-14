class Factorial{
    int values[];
    Factorial(int i) {
        values = new int[i];
    }
    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) +"]" + values[i-1] );
    }
}


class Recursion {
    public static void main(String args[]){
        Factorial ob = new Factorial(10);
        int i;
        for(i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
    
}
