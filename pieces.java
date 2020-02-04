public class pieces
{
 int x;
 int y;
 String icon;
 boolean king;
 //constructor
 public pieces(int a, int b, String c, boolean d)
 {
  x = a;
  y = b;
  icon = c;
  king = d;
 }
 //getter
 public int getX()
 {
  return x; 
 }
 public int getY()
 {
  return y; 
 }
 public boolean getKing()
 {
  return king; 
 }
 
 public void setKing()
 {
  king = true; 
 }
 //P1 moves
 public void P1moveRight()
 {
   x--;
   y++;
 }
 public void P1moveLeft()
 {
  x--;
  y--;
 }
//P2 moves
 public void P2moveRight()
 {
   x++;
   y++;
 }
 public void P2moveLeft()
 {
   x++;
   y--;
 }
 //King moves
 public void kingUpRight()
 {
   x--;
   y++;
 }
 public void kingUpLeft()
 {
  x--;
  y--;
 }
 public void kingDownRight()
 {
  x++;
  y++;
 }
 public void kingDownLeft()
 {
   x++;
   y--;
 }
 
 public String toString()
 {
  return icon; 
 }
}