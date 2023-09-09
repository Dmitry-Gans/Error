public class SexException extends Exception {
    
    public SexException() {

    }

    public void sexException(String sex) {
        System.out.println("Исключение: Неверные данные о поле!");
        System.out.printf("Эти данные неверные: %s", sex);
        System.out.println();
    }
}
