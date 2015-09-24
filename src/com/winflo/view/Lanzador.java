package com.winflo.view;

public class Lanzador {

   public static void main(String args[]) {
        
       /**
        * Iniciamos main, diciendo que aplique el estilo LookAndFeel, que hallamos
        * elegido en todas las clase que requieran graficos o JFRAME.
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el Look&Feel: "+e);
        }
        
        /**
         * Aqui lanzamos la clase interfaz que es la primera que se tiene que mostrar
         * al ejecutar nuestra aplicacion.
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // aqui referimos el nombre Interfaz() como primer frame.
                new Interfaz().setVisible(true);
            }
        });
    }
}
