class param{
    void meth(int i, int j){
        i*= 2;
        j/= 2;
    }
}


public class box {
    public static void main(String args[]){
        param ob = new param();
        int a = 15, b=20;

        System.out.println("a and b before: " + a +" " + b);
        ob.meth(a,b);

        System.out.println("a and b after: " + a +" " + b );
    }
    
}
