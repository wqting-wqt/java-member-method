package 方法.实例;

public class test {
    public static void main(String[] args){
        Person person=new Person();
        person.order(new Car());
        person.order(new Truck());
        person.order(new Bus());
    }
}
