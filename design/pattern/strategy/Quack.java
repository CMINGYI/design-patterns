package pattern.strategy;

/**
 * @Name: Quack
 * @Author: kitchening
 * @Date: 2023-03-28 23:15
 * @Description: Quack
 * @Version: V1.0
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack!!!");
    }
}
