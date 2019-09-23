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

void rotateMe(float angle) {
  // Displays the image at its actual size at point (0,0)

  rotate(angle);
  print("angle", angle);
}

}