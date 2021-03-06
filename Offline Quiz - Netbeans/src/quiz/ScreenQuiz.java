/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.*;
import javax.swing.JRadioButton;
import java.util.*;
import java.text.*;

/**
 *
 * @author ankit
 */
public class ScreenQuiz extends javax.swing.JFrame {
   QuizData mQuestion = new QuizData();
    int ques_length = mQuestion.mQuestion.length;
    Random r = new Random() ; //Random Question
    int score = 0 , ques_number = 1  ;
    String mAnswer;
    /**
     * Creates new form ScreenQuiz
     */
    public ScreenQuiz() {
        initComponents();
        try{
         updateQuestion(r.nextInt(ques_length)) ;
        }catch(Exception e ){
         JOptionPane.showMessageDialog(null, e);
        
        }
    }
public void updateQuestion(int num) {
        question_label.setText(mQuestion.getQuestion(num));
        r1.setText(mQuestion.getChoice(num));
        r2.setText(mQuestion.getChoice1(num));
        r3.setText(mQuestion.getChoice2(num));
        r4.setText(mQuestion.getChoice3(num));
        mAnswer = mQuestion.getCorrectAnswer(num);
         question_number.setText("Q."+ques_number);
        radiogrp.clearSelection();

    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiogrp = new javax.swing.ButtonGroup();
        question_label = new javax.swing.JLabel();
        score_label = new javax.swing.JLabel();
        question_number = new javax.swing.JLabel();
        skip_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        skip_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        question_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        question_label.setText("jLabel1");

        score_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        score_label.setText("Score: 0");

        question_number.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        question_number.setText("Q.");

        skip_btn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        skip_btn.setText("Skip");
        skip_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skip_btnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        radiogrp.add(r3);
        r3.setText("RadioButton3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        radiogrp.add(r4);
        r4.setText("jRadioButton4");
        r4.setActionCommand("RadioButton4");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        radiogrp.add(r1);
        r1.setText("RadioButton1");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        radiogrp.add(r2);
        r2.setText("RadioButton2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r1)
                .addGap(6, 6, 6)
                .addComponent(r2)
                .addGap(6, 6, 6)
                .addComponent(r3)
                .addGap(6, 6, 6)
                .addComponent(r4)
                .addContainerGap())
        );

        skip_btn1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        skip_btn1.setText("EXIT");
        skip_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skip_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(skip_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skip_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(score_label))
            .addGroup(layout.createSequentialGroup()
                .addComponent(question_number)
                .addGap(18, 18, 18)
                .addComponent(question_label, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score_label)
                    .addComponent(skip_btn)
                    .addComponent(skip_btn1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question_number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(question_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
      if(r1.getText()==mAnswer){
                score = score + 10 ;
                score_label.setText("Score:"+score);
                ques_number++;
                question_number.setText("Q."+ques_number);
                updateQuestion(r.nextInt(ques_length));
            }else {
                gameOver();
            }
            


     
    }//GEN-LAST:event_r1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
      
        // TODO add your handling code here:
         if(r3.getText()==mAnswer){
                score = score + 10 ;
                score_label.setText("Score:"+score);
                ques_number++;
                question_number.setText("Q."+ques_number);
                updateQuestion(r.nextInt(ques_length));
                
            }else {
                gameOver();
            }
    }//GEN-LAST:event_r3ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
             if(r2.getText()==mAnswer){
                score = score + 10 ;
                score_label.setText("Score:"+score);
                ques_number++;
                question_number.setText("Q."+ques_number);
                updateQuestion(r.nextInt(ques_length));
            }else {
                gameOver();
            }
    }//GEN-LAST:event_r2ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed

        // TODO add your handling code here:
         if(r4.getText()==mAnswer){
                score = score + 10 ;
                score_label.setText("Score:"+score);
                ques_number++;
                question_number.setText("Q."+ques_number);
                updateQuestion(r.nextInt(ques_length));
            }else {
                gameOver();
            }
    }//GEN-LAST:event_r4ActionPerformed

    private void skip_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skip_btnActionPerformed
     updateQuestion(r.nextInt(ques_length));        

    }//GEN-LAST:event_skip_btnActionPerformed

    private void skip_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skip_btn1ActionPerformed
           System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_skip_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenQuiz().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel question_label;
    private javax.swing.JLabel question_number;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.ButtonGroup radiogrp;
    private javax.swing.JLabel score_label;
    private javax.swing.JButton skip_btn;
    private javax.swing.JButton skip_btn1;
    // End of variables declaration//GEN-END:variables

    public void gameOver() {
       JOptionPane.showMessageDialog(this,"Wrong Answer\n \nCorrect Answer is "+mAnswer+"\nYou Score :- "+score, "Wrong", JOptionPane.CANCEL_OPTION);    
        updateQuestion(r.nextInt(ques_length)); 
       radiogrp.clearSelection();
       ques_number = 1;
       question_number.setText("Q."+ques_number);
    }
}
