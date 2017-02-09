package m17bfichaaval1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Endereço do repositório GitHub: https://github.com/SamuelCorreia/M17BfichaAval.git
 * @author Samuel Correia a15711 | Miguel Correia a13228
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Inicialização da Janela
     */
    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoAX = new javax.swing.JTextField();
        textoBY = new javax.swing.JTextField();
        textoAY = new javax.swing.JTextField();
        textoBX = new javax.swing.JTextField();
        botãoCalcula = new javax.swing.JButton();
        textoResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        textoAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAYActionPerformed(evt);
            }
        });

        botãoCalcula.setText("Calcular");
        botãoCalcula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botãoCalculaMouseClicked(evt);
            }
        });

        textoResultado.setEditable(false);

        jLabel1.setText("Ponto A:");

        jLabel2.setText("Ponto B:");

        jLabel3.setText("Coordenadas x:");

        jLabel4.setText("Coordenadas y:");

        jLabel5.setText("Distância:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textoAY, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoAX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoBX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoBY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botãoCalcula)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(botãoCalcula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botãoCalculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botãoCalculaMouseClicked
         /**
          * Variável "erro", utilizada como "flag"
          */
        int erro=0;
        /** 
         * Declaração e inicialização das variáveis relativas às coordenadas dos pontos
         */
        int aX=0;
        int aY=0;
        int bX=0;
        int bY=0;
        /** 
         * Declaração e inicialização da variável String resultado
         */
        String resultado=""; 
        try{
            /**
             * getText() para receber os valores das coordenadas dos pontos 
             */
            aX = Integer.parseInt(textoAX.getText());
            aY = Integer.parseInt(textoAY.getText());
            bX = Integer.parseInt(textoBX.getText());
            bY = Integer.parseInt(textoBY.getText());
            /**
             * Criação dos dois pontos (a e b)
             */
            Ponto2D a = new Ponto2D(aX,aY);
            Ponto2D b = new Ponto2D(bX,bY);
            /**
             * A string resultado recebe o valor da distância
             * O campo de texto: "textoResultado" recebe o valor da string resultado
             */
            resultado = (""+a.distancia(b));
            textoResultado.setText(resultado);
        }
        catch(NumberFormatException e){
            /**
             * Se ocorrer um erro devido ao utilizador inserir um valor inválido a flag erro receberá o valor 1
             * para impedir que os valores da operação sejam escritos no ficheiro dados.txt<br>
             * É dado um printf com informações sobre o erro
             */
            erro=1;
            System.out.printf("ERRO: O carater introduzido é inválido; "+ e + "\n");
        }
        /**
         * Verificação da flag: "erro"
         */
        if(erro==0){
            try{
                /**
                * Inicialização do objeto FileWriter: "ficheiro" em modo append
                */
                FileWriter ficheiro = new FileWriter("dados.txt", true);
                /**
                * Inicialização da String texto com valores relevantes à operação feita<br>
                * Escrita desta String no ficheiro
                */
                String texto = "Ponto A: ["+aX+" ; "+aY+"] Ponto B: ["+bX+" ; "+bY+"] \nDistância: "+resultado+"\n\n";
                ficheiro.write(texto);
                ficheiro.close();
            }
            catch(IOException e){
                /**
                * É dado um printf com informações sobre o erro
                */
                System.out.printf("ERRO: Ocorreu um erro na criação do ficheiro; "+ e + "\n");
            }
        }
    }//GEN-LAST:event_botãoCalculaMouseClicked

    private void textoAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAYActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botãoCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoAX;
    private javax.swing.JTextField textoAY;
    private javax.swing.JTextField textoBX;
    private javax.swing.JTextField textoBY;
    private javax.swing.JTextField textoResultado;
    // End of variables declaration//GEN-END:variables
}
