/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class sudokufile extends javax.swing.JFrame {
    private String turn = "1";
    private boolean globalFlag = true;
    private boolean globalFlag2 = true;
    private String solvedBoard[][]={
        {"4","3","5","2","6","9","7","8","1"},
        {"6","8","2","5","7","1","4","9","3"},
        {"1","9","7","8","3","4","5","6","2"},
        {"8","2","6","1","9","5","3","4","7"},
        {"3","7","4","6","8","2","9","1","5"},
        {"9","5","1","7","4","3","6","2","8"},
        {"5","1","9","3","2","6","8","7","4"},
        {"2","4","8","9","5","7","1","3","6"},
        {"7","6","3","4","1","8","2","5","9"}
        
        
    };
    private void AssignTurn(JButton btn){
        selectorButton1.setBackground(Color.black);
        selectorButton2.setBackground(Color.black);
        selectorButton3.setBackground(Color.black);
        selectorButton4.setBackground(Color.black);
        selectorButton5.setBackground(Color.black);
        selectorButton6.setBackground(Color.black);
        selectorButton7.setBackground(Color.black);
        selectorButton8.setBackground(Color.black);
        selectorButton9.setBackground(Color.black);
        btn.setBackground(Color.blue);
    }
    private void resetGame(){
        JButton predefinedbts[]={rc14,rc15,rc17,rc19,rc21,rc22,rc25,rc28,rc31,rc32,rc36,
            rc37,rc41,rc42,rc44,rc48,rc53,rc54,rc56,rc57,rc62,rc66,rc68,rc69,rc73,rc74,
            rc78,rc79,rc82,rc85,rc88,rc89,rc91,rc93,rc95,rc96};
        JButton btns[][]={
            {rc11,rc12,rc13,rc14,rc15,rc16,rc17,rc18,rc19},
            {rc21,rc22,rc23,rc24,rc25,rc26,rc27,rc28,rc29},
            {rc31,rc32,rc33,rc34,rc35,rc36,rc37,rc38,rc39},
            {rc41,rc42,rc43,rc44,rc45,rc46,rc47,rc48,rc49},
            {rc51,rc52,rc53,rc54,rc55,rc56,rc57,rc58,rc59},
            {rc61,rc62,rc63,rc64,rc65,rc66,rc67,rc68,rc69},
            {rc71,rc72,rc73,rc74,rc75,rc76,rc77,rc78,rc79},
            {rc81,rc82,rc83,rc84,rc85,rc86,rc87,rc88,rc89},
            {rc91,rc92,rc93,rc94,rc95,rc96,rc97,rc98,rc99}
        };
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                 boolean flag=true;
                 for(int k=0;k<predefinedbts.length;k++){
                    if(btns[i][j]==predefinedbts[k]){
                        flag=false;
                    }
                }
                if(flag){
                    btns[i][j].setText("");
                    btns[i][j].setForeground(Color.black);
                    btns[i][j].setBackground(Color.white);
                }
            }
        }
    }
    public void seeSolution(){
        JButton predefinedbts[]={rc14,rc15,rc17,rc19,rc21,rc22,rc25,rc28,rc31,rc32,rc36,
            rc37,rc41,rc42,rc44,rc48,rc53,rc54,rc56,rc57,rc62,rc66,rc68,rc69,rc73,rc74,
            rc78,rc79,rc82,rc85,rc88,rc89,rc91,rc93,rc95,rc96};
        JButton btns[][]={
            {rc11,rc12,rc13,rc14,rc15,rc16,rc17,rc18,rc19},
            {rc21,rc22,rc23,rc24,rc25,rc26,rc27,rc28,rc29},
            {rc31,rc32,rc33,rc34,rc35,rc36,rc37,rc38,rc39},
            {rc41,rc42,rc43,rc44,rc45,rc46,rc47,rc48,rc49},
            {rc51,rc52,rc53,rc54,rc55,rc56,rc57,rc58,rc59},
            {rc61,rc62,rc63,rc64,rc65,rc66,rc67,rc68,rc69},
            {rc71,rc72,rc73,rc74,rc75,rc76,rc77,rc78,rc79},
            {rc81,rc82,rc83,rc84,rc85,rc86,rc87,rc88,rc89},
            {rc91,rc92,rc93,rc94,rc95,rc96,rc97,rc98,rc99}
        };
        if(globalFlag){
            globalFlag=false;
            solutionButton.setText("Hide Solution");
        
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                 boolean flag=true;
                 for(int k=0;k<predefinedbts.length;k++){
                    if(btns[i][j]==predefinedbts[k]){
                        flag=false;
                    }
                }
                if(flag){
                    btns[i][j].setText(solvedBoard[i][j]);
                    btns[i][j].setForeground(Color.black);
                    btns[i][j].setBackground(Color.white);
                }
            }
        }
        }
        else{
            solutionButton.setText("Solution");
            globalFlag=true;
            resetGame();
            
        }
    }
    public void checkMove(){
        JButton predefinedbts[]={rc14,rc15,rc17,rc19,rc21,rc22,rc25,rc28,rc31,rc32,rc36,
            rc37,rc41,rc42,rc44,rc48,rc53,rc54,rc56,rc57,rc62,rc66,rc68,rc69,rc73,rc74,
            rc78,rc79,rc82,rc85,rc88,rc89,rc91,rc93,rc95,rc96};
        JButton btns[][]={
            {rc11,rc12,rc13,rc14,rc15,rc16,rc17,rc18,rc19},
            {rc21,rc22,rc23,rc24,rc25,rc26,rc27,rc28,rc29},
            {rc31,rc32,rc33,rc34,rc35,rc36,rc37,rc38,rc39},
            {rc41,rc42,rc43,rc44,rc45,rc46,rc47,rc48,rc49},
            {rc51,rc52,rc53,rc54,rc55,rc56,rc57,rc58,rc59},
            {rc61,rc62,rc63,rc64,rc65,rc66,rc67,rc68,rc69},
            {rc71,rc72,rc73,rc74,rc75,rc76,rc77,rc78,rc79},
            {rc81,rc82,rc83,rc84,rc85,rc86,rc87,rc88,rc89},
            {rc91,rc92,rc93,rc94,rc95,rc96,rc97,rc98,rc99}
        };
        if(globalFlag2){
            globalFlag2=false;
            checkmovesButton.setText("UNDO");
            for(int i =0;i<9;i++){
                for(int j=0;j<9;j++)
                   if(btns[i][j].getText()!=solvedBoard[i][j]&& btns[i][j].getText()!=""){
                       btns[i][j].setBackground(Color.red);
                    } 
            }
        }
        else{
            checkmovesButton.setText("CHECK MOVES");
            globalFlag2=true;
            for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                 boolean flag=true;
                 for(int k=0;k<predefinedbts.length;k++){
                    if(btns[i][j]==predefinedbts[k]){
                        flag=false;
                    }
                }
                if(flag){
                    btns[i][j].setForeground(Color.black);
                    btns[i][j].setBackground(Color.white);
                }
            }
        }
        }
    }
    public sudokufile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rc11 = new javax.swing.JButton();
        rc12 = new javax.swing.JButton();
        rc13 = new javax.swing.JButton();
        rc21 = new javax.swing.JButton();
        rc22 = new javax.swing.JButton();
        rc31 = new javax.swing.JButton();
        rc32 = new javax.swing.JButton();
        rc23 = new javax.swing.JButton();
        rc33 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        rc71 = new javax.swing.JButton();
        rc72 = new javax.swing.JButton();
        rc73 = new javax.swing.JButton();
        rc81 = new javax.swing.JButton();
        rc82 = new javax.swing.JButton();
        rc91 = new javax.swing.JButton();
        rc92 = new javax.swing.JButton();
        rc83 = new javax.swing.JButton();
        rc93 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rc14 = new javax.swing.JButton();
        rc15 = new javax.swing.JButton();
        rc16 = new javax.swing.JButton();
        rc24 = new javax.swing.JButton();
        rc25 = new javax.swing.JButton();
        rc34 = new javax.swing.JButton();
        rc35 = new javax.swing.JButton();
        rc26 = new javax.swing.JButton();
        rc36 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rc41 = new javax.swing.JButton();
        rc42 = new javax.swing.JButton();
        rc43 = new javax.swing.JButton();
        rc51 = new javax.swing.JButton();
        rc52 = new javax.swing.JButton();
        rc61 = new javax.swing.JButton();
        rc62 = new javax.swing.JButton();
        rc53 = new javax.swing.JButton();
        rc63 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        rc44 = new javax.swing.JButton();
        rc45 = new javax.swing.JButton();
        rc46 = new javax.swing.JButton();
        rc54 = new javax.swing.JButton();
        rc55 = new javax.swing.JButton();
        rc64 = new javax.swing.JButton();
        rc65 = new javax.swing.JButton();
        rc56 = new javax.swing.JButton();
        rc66 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        rc74 = new javax.swing.JButton();
        rc75 = new javax.swing.JButton();
        rc76 = new javax.swing.JButton();
        rc84 = new javax.swing.JButton();
        rc85 = new javax.swing.JButton();
        rc94 = new javax.swing.JButton();
        rc95 = new javax.swing.JButton();
        rc86 = new javax.swing.JButton();
        rc96 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rc17 = new javax.swing.JButton();
        rc18 = new javax.swing.JButton();
        rc19 = new javax.swing.JButton();
        rc27 = new javax.swing.JButton();
        rc28 = new javax.swing.JButton();
        rc37 = new javax.swing.JButton();
        rc38 = new javax.swing.JButton();
        rc29 = new javax.swing.JButton();
        rc39 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        rc47 = new javax.swing.JButton();
        rc48 = new javax.swing.JButton();
        rc49 = new javax.swing.JButton();
        rc57 = new javax.swing.JButton();
        rc58 = new javax.swing.JButton();
        rc67 = new javax.swing.JButton();
        rc68 = new javax.swing.JButton();
        rc59 = new javax.swing.JButton();
        rc69 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        rc77 = new javax.swing.JButton();
        rc78 = new javax.swing.JButton();
        rc79 = new javax.swing.JButton();
        rc87 = new javax.swing.JButton();
        rc88 = new javax.swing.JButton();
        rc97 = new javax.swing.JButton();
        rc98 = new javax.swing.JButton();
        rc99 = new javax.swing.JButton();
        rc89 = new javax.swing.JButton();
        selectorButton1 = new javax.swing.JButton();
        selectorButton2 = new javax.swing.JButton();
        selectorButton3 = new javax.swing.JButton();
        selectorButton4 = new javax.swing.JButton();
        selectorButton5 = new javax.swing.JButton();
        selectorButton6 = new javax.swing.JButton();
        selectorButton7 = new javax.swing.JButton();
        selectorButton8 = new javax.swing.JButton();
        selectorButton9 = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        solutionButton = new javax.swing.JButton();
        checkmovesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 630));

        jPanelMain.setBackground(new java.awt.Color(255, 102, 0));
        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMain.setMaximumSize(new java.awt.Dimension(506, 800));
        jPanelMain.setPreferredSize(new java.awt.Dimension(506, 650));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        rc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc11ActionPerformed(evt);
            }
        });

        rc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc12ActionPerformed(evt);
            }
        });

        rc13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc13ActionPerformed(evt);
            }
        });

        rc21.setBackground(new java.awt.Color(102, 255, 255));
        rc21.setText("6");
        rc21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc21ActionPerformed(evt);
            }
        });

        rc22.setBackground(new java.awt.Color(0, 255, 255));
        rc22.setText("8");
        rc22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc22ActionPerformed(evt);
            }
        });

        rc31.setBackground(new java.awt.Color(0, 255, 255));
        rc31.setText("1");
        rc31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc31ActionPerformed(evt);
            }
        });

        rc32.setBackground(new java.awt.Color(0, 255, 255));
        rc32.setText("9");
        rc32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc32ActionPerformed(evt);
            }
        });

        rc23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc23ActionPerformed(evt);
            }
        });

        rc33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rc11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rc31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rc21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rc13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rc31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        rc71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc71ActionPerformed(evt);
            }
        });

        rc72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc72ActionPerformed(evt);
            }
        });

        rc73.setBackground(new java.awt.Color(0, 255, 255));
        rc73.setText("9");
        rc73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc73ActionPerformed(evt);
            }
        });

        rc81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc81ActionPerformed(evt);
            }
        });

        rc82.setBackground(new java.awt.Color(0, 255, 255));
        rc82.setText("4");
        rc82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc82ActionPerformed(evt);
            }
        });

        rc91.setBackground(new java.awt.Color(0, 255, 255));
        rc91.setText("7");
        rc91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc91ActionPerformed(evt);
            }
        });

        rc92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc92ActionPerformed(evt);
            }
        });

        rc83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc83ActionPerformed(evt);
            }
        });

        rc93.setBackground(new java.awt.Color(0, 255, 255));
        rc93.setText("3");
        rc93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc93ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rc71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rc91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rc81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rc73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(rc91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        rc14.setBackground(new java.awt.Color(0, 255, 255));
        rc14.setText("2");
        rc14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc14ActionPerformed(evt);
            }
        });

        rc15.setBackground(new java.awt.Color(0, 255, 255));
        rc15.setText("6");
        rc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc15ActionPerformed(evt);
            }
        });

        rc16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc16ActionPerformed(evt);
            }
        });

        rc24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc24ActionPerformed(evt);
            }
        });

        rc25.setBackground(new java.awt.Color(0, 255, 255));
        rc25.setText("7");
        rc25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc25ActionPerformed(evt);
            }
        });

        rc34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc34ActionPerformed(evt);
            }
        });

        rc35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc35ActionPerformed(evt);
            }
        });

        rc26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc26ActionPerformed(evt);
            }
        });

        rc36.setBackground(new java.awt.Color(0, 255, 255));
        rc36.setText("4");
        rc36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rc14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rc34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rc24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rc16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rc34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        rc41.setBackground(new java.awt.Color(0, 255, 255));
        rc41.setText("8");
        rc41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc41ActionPerformed(evt);
            }
        });

        rc42.setBackground(new java.awt.Color(0, 255, 255));
        rc42.setText("2");
        rc42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc42ActionPerformed(evt);
            }
        });

        rc43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc43ActionPerformed(evt);
            }
        });

        rc51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc51ActionPerformed(evt);
            }
        });

        rc52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc52ActionPerformed(evt);
            }
        });

        rc61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc61ActionPerformed(evt);
            }
        });

        rc62.setBackground(new java.awt.Color(0, 255, 255));
        rc62.setText("5");
        rc62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc62ActionPerformed(evt);
            }
        });

        rc53.setBackground(new java.awt.Color(0, 255, 255));
        rc53.setText("4");
        rc53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc53ActionPerformed(evt);
            }
        });

        rc63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rc41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rc61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rc51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rc43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(rc61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        rc44.setBackground(new java.awt.Color(0, 255, 255));
        rc44.setText("1");
        rc44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc44ActionPerformed(evt);
            }
        });

        rc45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc45ActionPerformed(evt);
            }
        });

        rc46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc46ActionPerformed(evt);
            }
        });

        rc54.setBackground(new java.awt.Color(0, 255, 255));
        rc54.setText("6");
        rc54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc54ActionPerformed(evt);
            }
        });

        rc55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc55ActionPerformed(evt);
            }
        });

        rc64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc64ActionPerformed(evt);
            }
        });

        rc65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc65ActionPerformed(evt);
            }
        });

        rc56.setBackground(new java.awt.Color(0, 255, 255));
        rc56.setText("2");
        rc56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc56ActionPerformed(evt);
            }
        });

        rc66.setBackground(new java.awt.Color(0, 255, 255));
        rc66.setText("3");
        rc66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc66ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rc44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rc64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rc54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rc46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(rc64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        rc74.setBackground(new java.awt.Color(0, 255, 255));
        rc74.setText("3");
        rc74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc74ActionPerformed(evt);
            }
        });

        rc75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc75ActionPerformed(evt);
            }
        });

        rc76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc76ActionPerformed(evt);
            }
        });

        rc84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc84ActionPerformed(evt);
            }
        });

        rc85.setBackground(new java.awt.Color(0, 255, 255));
        rc85.setText("5");
        rc85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc85ActionPerformed(evt);
            }
        });

        rc94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc94ActionPerformed(evt);
            }
        });

        rc95.setBackground(new java.awt.Color(0, 255, 255));
        rc95.setText("1");
        rc95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc95ActionPerformed(evt);
            }
        });

        rc86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc86ActionPerformed(evt);
            }
        });

        rc96.setBackground(new java.awt.Color(0, 255, 255));
        rc96.setText("8");
        rc96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc96ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rc74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rc94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rc84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(rc76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(rc94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        rc17.setBackground(new java.awt.Color(0, 255, 255));
        rc17.setText("7");
        rc17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc17ActionPerformed(evt);
            }
        });

        rc18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc18ActionPerformed(evt);
            }
        });

        rc19.setBackground(new java.awt.Color(0, 255, 255));
        rc19.setText("1");
        rc19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc19ActionPerformed(evt);
            }
        });

        rc27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc27ActionPerformed(evt);
            }
        });

        rc28.setBackground(new java.awt.Color(0, 255, 255));
        rc28.setText("9");
        rc28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc28ActionPerformed(evt);
            }
        });

        rc37.setBackground(new java.awt.Color(0, 255, 255));
        rc37.setText("5");
        rc37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc37ActionPerformed(evt);
            }
        });

        rc38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc38ActionPerformed(evt);
            }
        });

        rc29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc29ActionPerformed(evt);
            }
        });

        rc39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rc17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rc37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rc27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rc19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(rc37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        rc47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc47ActionPerformed(evt);
            }
        });

        rc48.setBackground(new java.awt.Color(0, 255, 255));
        rc48.setText("4");
        rc48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc48ActionPerformed(evt);
            }
        });

        rc49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc49ActionPerformed(evt);
            }
        });

        rc57.setBackground(new java.awt.Color(0, 255, 255));
        rc57.setText("9");
        rc57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc57ActionPerformed(evt);
            }
        });

        rc58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc58ActionPerformed(evt);
            }
        });

        rc67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc67ActionPerformed(evt);
            }
        });

        rc68.setBackground(new java.awt.Color(0, 255, 255));
        rc68.setText("2");
        rc68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc68ActionPerformed(evt);
            }
        });

        rc59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc59ActionPerformed(evt);
            }
        });

        rc69.setBackground(new java.awt.Color(0, 255, 255));
        rc69.setText("8");
        rc69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc69ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rc47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rc67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rc57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rc49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rc59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(rc67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        rc77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc77ActionPerformed(evt);
            }
        });

        rc78.setBackground(new java.awt.Color(0, 255, 255));
        rc78.setText("7");
        rc78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc78ActionPerformed(evt);
            }
        });

        rc79.setBackground(new java.awt.Color(0, 255, 255));
        rc79.setText("4");
        rc79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc79ActionPerformed(evt);
            }
        });

        rc87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc87ActionPerformed(evt);
            }
        });

        rc88.setBackground(new java.awt.Color(0, 255, 255));
        rc88.setText("3");
        rc88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc88ActionPerformed(evt);
            }
        });

        rc97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc97ActionPerformed(evt);
            }
        });

        rc98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc98ActionPerformed(evt);
            }
        });

        rc99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc99ActionPerformed(evt);
            }
        });

        rc89.setBackground(new java.awt.Color(0, 255, 255));
        rc89.setText("6");
        rc89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc89ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rc77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rc97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rc87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(rc89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rc79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rc89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rc88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rc98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(rc97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(rc99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        selectorButton1.setBackground(new java.awt.Color(0, 0, 204));
        selectorButton1.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton1.setText("1");
        selectorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton1ActionPerformed(evt);
            }
        });

        selectorButton2.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton2.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton2.setText("2");
        selectorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton2ActionPerformed(evt);
            }
        });

        selectorButton3.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton3.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton3.setText("3");
        selectorButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton3ActionPerformed(evt);
            }
        });

        selectorButton4.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton4.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton4.setText("4");
        selectorButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton4ActionPerformed(evt);
            }
        });

        selectorButton5.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton5.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton5.setText("5");
        selectorButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton5ActionPerformed(evt);
            }
        });

        selectorButton6.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton6.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton6.setText("6");
        selectorButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton6ActionPerformed(evt);
            }
        });

        selectorButton7.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton7.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton7.setText("7");
        selectorButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton7ActionPerformed(evt);
            }
        });

        selectorButton8.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton8.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton8.setText("8");
        selectorButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton8ActionPerformed(evt);
            }
        });

        selectorButton9.setBackground(new java.awt.Color(0, 0, 0));
        selectorButton9.setForeground(new java.awt.Color(255, 255, 255));
        selectorButton9.setText("9");
        selectorButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorButton9ActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(0, 204, 204));
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        solutionButton.setBackground(new java.awt.Color(51, 255, 0));
        solutionButton.setText("SOLUTION");
        solutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionButtonActionPerformed(evt);
            }
        });

        checkmovesButton.setBackground(new java.awt.Color(255, 255, 0));
        checkmovesButton.setText("CHECK MOVES");
        checkmovesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkmovesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(selectorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(selectorButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(selectorButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(solutionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkmovesButton))))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(solutionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkmovesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc11ActionPerformed
        // TODO add your handling code here:
        rc11.setText(turn);
        rc11.setBackground(Color.white);
        
    }//GEN-LAST:event_rc11ActionPerformed

    private void rc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc12ActionPerformed
        // TODO add your handling code here:
        rc12.setText(turn);
        rc12.setBackground(Color.white);
    }//GEN-LAST:event_rc12ActionPerformed

    private void rc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc13ActionPerformed
        // TODO add your handling code here:
        rc13.setText(turn);
        rc13.setBackground(Color.white);
    }//GEN-LAST:event_rc13ActionPerformed

    private void rc21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc21ActionPerformed

    private void rc22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc22ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc22ActionPerformed

    private void rc31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc31ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc31ActionPerformed

    private void rc32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc32ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc32ActionPerformed

    private void rc23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc23ActionPerformed
        // TODO add your handling code here:
        rc23.setText(turn);
        rc23.setBackground(Color.white);
    }//GEN-LAST:event_rc23ActionPerformed

    private void rc33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc33ActionPerformed
        // TODO add your handling code here:
        rc33.setText(turn);
        rc33.setBackground(Color.white);
    }//GEN-LAST:event_rc33ActionPerformed

    private void rc71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc71ActionPerformed
        // TODO add your handling code here:
        rc71.setText(turn);
        rc71.setBackground(Color.white);
    }//GEN-LAST:event_rc71ActionPerformed

    private void rc72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc72ActionPerformed
        // TODO add your handling code here:
        rc72.setText(turn);
        rc72.setBackground(Color.white);
        
    }//GEN-LAST:event_rc72ActionPerformed

    private void rc73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc73ActionPerformed

    private void rc81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc81ActionPerformed
        // TODO add your handling code here:
        rc81.setText(turn);
        rc81.setBackground(Color.white);
    }//GEN-LAST:event_rc81ActionPerformed

    private void rc82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc82ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc82ActionPerformed

    private void rc91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc91ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc91ActionPerformed

    private void rc92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc92ActionPerformed
        // TODO add your handling code here:
        rc92.setText(turn);
        rc92.setBackground(Color.white);
    }//GEN-LAST:event_rc92ActionPerformed

    private void rc83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc83ActionPerformed
        // TODO add your handling code here:
        rc83.setText(turn);
        rc83.setBackground(Color.white);
    }//GEN-LAST:event_rc83ActionPerformed

    private void rc93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc93ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc93ActionPerformed

    private void rc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc14ActionPerformed

    private void rc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc15ActionPerformed

    private void rc16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc16ActionPerformed
        // TODO add your handling code here:
        rc16.setText(turn);
        rc16.setBackground(Color.white);
    }//GEN-LAST:event_rc16ActionPerformed

    private void rc24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc24ActionPerformed
        // TODO add your handling code here:
        rc24.setText(turn);
        rc24.setBackground(Color.white);
    }//GEN-LAST:event_rc24ActionPerformed

    private void rc25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc25ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc25ActionPerformed

    private void rc34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc34ActionPerformed
        // TODO add your handling code here:
        rc34.setText(turn);
        rc34.setBackground(Color.white);
    }//GEN-LAST:event_rc34ActionPerformed

    private void rc35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc35ActionPerformed
        // TODO add your handling code here:
        rc35.setText(turn);
        rc35.setBackground(Color.white);
    }//GEN-LAST:event_rc35ActionPerformed

    private void rc26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc26ActionPerformed
        // TODO add your handling code here:
        rc26.setText(turn);
        rc26.setBackground(Color.white);
    }//GEN-LAST:event_rc26ActionPerformed

    private void rc36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc36ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc36ActionPerformed

    private void rc41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc41ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc41ActionPerformed

    private void rc42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc42ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc42ActionPerformed

    private void rc43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc43ActionPerformed
        // TODO add your handling code here:
        rc43.setText(turn);
        rc43.setBackground(Color.white);
    }//GEN-LAST:event_rc43ActionPerformed

    private void rc51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc51ActionPerformed
        // TODO add your handling code here:
        rc51.setText(turn);
        rc51.setBackground(Color.white);
    }//GEN-LAST:event_rc51ActionPerformed

    private void rc52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc52ActionPerformed
        // TODO add your handling code here:
        rc52.setText(turn);
        rc52.setBackground(Color.white);
    }//GEN-LAST:event_rc52ActionPerformed

    private void rc61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc61ActionPerformed
        // TODO add your handling code here:
        rc61.setText(turn);
        rc61.setBackground(Color.white);
    }//GEN-LAST:event_rc61ActionPerformed

    private void rc62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc62ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc62ActionPerformed

    private void rc53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc53ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc53ActionPerformed

    private void rc63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc63ActionPerformed
        // TODO add your handling code here:
        rc63.setText(turn);
        rc63.setBackground(Color.white);
    }//GEN-LAST:event_rc63ActionPerformed

    private void rc44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc44ActionPerformed

    private void rc45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc45ActionPerformed
        // TODO add your handling code here:
        rc45.setText(turn);
        rc45.setBackground(Color.white);
    }//GEN-LAST:event_rc45ActionPerformed

    private void rc46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc46ActionPerformed
        // TODO add your handling code here:
        rc46.setText(turn);
        rc46.setBackground(Color.white);
    }//GEN-LAST:event_rc46ActionPerformed

    private void rc54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc54ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc54ActionPerformed

    private void rc55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc55ActionPerformed
        // TODO add your handling code here:
        rc55.setText(turn);
        rc55.setBackground(Color.white);
    }//GEN-LAST:event_rc55ActionPerformed

    private void rc64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc64ActionPerformed
        // TODO add your handling code here:
        rc64.setText(turn);
        rc64.setBackground(Color.white);
    }//GEN-LAST:event_rc64ActionPerformed

    private void rc65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc65ActionPerformed
        // TODO add your handling code here:
        rc65.setText(turn);
        rc65.setBackground(Color.white);
    }//GEN-LAST:event_rc65ActionPerformed

    private void rc56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc56ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc56ActionPerformed

    private void rc66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc66ActionPerformed

    private void rc74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc74ActionPerformed

    private void rc75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc75ActionPerformed
        // TODO add your handling code here:
        rc75.setText(turn);
        rc75.setBackground(Color.white);
    }//GEN-LAST:event_rc75ActionPerformed

    private void rc76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc76ActionPerformed
        // TODO add your handling code here:
        rc76.setText(turn);
        rc76.setBackground(Color.white);
    }//GEN-LAST:event_rc76ActionPerformed

    private void rc84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc84ActionPerformed
        // TODO add your handling code here:
        rc84.setText(turn);
        rc84.setBackground(Color.white);
    }//GEN-LAST:event_rc84ActionPerformed

    private void rc85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc85ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc85ActionPerformed

    private void rc94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc94ActionPerformed
        // TODO add your handling code here:
        rc94.setText(turn);
        rc94.setBackground(Color.white);
    }//GEN-LAST:event_rc94ActionPerformed

    private void rc95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc95ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc95ActionPerformed

    private void rc86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc86ActionPerformed
        // TODO add your handling code here:
        rc86.setText(turn);
        rc86.setBackground(Color.white);
    }//GEN-LAST:event_rc86ActionPerformed

    private void rc96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc96ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc96ActionPerformed

    private void rc17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc17ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc17ActionPerformed

    private void rc18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc18ActionPerformed
        // TODO add your handling code here:
        rc18.setText(turn);
        rc18.setBackground(Color.white);
    }//GEN-LAST:event_rc18ActionPerformed

    private void rc19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc19ActionPerformed

    private void rc27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc27ActionPerformed
        // TODO add your handling code here:
        rc27.setText(turn);
        rc27.setBackground(Color.white);
    }//GEN-LAST:event_rc27ActionPerformed

    private void rc28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc28ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc28ActionPerformed

    private void rc37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc37ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc37ActionPerformed

    private void rc38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc38ActionPerformed
        // TODO add your handling code here:
        rc38.setText(turn);
        rc38.setBackground(Color.white);
    }//GEN-LAST:event_rc38ActionPerformed

    private void rc29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc29ActionPerformed
        // TODO add your handling code here:
        rc29.setText(turn);
        rc29.setBackground(Color.white);
    }//GEN-LAST:event_rc29ActionPerformed

    private void rc39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc39ActionPerformed
        // TODO add your handling code here:
        rc39.setText(turn);
        rc39.setBackground(Color.white);
    }//GEN-LAST:event_rc39ActionPerformed

    private void rc47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc47ActionPerformed
        // TODO add your handling code here:
        rc47.setText(turn);
        rc47.setBackground(Color.white);
    }//GEN-LAST:event_rc47ActionPerformed

    private void rc48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc48ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc48ActionPerformed

    private void rc49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc49ActionPerformed
        // TODO add your handling code here:
        rc49.setText(turn);
        rc49.setBackground(Color.white);
    }//GEN-LAST:event_rc49ActionPerformed

    private void rc57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc57ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc57ActionPerformed

    private void rc58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc58ActionPerformed
        // TODO add your handling code here:
        rc58.setText(turn);
        rc58.setBackground(Color.white);
    }//GEN-LAST:event_rc58ActionPerformed

    private void rc67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc67ActionPerformed
        // TODO add your handling code here:
        rc67.setText(turn);
        rc67.setBackground(Color.white);
    }//GEN-LAST:event_rc67ActionPerformed

    private void rc68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc68ActionPerformed

    private void rc59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc59ActionPerformed
        // TODO add your handling code here:
        rc59.setText(turn);
        rc59.setBackground(Color.white);
    }//GEN-LAST:event_rc59ActionPerformed

    private void rc69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc69ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc69ActionPerformed

    private void rc77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc77ActionPerformed
        // TODO add your handling code here:
        rc77.setText(turn);
        rc77.setBackground(Color.white);
    }//GEN-LAST:event_rc77ActionPerformed

    private void rc78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc78ActionPerformed

    private void rc79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc79ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc79ActionPerformed

    private void rc87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc87ActionPerformed
        // TODO add your handling code here:
        rc87.setText(turn);
        rc87.setBackground(Color.white);
    }//GEN-LAST:event_rc87ActionPerformed

    private void rc88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc88ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc88ActionPerformed

    private void rc97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc97ActionPerformed
        // TODO add your handling code here:
        rc97.setText(turn);
        rc97.setBackground(Color.white);
    }//GEN-LAST:event_rc97ActionPerformed

    private void rc98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc98ActionPerformed
        // TODO add your handling code here:
        rc98.setText(turn);
        rc98.setBackground(Color.white);
    }//GEN-LAST:event_rc98ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure that you want to Exit the game",
                "Sudoku Puzzle", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void rc99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc99ActionPerformed
        // TODO add your handling code here:
        rc99.setText(turn);
        rc99.setBackground(Color.white);
    }//GEN-LAST:event_rc99ActionPerformed

    private void selectorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton2ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton2);
        turn="2";
    }//GEN-LAST:event_selectorButton2ActionPerformed

    private void rc89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc89ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This Place is Already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rc89ActionPerformed

    private void selectorButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton9ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton9);
        turn="9";
    }//GEN-LAST:event_selectorButton9ActionPerformed

    private void selectorButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton3ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton3);
        turn="3";
    }//GEN-LAST:event_selectorButton3ActionPerformed

    private void selectorButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton4ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton4);
        turn="4";
    }//GEN-LAST:event_selectorButton4ActionPerformed

    private void selectorButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton5ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton5);
        turn="5";
    }//GEN-LAST:event_selectorButton5ActionPerformed

    private void selectorButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton6ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton6);
        turn="6";
    }//GEN-LAST:event_selectorButton6ActionPerformed

    private void selectorButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton7ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton7);
        turn="7";
    }//GEN-LAST:event_selectorButton7ActionPerformed

    private void selectorButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton8ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton8);
        turn="8";
    }//GEN-LAST:event_selectorButton8ActionPerformed

    private void selectorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorButton1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectorButton1);
        turn="1";
    }//GEN-LAST:event_selectorButton1ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure that you want to Reset the game",
                "Sudoku Puzzle", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            resetGame();
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void solutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionButtonActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionButtonActionPerformed

    private void checkmovesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkmovesButtonActionPerformed
        // TODO add your handling code here:
        checkMove();
    }//GEN-LAST:event_checkmovesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudokufile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkmovesButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JButton rc11;
    private javax.swing.JButton rc12;
    private javax.swing.JButton rc13;
    private javax.swing.JButton rc14;
    private javax.swing.JButton rc15;
    private javax.swing.JButton rc16;
    private javax.swing.JButton rc17;
    private javax.swing.JButton rc18;
    private javax.swing.JButton rc19;
    private javax.swing.JButton rc21;
    private javax.swing.JButton rc22;
    private javax.swing.JButton rc23;
    private javax.swing.JButton rc24;
    private javax.swing.JButton rc25;
    private javax.swing.JButton rc26;
    private javax.swing.JButton rc27;
    private javax.swing.JButton rc28;
    private javax.swing.JButton rc29;
    private javax.swing.JButton rc31;
    private javax.swing.JButton rc32;
    private javax.swing.JButton rc33;
    private javax.swing.JButton rc34;
    private javax.swing.JButton rc35;
    private javax.swing.JButton rc36;
    private javax.swing.JButton rc37;
    private javax.swing.JButton rc38;
    private javax.swing.JButton rc39;
    private javax.swing.JButton rc41;
    private javax.swing.JButton rc42;
    private javax.swing.JButton rc43;
    private javax.swing.JButton rc44;
    private javax.swing.JButton rc45;
    private javax.swing.JButton rc46;
    private javax.swing.JButton rc47;
    private javax.swing.JButton rc48;
    private javax.swing.JButton rc49;
    private javax.swing.JButton rc51;
    private javax.swing.JButton rc52;
    private javax.swing.JButton rc53;
    private javax.swing.JButton rc54;
    private javax.swing.JButton rc55;
    private javax.swing.JButton rc56;
    private javax.swing.JButton rc57;
    private javax.swing.JButton rc58;
    private javax.swing.JButton rc59;
    private javax.swing.JButton rc61;
    private javax.swing.JButton rc62;
    private javax.swing.JButton rc63;
    private javax.swing.JButton rc64;
    private javax.swing.JButton rc65;
    private javax.swing.JButton rc66;
    private javax.swing.JButton rc67;
    private javax.swing.JButton rc68;
    private javax.swing.JButton rc69;
    private javax.swing.JButton rc71;
    private javax.swing.JButton rc72;
    private javax.swing.JButton rc73;
    private javax.swing.JButton rc74;
    private javax.swing.JButton rc75;
    private javax.swing.JButton rc76;
    private javax.swing.JButton rc77;
    private javax.swing.JButton rc78;
    private javax.swing.JButton rc79;
    private javax.swing.JButton rc81;
    private javax.swing.JButton rc82;
    private javax.swing.JButton rc83;
    private javax.swing.JButton rc84;
    private javax.swing.JButton rc85;
    private javax.swing.JButton rc86;
    private javax.swing.JButton rc87;
    private javax.swing.JButton rc88;
    private javax.swing.JButton rc89;
    private javax.swing.JButton rc91;
    private javax.swing.JButton rc92;
    private javax.swing.JButton rc93;
    private javax.swing.JButton rc94;
    private javax.swing.JButton rc95;
    private javax.swing.JButton rc96;
    private javax.swing.JButton rc97;
    private javax.swing.JButton rc98;
    private javax.swing.JButton rc99;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton selectorButton1;
    private javax.swing.JButton selectorButton2;
    private javax.swing.JButton selectorButton3;
    private javax.swing.JButton selectorButton4;
    private javax.swing.JButton selectorButton5;
    private javax.swing.JButton selectorButton6;
    private javax.swing.JButton selectorButton7;
    private javax.swing.JButton selectorButton8;
    private javax.swing.JButton selectorButton9;
    private javax.swing.JButton solutionButton;
    // End of variables declaration//GEN-END:variables
}
