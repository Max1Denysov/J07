class param{
    int a,b;
    param(int i , int j){
        a = i ;
        b = j;
    }
    void meth(param ob){
        ob.a*= 2;
        ob.b/= 2;
    }
}


public class box {
    public static void main(String args[]){
        param ob = new param(15,20);
        

        System.out.println("a and b before: " + ob.a +" " + ob.b);
        ob.meth(ob);

        System.out.println("a and b after: " + ob.a +" " + ob.b );
    }
    
}
