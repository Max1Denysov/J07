class test{
    int a, b ;
    test(int i, int j){
        a = i;
        b = j ;

    }
    boolean equals(test ob){
        if(ob.a == a && ob.b == b) return true;
        else return false;
    }
}
class skam{
    int a,b;
    skam(int f , int g){
        a = f;
        b = g;
    }
}
public class PassOb {
    public static void main(String args[]){
        test ob1 = new test(100,22);
        test ob2 = new test(100,22);
        test ob3 = new test(-1,-1);
        skam sk = new skam(100,22);

        System.out.println("ob1 == ob2 :" + ob1.equals(ob2));
        System.out.println("ob1 == ob3 :" + ob1.equals(ob3));
        System.out.println("ob1 == sk :" + ob1.equals(sk));
    }
    
}
