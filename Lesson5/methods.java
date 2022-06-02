package Lesson5;

public class methods {

    public  static void faculty(Student[] students, String faculty) {
        System.out.println("Студенты на факультете " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }


    public   static void student_check_faculty_and_cours(Student[] students, String faculty, int course) {
        System.out.println("Студенты на факультете " + faculty + "и курсе " + course+" :");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getCourse()==(course)) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    public  static void year(Student[] students, int year){
        System.out.println("Список студентов, родившихся после "+year+":");
        for(Student student: students){
            if(student.getYear()>year){
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }


   public static  void list_group(Student[] students,String group) {
        System.out.println("Cписок учебной группы " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }
}
