/**
 * Interfaz de localizacion de los archivos que vallamos a abrir.
 */
package com.winflo.view;

import com.winflo.controller.cargarArchivo;
import java.io.File;

public class AbrirArchivo extends javax.swing.JFrame {

    public AbrirArchivo() {
        initComponents();
        int status = jFileChooser1.showOpenDialog(null);// Da un entero
// Si apretamos en aceptar ocurrirá esto
        if (status == jFileChooser1.APPROVE_OPTION) {
            File selectedFile = jFileChooser1.getSelectedFile();
            System.out.println(selectedFile.getParent());
// Si apretamos en cancelar o cerramos la ventana ocurrirá esto
        } else if (status == jFileChooser1.CANCEL_OPTION) {
            System.out.println("Cancelar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        /**
         * Creamos un objeto del tipo File llamado archivo, que almacenara el
         * archivo de audio.
         */
        File archivo = jFileChooser1.getSelectedFile();

        /**
         * Instaciamos la clase cargarArchivo que manipulara el archivo de audio
         * y se lo mandamos atraves de la funcion Cargar().
         */
        cargarArchivo cargar = new cargarArchivo();
        cargar.Cargar(archivo);
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
