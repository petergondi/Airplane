/*
Copyright Benn

*/
package airplane_takeoff;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import javax.swing.JFrame;


/**
 *
 * @author Benn
 */
public class Jogl_test {   
     public static void takeoff(GLCanvas glcanvas){
        TakingOff b = new  TakingOff();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(700, 700);
        //creating frame
        final JFrame frame = new JFrame ("Airplane Take Off");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true); 
        final FPSAnimator animator= new FPSAnimator(glcanvas, 700,true);
        animator.start();        
       
    }
    public static void main(String[] args) {
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        takeoff(glcanvas);
    }

}
