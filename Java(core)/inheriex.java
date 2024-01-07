//// super keyword can be used to refer immediate parent class instance variable , can be used to invoke
//// parent class methods , can be used to invoke parent class instructors 

public class inheriex {
    
public int radius;
inheriex (int r){
    this.radius=r;
}

public double area(int r){
this.radius = r;
double area= Math.PI*radius*radius;
    return area ;
}


    public static void main(String[] args) {
   
        inheriex in = new inheriex(10);
        System.out.println( in.area(10));
        System.out.println();
// cylinder cy = new cylinder(10, 10);


class cylinder extends inheriex{
    public int height;
        cylinder(int r,int h) {
            super(r);
            this.height= h;
        }
    
    
        public double volume(){
            return  Math.PI*radius*radius*height;
        }
    }
    

    }
}
