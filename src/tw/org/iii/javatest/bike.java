package tw.org.iii.javatest;

public class bike {
    private double speed;
    bike(int n){
        System.out.println(n);
    }
    bike(){
        System.out.println();
    }
    void upspeed(){
        speed += 0.1 + speed * 1.1;
    }
    void upspeed(int gear){
        speed += 0.1;
        speed *= (gear);
    }
    void upspeed(double gear){
        speed += 0.1;
        speed *= (1+gear);
    }
    void downspeed(){
        speed = speed<1?0:speed*0.7;
    }
    double getspeed(){
        return speed;
    }
}
