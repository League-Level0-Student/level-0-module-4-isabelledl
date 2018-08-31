int x= 200;
int y= 210;
PImage face;
void setup() {
  size(530, 532);
  face = loadImage("cat.jpeg");
}
void draw() {
  x=mouseX;
  y=mouseY;
  face.resize(530, 532);
  image(face, 0, 0);
  fill(#FFFFFF);
  ellipse(200, 210, 100, 60);
  ellipse(340, 210, 100, 60);
  fill(#FF150D);
  if (mouseY>240) {
    y=240;
  }
  if(mouseY<180) {
    y=180;
  }
  ellipse(x, y, 20, 20);
  ellipse(x+140, y, 20, 20);
}