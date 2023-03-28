package pattern.strategy;

/**
 * @Name: Duck
 * @Author: kitchening
 * @Date: 2023-03-28 23:09
 * @Description: 策略模式
 * @Version: V1.0
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    protected Duck(){}

    public abstract void display();


    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }


    public void swim(){
        System.out.println("all duck will swim!!!");
    }

    public static void main(String[] args) {
        Duck duck = new MallDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.performFly();
        duck.performQuack();
    }
}
