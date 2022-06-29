public class Student {
    private String knowledge;
    static void learn(String knowledge){
        knowledge = "Много знаний";
    }
}
    interface ITeacherWorker {
        void prepareLesson();

        void teach(Student);
    }
    class SchoolTeacherWorker implements ITeacherWorker{
        private String lessonName;

        void speakWithOtherTeachers(){
            System.out.println("Отсутствует пол урока");
        }
        public void prepareLesson(){
            lessonName = "Физкультура";
        }

        @Override
        public void teach() {
            speakWithOtherTeachers();
            Student.learn(lessonName);
        }


    }
    class UniversityTeacherWorker implements ITeacherWorker{
        private String courseName;

        void workOnDoctorskaya() {
            System.out.println("Работаю над докторской");
        }
        void speakAboutPutin(){
            System.out.println("PutinKing");
        }
        public void prepareLesson(){
            workOnDoctorskaya();
        }

        @Override
        public void teach(Student student) {
            speakAboutPutin();
            Student.learn(courseName);
        }

    }
    public static class IrbisTeacherWorker implements ITeacherWorker{
        private String cousreName = "java";

        void readHabr(){
            System.out.println("Читаю хабр");
        }
        void doIrbisTasks(){
            readHabr();
        }
        public void prepareLesson(){
            readHabr();
        }
        public void teach(Student student){
            student.learn(cousreName);
        }

    }
}

