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
        System.out.println("Fish has "+leg+" leg");
    }
}
class Dog extends Animal{
    Dog(int leg){
        this.leg=leg;
    }
    public void getLeg() {
        System.out.println("Dog has "+leg+" leg");
    }
}
public class 多态 {
    public static void main(String[] args){
        Animal animal=new Animal();
        Fish fish=new Fish(0);
        Dog dog=new Dog(4);
        animal.getLeg();
        fish.getLeg();
        dog.getLeg();
    }
}
