package forms;

import org.jpl7.*;
import java.awt.*;
import Entidades.Sintoma;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/* @author Santana */
public class Main extends javax.swing.JFrame {
    List<Sintoma> sintomas;
    int counter = 0;
    boolean diagnosticoCompleto = false;
    
    /* Creates new form Main */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        inicializarControles();
        radGroup.add(radSi);
        radGroup.add(radNo);
        inicializarSintomas();
        //Muestra como icono de la aplicacion una inyeccion
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("resources/icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radGroup = new javax.swing.ButtonGroup();
        btnInicio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radSi = new javax.swing.JRadioButton();
        radNo = new javax.swing.JRadioButton();
        lblTitulo = new javax.swing.JLabel();
        lblDetalle = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setText("Iniciar");
        btnInicio.setAlignmentY(0.0F);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio_Click(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 100));

        radSi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radSi.setText("S??");
        radSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSi_Click(evt);
            }
        });

        radNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radNo.setText("No");
        radNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNo_Click(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Bienvenido");

        lblDetalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalle.setText("<html>Este Sistema ha sido creado con el prop??sito de determinar la enfermedad que presenta una persona utilizando los s??ntomas presentados.</html>");
        lblDetalle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(radSi)
                        .addGap(18, 18, 18)
                        .addComponent(radNo)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addComponent(lblDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radSi)
                    .addComponent(radNo))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnAnterior.setText("Anterior");
        btnAnterior.setAlignmentY(0.0F);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior_Click(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.setToolTipText("");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente_Click(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicio_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio_Click
        inicializarControles();
        inicializarSintomas();
        radSi.setVisible(true);
        radNo.setVisible(true);
        btnInicio.setVisible(false);
        btnAnterior.setVisible(false);
        btnSiguiente.setVisible(true);
        if(diagnosticoCompleto == false){
            Query consult = new Query( "consult", new Term[] {new Atom("base.pl")} );
            consult.hasSolution();
        }
        else{
            Query eliminarSintomasDeBase = new Query("retractall(sintoma(X)).");
            Map<String,Term>[] solutions = eliminarSintomasDeBase.allSolutions();
            btnSiguiente.setText("Siguiente");
        }
        refreshControls();
    }//GEN-LAST:event_btnInicio_Click

    private void btnAnterior_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior_Click
        counter--;
        refreshControls();
    }//GEN-LAST:event_btnAnterior_Click

    private void btnSiguiente_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente_Click
        counter++;
        refreshControls();
    }//GEN-LAST:event_btnSiguiente_Click

    private void radSi_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSi_Click
        sintomas.get(counter).setRespuesta(true);
    }//GEN-LAST:event_radSi_Click

    private void radNo_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNo_Click
        sintomas.get(counter).setRespuesta(false);
    }//GEN-LAST:event_radNo_Click

    /*@param args the command line arguments*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void refreshControls(){
        if(counter < sintomas.size()){
            lblTitulo.setText("Pregunta #"+(counter+1));
            lblDetalle.setText(sintomas.get(counter).getNombre());
            /*Muestra las respuestas que selecciono en determinada pregunta*/
            if(sintomas.get(counter).isRespuesta())
                radSi.setSelected(true);
            else
                radNo.setSelected(true);
        }
        else{
            lblTitulo.setText("Diagn??sico");
            lblDetalle.setText(obtenerRespuesta());
        }
        if(counter == 0){//Primer Pregunta, No debe haber boton anterior
            btnAnterior.setVisible(false);
            btnSiguiente.setVisible(true);
        }
        else if(counter == sintomas.size()-1){//Se encuentra en la ultima pregunta
            btnAnterior.setVisible(true);
            btnSiguiente.setVisible(true);
            btnSiguiente.setText("Evaluar");
        }
        else if(counter == sintomas.size()){//Se eligio Obtener Respuessta
            radSi.setVisible(false);
            radNo.setVisible(false);
            btnAnterior.setVisible(false);
            btnSiguiente.setVisible(false);
            btnInicio.setVisible(true);
            counter = 0;
            btnInicio.setText("De nuevo");
            diagnosticoCompleto = true;
        }
        else{
            btnAnterior.setVisible(true);
            btnSiguiente.setVisible(true);
        }
    }

    private void inicializarSintomas() {
        sintomas = new ArrayList<>();
        sintomas.add(new Sintoma("??Tiene tos?","tos",false));
        sintomas.add(new Sintoma("??Sufre de estornudos?","estornudo",false));
        sintomas.add(new Sintoma("??Tiene fiebre mayor a 39??C?","fiebre_alta",false));
        sintomas.add(new Sintoma("??Sufre de diarrea?","diarrea",false));
        sintomas.add(new Sintoma("??Tiene dolores musculares?","dolor_muscular",false));
        sintomas.add(new Sintoma("??Tiene dolores de cabeza?","dolor_de_cabeza",false));
        sintomas.add(new Sintoma("??Tiene escurrimiento nasal?","escurrimiento_nasal",false));
        sintomas.add(new Sintoma("??Sufre de ojos irritados?","ojos_irritados",false));
        sintomas.add(new Sintoma("??Tiene dolor de garganta?","dolor_de_garganta",false));
        sintomas.add(new Sintoma("??Ha perdido el olfato?","perdida_olfato",false));
        sintomas.add(new Sintoma("??Ha perdido el gusto?","perdida_gusto",false));
        sintomas.add(new Sintoma("??Sufre de problemas para respirar?","problemas_respiratorios",false));
    }

    private void inicializarControles() {
        radSi.setVisible(false);
        radNo.setVisible(false);
        btnAnterior.setVisible(false);
        btnSiguiente.setVisible(false);
    }

    private String obtenerRespuesta() {
        introducirSintomas();
        Query hipotesisCovid = new Query("hipotesis(coronavirus).");
        Query hipotesisGripe = new Query("hipotesis(gripe).");
        Query hipotesisResfriado = new Query("hipotesis(resfriado).");
        Query hipotesisAlergia = new Query("hipotesis(alergia).");
        if(hipotesisCovid.hasSolution()){
            return "Es altamente probable que usted tenga Covid.";
        }
        else if(hipotesisGripe.hasSolution()){
            return "Usted tiene Gripe.";
        }
        else if(hipotesisResfriado.hasSolution()){
            return "Usted solo tiene un resfriado.";
        }
        else if(hipotesisAlergia.hasSolution()){
            return "Usted solo sufre una alergia.";
        }
        return "<html>Sus sintomas son muy particulares,<br>por favor acuda a un doctor.</html>";
    }
    
    private void introducirSintomas() {
        short numSintomas = 0;
        for(Sintoma sintoma : sintomas){
            if(sintoma.isRespuesta()){
                numSintomas++;
                Query agregar=  new Query("assert(sintoma("+sintoma.getClave()+")).");
                agregar.hasSolution();
            }
        }
        if(numSintomas == 0){
            Query agregar = new Query("assert(sintoma(ninguno)).");
            agregar.hasSolution();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.ButtonGroup radGroup;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radSi;
    // End of variables declaration//GEN-END:variables

}
