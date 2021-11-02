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

    }

    public static void exercise6 (){

    }
}
