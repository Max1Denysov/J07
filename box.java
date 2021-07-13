class param{
    double width,height,depth;
    param(param ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    param(double w ,double h, double d){
        width = w;
        height = h;
        depth = d ;
    }
    param(){
        width = -1;
        height = -1;
        depth = -1;

    }
    param(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}


public class box {
    public static void main(String args[]){
        param mybox1 = new param(10,20,15);
        param mybox2 = new param();
        param mybox3 = new param(7);
        param myclone = new param(mybox1);
        
        System.out.println("Volume one = "+ mybox1.volume());
        System.out.println("Volume two = "+ mybox2.volume());
        System.out.println("Volume cube = "+ mybox3.volume());
        System.out.println("Volume clone = "+ myclone.volume());
    }
    
}
