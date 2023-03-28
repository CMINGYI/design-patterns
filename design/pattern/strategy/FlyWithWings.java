package pattern.strategy;

/**
 * @Name: FlyWithWings
 * @Author: kitchening
 * @Date: 2023-03-28 23:13
 * @Description: FlyWithWings
 * @Version: V1.0
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
