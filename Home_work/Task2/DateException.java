public class DateException extends Exception {

    public DateException() {

    }
    
    public void dateException(String date) {
        System.out.println("Исключение: Неверный формат даты");
        System.out.printf("Это неправильный формат даты: %s", date);
        System.out.println();
    }

    public void dataException(String string) {
    }
}
