class two {
    private int age;
    private int money;
    private String position ;
    public void setter(int a,int m, String p){
        this.age = a;
        this.money = m;
        this.position =p;
    }
    public String getter(){
        return "Position : " + position + "\nAge : " + age + " \nMoney : " +  money;
        
    }
}
public class one {

    public static void main(String args[]){

        two ob = new two();
        ob.setter(12,200," manager");
        
        System.out.println(ob.age());
    }
}
