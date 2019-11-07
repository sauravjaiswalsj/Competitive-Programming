class Dog{
    String name;
    void bark(){
        System.out.println(name +" Says Ruff!");
    }
    void eat(){}
    void chaseCat(){}
}
public class ObjectReference{
    public static void main(String[] args){
        Dog d=new Dog();
        d.bark();
        d.name="Brat";
        Dog[] myDogs=new Dog[3];
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
    }
}