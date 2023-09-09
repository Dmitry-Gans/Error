import java.util.Scanner;

public class InputData {

    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите данные через пробел: \n" +
            "Пример: ФИО, dd.mm.yyyy, номер телефона, пол - f/m.");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, повторите попытку");
            }
        }
    }
}