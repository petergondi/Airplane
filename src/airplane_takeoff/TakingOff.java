/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.project;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;

/**
 *
 * @author Benn
 */
public class TakingOff implements GLEventListener{
float deg=(float) (3.14159/180);
float rtri=0;
float lanf=0;
float trans=0;
float trant=0;
float lanft=0;
float x=0; 
float landing_x=-3.4f;
float landing_y=1.9f;
int count=0;
float y=0;
float z=0;
GLU glu=new GLU();
    @Override
    public void init(GLAutoDrawable drawable) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display(GLAutoDrawable glad) {
        final GL2 gl = glad.getGL().getGL2();
        gl.glClear (GL2.GL_COLOR_BUFFER_BIT |GL2.GL_DEPTH_BUFFER_BIT );
        gl.glLoadIdentity();
        gl.glClearColor(0, 0, 0, 0.0f);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glEnable(GL2.GL_BLEND);
        gl.glEnable(GL2.GL_POLYGON_SMOOTH);
        gl.glHint(GL2.GL_POLYGON_SMOOTH_HINT,GL2.GL_NICEST);
        gl.glBlendFunc(GL2.GL_SRC_ALPHA,GL2.GL_ONE_MINUS_SRC_ALPHA);
        gl.glDepthFunc(GL2.GL_NEVER);
        //left
        
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        
        if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.9f+rtri*4.2f, -2.9f+(float)(Math.pow(1.7, rtri)), 0);
        }
        gl.glBegin (GL2.GL_POLYGON);          
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0f,-.05f,.4f);
        gl.glVertex3f(-.4f,0.2f,.2f);
        gl.glVertex3f(-.43f,0.2f,.2f);
        gl.glVertex3f(-.3f,-0.05f,.1f);        
        gl.glEnd();
        gl.glPopMatrix();
        //leftwing
        //leftwingout
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.9f+rtri*4.2f, -2.9f+(float)(Math.pow(1.7, rtri)), 0);
        }
       
        gl.glBegin (GL2.GL_LINE_LOOP);
        gl.glColor3f(0, 0, 0);
        gl.glVertex3f(0f,-.05f,.4f);
        gl.glVertex3f(-.4f,0.2f,.2f);
        gl.glVertex3f(-.43f,0.2f,.2f);
        gl.glVertex3f(-.3f,-0.05f,.1f);        
        gl.glEnd();
        gl.glPopMatrix();
        //leftwingout
        
        //90%oftheplane
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        //if//-1.4f x//1.92f y
        if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.9f+rtri*4.2f, -2.9f+(float)(Math.pow(1.7, rtri)), 0);
        }
       
        gl.glRotatef(90f,3,2.8f,2);//f(0.5f,0f, 0f);
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);//static field
        for(int i=-1;i<360;i++){
            float deginrad=i*deg;
            
            if(i<180){
                  x=(float)((Math.cos(deginrad)))*.1f;
                  y=(float)(Math.sin(deginrad))*.3f;
                  z=(float)((Math.sin(deginrad)))*.35f; 
                gl.glVertex3f(x,y,z);
            }
            else{
            x=(float)((Math.cos(deginrad)))*.1f;
            y=(float)(Math.sin(deginrad))*.8f;
            z=(float)((Math.sin(deginrad)))*.87f;    
            gl.glVertex3f(x,y,z);    
            }
        }
        gl.glEnd();
        gl.glPopMatrix();
        //90%oftheplane
        
//90%oftheplaneout
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        
         if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.9f+rtri*4.2f, -2.9f+(float)(Math.pow(1.7, rtri)), 0);
        }
       
        gl.glRotatef(90f,3,2.8f,2);//f(0.5f,0f, 0f);
        gl.glColor3f(0, 0, 0);
        gl.glBegin (GL2.GL_LINE_LOOP);//static field
        for(int i=0;i<360;i++){
            float deginrad=i*deg;
            
            if(i<180){
                  x=(float)((Math.cos(deginrad)))*.1f;
                  y=(float)(Math.sin(deginrad))*.4f;
                  z=(float)((Math.sin(deginrad)))*.4f; 
                gl.glVertex3f(x,y,z);
            }
            else{
            x=(float)((Math.cos(deginrad)))*.1f;
            y=(float)(Math.sin(deginrad))*.8f;
            z=(float)((Math.sin(deginrad)))*.87f;    
            gl.glVertex3f(x,y,z);    
            }
        }//kweter goog casper
        gl.glEnd();
        gl.glPopMatrix();
        //90%oftheplane
        //backwing
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        
         if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.9f+rtri*4.2f, -2.9f+(float)(Math.pow(1.7, rtri)), 0);
        }
       
        //gl.glRotatef( rtri, rtri,0f,0f );//
         gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.73f,.3f,.1f);
        gl.glVertex3f(-.75f,.3f,.1f);
        gl.glVertex3f(-.75f,0.04f,.4f);
        gl.glVertex3f(-.6f,0.04f,.9f);
        gl.glEnd();
        gl.glPopMatrix();
        //backwing
        //landgear
         gl.glPushMatrix();
         gl.glScaled(.6, .6, .6);
       
         if(rtri>0.8249994){
             
         if(rtri>2 ){
             if(trans<1.4760063)gl.glColor4f(1, 1, 1,0f);else gl.glColor4f(1, 1, 1,1f);
            
             //System.out.println("tst"+rtri);
         //gl.glTranslatef(-.829f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, rtri*(0.25f/.6f))), 0);             
         gl.glTranslatef(landing_x*((0.25f/.6f))+-.7f+(trans*(0.25f/.6f))*4.2f, landing_y*(0.5351f)-1.3f+(float)(Math.pow(1/(1.89+lanft*(0.25f/.6f)), trans*(0.25f/.6f))-Math.log(trant*(0.25f/.6f))), 0);
        //gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
         else{
             gl.glColor4f(1, 1, 1,0f);
         }
        }
         else{
             gl.glColor3f(1, 1, 1);
             gl.glTranslatef(-.7f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, rtri*(0.25f/.6f))), 0);
         }
        
        //gl.glTranslatef(-.7f, -.3f, 0);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.485f,-.5f,.1f);
        gl.glVertex3f(-.485f,-.55f,.5f);
        gl.glVertex3f(-0.5f,-0.5f,.5f);
        gl.glVertex3f(-0.5f,-0.55f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //landgear
        gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        gl.glScaled(.6, .6, .6);
        
        if(rtri>0.8249994){
             
         if(rtri>2 ){
             if(trans<1.4760063)gl.glColor4f(1, 1, 1,0f);else gl.glColor4f(1, 1, 1,1f);
            
//gl.glTranslatef(-.829f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, rtri*(0.25f/.6f))), 0);             
gl.glTranslatef(landing_x*((0.25f/.6f))+-.829f+(trans*(0.25f/.6f))*4.2f, landing_y*(0.5351f)-1.3f+(float)(Math.pow(1/(1.89+lanft*(0.25f/.6f)), trans*(0.25f/.6f))-Math.log(trant*(0.25f/.6f))), 0);
        //gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
         else{
             gl.glColor4f(1, 1, 1,0f);
         }
        }
         else{
             gl.glColor3f(1, 1, 1);
             gl.glTranslatef(-.829f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, rtri*(0.25f/.6f))), 0);
         }
       //gl.glTranslatef(-.829f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, (rtri*(0.25f/.6f)))), 0);
        //gl.glTranslatef(-.829f, -1.3f, 0);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.485f,-.5f,.1f);
        gl.glVertex3f(-.485f,-.55f,.5f);
        gl.glVertex3f(-0.5f,-0.5f,.5f);
        gl.glVertex3f(-0.5f,-0.55f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //landgear
        //landwheel
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>0.8249994){
             
         if(rtri>2 ){
             if(trans<1.4760063)gl.glColor4f(1, 1, 1,0f);else gl.glColor4f(1, 1, 1,1f);
gl.glTranslatef(landing_x*((0.25f/.6f))+-1.19f+(trans*(0.25f/.6f))*4.2f, landing_y*(.5401f)-1.86f+(float)(Math.pow(1/(1.9+lanft*(0.25f/.6f)), trans*(0.25f/.6f))-Math.log(trant*(0.25f/.6f))), 0);
        //gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
         else{
             gl.glColor4f(1, 1, 1,0f);
         }
        }
         else{
             gl.glColor3f(1, 1, 1);
            gl.glTranslatef(-1.19f+(rtri*(0.25f/.6f))*4.2f, -1.86f+(float)(Math.pow(1.9, rtri*(0.25f/.6f))), 0);
         }
        
       // gl.glTranslatef(-1.19f+(rtri*(0.25f/.6f))*4.2f, -1.86f+(float)(Math.pow(1.9, (rtri*(0.25f/.6f)))), 0);
        //gl.glTranslatef(-71.4f, -51.3f, 0);
        gl.glBegin (GL2.GL_POLYGON);
        for(int i=0;i<360;i++){
            float deginrad=i*deg;
                  float x=(float)((Math.cos(deginrad))*-.02000011111f);
                  float y=(float)((Math.sin(deginrad))*-.02000011111f);
                  float z=(float)((Math.sin(deginrad))*-.02000011111f);
             gl.glVertex3f(x,y,z);
        }
            
        gl.glEnd();
        gl.glPopMatrix();
        //landwheel
        //landwheel
         gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
        if(rtri>0.8249994){
             
         if(rtri>2 ){
             if(trans<1.4760063)gl.glColor4f(1, 1, 1,0f);else gl.glColor4f(1, 1, 1,1f);
            
//gl.glTranslatef(-.829f+(rtri*(0.25f/.6f))*4.2f, -1.3f+(float)(Math.pow(1.89, rtri*(0.25f/.6f))), 0);              
gl.glTranslatef(landing_x*((0.25f/.6f))+-1.33f+(trans*(0.25f/.6f))*4.2f, landing_y*(0.5351f)-1.86f+(float)(Math.pow(1/(1.9+lanft*(0.25f/.6f)), trans*(0.25f/.6f))-Math.log(trant*(0.25f/.6f))), 0);
        //gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
         else{
             gl.glColor4f(1, 1, 1,0f);
         }
        }
         else{
             gl.glColor3f(1, 1, 1);
            gl.glTranslatef(-1.33f+(rtri*(0.25f/.6f))*4.2f, -1.86f+(float)(Math.pow(1.9, rtri*(0.25f/.6f))), 0);
         }
       
        //gl.glTranslatef(-1.33f+(rtri*(0.25f/.6f))*4.2f, -1.86f+(float)(Math.pow(1.9, (rtri*(0.25f/.6f)))), 0);
        //gl.glTranslatef(-79.4f, -51.25f, 0);
        gl.glBegin (GL2.GL_POLYGON);
        for(int i=0;i<360;i++){
            float deginrad=i*deg;
             float x=(float)((Math.cos(deginrad))*-.02000011111f);
                  float y=(float)((Math.sin(deginrad))*-.02000011111f);
                  float z=(float)((Math.sin(deginrad))*-.02000011111f);
             gl.glVertex3f(x,y,z);
        }
            
        gl.glEnd();
        gl.glPopMatrix();
        //landwheel
         gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
        if(rtri>0.8249994){
             
         if(rtri>2 ){
             if(trans<1.4760063)gl.glColor4f(1, 1, 1,0f);else gl.glColor4f(1, 1, 1,1f);
gl.glTranslatef(landing_x*((0.25f/.6f))+-1.32f+(trans*(0.25f/.6f))*4.2f, landing_y*(0.5401f)-1.86f+(float)(Math.pow(1/(1.9+lanft*(0.25f/.6f)), trans*(0.25f/.6f))-Math.log(trant*(0.25f/.6f))), 0);
        //gl.glTranslatef(landing_x+-2.9f+trans*4.2f, (float) (landing_y+-2.9f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
         else{
             gl.glColor4f(1, 1, 1,0f);
         }
        }
         else{
             gl.glColor3f(1, 1, 1);
            gl.glTranslatef(-1.32f+(rtri*(0.25f/.6f))*4.2f, -1.86f+(float)(Math.pow(1.9, rtri*(0.25f/.6f))), 0);
         }
        gl.glBegin (GL2.GL_POLYGON);
        for(int i=0;i<360;i++){
            float deginrad=i*deg;
                float x=(float)((Math.cos(deginrad))*-.02000011111f);
                float y=(float)((Math.sin(deginrad))*-.02000011111f);
                float z=(float)((Math.sin(deginrad))*-.02000011111f);
                gl.glVertex3f(x,y,z);
        }
            
        gl.glEnd();
        gl.glPopMatrix();
        //landwheel
        //rightwing
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
        if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.65f+trans*4.2f, (float) (landing_y+-2.85f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.65f+rtri*4.2f, -2.85f+(float)(Math.pow(1.7, rtri)), 0);
        }
      /*  if(rtri>2 ){
             gl.glTranslatef(landing_x+-2.65f+trans*4.2f, (landing_y+-2.85f+(float)(Math.pow(1/1.7+lanft, trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.65f+rtri*4.2f, -2.85f+(float)(Math.pow(1.7, rtri)), 0);
        }*/
      //  gl.glTranslatef(-2.65f+rtri*4.2f, -2.85f+(float)(Math.pow(1.7, rtri)), 0);
         //gl.glTranslatef(-2.65f, -1.85f, 0);
        gl.glBegin (GL2.GL_POLYGON);  
        
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(-.35f,-.05f,.4f);
        gl.glVertex3f(-.7f,-0.2f,.2f);
        gl.glVertex3f(-.73f,-0.2f,.2f);
        gl.glVertex3f(-.6f,-0.05f,.1f);        
        gl.glEnd();
        gl.glPopMatrix();
         //rightwing
         //rightwingout
        gl.glPushMatrix();
        gl.glScaled(.25, .25, .25);
         if(rtri>2 ){
            //rtri=7;
             gl.glTranslatef(landing_x+-2.65f+trans*4.2f, (float) (landing_y+-2.85f+(float)(Math.pow(1/(1.7+lanft), trans)-Math.log(trant))), 0);
        }
        else{
             gl.glTranslatef(-2.65f+rtri*4.2f, -2.85f+(float)(Math.pow(1.7, rtri)), 0);
        }
       // gl.glTranslatef(-2.65f+rtri*4.2f, -2.85f+(float)(Math.pow(1.7, rtri)), 0);
        gl.glBegin (GL2.GL_LINE_LOOP);  
        gl.glColor3f(0, 0, 0);
        gl.glVertex3f(-.35f,-.05f,.4f);
        gl.glVertex3f(-.7f,-0.2f,.2f);
        gl.glVertex3f(-.73f,-0.2f,.2f);
        gl.glVertex3f(-.6f,-0.05f,.1f);        
        gl.glEnd();
        gl.glPopMatrix();        
 //rightwingout
        
 //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0020f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.79f,-.58f,.1f);
        gl.glVertex3f(-.8f,-.6f,.5f);
        gl.glVertex3f(-0.9f,-0.6f,.5f);
        gl.glVertex3f(-0.89f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.49f,-.58f,.1f);
        gl.glVertex3f(-.5f,-.6f,.5f);
        gl.glVertex3f(-.6f,-0.6f,.5f);
        gl.glVertex3f(-.59f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(-.19f,-.58f,.1f);
        gl.glVertex3f(-.2f,-.6f,.5f);
        gl.glVertex3f(-.3f,-0.6f,.5f);
        gl.glVertex3f(-.29f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(0.12f,-.58f,.1f);
        gl.glVertex3f(.1f,-.6f,.5f);
        gl.glVertex3f(0f,-0.6f,.5f);
        gl.glVertex3f(0.02f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
       
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(0.42f,-.58f,.1f);
        gl.glVertex3f(.4f,-.6f,.5f);
        gl.glVertex3f(.3f,-0.6f,.5f);
        gl.glVertex3f(.32f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
       
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(0.72f,-.58f,.1f);
        gl.glVertex3f(.7f,-.6f,.5f);
        gl.glVertex3f(.6f,-0.6f,.5f);
        gl.glVertex3f(.62f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(1.02f,-.58f,.1f);
        gl.glVertex3f(1.f,-.6f,.5f);
        gl.glVertex3f(.9f,-0.6f,.5f);
        gl.glVertex3f(.92f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
        //runwaystrip
        gl.glPushMatrix();
        gl.glScaled(.6, .6, .6);
         if(rtri>1.8649985 && lanf<0.9480013){
             lanf +=0.0025f;
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        else{
            gl.glTranslatef(-.7f+lanf, -.3f, 0);
        }
        gl.glColor3f(1, 1, 1);
        gl.glBegin (GL2.GL_POLYGON);  
        gl.glVertex3f(1.32f,-.58f,.1f);
        gl.glVertex3f(1.3f,-.6f,.5f);
        gl.glVertex3f(1.2f,-0.6f,.5f);
        gl.glVertex3f(1.22f,-0.58f,.4f);        
        gl.glEnd();
        gl.glPopMatrix();
       //runwaystrip
        /*      
        gl.glBegin (GL2.GL_POLYGON);       
        gl.glVertex3f(0f,-.05f,.4f);         
        gl.glVertex3f(-.4f,0.2f,.1f);
        gl.glVertex3f(-.42f,0.2f,.1f);
        gl.glVertex3f(-.3f,-0.05f,.1f);
        
        gl.glEnd();*/
//if(rtri>1.8649985)lanf +=0.0015f;
if(lanf>0.8880013){
    if(trans>2.2440116){
        trans+=0;
        lanft+=0;
    }
    else{
    trans+=0.003f;
    lanft+=1.8f;
    }
    
    if(trans>1.4950057){
        trant+=0;
    }
    else{
        trant+=0.005f;
    }
    //2.2440116
 //rtri=0;
} 
else{
rtri +=0.005f;
}
 System.out.println("tst"+trans);
//1.8649985

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
