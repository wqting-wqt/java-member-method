package 方法;
/*
    多态：是指在继承的关系下，对于相同的消息，不同类采用不同的实现方式，
    即不同类的对象调用同名的方法，产生不同的行为。
    多态提供了另外一种分离接口和实现（即把“做什么”与“怎么做”分开）的尺度。
    方法重载：是一个类中定义了多个方法名相同，而参数的数量不同或数量相同而
    类型和次序不同
 */
class Vehicle01 {
    int seats;
    Vehicle01(){
        seats=0;
    }
    Vehicle01(int seats){
        this.seats=seats;
    }
    void setSeats(){
        seats=0;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}
public class 方法重载 {
    public static void main(String[] args){
        Vehicle01 car=new Vehicle01();
        Vehicle01 bus=new Vehicle01(4);
        car.setSeats();
        bus.setSeats(34);
        System.out.println(car.getSeats());
        System.out.println(bus.getSeats());
    }
}
