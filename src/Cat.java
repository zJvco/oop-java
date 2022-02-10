public class Cat extends Mammal implements DomesticatedAnimal, Pet {
    public String breed;

    @Override
    public String emitSound() {
        return "Miauuu...";
    }

    @Override
    public String breastFeed() {
        return "Hmmm...";
    }

    @Override
    public void callVet() {
        System.out.println("Calling to vet...");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + this.name);
    }

    @Override
    public void play() {
        System.out.println("Playing with " + this.name);
    }

    @Override
    public void takeVet() {
        System.out.println("Taking " + this.name + "to the vet...");
    }

    @Override
    public void takeWalk() {
        System.out.println("Taking " + this.name + "to walk...");
    }
}
