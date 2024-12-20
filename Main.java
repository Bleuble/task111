public class Main {
    public static void main(String[] args) {

        String[] options1 = {"Kerey", "Zhanibek", "Kenesary", "Abylai"};
        Question question1 = new Question("Who is the first Kazakh khan?", options1, "Kerey");

        String[] options2 = {"1992", "1994", "1991", "1465"};
        Question question2 = new Question("Which year Kazakhstan get their independence?", options2, "1991");

        Question[] questions = {question1, question2};

        Candidate candidate = new Candidate("Abay Bauyrzhan", "N01", "abay.bauyrzhan@aitu.edu.kz");
        Candidate candidate2 = new Candidate("Islam Madi", "N02", "islam.madi@aitu.edu.kz");

        Exam exam = new Exam("Kazakh History Exam", questions, candidate);
        Exam exam2 = new Exam("Kazakh History Exam", questions, candidate2);
        exam.examDetails();

        exam2.examDetails();

        exam.examQuestions();
    }
}