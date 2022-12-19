public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String fistName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + fistName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        System.out.println("Задание 2");
        String name = "Ivanov Ivan Ivanovich";
        String upperFullName = name.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        //Задание 3
        System.out.println("Задание 3");
        String name1 = "Иванов Семён Семёныч";
        String fixedFullName = name1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fixedFullName);

    }
}