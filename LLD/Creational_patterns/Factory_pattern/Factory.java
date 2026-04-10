package LLD.Creational_patterns.Factory_pattern;

// Product Interface    
interface Burger{
    void prepare();
}

// Concrete Products
class BasicBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Basic Burger");
    }
}
class PremiumBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Premium Burger");
    }   
}
class BasicWheatBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Basic Wheat Burger");
    }
}
class PremiumWheatBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Premium Wheat Burger");
    }
}

// Creator
abstract class BurgerFactory{
    public abstract Burger createBurger(String type);

    public void orderBurger(String type){
        Burger burger = createBurger(type);
        burger.prepare();
    }
}

// Concrete Creators A
class singBurger extends BurgerFactory{
    @Override
    public Burger createBurger(String type){
        if(type.equals("Basic")){
            return new BasicBurger();
        }else if(type.equals("Premium")){
            return new PremiumBurger();
        }
        return null;
    }
}
// Concrete Creator B
class kingBurger extends BurgerFactory{
    @Override
    public Burger createBurger(String type){
        if(type.equals("Basic")){
            return new BasicWheatBurger();
        }else if(type.equals("Premium")){
            return new PremiumWheatBurger();
        }
        return null;
    }
}

// Client
public class Factory {
    public static void main(String[] args) {
        BurgerFactory healthyFactory = new kingBurger();
        System.out.println("Ordering a healthy burger");
        healthyFactory.orderBurger("Premium");

        BurgerFactory unhealthyFactory = new singBurger();
        System.out.println("Ordering an unhealthy burger");
        unhealthyFactory.orderBurger("Basic");
    }
}
