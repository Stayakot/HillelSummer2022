package Lesson5;

public class Array {
    public static void main(String[] args) {


        Student[] student = new Student[10];
        student[0] = new Misha(9, "Misha", "Muron", "Nataliev", 1995, "Odesa", "568684868", "Math", 1, "A");
        student[1] = new Petya(10, "Petya", "Petrov", "Petrovovich", 1990, "Lviv", "26569968", "History", 1, "B");
        student[2] = new Olya(8, "Olya", "Klevna", "Mihailovna", 1996, "Odesa", "5564648", "Economic", 2, "C");
        student[3] = new Katya(7, "Katya", "Korovna", "Bukova", 1991, "Kiev", "5651575", "Economic", 4, "B");
        student[4] = new Alena(6, "Alena", "Popova", "Kirova", 1994, "Lviv", "5646546804", "Math", 4, "A");
        student[5] = new Kostya(5, "Kostya", "Rubin", "Alexceev", 1996, "Odesa", "3584890", "History", 1, "B");
        student[6] = new Vlad(4, "Vlad", "Slyvka", "Olegovych", 1993, "Odesa", "35489080", "Math", 4, "A");
        student[7] = new Sasha(3, "Sasha", "Korankov", "Mishuta", 1995, "Kiev", "1541656486", "Math", 1, "C");
        student[8] = new Oleg(2, "Oleg", "Polets", "Konstantinovich", 1995, "Odesa", "380921535", "History", 3, "B");
        student[9] = new Kristina(1, "Kristina", "Spivak", "Alexandrovna", 1994, "Odesa", "+38095543", "Math", 3, "A");

        Methods.faculty(student, "Math");
        Methods.studentCheckFacultyAndCourse(student, "History", 3);
        Methods.year(student, 1991);
        Methods.listGroup(student, "A");

    }
}