package Lesson17_Hometask;

/*public interface IShape {

  public double getSquare(int x, int y){
    return x * y;
  }

}*/

//@FunctionalInterface
public interface IShape<x, y> {
    public void getSquare(int x, int y);
}
