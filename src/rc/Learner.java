package rc;



/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class Learner {
    //1. Declare attributes: full name, subject, assignment mark, test mark, and exam mark
    private String fullName;
    private String subject;
    private int assignmentMark;
    private int testMark;
    private int examMark;
    
    //2. Create default constructor
    public Learner (){
        this.fullName="";
        this.subject="";
        this.assignmentMark=0;
        this.testMark=0;
        this.examMark=0;
    }
       //3. Create accessor methods
    public String getfullName (){
        return this.fullName;
    }
    public String getsubject (){
        return this.subject;   
    }
    public int getassignmentMark (){
        return this.assignmentMark;
    }
    public int gettestMark(){
        return this.testMark;
    }
    public int getexamMark (){
        return this.examMark;
    }
    //4. Create mutator methods
    public void setfullName (String fullName){
        this.fullName=fullName;
    }
    public void setsubject(String subject){
        this.subject=subject;
    }
    public void setassignmentMark (int assignmentMark){
        this.assignmentMark=assignmentMark;
    }
    public void settestMark (int testMark){
        this.testMark=testMark;
    }
    public void setexamMark (int examMark){
        this.examMark=examMark;
    }
    // This is a method to calculate the full marks
    public double calcFinalMark(){
        return (getassignmentMark()+gettestMark()+getexamMark())/3;
    }
}