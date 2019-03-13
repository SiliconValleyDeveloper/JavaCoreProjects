/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author ankit
 */
public class QuizData {
     public String mQuestion[] ={
            "Which is the First Planet in the Solar System?",
            "Which is the Second Planet in the Solar System?",
            "Which is the Third Planet in the Solar System?",
            "Which is the Forth Planet in the Solar System?",
            "Which is the Fifth Planet in the Solar System?",
            "Which is the Sixth Planet in the Solar System?",
            "Which is the Seventh Planet in the Solar System?",
            "Which is the Eight Planet in the Solar System?",
            "Which is the Ninth Planet in the Solar System?",

    };
     
       private String mChoice[][] = {
            {"Mercury","Venus","Mars","Saturn"},
            {"Jupiter","Venus","Neptune","Earth"},
            {"Earth","Jupiter","pluto","Venus"},
            {"Jupiter","Saturn","Mars","Earth"},
            {"Mercury","Pluto","Jupiter","Earth"},
            {"Uranus","Venus","Mars","Saturn"},
            {"Saturn","Pluto","Uranus","Earth"},
            {"Venus","Neptune","pluto","Mars"},
            {"Mercury","Venus","Mars","Pluto"}


    };
       
       private String mCorrectAnswer[]={"Mercury","Venus","Earth","Mars","Jupiter"
            ,"Saturn","Uranus","Neptune","Pluto"

    };

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice(int a){
        String choice = mChoice[a][0];
        return choice;
    }
    public String getChoice1(int a){
        String choice = mChoice[a][1];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoice[a][2];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoice[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
