package Lesson5;

public class Array {
    public static void main(String[] args) {

        Student Misha = new Student(9, "Misha", "Muron", "Nataliev", 1995, "Odesa", "568684868", "Math", 1, "A");
        Student Petya = new Student(10, "Petya", "Petrov", "Petrovovich", 1990, "Lviv", "26569968", "History", 1, "B");
        Student Olya = new Student(8, "Olya", "Klevna", "Mihailovna", 1996, "Odesa", "5564648", "Economic", 2, "C");
        Student Katya = new Student(7, "Katya", "Korovna", "Bukova", 1991, "Kiev", "5651575", "Economic", 4, "B");
        Student Alena = new Student(6, "Alena", "Popova", "Kirova", 1994, "Lviv", "5646546804", "Math", 4, "A");
        Student Kostya = new Student(5, "Kostya", "Rubin", "Alexceev", 1996, "Odesa", "3584890", "History", 1, "B");
        Student Vlad = new Student(4, "Vlad", "Slyvka", "Olegovych", 1993, "Odesa", "35489080", "Math", 4, "A");
        Student Sasha = new Student(3, "Sasha", "Korankov", "Mishuta", 1995, "Kiev", "1541656486", "Math", 1, "C");
        Student Oleg = new Student(2, "Oleg", "Polets", "Konstantinovich", 1995, "Odesa", "380921535", "History", 3, "B");
        Student Kristina = new Student(1, "Kristina", "Spivak", "Alexandrovna", 1994, "Odesa", "+38095543", "Math", 3, "A");

        Student[] student = new Student[10];
        student[0] = Misha;
        student[1] = Petya;
        student[2] = Olya;
        student[3] = Katya;
        student[4] = Alena;
        student[5] = Kostya;
        student[6] = Vlad;
        student[7] = Sasha;
        student[8] = Oleg;
        student[9] = Kristina;

        Methods.faculty(student, "Math");
        Methods.studentCheckFacultyAndCourse(student, "History", 3);
        Methods.year(student, 1991);
        Methods.listGroup(student, "A");


    }
}