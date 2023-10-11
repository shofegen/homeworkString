public class Main {
    public static void main(String[] args) {
// Задача 1
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
// Задача 2
        String small = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + small);
// Задача 3
        String s1 = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + s1);
    }
}