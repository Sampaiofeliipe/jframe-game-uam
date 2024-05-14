/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meujogo;

import javax.swing.JFrame;
import meujogo.Modelo.Fase;

/**
 *
 * @author USER
 */
public class container extends JFrame {

public container(){
    add(new Fase());
    setTitle("touhou invaders");
    setSize(1024,728);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo   (null);
    this.setResizable(true);
    setVisible(true);
    
}

public static void main (String[]args) {
    new container();
}

}
