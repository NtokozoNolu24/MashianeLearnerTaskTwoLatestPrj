
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class MashianeLearnerTaskTwoPrj {
// Create Learner2 object
      static Learner objLearner2 = new Learner ();
      
    public static void main(String[] args) {
        // Call in a method to get the user input
        getLearner2Input();
        
        // Call a method to display the final mark
        displayFinalMark();
    }
    // Then call a method to prompt the user for input 
    public static void getLearner2Input(){
        objLearner2.setfullName(JOptionPane.showInputDialog("Please enter your full name ; "));
        objLearner2.setsubject(JOptionPane.showInputDialog("Please enter the subject you are studying : "));
        objLearner2.setassignmentMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your assignment mark : ")));
        objLearner2.settestMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your test mark : ")));
        objLearner2.setexamMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your exam mark : ")));
    }    
        // Create a method to display final mark
    public static void displayFinalMark(){
          double finalMark = objLearner2.calcFinalMark();
          JOptionPane.showMessageDialog(null, "Your final mark is :"+ finalMark);
        }
    }

