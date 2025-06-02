package chapter_3;

public class Book {
    public static void main(String[] args) {
        Book myBook = new Book("Head First Java","Kathy Sierra & Bert Bates");
        myBook.displayMessage();
    }
    private String courseName;
    private String instructorName;

    public Book(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + courseName + "!");
        System.out.println("This course is presented by: " + instructorName);
    }


}
