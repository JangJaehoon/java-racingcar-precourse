package racingcar;

import java.util.List;

public class Racing {

    private final Cars cars = new Cars();

    private void initCars() {
        System.out.println("Input the name of car ( (,) is the seperator.)");
        cars.makeCar();
    }



}
