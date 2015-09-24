/**
 *  Gestor de carga del archivo.
 *  Esta clase se encarga de gestionar el archivo, leerlo y decir cual es su formato.
 */
package com.winflo.controller;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class cargarArchivo {
    /**
     * Instaciamos File con el nombre archivo
     */
    File archivo;
    
    public void Cargar(File nArchivo){
        /**
         * Inicializamos archivo con el File que nos manda jFileChoser.
         */
        archivo = nArchivo;
        
        /**
         * Averiguamos el formato en el que se encuentra el archivo de audio
         */
        try {
            AudioFileFormat formato = AudioSystem.getAudioFileFormat(archivo);
            //AudioInputStream audio = AudioSystem.getAudioInputStream(archivo);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Formato de audio no admitido error: "+e);
        } catch (IOException e) {
            System.out.println("Error Inesperado: "+e);
        }
        
    }
}
