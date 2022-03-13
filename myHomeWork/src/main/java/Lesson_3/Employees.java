package Lesson_3;

public class Employees {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employees(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String display() {
        return (surname + " " + name + " " + patronymic + " " + position + " " + email + " "
                + phone + " " + salary + " " + age);
    }

    public void printInfo() {
        System.out.println(" Фамилия " + surname + " Имя " + name + " Отчество " + patronymic +
                " Должность " + position + " email " + email + " Телефон " + phone +
                " Зарплата " + salary + " Возвраст " + age);
    }
}