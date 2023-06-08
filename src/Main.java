public class Main {
    public static void main(String[] args) {
        // Напишите пример обработки нескольких исключений в одном блоке catch
        Login login = new Login();
        validate("login");
    }

    public static boolean validate(String login) {
        try {
            check(login);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check(String login) {
        if (login == null) {
            throw new NullPointerException("логин отсутствует!");
        }
        if (login.contains("login")) {
            throw new IllegalArgumentException("логин не валидный!");
        }
    }
}