public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fish fish= new Fish(1,"Жумгалбек","blue",12);
        Cat cat = new Cat(3,"Siymik","Black", 20);
        Dog dog = new Dog(4,"Argen","White",75);
        Parrot parrot = new Parrot(1,"gk","Orange",2);
        System.out.println(fish);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(parrot);

//        System.out.printf("%s","%d","%d","%s", fish.getName(),fish.getAge(),fish.getWeight(),fish.getColor());
//        System.out.printf("%s","%d","%d","%s",cat.getName(),cat.getAge(),cat.getWeight(),cat.getColor());
//        System.out.printf("%s","%d","%d","%s",dog.getName(),dog.getAge(),dog.getWeight(),dog.getColor());
//        System.out.printf("%s","%d","%d","%s",parrot.getName(),parrot.getAge(),parrot.getWeight(),parrot.getColor());
    }
}