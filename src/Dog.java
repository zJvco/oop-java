public class Dog extends Mammal implements DomesticatedAnimal, Pet {
    public String size;
    public String breed;

    @Override
    public String emitSound() {
        return "Au! Au!";
    }

    @Override
    public String breastFeed() {
        return "Hmmmmm...";
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
