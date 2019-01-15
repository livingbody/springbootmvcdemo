package cn.goingtodo;

import java.util.Arrays;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {
        //方法引用
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }
}
