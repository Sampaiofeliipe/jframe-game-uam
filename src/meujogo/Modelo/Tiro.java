package meujogo.Modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro {
    private Image imagem;
    private int x,y;
    private int width, height;
    private boolean isVisivel;
    
    private static final int WIDTH = 938;
    private static int VELOCIDADE = 2;

    public Tiro (int x, int y) {
        this.x = x;
        this.y = y;
        isVisivel = true;
    }

    public void load() {
        ImageIcon referencia = new ImageIcon("res\\kk.png");
        imagem = referencia.getImage();

        this.width = imagem.getWidth(null);
        this.height = imagem.getHeight(null);
    }
    
    public void update() {
        this.x += VELOCIDADE;
        if(this.x > WIDTH) { 
            isVisivel = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    


    public Image getImagem() {
        return imagem;
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int vELOCIDADE) {
        VELOCIDADE = vELOCIDADE;
    }

    
}
