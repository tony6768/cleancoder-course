
package snake2;



import javax.swing.JFrame;



public class Snake extends JFrame
{
    
    
    public static void main(final String[] args) {
    
    
        new Snake();
    }
    
    
    public Snake() {
    
    
        add(new Board());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 340);
        setLocationRelativeTo(null);
        setTitle("Snake");
        
        setResizable(false);
        setVisible(true);
    }
}
