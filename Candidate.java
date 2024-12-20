class Candidate {
    private String name;
    private String candidateId;
    private String email;

    public Candidate(String name, String candidateId, String email) {
        this.name = name;
        this.candidateId = candidateId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void candidateDetails() {
        System.out.println("Candidate Name: " + name);
        System.out.println("CandidateID: " + candidateId);
        System.out.println("Email: " + email);
    }
}
class Exam {
    private String examName;
    private Question[] questions;
    private Candidate candidate;

    public Exam(String examName, Question[] questions, Candidate candidate) {
        this.examName = examName;
        this.questions = questions;
        this.candidate = candidate;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public void examDetails() {
        System.out.println("\nExam Name: " + examName);
        System.out.println("Candidate Details:");
        candidate.candidateDetails();
    }

    public void examQuestions() {
        System.out.println("\nQuestion of  Exam - " + examName + ":");
        for (Question question : questions) {
            question.questions();
        }
    }
}
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
    class Question {
        private String question;
        private String[] options;
        private String correctAnswer;

        public Question(String question, String[] options, String correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String newQuestion) {
            this.question = newQuestion;
        }

        public String[] getOptions() {
            return options;
        }

        public void setOptions(String[] options) {
            this.options = options;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
        }

        public void questions() {
            System.out.println(question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
        }
    }
