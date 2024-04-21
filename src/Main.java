public class Main {
    public static void main(String[] args) {

    }
    // Статические функции
    public static int getPrisonerCount(String prisonId) {
        return 100; // Заглушка
    }

    public static int calculateSentenceLength(String startDate, String endDate) {
        return 365; // Заглушка
    }

    public static void recordVisitorEntry(String visitorName, String visitDate, String purpose) {
        System.out.println("Посетитель " + visitorName + " осуществил вход с целью " + purpose + " " + visitDate);
    }

    // Обычные функции
    public void addPrisoner(String name, int age, String crime) {
        System.out.println("Добавленный заключенный:  " + name + " преступление: " + crime);
    }

    public void releasePrisoner(int prisonerId) {
        System.out.println("ID освобожденного заключенного: " + prisonerId);
    }

    public String searchPrisoner(String searchTerm) {
        return "Заключенный не найден"; // Заглушка
    }

    // Ответвления
    public static void getPrisonStatistics() {
        System.out.println("Статистика:");
        System.out.println("Всего заключенных: 100");
        System.out.println("Средний срок заключения: 3 года");
    }

    public static void updateVisitorRecord(String visitorName, String newVisitDate, String newPurpose) {
        System.out.println("Обновлена запись для посетителя: " + visitorName + " с новой датой посещения: " + newVisitDate);
    }
}