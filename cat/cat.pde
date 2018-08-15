void setup(){
  size(530,532);
}
void draw(){
PImage face = loadImage("cat.jpeg");
face.resize(530,532);
image(face, 0, 0);}