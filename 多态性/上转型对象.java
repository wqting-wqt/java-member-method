package 方法.多态性;
class Animal{
    public int leg;
    Animal(){
    }

    public void getLeg() {
        System.out.println("Animal's leg");
    }
}
class Fish extends Animal{
    Fish(int leg){
        this.leg=leg;
    }
    public void getLeg() {
        System.out.println("Fish's leg");
    }
}
class Dog extends Animal{
    Dog(int leg){
        this.leg=leg;
    }
    public void getLeg() {
        System.out.println("Dog's leg");
    }
}
public class 上转型对象 {

}
