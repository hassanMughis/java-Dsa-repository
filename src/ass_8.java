interface Animal {
    void eat();
    void travel();
}
class Reptiles implements Animal {
    @Override
    public void eat() {
        System.out.println("Reptiles eat insects and small animals.");
    }

    @Override
    public void travel() {
        System.out.println("Reptiles crawl or slither to travel.");
    }
}

class Birds implements Animal {
    @Override
    public void eat() {
        System.out.println("Birds eat seeds, fruits, and small insects.");
    }

    @Override
    public void travel() {
        System.out.println("Birds fly to travel.");
    }
}

class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish eat algae, small insects, and other small fish.");
    }

    @Override
    public void travel() {
        System.out.println("Fish swim to travel.");
    }
}

public class ass_8 {
    public static void main(String[] args) {
        Animal reptile = new Reptiles();
        Animal bird = new Birds();
        Animal fish = new Fish();

        reptile.eat();
        reptile.travel();

        bird.eat();
        bird.travel();

        fish.eat();
        fish.travel();
    }
}
