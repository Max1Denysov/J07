class ftest {
    int a;
    public int b;
    private int c;

    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
}



public class TestTwo {
    public static void main(String args[]){
        ftest ob = new ftest();
        ob.a = 10;
        ob.b = 20;
        
        
    
    System.out.println("a,b : " + ob.a + " "+ob.b+" ");
    }
     
}
