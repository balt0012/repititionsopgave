import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exerciseNr;
        do {
            System.out.println("which exercise do you want to see? (2,3,4,6) 0 to exit");
            exerciseNr = scanner.nextInt();
            if (exerciseNr == 2){
                exercise2();
            } else if (exerciseNr == 3){
                exercise3();
            } else if (exerciseNr == 4){
                exercise4();
            } else if (exerciseNr == 6){
                exercise6();
            } else if (exerciseNr != 0){
                System.out.println("please chose a number from within the brackets");
            }
        } while (exerciseNr != 0);

    }

    public static void exercise2 (){
        //here we make a car and as can be seen we are giving it all the necessary inputs for both the car class and the vehicle class
        Car car = new Car(5, 180, 100000, 4, 0);
        System.out.println(car.toString());
    }

    public static void exercise3 (){
        int words = 0;
        String[] strings = FileReader.wordReader();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) == ' '){
                    words += 1;
                }
            }
            words += 1;
        }
        System.out.println(words);
    }

    public static void exercise4 (){
        int secondsInAYear = 60 * 60 * 24 * 365;
        int growthInFiveYears = ((secondsInAYear/7 - secondsInAYear/13) * 5);
        System.out.println("growth in five years: " + growthInFiveYears);
        System.out.println("population in five years: " + (331002651 + growthInFiveYears));
    }

    public static void exercise6 (){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i+1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("chose a number to have all multiples of removed");
        int chosenNr = scanner.nextInt();
        int nrToRemove = chosenNr;
        int[] newNumbers;
        while (nrToRemove <= 100){
            nrToRemove = nrToRemove+chosenNr;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == nrToRemove){
                    newNumbers = new int[numbers.length-1];
                    for (int j = 0; j < numbers.length; j++) {
                        if(numbers[j] < nrToRemove){
                            newNumbers[j] = numbers[j];
                        } else if(numbers[j] > nrToRemove){
                            newNumbers[j-1] = numbers[j];
                        }
                        numbers = newNumbers;
                    }
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
    }
}
