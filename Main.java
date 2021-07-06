class math{
    double one;
    double two;
    double three;
    math(double o, double t, double th){
            one = o;
            two = t;
            three = th;

        }
    math(){
            one = -1;
            two = -2;
            three = -3;

        }

    math(double len){
            one = two = three =len;
        }
    double volume(){
        return one*two*three;
    } 
}
public class Main{
    public static void main(String args[]){
        math square1 =new math(11,22,33);
        math square2 =new math();
        math square3=new math(22);
        System.out.println("square = "+ square1.volume() );
        System.out.println("triangle = "+ square2.volume() );
        System.out.println("quadrat = "+ square3.volume() );
    }
}
     
    