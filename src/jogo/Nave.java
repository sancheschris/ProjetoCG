/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author santosc
 */
public class Nave extends Base {

    public Nave(){
        
    }
    public Nave(String url, int larguraJogo) {
        super(url, larguraJogo);
    }
    
        public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }
        
    
}
