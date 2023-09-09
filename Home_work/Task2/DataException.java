public class DataException extends Exception {
    
    public DataException() {
    }

    public void dataException(String data) {
        System.out.println("Исключение: Неверный формат данных");
        System.out.printf("Это неправильный формат: %s", data);
        System.out.println();
    }
}
