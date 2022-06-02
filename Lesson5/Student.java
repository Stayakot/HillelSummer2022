package Lesson5;

public class Student {

    int id;
    String name;
    String surname;
    String middleName;
    int year;
    String address;
    String telNumber;
    String faculty;
    int course;
    String group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int id, String name, String surname, String middleName,
                   int year, String address, String telNumber, String faculty, int course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.year = year;
        this.address = address;
        this.telNumber = telNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
class Petya extends Student {
    Petya() {
    }

    public Petya(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(10, "Petya", "Petrov", "Petrovovich", 1990, "Lviv", "26569968", "History", 1, "B");
    }
}

class Misha extends Student {
    Misha() {
    }
    public Misha(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(9, "Misha", "Muron", "Nataliev", 1995, "Odesa", "568684868", "Math", 1, "A");
    }
}


class Olya extends Student {
    Olya() {
    }
    public Olya(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(8, "Olya", "Klevna", "Mihailovna", 1996, "Odesa", "5564648", "Economic", 2, "C");
    }
}

class Katya extends Student {
    Katya() {
    }
    public Katya(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(7, "Katya", "Korovna", "Bukova", 1991, "Kiev", "5651575", "Economic", 4, "B");
    }
}

class Alena extends Student {
    Alena() {
    }
    public Alena(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(6, "Alena", "Popova", "Kirova", 1994, "Lviv", "5646546804", "Math", 4, "A");
    }
}

class Kostya extends Student {
    Kostya() {
    }
    public Kostya(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(5, "Kostya", "Rubin", "Alexceev", 1996, "Odesa", "3584890", "History", 1, "B");
    }
}

class Vlad extends Student {
    Vlad() {
    }
    public Vlad(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(4, "Vlad", "Slyvka", "Olegovych", 1993, "Odesa", "35489080", "Math", 4, "A");
    }
}

class Sasha extends Student {
    Sasha() {
    }
    public Sasha(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(3, "Sasha", "Korankov", "Mishuta", 1995, "Kiev", "1541656486", "Math", 1, "C");
    }
}

class Oleg extends Student {
    Oleg() {
    }
    public Oleg(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(2, "Oleg", "Polets", "Konstantinovich", 1995, "Odesa", "380921535", "History", 3, "B");
    }
}

class Kristina extends Student {
    Kristina() {
    }
    public Kristina(int id, String name, String surname, String middleName, int year, String address, String telNumber, String faculty, int course, String group) {
        super(1, "Kristina", "Spivak", "Alexandrovna", 1994, "Odesa", "+38095543", "Math", 3, "A");
    }
}