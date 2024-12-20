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
