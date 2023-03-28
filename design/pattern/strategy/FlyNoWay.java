package pattern.strategy;

/**
 * @Name: FlyNoWay
 * @Author: kitchening
 * @Date: 2023-03-28 23:13
 * @Description: FlyNoWay
 * @Version: V1.0
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
