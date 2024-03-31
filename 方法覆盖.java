package 方法;
class Vehicle {
    int seats;
    Vehicle(){
        seats=0;
    }

    void getSeats() {
        System.out.println("Vehicle's seats");
    }
}
class Bus extends Vehicle {
    Bus(int seats){
        this.seats=seats;
    }
    void getSeats(){
        System.out.println("This bus has "+seats+" seats");
    }
}
class Car extends Vehicle {
    Car(int seats){
        this.seats=seats;
    }
    void getSeats(){
        System.out.println("This car has "+seats+" seats");
    }
}
public class 方法覆盖 {
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle();
        Car car=new Car(5);
        Bus bus=new Bus(35);
        vehicle=car;
        vehicle.getSeats();
        vehicle=bus;
        vehicle.getSeats();
    }
}
