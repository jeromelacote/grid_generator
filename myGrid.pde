void setup()
{
  size(720, 720);
  smooth();
  frameRate(100);
}

float angle=1;
float randomAngle = 1;
int lib =0;
void draw()
{
  background(0);
  
  
    

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

void DrawShape(float angle)
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