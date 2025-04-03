package Calculadora;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
        expressaoLbl.setText("");
    }
    
    String expressaoAt = "";
    String expressaoEx = "";
    double res = 0.0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n8Btn = new javax.swing.JButton();
        n9Btn = new javax.swing.JButton();
        n1Btn = new javax.swing.JButton();
        n7Btn = new javax.swing.JButton();
        n4Btn = new javax.swing.JButton();
        n6Btn = new javax.swing.JButton();
        n5Btn = new javax.swing.JButton();
        n3Btn = new javax.swing.JButton();
        n2Btn = new javax.swing.JButton();
        n0Btn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        virgBtn = new javax.swing.JButton();
        pAbeBtn = new javax.swing.JButton();
        pFecBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        resBtn = new javax.swing.JButton();
        expressaoPane = new javax.swing.JPanel();
        expressaoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n8Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n8Btn.setText("8");
        n8Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8BtnActionPerformed(evt);
            }
        });

        n9Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n9Btn.setText("9");
        n9Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9BtnActionPerformed(evt);
            }
        });

        n1Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n1Btn.setText("1");
        n1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1BtnActionPerformed(evt);
            }
        });

        n7Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n7Btn.setText("7");
        n7Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7BtnActionPerformed(evt);
            }
        });

        n4Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n4Btn.setText("4");
        n4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4BtnActionPerformed(evt);
            }
        });

        n6Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n6Btn.setText("6");
        n6Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6BtnActionPerformed(evt);
            }
        });

        n5Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n5Btn.setText("5");
        n5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5BtnActionPerformed(evt);
            }
        });

        n3Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n3Btn.setText("3");
        n3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3BtnActionPerformed(evt);
            }
        });

        n2Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n2Btn.setText("2");
        n2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2BtnActionPerformed(evt);
            }
        });

        n0Btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n0Btn.setText("0");
        n0Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0BtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addBtn.setText("+");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        subBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subBtn.setText("-");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        mulBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mulBtn.setText("x");
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });

        divBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        divBtn.setText("÷");
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });

        virgBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        virgBtn.setText(",");
        virgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgBtnActionPerformed(evt);
            }
        });

        pAbeBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pAbeBtn.setText("(");
        pAbeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAbeBtnActionPerformed(evt);
            }
        });

        pFecBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pFecBtn.setText(")");
        pFecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFecBtnActionPerformed(evt);
            }
        });

        cleanBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cleanBtn.setText("C");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });

        delBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delBtn.setText("Del");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        resBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        resBtn.setText("=");
        resBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resBtnActionPerformed(evt);
            }
        });

        expressaoLbl.setBackground(new java.awt.Color(0, 0, 0));
        expressaoLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        expressaoLbl.setText("EXPRESSAO");

        javax.swing.GroupLayout expressaoPaneLayout = new javax.swing.GroupLayout(expressaoPane);
        expressaoPane.setLayout(expressaoPaneLayout);
        expressaoPaneLayout.setHorizontalGroup(
            expressaoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expressaoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expressaoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        expressaoPaneLayout.setVerticalGroup(
            expressaoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(expressaoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(n3Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(n9Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n6Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(virgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n8Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n0Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(n4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(n7Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mulBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(resBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pAbeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pFecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(expressaoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expressaoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pAbeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pFecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cleanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n9Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n0Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(virgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n9BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "9");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "9");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n9BtnActionPerformed

    private void n8BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "8");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "8");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n8BtnActionPerformed

    private void n7BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "7");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "7");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n7BtnActionPerformed

    private void n6BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "6");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "6");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n6BtnActionPerformed

    private void n5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "5");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "5");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n5BtnActionPerformed

    private void n4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "4");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "4");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n4BtnActionPerformed

    private void n3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "3");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "3");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n3BtnActionPerformed

    private void n2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "2");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "2");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n2BtnActionPerformed

    private void n1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "1");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "1");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n1BtnActionPerformed

    private void n0BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0BtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "0");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "0");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_n0BtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "-");
        expressaoEx = Metodos.expressaoNum(expressaoEx , " - ");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_subBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "+");
        expressaoEx = Metodos.expressaoNum(expressaoEx , " + ");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_addBtnActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "*");
        expressaoEx = Metodos.expressaoNum(expressaoEx , " x ");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_mulBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , " / ");
        expressaoEx = Metodos.expressaoNum(expressaoEx , " ÷ ");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_divBtnActionPerformed

    private void pAbeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAbeBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , "(");
        expressaoEx = Metodos.expressaoNum(expressaoEx , "(");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_pAbeBtnActionPerformed

    private void pFecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFecBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt, ")");
        expressaoEx = Metodos.expressaoNum(expressaoEx , ")");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_pFecBtnActionPerformed

    private void virgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = Metodos.expressaoNum(expressaoAt , ".");
        expressaoEx = Metodos.expressaoNum(expressaoEx , ",");
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_virgBtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        // TODO add your handling code here:
        expressaoAt = "";
        expressaoEx = "";
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int ultChar = expressaoAt.length() -1;
        expressaoAt = expressaoAt.substring(0, ultChar);
        expressaoEx = expressaoEx.substring(0, ultChar);
        expressaoLbl.setText(expressaoEx);
    }//GEN-LAST:event_delBtnActionPerformed

    private void resBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resBtnActionPerformed
        // TODO add your handling code here:
        Expression e = new ExpressionBuilder(expressaoAt).build();
        res = e.evaluate();
        if (res % 1 == 0) {
            expressaoLbl.setText(Integer.toString((int) res));
            
        } else {
            expressaoLbl.setText(Double.toString(res));
        }
        expressaoAt = expressaoLbl.getText();
        expressaoEx = expressaoAt;
    }//GEN-LAST:event_resBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton divBtn;
    private javax.swing.JLabel expressaoLbl;
    private javax.swing.JPanel expressaoPane;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton n0Btn;
    private javax.swing.JButton n1Btn;
    private javax.swing.JButton n2Btn;
    private javax.swing.JButton n3Btn;
    private javax.swing.JButton n4Btn;
    private javax.swing.JButton n5Btn;
    private javax.swing.JButton n6Btn;
    private javax.swing.JButton n7Btn;
    private javax.swing.JButton n8Btn;
    private javax.swing.JButton n9Btn;
    private javax.swing.JButton pAbeBtn;
    private javax.swing.JButton pFecBtn;
    private javax.swing.JButton resBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton virgBtn;
    // End of variables declaration//GEN-END:variables
}
