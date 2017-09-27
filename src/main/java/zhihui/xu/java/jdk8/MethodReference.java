package zhihui.xu.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class MethodReference {

    public static void test(Integer i) {
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);
        cars.forEach(Car::follow);

    }

    public static class Car {
        public static Car create(final Supplier<Car> supplier) {
            return supplier.get();
        }

        public static void collide(final Car car) {
            System.out.println("Collided " + car.toString());
        }

        public static void follow(final Car another) {
            System.out.println("Following the " + another.toString());
        }

        public void repair() {
            System.out.println("Repaired " + this.toString());
        }
    }

}
