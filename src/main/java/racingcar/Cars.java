package racingcar;

import java.util.ArrayList;
import java.util.List;



import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Console;

public class Cars {
    public static final String seperator = ",";

    private final List<Car_Name_Position> cars
            = new ArrayList<>();

    private static String[] inputName(){
        return Console.readLine().split(seperator);
    }

    public void makeCar(){

        String[] carName = inputName();

        try {
            for (String car : carName) {
                Car_Name_Position carNamePosi = new Car_Name_Position(car);
                cars.add(carNamePosi);
            }
        }catch (IllegalArgumentException e){
            makeCar();
        }
    }






}
