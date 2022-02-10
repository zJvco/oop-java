public class Hourse extends Mammal implements DomesticatedAnimal {
    @Override
    public String emitSound() {
        return "Yhuuuuu...";
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
    public void takeVet() {
        System.out.println("Taking " + this.name + "to the vet...");
    }
}
