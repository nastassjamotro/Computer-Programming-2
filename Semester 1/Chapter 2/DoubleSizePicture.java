// Nastassja Motro 9/19/17

public class DoubleSizePicture {
  public static void main(String[] args) {
    Picture pic = new Picture();
    pic.load("fun.png");
    int newWidth = pic.getWidth() * 2;
    int newHeight = pic.getHeight() * 2;
    pic.scale(newWidth, newHeight);
  }
}
