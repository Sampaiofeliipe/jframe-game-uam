package meujogo.Modelo;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import java.awt.event.KeyEvent;

public class Player {

    private int x, y;
    private int dx, dy;
    private Image images;
    private int height, width;
    private List <Tiro> tiros;

    public Player() {
        this.x = 100;
        this.y = 100;

        tiros = new ArrayList<Tiro>();
    }

    public void load() {
        ImageIcon reference = new ImageIcon("res\\player.png");
        images = reference.getImage();
        height = images.getHeight(null);
        width = images.getWidth(null);
    }

    public void update(){
        x += dx;
        y += dy;
    }

    public void tiroSimples() {
        this.tiros.add(new Tiro(x+width,y+(height/2)));
    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_A) {
            tiroSimples();
        }

        if(codigo == KeyEvent.VK_UP) {
            dy = 3;
        }

        if(codigo == KeyEvent.VK_DOWN) {
            dy = -3;
        }

        if(codigo == KeyEvent.VK_LEFT) {
            dx= -3;
        }

        if(codigo == KeyEvent.VK_RIGHT) {
            dx = 3;
        }

    }

    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_UP) {
            dy = 0;
        }

        if(codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        }

        if(codigo == KeyEvent.VK_LEFT) {
            dx= 0;
        }

        if(codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return images;
    }

    public List<Tiro> getTiros() {
        return tiros;
    }
    
}
