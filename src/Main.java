public class Main {
    public static void main(String[] args) {
        Student zapusk = new Student();
        zapusk.learn("Много знаний");
        SchoolTeacherWorker Biologichka = new SchoolTeacherWorker();
        Biologichka.prepareLesson();
        Biologichka.teach();
        new UniversityTeacherWorker();



    }
}