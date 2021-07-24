import java.awt.*;  import java.awt.event.*;  
public class ButtonExample4 {  
public static void main(String[] args) {  
    Frame f=new Frame("Button Example3");  
    Button b;
    TextField tf;
b=new Button("Click Here"); tf=new TextField();
f.setLayout(null);
 tf.setBounds(50,50, 150,20);  
    b.setBounds(100,150,60,30);  
f.add(b);f.add(tf);  
    f.setSize(400,400);  
    
    f.setVisible(true);   

    b.addActionListener(new ActionListener()
        {  
    public void actionPerformed(ActionEvent e)
           {  
            tf.setText("Welcome to Java.");  
            }  
        });  
// window closing code
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we){
          System.exit(0);
     }        
});
}  } 
