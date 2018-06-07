package visao;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        
        initComponents();        
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblGeometriaA = new javax.swing.JLabel();
        txtGeomA = new javax.swing.JTextField();
        lblGeometriaB = new javax.swing.JLabel();
        txtGeomB = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblEquals = new javax.swing.JLabel();
        lblDisjoint = new javax.swing.JLabel();
        lblIntersects = new javax.swing.JLabel();
        lblTouches = new javax.swing.JLabel();
        lblCrosses = new javax.swing.JLabel();
        lblWithin = new javax.swing.JLabel();
        lblContains = new javax.swing.JLabel();
        lblOverlaps = new javax.swing.JLabel();
        lblCovers = new javax.swing.JLabel();
        lblCoverdBy = new javax.swing.JLabel();
        lblPredicados = new javax.swing.JLabel();
        lblAB = new javax.swing.JLabel();
        lblBA = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        EqualsAB = new javax.swing.JLabel();
        EqualsBA = new javax.swing.JLabel();
        DisjointAB = new javax.swing.JLabel();
        DisjointBA = new javax.swing.JLabel();
        IntersectsAB = new javax.swing.JLabel();
        IntersectsBA = new javax.swing.JLabel();
        TouchesAB = new javax.swing.JLabel();
        TouchesBA = new javax.swing.JLabel();
        CrossesAB = new javax.swing.JLabel();
        CrossesBA = new javax.swing.JLabel();
        WithinAB = new javax.swing.JLabel();
        WithinBA = new javax.swing.JLabel();
        ContainsAB = new javax.swing.JLabel();
        ContainsBA = new javax.swing.JLabel();
        OverlapsAB = new javax.swing.JLabel();
        OverlapsBA = new javax.swing.JLabel();
        CoversAB = new javax.swing.JLabel();
        CoversBA = new javax.swing.JLabel();
        CoveredByAB = new javax.swing.JLabel();
        CoveredByBA = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();

        jLabel18.setText("---");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblGeometriaA.setText("Geometria A:");

        lblGeometriaB.setText("Geometria B:");

        lblEquals.setText("Equals");

        lblDisjoint.setText("Disjoint");

        lblIntersects.setText("Intersects");

        lblTouches.setText("Touches");

        lblCrosses.setText("Crosses");

        lblWithin.setText("Within");

        lblContains.setText("Contains");

        lblOverlaps.setText("Overlaps");

        lblCovers.setText("Covers");

        lblCoverdBy.setText("CoveredBy");

        lblPredicados.setText("Predicados");

        lblAB.setText("AB");

        lblBA.setText("BA");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        EqualsAB.setText("---");

        EqualsBA.setText("---");

        DisjointAB.setText("---");

        DisjointBA.setText("---");

        IntersectsAB.setText("---");

        IntersectsBA.setText("---");

        TouchesAB.setText("---");

        TouchesBA.setText("---");

        CrossesAB.setText("---");

        CrossesBA.setText("---");

        WithinAB.setText("---");

        WithinBA.setText("---");

        ContainsAB.setText("---");

        ContainsBA.setText("---");

        OverlapsAB.setText("---");

        OverlapsBA.setText("---");

        CoversAB.setText("---");

        CoversBA.setText("---");

        CoveredByAB.setText("---");

        CoveredByBA.setText("---");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblGeometriaB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeomB, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblGeometriaA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeomA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPredicados)
                            .addComponent(lblEquals)
                            .addComponent(lblDisjoint)
                            .addComponent(lblIntersects)
                            .addComponent(lblTouches)
                            .addComponent(lblCrosses)
                            .addComponent(lblWithin)
                            .addComponent(lblContains)
                            .addComponent(lblOverlaps)
                            .addComponent(lblCovers)
                            .addComponent(lblCoverdBy))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IntersectsAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(IntersectsBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WithinAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(WithinBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CrossesAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(CrossesBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TouchesAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(TouchesBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ContainsAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(ContainsBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CoveredByAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(CoveredByBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CoversAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(CoversBA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OverlapsAB)
                                        .addGap(18, 18, 18)
                                        .addComponent(OverlapsBA)))
                                .addGap(33, 33, 33)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DisjointAB)
                                .addGap(18, 18, 18)
                                .addComponent(DisjointBA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAB)
                                .addGap(18, 18, 18)
                                .addComponent(lblBA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EqualsAB)
                                .addGap(18, 18, 18)
                                .addComponent(EqualsBA)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeometriaA)
                    .addComponent(txtGeomA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeometriaB)
                    .addComponent(txtGeomB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnVerificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPredicados)
                            .addComponent(lblAB)
                            .addComponent(lblBA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquals)
                            .addComponent(EqualsAB)
                            .addComponent(EqualsBA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisjoint)
                            .addComponent(DisjointAB)
                            .addComponent(DisjointBA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntersects)
                            .addComponent(IntersectsAB)
                            .addComponent(IntersectsBA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTouches)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCrosses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWithin))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TouchesAB)
                                    .addComponent(TouchesBA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CrossesAB)
                                    .addComponent(CrossesBA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WithinAB)
                                    .addComponent(WithinBA))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContains)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOverlaps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCovers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCoverdBy))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ContainsAB)
                                    .addComponent(ContainsBA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OverlapsAB)
                                    .addComponent(OverlapsBA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CoversAB)
                                    .addComponent(CoversBA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CoveredByAB)
                                    .addComponent(CoveredByBA)))))
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        
        GeometryFactory geomFactory = new GeometryFactory();
        WKTReader reader = new WKTReader(geomFactory);
        
        String WKTgeomA = txtGeomA.getText();
        String WKTgeomB = txtGeomB.getText();
        
        if(WKTgeomA.isEmpty() || WKTgeomB.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
           return;
        }
                
        Geometry geomA = null;
        try {
            geomA = reader.read(WKTgeomA);
        } catch (ParseException ex) {
           JOptionPane.showMessageDialog(null, "Geometria A inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        Geometry geomB = null;
        try {
            geomB = reader.read(WKTgeomB);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Geometria B inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        setPredicados(geomA, geomB);                
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparPredicados();
        limparGeometrias();        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void setPredicados(Geometry geomA, Geometry geomB){
        
        //---AB---
        if(geomA.equals(geomB)){ EqualsAB.setText(" T ");
        }else{ EqualsAB.setText(" F "); }
        
        if(geomA.disjoint(geomB)){ DisjointAB.setText(" T ");
        }else{ DisjointAB.setText(" F "); }
        
        if(geomA.intersects(geomB)){ IntersectsAB.setText(" T ");
        }else{ IntersectsAB.setText(" F "); }
        
        if(geomA.touches(geomB)){ TouchesAB.setText(" T ");
        }else{ TouchesAB.setText(" F "); }
        
        if(geomA.touches(geomB)){ TouchesAB.setText(" T ");
        }else{ TouchesAB.setText(" F "); }
        
        if(geomA.crosses(geomB)){ CrossesAB.setText(" T ");
        }else{ CrossesAB.setText(" F "); }
        
        if(geomA.within(geomB)){ WithinAB.setText(" T ");
        }else{ WithinAB.setText(" F "); }
        
        if(geomA.contains(geomB)){ ContainsAB.setText(" T ");
        }else{ ContainsAB.setText(" F "); }
        
        if(geomA.overlaps(geomB)){ OverlapsAB.setText(" T ");
        }else{ OverlapsAB.setText(" F "); }
        
        if(geomA.covers(geomB)){ CoversAB.setText(" T ");
        }else{ CoversAB.setText(" F "); }
        
        if(geomA.coveredBy(geomB)){ CoveredByAB.setText(" T ");
        }else{ CoveredByAB.setText(" F "); }
        
        //---BA---
        if(geomB.equals(geomA)){ EqualsBA.setText(" T ");
        }else{ EqualsBA.setText(" F "); }
        
        if(geomB.disjoint(geomA)){ DisjointBA.setText(" T ");
        }else{ DisjointBA.setText(" F "); }
        
        if(geomB.intersects(geomA)){ IntersectsBA.setText(" T ");
        }else{ IntersectsBA.setText(" F "); }
        
        if(geomB.touches(geomA)){ TouchesBA.setText(" T ");
        }else{ TouchesBA.setText(" F "); }
        
        if(geomB.touches(geomA)){ TouchesBA.setText(" T ");
        }else{ TouchesBA.setText(" F "); }
        
        if(geomB.crosses(geomA)){ CrossesBA.setText(" T ");
        }else{ CrossesBA.setText(" F "); }
        
        if(geomB.within(geomA)){ WithinBA.setText(" T ");
        }else{ WithinBA.setText(" F "); }
        
        if(geomB.contains(geomA)){ ContainsBA.setText(" T ");
        }else{ ContainsBA.setText(" F "); }
        
        if(geomB.overlaps(geomA)){ OverlapsBA.setText(" T ");
        }else{ OverlapsBA.setText(" F "); }
        
        if(geomB.covers(geomA)){ CoversBA.setText(" T ");
        }else{ CoversBA.setText(" F "); }
        
        if(geomB.coveredBy(geomA)){ CoveredByBA.setText(" T ");
        }else{ CoveredByBA.setText(" F "); }
        
    }
    
    private void limparPredicados(){
        
        //---AB---
        EqualsAB.setText("---");
        DisjointAB.setText("---");
        IntersectsAB.setText("---");
        TouchesAB.setText("---");
        TouchesAB.setText("---");
        CrossesAB.setText("---");
        WithinAB.setText("---");
        ContainsAB.setText("---");
        OverlapsAB.setText("---");
        CoversAB.setText("---");
        CoveredByAB.setText("---");
        
        //---BA---
        EqualsBA.setText("---");
        DisjointBA.setText("---");
        IntersectsBA.setText("---");
        TouchesBA.setText("---");
        TouchesBA.setText("---");
        CrossesBA.setText("---");
        WithinBA.setText("---");
        ContainsBA.setText("---");
        OverlapsBA.setText("---");
        CoversBA.setText("---");
        CoveredByBA.setText("---");
        CoveredByBA.setText("---");        
    }
    
    private void limparGeometrias(){        
        txtGeomA.setText("");
        txtGeomB.setText("");        
    }
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContainsAB;
    private javax.swing.JLabel ContainsBA;
    private javax.swing.JLabel CoveredByAB;
    private javax.swing.JLabel CoveredByBA;
    private javax.swing.JLabel CoversAB;
    private javax.swing.JLabel CoversBA;
    private javax.swing.JLabel CrossesAB;
    private javax.swing.JLabel CrossesBA;
    private javax.swing.JLabel DisjointAB;
    private javax.swing.JLabel DisjointBA;
    private javax.swing.JLabel EqualsAB;
    private javax.swing.JLabel EqualsBA;
    private javax.swing.JLabel IntersectsAB;
    private javax.swing.JLabel IntersectsBA;
    private javax.swing.JLabel OverlapsAB;
    private javax.swing.JLabel OverlapsBA;
    private javax.swing.JLabel TouchesAB;
    private javax.swing.JLabel TouchesBA;
    private javax.swing.JLabel WithinAB;
    private javax.swing.JLabel WithinBA;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAB;
    private javax.swing.JLabel lblBA;
    private javax.swing.JLabel lblContains;
    private javax.swing.JLabel lblCoverdBy;
    private javax.swing.JLabel lblCovers;
    private javax.swing.JLabel lblCrosses;
    private javax.swing.JLabel lblDisjoint;
    private javax.swing.JLabel lblEquals;
    private javax.swing.JLabel lblGeometriaA;
    private javax.swing.JLabel lblGeometriaB;
    private javax.swing.JLabel lblIntersects;
    private javax.swing.JLabel lblOverlaps;
    private javax.swing.JLabel lblPredicados;
    private javax.swing.JLabel lblTouches;
    private javax.swing.JLabel lblWithin;
    private javax.swing.JTextField txtGeomA;
    private javax.swing.JTextField txtGeomB;
    // End of variables declaration//GEN-END:variables
}
