
package snake2;



import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Board extends JPanel implements ActionListener
{
    
    
    private class TAdapter extends KeyAdapter
    {
        
        
        @Override
        public void keyPressed(final KeyEvent e) {
        
        
            final int key = e.getKeyCode();
            
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }
            
            if (key == KeyEvent.VK_UP && !down) {
                up = true;
                right = false;
                left = false;
            }
            
            if (key == KeyEvent.VK_DOWN && !up) {
                down = true;
                right = false;
                left = false;
            }
        }
    }
    
    
    
    private final int   PREFIX_WIDTH  = 300;
    private final int   PREFIX_HEIGHT = 300;
    private final int   SIZE_DOTS     = 10;
    private final int   ALL_DOTS      = 900;
    private final int   RAND_POS      = 29;
    
    private final int   DELAY         = 140;
    private final int   x[]           = new int[ALL_DOTS];
    
    private final int   y[]           = new int[ALL_DOTS];
    private int         dots;
    private int         a_x;
    
    private int         a_y;
    private boolean     left          = false;
    private boolean     right         = true;
    private boolean     up            = false;
    private boolean     down          = false;
    
    private boolean     inGame        = true;
    private Timer       timer;
    private final Image imageiid;
    private final Image imageiia;
    
    
    private final Image imagehead;
    
    
    
    public Board() {
    
    
        addKeyListener(new TAdapter());
        
        setBackground(Color.black);
        
        final ImageIcon iid = new ImageIcon(this.getClass().getResource("dot.png"));
        imageiid = iid.getImage();
        
        final ImageIcon iia = new ImageIcon(this.getClass().getResource("apple.png"));
        imageiia = iia.getImage();
        
        final ImageIcon iih = new ImageIcon(this.getClass().getResource("head.png"));
        imagehead = iih.getImage();
        
        setFocusable(true);
        initGame();
    }
    
    
    public void actionPerformed(final ActionEvent e) {
    
    
        if (inGame) {
            checkApple();
            checkCollision();
            move();
        }
        
        repaint();
    }
    
    
    public void appleFind() {
    
    
        int r = (int) (Math.random() * RAND_POS);
        a_x = r * SIZE_DOTS;
        r = (int) (Math.random() * RAND_POS);
        a_y = r * SIZE_DOTS;
    }
    
    
    public void checkApple() {
    
    
        if (x[0] == a_x && y[0] == a_y) {
            dots++;
            appleFind();
        }
    }
    
    
    public void checkCollision() {
    
    
        for (int z = dots; z > 0; z--) {
            
            if (z > 4 && x[0] == x[z] && y[0] == y[z]) {
                inGame = false;
            }
        }
        
        if (y[0] > PREFIX_HEIGHT) {
            inGame = false;
        }
        
        if (y[0] < 0) {
            inGame = false;
        }
        
        if (x[0] > PREFIX_WIDTH) {
            inGame = false;
        }
        
        if (x[0] < 0) {
            inGame = false;
        }
    }
    
    
    public void gameOver(final Graphics g) {
    
    
        final String msg = "Game Over";
        final Font small = new Font("Helvetica", Font.BOLD, 14);
        final FontMetrics metr = getFontMetrics(small);
        
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (PREFIX_WIDTH - metr.stringWidth(msg)) / 2, PREFIX_HEIGHT / 2);
    }
    
    
    public void initGame() {
    
    
        dots = 3;
        
        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        
        appleFind();
        
        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    
    public void move() {
    
    
        for (int z = dots; z > 0; z--) {
            x[z] = x[z - 1];
            y[z] = y[z - 1];
        }
        
        if (left) {
            x[0] -= SIZE_DOTS;
        }
        
        if (right) {
            x[0] += SIZE_DOTS;
        }
        
        if (up) {
            y[0] -= SIZE_DOTS;
        }
        
        if (down) {
            y[0] += SIZE_DOTS;
        }
    }
    
    
    @Override
    public void paint(final Graphics g) {
    
    
        super.paint(g);
        
        if (inGame) {
            
            g.drawImage(imageiia, a_x, a_y, this);
            
            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(imagehead, x[z], y[z], this);
                } else {
                    g.drawImage(imageiid, x[z], y[z], this);
                }
            }
            
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
            
        } else {
            gameOver(g);
        }
    }
}
