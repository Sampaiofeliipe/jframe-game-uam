/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meujogo.Modelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.List;


/**
 *
 * @author USER
 */
public class Fase extends JPanel implements ActionListener{
    
    private Image fundo;
    private Player player;
    private Timer timer;

    public Fase() {
        setFocusable(true);
        setDoubleBuffered(true);

        ImageIcon reference = new ImageIcon("res\\gamebackground.png");
        fundo = reference.getImage();

        player = new Player();
        player.load();

        addKeyListener(new TecladoAdapter());

        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this );
        
        List<Tiro> tiros = player.getTiros();
        for(int i  = 0; i < tiros.size(); i++) {
            Tiro m = tiros.get(i);
            m.load();
            graficos.drawImage(m.getImagem(), m.getX(),m.getY(), this);
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        List<Tiro> tiros = player.getTiros();
        for(int i  = 0; i < tiros.size(); i++) {
            Tiro m = tiros.get(i);
                if(m.isVisivel()) {
                    m.update();
                } else {
                    tiros.remove(i);
                }
        }

        repaint();
    }

    private class TecladoAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent teclado){
            player.keyPressed(teclado);
        }

        @Override
        public void keyReleased(KeyEvent teclado){
            player.keyRelease(teclado);
        }
    }
}
    
    

