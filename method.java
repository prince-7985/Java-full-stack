public class Dog{
    void bark(){
        System.out.println("bhoo bhoo");
    }
    void eat(String food){
        System.out.println("Dog is eating " + food);
    }
}


public class method {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat("bone");
    }
}
