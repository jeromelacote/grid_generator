import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class myGrid extends PApplet {

public void setup()
{
  
  
  frameRate(100);
}

float angle=1;
float randomAngle = 1;
int lib =0;
public void draw()
{
  background(55);
  
  
    

   angle += 1;
   
   
 // Save defaults
 
  for (int x = 0; x < 10; x++) {
   for (int y = 0; y < 10; y++) {  
 
 randomAngle++;   //round(random(10));
  MyShape aShape = new MyShape(x,y,radians(90)*randomAngle,lib);

   }
   lib += floor(mouseX/10);
 }
 lib += floor(mouseY/10);
 //print("draw",randomAngle,"\n");


}

public void DrawShape(float angle)
{
MyShape aShape = new MyShape(0,0,angle,0);
//aShape.rotateMe(angle);
} 

//    float rot =1;  
//void setup() {
//  size(720, 720);  
//  frameRate(120);
//}

//void draw() {
//  // Displays the image at its actual size at point (0,0)
//  for (int x = 0; x < 8; x++) {
//    for (int y = 0; y < 8; y++) {  

//MyShape aShape;
//pushMatrix();
//aShape = new MyShape(x*72,y*72);
//rot -=1;
//aShape.rotateMe(PI/3);
////popMatrix();

//  }
//  }
//  print("hi\n",rot);
//loop();
//}
class MyShape{
PImage img;  // Declare variable "a" of type PImage
float imgSize=72;
MyShape(float x,float y,float angle, int lib) {
  String[] imgCollec = {"monimage.png","monimage2.png","monimage3.png","monimage4.png","monimage5.png"};
  int randomShape=round(random(imgCollec.length - 1));
  randomShape =lib%5;
  print("randomShape",randomShape,"\n");
  
  img = loadImage(imgCollec[randomShape]);   
  pushMatrix();
translate(x*imgSize, y*imgSize);
pushMatrix();
translate(imgSize/2, imgSize/2); 
rotate(angle);
translate(-imgSize/2, -imgSize/2); 
  image(img, 0, 0,imgSize,imgSize);
 popMatrix();
  popMatrix();
  //translate(img.width/2, img.height/2); 
  
  //rotate(PI/angle);
  //rotate(PI/random(50));
}

public void rotateMe(float angle) {
  // Displays the image at its actual size at point (0,0)

  rotate(angle);
  print("angle", angle);
}

}
  public void settings() {  size(720, 720);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "myGrid" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
