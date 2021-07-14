class param{
    int a;
    param(int i ){
        a = i ;
        
    }
    param meth(){
        param ob = new param(a +10);
        return ob;
    }
}


public class box {
    public static void main(String args[]){
        param ob1 = new param(15);
        param ob2;
        ob2 = ob1.meth();
        System.out.println("ob1.a: " + ob1.a );
        System.out.println("ob2.a: " + ob2.a );
        ob2 = ob2.meth();

        System.out.println("ob2.a after: " + ob2.a  );
    }
    
}
