package window;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
  
import javax.swing.ImageIcon;  
import javax.swing.JPanel;  
public class HomePanel extends JPanel{
    ImageIcon icon;  
    Image img; 
	public HomePanel() {
		// TODO Auto-generated constructor stub
        icon=new ImageIcon(getClass().getResource("/imageLibary/info.png"));  
        img=icon.getImage(); 
	}
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);  
       // 下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小  
         g.drawImage(img, 0, 0,this.getWidth(), this.getHeight(), this);  
    }  

}
