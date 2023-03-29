package pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品接口
 */
public abstract class Pizza {

    String name;

    String dough;

    String sauce;

    List<String>  toppings = new ArrayList<>();


    void prepare() {
        System.out.println("prepare " + name);
        System.out.println("tossing dough" + dough);
        System.out.println("add sauce" + sauce);
        toppings.forEach(System.out::println);
    }


    void bake() {
        System.out.println(".... bake");
    }

    void cut() {
        System.out.println(".... cut");
    }


    void box() {
        System.out.println("..... box");
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
