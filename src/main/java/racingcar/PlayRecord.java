package racingcar;

public class PlayRecord {

    public static final String number_exception
            = "[ERROR] Try count should be number(int)";
    public static final String plus_exception
            = "[ERROR] Try count should be plus number";
    private Integer round = 0;

    private void validInteger(String i) {
        try {
            Integer.parseInt(i);
        } catch (Exception e) {
            System.out.println(number_exception);
            throw new IllegalArgumentException();
        }
    } // validInteger method


    private void validPlus(String i) {
        if (Integer.parseInt(i) <= 0) {
            System.out.println(plus_exception);
            throw new IllegalArgumentException();
        }
    } // validPlus method

    private void validInput(String i) {
        validInteger(i);
        validPlus(i);
    }





}
