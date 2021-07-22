 class Test{

    void math(int i, int j){
        i *= 2;
        j *= 2;

    }
}
class test2{
    int d,f;
    test2(int q, int w){
       this.d = q;
       this.f = w;

    }
    void math(test2 ob){
        ob.d *= 2;
        ob.f *= 2;
    }
}

public class CallByValue {

    public static void main(String args[]){
        Test ob = new Test();
        test2 obb = new test2(100,200);
        int a = 100 ,b = 200;

        System.out.println(" a and b BEFORE: " + a + " , "+ b);
        System.out.println(" d and f BEFORE: " + obb.d + " , "+ obb.f);
         ob.math(a,b);
         obb.math(obb);
        System.out.println(" a and b AFTER: " + a + " , "+ b);
        System.out.println(" d and f AFTER: " + obb.d + " , "+ obb.f);
    }
}
