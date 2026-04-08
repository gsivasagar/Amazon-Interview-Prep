package LLD;

//Walk Strategy
interface Walkable {
    void walk();
}

//Talk Strategy
interface Talkable {
    void talk();
}

//Fly Strategy
interface Flyable {
    void fly();
}


//Concrete Walk Behaviors
class NormalWalk implements Walkable {
    public void walk() {
        System.out.println("Walking normally...");
    }
}

class NoWalk implements Walkable {
    public void walk() {
        System.out.println("Cannot walk...");
    }
}

//Concrete Talk Behaviors
class NormalTalk implements Talkable {
    public void talk() {
        System.out.println("Talking normally...");
    }
}

class NoTalk implements Talkable {
    public void talk() {
        System.out.println("Cannot Talk...");
    }
}

//Concrete Fly Behaviors
class NormalFly implements Flyable {
    public void fly() {
        System.out.println("Flying normally...");
    }
}

class JetFly implements Flyable {
    public void fly() {
        System.out.println("Flying with jet...");
    }
}


//client
abstract class Robots {
    Walkable walkable;
    Talkable talkable;
    Flyable flyable;

    public Robots(Walkable w, Talkable t, Flyable f) {
        this.walkable = w;
        this.talkable = t;
        this.flyable = f;
    }

    public void performWalk() {
        walkable.walk();
    }

    public void performTalk() {
        talkable.talk();
    }

    public void performFly() {
        flyable.fly();
    }

    public abstract void display();
}

class WorkerRobot extends Robots {
    public WorkerRobot(Walkable w, Talkable t, Flyable f) {
        super(w, t, f);
    }

    @Override
    public void display() {
        System.out.println("I'm a worker Robot...");
    }
}


public class strategy {
    public static void main(String[] args) {
        Robots droneWorker = new WorkerRobot(new NoWalk(), new NoTalk(), new JetFly());
        droneWorker.display();
        droneWorker.performWalk();
        droneWorker.performTalk();
        droneWorker.performFly();
    }
}
