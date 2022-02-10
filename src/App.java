public class App {
    public static void main(String[] args) {
        // Instanciating a new dog object
        Dog dog1 = new Dog();
        dog1.name = "Cookie";
        dog1.size = "20";
        dog1.breed = "German shepherd";
        System.out.println("Name: " + dog1.name +
                        "\nSize: " + dog1.size +
                        "\nBreed: " + dog1.breed);
        System.out.println(dog1.emitSound());
        dog1.feed();

        System.out.println("-----------------");

        // Instanciating a new cat object        
        Cat cat1 = new Cat();
        cat1.name = "Minie";
        cat1.breed = "Persa";
        System.out.println("Name: " + cat1.name +
                        "\nBreed: " + cat1.breed);
        System.out.println(cat1.emitSound());
        cat1.play();

        System.out.println("-----------------");

        // Instanciating a new hourse object
        Hourse hourse1 = new Hourse();
        hourse1.name = "Pegasus";
        System.out.println("Name: " + hourse1.name);
        System.out.println(hourse1.emitSound());
        System.out.println(hourse1.breastFeed());

        System.out.println("-----------------");

        // Instanciating a new hourse object
        Parrot parrot1 = new Parrot();
        parrot1.name = "Loro";
        System.out.println("Name: " + parrot1.name);
        System.out.println(parrot1.emitSound());
        System.out.println(parrot1.fly());
    }
}
