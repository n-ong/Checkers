//Nick Ong
import java.util.*;

public class checkers
{
  //board initialization
  public static pieces [][] board = new pieces[8][8];
  
  public static pieces placeholder = new pieces(0,0,"_ ", false); //empty spaces
  
  // Player One Pieces
  public static int x1 = 5;
  public static int x2 = 5;
  public static int x3 = 5;
  public static int x4 = 5;
  public static int x5 = 6;
  public static int x6 = 6;
  public static int x7 = 6;
  public static int x8 = 6;
  public static int x9 = 7;
  public static int x10 = 7;
  public static  int x11 = 7;
  public static int x12 = 7;
  
  public static int y1 = 0;
  public static int y2 = 2;
  public static int y3 = 4;
  public static int y4 = 6;
  public static int y5 = 1;
  public static int y6 = 3;
  public static int y7 = 5;
  public static int y8 = 7;
  public static int y9 = 0;
  public static int y10 = 2;
  public static int y11 = 4;
  public static int y12 = 6;
  
  public static pieces P1One = new pieces(x1,y1, "M ", false);
  public static pieces P1Two = new pieces(x2,y2, "N ", false);
  public static pieces P1Three = new pieces(x3,y3, "O ", false);
  public static pieces P1Four = new pieces(x4,y4, "P ", false);
  public static pieces P1Five = new pieces(x5,y5, "Q ", false);
  public static pieces P1Six = new pieces(x6,y6, "R ", false);
  public static pieces P1Seven = new pieces(x7,y7, "S ", false);
  public static pieces P1Eight = new pieces(x8,y8, "T ", false);
  public static pieces P1Nine = new pieces(x9,y9, "U ", false);
  public static pieces P1Ten = new pieces(x10,y10, "V ", false);
  public static pieces P1Eleven = new pieces(x11,y11, "W ", false);
  public static pieces P1Twelve = new pieces(x12,y12, "X ", false); 
  
  //Player 2 Pieces
  
  public static int x_1 = 0;
  public static int x_2 = 0;
  public static int x_3 = 0;
  public static int x_4 = 0;
  public static int x_5 = 1;
  public static int x_6 = 1;
  public static int x_7 = 1;
  public static int x_8 = 1;
  public static int x_9 = 2;
  public static int x_10 = 2;
  public static int x_11 = 2;
  public static int x_12 = 2;
  
  public static int y_1 = 1;
  public static int y_2 = 3;
  public static int y_3 = 5;
  public static int y_4 = 7;
  public static int y_5 = 0;
  public static int y_6 = 2;
  public static int y_7 = 4;
  public static int y_8 = 6;
  public static int y_9 = 1;
  public static int y_10 = 3;
  public static int y_11 = 5;
  public static int y_12 = 7;
  
  public static pieces P2One = new pieces(x_1,y_1, "A ", false);
  public static pieces P2Two = new pieces(x_2,y_2, "B ", false);
  public static pieces P2Three = new pieces(x_3,y_3, "C ", false);
  public static pieces P2Four = new pieces(x_4,y_4, "D ", false);
  public static pieces P2Five = new pieces(x_5,y_5, "E ", false);
  public static pieces P2Six = new pieces(x_6,y_6, "F ", false);
  public static pieces P2Seven = new pieces(x_7,y_7, "G ", false);
  public static pieces P2Eight = new pieces(x_8,y_8, "H ", false);
  public static pieces P2Nine = new pieces(x_9,y_9, "I ", false);
  public static pieces P2Ten = new pieces(x_10,y_10, "J ", false);
  public static pieces P2Eleven = new pieces(x_11,y_11, "K ", false);
  public static pieces P2Twelve = new pieces(x_12,y_12, "L ", false);
  
  //number of pieces that will be kept track of
  public static int P1count = 12; 
  public static int P2count = 12;
  
  //various variables
  public static boolean P1run = true;
  public static boolean P2run = true;
  public static Scanner user = new Scanner(System.in);
  public static int killcounter = 0;
  public static void main(String[] args)
  {
    System.out.println("Welcome to Checkers! Here is the board.");
    
    for (int i = 0; i < 8; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        board[i][j] = placeholder;
      }
    }
    board[P1One.getX()][P1One.getY()] = P1One;
    board[P1Two.getX()][P1Two.getY()] = P1Two;
    board[P1Three.getX()][P1Three.getY()] = P1Three;
    board[P1Four.getX()][P1Four.getY()] = P1Four;
    board[P1Five.getX()][P1Five.getY()] = P1Five;
    board[P1Six.getX()][P1Six.getY()] = P1Six;
    board[P1Seven.getX()][P1Seven.getY()] = P1Seven;
    board[P1Eight.getX()][P1Eight.getY()] = P1Eight;
    board[P1Nine.getX()][P1Nine.getY()] = P1Nine;
    board[P1Ten.getX()][P1Ten.getY()] = P1Ten;
    board[P1Eleven.getX()][P1Eleven.getY()] = P1Eleven;
    board[P1Twelve.getX()][P1Twelve.getY()] = P1Twelve;
    
    board[P2One.getX()][P2One.getY()] = P2One;
    board[P2Two.getX()][P2Two.getY()] = P2Two;
    board[P2Three.getX()][P2Three.getY()] = P2Three;
    board[P2Four.getX()][P2Four.getY()] = P2Four;
    board[P2Five.getX()][P2Five.getY()] = P2Five;
    board[P2Six.getX()][P2Six.getY()] = P2Six;
    board[P2Seven.getX()][P2Seven.getY()] = P2Seven;
    board[P2Eight.getX()][P2Eight.getY()] = P2Eight;
    board[P2Nine.getX()][P2Nine.getY()] = P2Nine;
    board[P2Ten.getX()][P2Ten.getY()] = P2Ten;
    board[P2Eleven.getX()][P2Eleven.getY()] = P2Eleven;
    board[P2Twelve.getX()][P2Twelve.getY()] = P2Twelve;
    
    boolean gameRun = true;
    while (gameRun == true)
    {
      while (P1run == true)
      {
        
        for (int i = 0; i < 8; i++)
        {
          for (int j = 0; j < 8; j++)
          {
            System.out.print(board[i][j]);
          }
          System.out.println();
        }
        
        System.out.println("Player one's turn: Choose a piece to move (M-X)");
        String pieceChoice = user.nextLine();
        
        if (pieceChoice.equals("M"))
        {
          if (P1One.getKing() == true)
          {
            P1kingMove(P1One);
          }
          else
          {
            playerOneMove(P1One);
          }
        }
        else if (pieceChoice.equals("N"))
        {
          if (P1Two.getKing() == true)
          {
            P1kingMove(P1Two);
          }
          else
          {
            playerOneMove(P1Two);
          }
        }
        else if (pieceChoice.equals("O"))
        {
          if (P1Three.getKing() == true)
          {
            P1kingMove(P1Three);
          }
          else
          {
            playerOneMove(P1Three);
          }
        }
        else if (pieceChoice.equals("P"))
        {
          if (P1Four.getKing() == true)
          {
            P1kingMove(P1Four);
          }
          else
          {
            playerOneMove(P1Four);
          }
        }
        else if (pieceChoice.equals("Q"))
        {
          if (P1Five.getKing() == true)
          {
            P1kingMove(P1Five);
          }
          else
          {
            playerOneMove(P1Five);
          }
        }
        else if (pieceChoice.equals("R"))
        {
          if (P1Six.getKing() == true)
          {
            P1kingMove(P1Six);
          }
          else
          {
            playerOneMove(P1Six);
          }
        }
        else if (pieceChoice.equals("S"))
        {
          if (P1Seven.getKing() == true)
          {
            P1kingMove(P1Seven);
          }
          else
          {
            playerOneMove(P1Seven);
          }
        }
        else if (pieceChoice.equals("T"))
        {
          if (P1Eight.getKing() == true)
          {
            P1kingMove(P1Eight);
          }
          else
          {
            playerOneMove(P1Eight);
          }
        }
        else if (pieceChoice.equals("U"))
        {
          if (P1Nine.getKing() == true)
          {
            P1kingMove(P1Nine);
          }
          else
          {
            playerOneMove(P1Nine);
          }
        }
        else if (pieceChoice.equals("V"))
        {
          if (P1Ten.getKing() == true)
          {
            P1kingMove(P1Ten);
          }
          else
          {
            playerOneMove(P1Ten);
          }
        }
        else if (pieceChoice.equals("W"))
        {
          if (P1Eleven.getKing() == true)
          {
            P1kingMove(P1Eleven);
          }
          else
          {
            playerOneMove(P1Eleven);
          }
        }
        else if (pieceChoice.equals("X"))
        {
          if (P1Twelve.getKing() == true)
          {
            P1kingMove(P1Twelve);
          }
          else
          {
            playerOneMove(P1Twelve);
          }
        }
        
        System.out.println("P1 Pieces: " + P1count);
        System.out.println("P2 Pieces: " + P2count);
      }
      
      
      //Player Two
      while (P2run == true)
      {
        for (int m = 0; m < 8; m++)
        {
          for (int n = 0; n < 8; n++)
          {
            System.out.print(board[m][n]);
          }
          System.out.println();
        }
        
        System.out.println("Player two's turn: Choose a piece to move (A-L)");
        String pieceChoice = user.nextLine();
        
        if (pieceChoice.equals("A"))
        {
          if (P2One.getKing() == true)
          {
            P2kingMove(P2One);
          }
          else
          {
            playerTwoMove(P2One);
          }
        }
        else if (pieceChoice.equals("B"))
        {
          if (P2Two.getKing() == true)
          {
            P2kingMove(P2Two);
          }
          else
          {
            playerTwoMove(P2Two);
          }
        }
        else if (pieceChoice.equals("C"))
        {
          if (P2Three.getKing() == true)
          {
            P2kingMove(P2Three);
          }
          else
          {
            playerTwoMove(P2Three);
          }
        }
        else if (pieceChoice.equals("D"))
        {
          if (P2Four.getKing() == true)
          {
            P2kingMove(P2Four);
          }
          else
          {
            playerTwoMove(P2Four);
          }
        }
        else if (pieceChoice.equals("E"))
        {
          if (P2Five.getKing() == true)
          {
            P2kingMove(P2Five);
          }
          else
          {
            playerTwoMove(P2Five);
          }
        }
        else if (pieceChoice.equals("F"))
        {
          if (P2Six.getKing() == true)
          {
            P2kingMove(P2Six);
          }
          else
          {
            playerTwoMove(P2Six);
          }
        }
        else if (pieceChoice.equals("G"))
        {
          if (P2Seven.getKing() == true)
          {
            P2kingMove(P2Seven);
          }
          else
          {
            playerTwoMove(P2Seven);
          }
        }
        else if (pieceChoice.equals("H"))
        {
          if (P2Eight.getKing() == true)
          {
            P2kingMove(P2Eight);
          }
          else
          {
            playerTwoMove(P2Eight);
          }
        }
        else if (pieceChoice.equals("I"))
        {
          if (P2Nine.getKing() == true)
          {
            P2kingMove(P2Nine);
          }
          else
          {
            playerTwoMove(P2Nine);
          }
        }
        else if (pieceChoice.equals("J"))
        {
          if (P2Ten.getKing() == true)
          {
            P2kingMove(P2Ten);
          }
          else
          {
            playerTwoMove(P2Ten);
          }
        }
        else if (pieceChoice.equals("K"))
        {
          if (P2Eleven.getKing() == true)
          {
            P2kingMove(P2Eleven);
          }
          else
          {
            playerTwoMove(P2Eleven);
          }
        }
        else if (pieceChoice.equals("L"))
        {
          if (P2Twelve.getKing() == true)
          {
            P2kingMove(P2Twelve);
          }
          else
          {
            playerTwoMove(P2Twelve);
          }
        }
        System.out.println("P1 Pieces: " + P1count);
        System.out.println("P2 Pieces: " + P2count);
      }
      if (P1count == 0 || P2count == 0)
      {
        gameRun = false;
        if (P1count == 0)
        {
          System.out.println("P1 Wins."); 
        }
        else if (P2count == 0)
        {
          System.out.println("P2 Wins."); 
        }
      }
    }
  }
  
  //method for P1
  public static void playerOneMove(pieces P1)
  {
    System.out.println("Where would you like to move? (L or R)");
    String choice = user.nextLine();
    if (P1.getX()-2 >= 0)
    {
      //left boundary
      if ( P1.getY() == 0 && choice.equals("L"))
      {
        System.out.println("You can only move right.");
      }
      else if (P1.getY() == 0 && choice.equals("R"))
      {
        //kill
        if ((choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve) && board[P1.getX()-2][P1.getY()+2] == placeholder))
        {
          P1.P1moveRight();
          P1.P1moveRight();
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()+2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          playerOneMove(P1); 
        }
        
        //basic movement
        else if (choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.P1moveRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      //right boundary
      else if ( P1.getY() == 7 && choice.equals("R")) 
      {
        System.out.println("You can only move left.");
      }
      else if (P1.getY() == 7 && choice.equals("L"))
      {
        //kill
        if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder)
        {
          P1.P1moveLeft();
          P1.P1moveLeft();
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()+2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          playerOneMove(P1);
        }
        
        //basic movement
        if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.P1moveLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      
      //no boundary
      else if ((P1.getX() > 0) && (P1.getX() <= 7) && (P1.getY() > 0) && (P1.getY() < 7))
      {
        //kills
        
        if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder)
        {
          P1.P1moveLeft();
          P1.P1moveLeft();
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()+2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          playerOneMove(P1);
        }
        else if (choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve) && board[P1.getX()-2][P1.getY()+2] == placeholder)
        {
          P1.P1moveRight();
          P1.P1moveRight();
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()+2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          playerOneMove(P1);
        }
        
        //basic movement
        else if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.P1moveLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.P1moveRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        } 
        else if ((choice.equals("L") && killcounter == 1) || (choice.equals("R") && killcounter == 1))
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
    }
    
    
//no kill area
    else
    {
      //left boundary
      if ( P1.getY() == 0 && choice.equals("L"))
      {
        System.out.println("You can only move right.");
      }
      else if (P1.getY() == 0 && choice.equals("R"))
      {
        if (choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.P1moveRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //right boundary
      else if ( P1.getY() == 7 && choice.equals("R")) 
      {
        System.out.println("You can only move left.");
      }
      else if (P1.getY() == 7 && choice.equals("L"))
      {
        if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.P1moveLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //no boundary
      else if ((P1.getX() > 0) && (P1.getX() <= 7) && (P1.getY() > 0) && (P1.getY() < 7))
      {
        if (choice.equals("L") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.P1moveLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("R") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.P1moveRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        } 
        else if ((choice.equals("L") && killcounter == 1) || (choice.equals("R") && killcounter == 1))
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //king check
      if (P1.getX() == 0)
      {
        P1.setKing();
        System.out.println("This piece is now a king.");
      }
    }
  } 
  
  
  //method for P2
  public static void playerTwoMove(pieces P2)
  {
    System.out.println("Where would you like to move? (L or R)");
    String choice = user.nextLine();
    if (P2.getX() <= 5)
    {
      //left boundary
      if ( P2.getY() == 0 && choice.equals("L"))
      {
        System.out.println("You can only move right.");
      }
      else if (P2.getY() == 0 && choice.equals("R"))
      {
        //kill
        if ((choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder))
        {
          P2.P2moveRight();
          P2.P2moveRight();
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()-2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          playerTwoMove(P2);
        }
        
        
        //basic movement
        else if (choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.P2moveRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      //right boundary
      else if ( P2.getY() == 7 && choice.equals("R")) 
      {
        System.out.println("You can only move left.");
      }
      else if (P2.getY() == 7 && choice.equals("L"))
      {
        //kill
        if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder)
        {
          P2.P2moveLeft();
          P2.P2moveLeft();
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()-2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          playerTwoMove(P2);
        }
        
        //basic movement
        else if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.P2moveLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      
      //no boundary
      else if ((P2.getX() >= 0) && (P2.getX() < 7) && (P2.getY() >= 0) && (P2.getY() <= 7))
      {
        //kills
        
        if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder)
        {
          P2.P2moveLeft();
          P2.P2moveLeft();
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()-2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          playerTwoMove(P2);
        }
        else if (choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder)
        {
          P2.P2moveRight();
          P2.P2moveRight();
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()-2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          playerTwoMove(P2);
        }
        
        //basic movement
        else if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.P2moveLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.P2moveRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        } 
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
    }
    
    //no kill zone
    else
    {
      //left boundary
      if ( P2.getY() == 0 && choice.equals("L"))
      {
        System.out.println("You can only move right.");
      }
      else if (P2.getY() == 0 && choice.equals("R"))
      {
        if (choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.P2moveRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //right boundary
      else if ( P2.getY() == 7 && choice.equals("R")) 
      {
        System.out.println("You can only move left.");
      }
      else if (P2.getY() == 7 && choice.equals("L"))
      {
        if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.P2moveLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //no boundary
      else if ((P2.getX() >= 0) && (P2.getX() < 7) && (P2.getY() >= 0) && (P2.getY() <= 7))
      {
        if (choice.equals("L") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.P2moveLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("L") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("R") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.P2moveRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        } 
        else if (choice.equals("R") && killcounter == 1)
        {
          System.out.println("No more kills available");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      //king check
      if (P2.getX() == 7)
      {
        P2.setKing();
        System.out.println("This piece is now a king.");
      } 
    }
  }
  
  
  //method for king P1
  public static void P1kingMove(pieces P1)
  {
    System.out.println("Where would you like to move? (UpL, DownL, UpR, DownR)");
    String choice = user.nextLine();
    //Upper and lower boundaries restrictions
    if ((P1.getX() == 0 && choice.equals("UpL")) || (P1.getX() == 0 && choice.equals("UpR")) || (P1.getX() == 7 && choice.equals("DownL")) || (P1.getX() == 7 && choice.equals("DownR")))
    {
      System.out.println("You can't move there.");
    }
    if (P1.getX() >= 2 && P1.getX() <= 5)
    {
      //left boundary
      if ((P1.getY() == 0 && choice.equals("UpL")) || (P1.getY() == 0 && choice.equals("DownL")))
      {
        System.out.println("You can only move right.");
      }
      else if (P1.getY() == 0 && choice.equals("UpR"))
      {
        //kill
        if ((choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve) && board[P1.getX()-2][P1.getY()+2] == placeholder))
        {
          P1.kingUpRight();
          P1.kingUpRight();
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()+2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1); 
        }
        
        //basic movement
        else if (choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.kingUpRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("UpR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      else if (P1.getY() == 0 && choice.equals("DownR"))
      {
        //kill
        if ((choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == P2One || board[P1.getX()+1][P1.getY()+1] == P2Two || board[P1.getX()+1][P1.getY()+1] == P2Three || board[P1.getX()+1][P1.getY()+1] == P2Four || board[P1.getX()+1][P1.getY()+1] == P2Five || board[P1.getX()+1][P1.getY()+1] == P2Six || board[P1.getX()+1][P1.getY()+1] == P2Seven || board[P1.getX()+1][P1.getY()+1] == P2Eight || board[P1.getX()+1][P1.getY()+1] == P2Nine || board[P1.getX()+1][P1.getY()+1] == P2Ten || board[P1.getX()+1][P1.getY()+1] == P2Eleven || board[P1.getX()+1][P1.getY()+1] == P2Twelve) && board[P1.getX()+2][P1.getY()+2] == placeholder))
        {
          P1.kingDownRight();
          P1.kingDownRight();
          board[P1.getX()-1][P1.getY()-1] = placeholder;
          board[P1.getX()-2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1); 
        }
        
        //basic movement
        else if (choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.kingDownRight(); 
          board[P1.getX()-1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("DownR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      //right boundary
      else if ( (P1.getY() == 7 && choice.equals("UpR")) || (P1.getY() == 7 && choice.equals("DownR"))) 
      {
        System.out.println("You can only move left.");
      }
      else if (P1.getY() == 7 && choice.equals("UpL"))
      {
        //kill
        if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder)
        {
          P1.kingUpLeft();
          P1.kingUpLeft();
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()+2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1);
        }
        
        //basic movement
        if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.kingUpLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("UpL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      else if (P1.getY() == 7 && choice.equals("DownL"))
      {
        //kill
        if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == P2One || board[P1.getX()+1][P1.getY()-1] == P2Two || board[P1.getX()+1][P1.getY()-1] == P2Three || board[P1.getX()+1][P1.getY()-1] == P2Four || board[P1.getX()+1][P1.getY()-1] == P2Five || board[P1.getX()+1][P1.getY()-1] == P2Six || board[P1.getX()+1][P1.getY()-1] == P2Seven || board[P1.getX()+1][P1.getY()-1] == P2Eight || board[P1.getX()+1][P1.getY()-1] == P2Nine || board[P1.getX()+1][P1.getY()-1] == P2Ten || board[P1.getX()+1][P1.getY()-1] == P2Eleven || board[P1.getX()+1][P1.getY()-1] == P2Twelve) && board[P1.getX()+2][P1.getY()-2] == placeholder)
        {
          P1.kingDownLeft();
          P1.kingDownLeft();
          board[P1.getX()-1][P1.getY()+1] = placeholder;
          board[P1.getX()-2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1);
        }
        
        //basic movement
        if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.kingDownLeft(); 
          board[P1.getX()-1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("DownL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      
      //no boundary
      else if ((P1.getX() > 0) && (P1.getX() < 7) && (P1.getY() > 0) && (P1.getY() < 7))
      {
        //kill
        if ((choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve) && board[P1.getX()-2][P1.getY()+2] == placeholder))
        {
          P1.kingUpRight();
          P1.kingUpRight();
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()+2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1); 
        }
        
        //basic movement
        else if (choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.kingUpRight(); 
          board[P1.getX()+1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("UpR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        
        //kill
        else if ((choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == P2One || board[P1.getX()+1][P1.getY()+1] == P2Two || board[P1.getX()+1][P1.getY()+1] == P2Three || board[P1.getX()+1][P1.getY()+1] == P2Four || board[P1.getX()+1][P1.getY()+1] == P2Five || board[P1.getX()+1][P1.getY()+1] == P2Six || board[P1.getX()+1][P1.getY()+1] == P2Seven || board[P1.getX()+1][P1.getY()+1] == P2Eight || board[P1.getX()+1][P1.getY()+1] == P2Nine || board[P1.getX()+1][P1.getY()+1] == P2Ten || board[P1.getX()+1][P1.getY()+1] == P2Eleven || board[P1.getX()+1][P1.getY()+1] == P2Twelve) && board[P1.getX()+2][P1.getY()+2] == placeholder))
        {
          P1.kingDownRight();
          P1.kingDownRight();
          board[P1.getX()-1][P1.getY()-1] = placeholder;
          board[P1.getX()-2][P1.getY()-2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1); 
        }    
        //basic movement
        else if (choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == placeholder) && killcounter != 1)
        {
          P1.kingDownRight(); 
          board[P1.getX()-1][P1.getY()-1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("DownR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }      
        //kill
        else if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder)
        {
          P1.kingUpLeft();
          P1.kingUpLeft();
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()+2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1);
        }      
        //basic movement
        else if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.kingUpLeft(); 
          board[P1.getX()+1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("UpL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        } 
        //kill
        else if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == P2One || board[P1.getX()+1][P1.getY()-1] == P2Two || board[P1.getX()+1][P1.getY()-1] == P2Three || board[P1.getX()+1][P1.getY()-1] == P2Four || board[P1.getX()+1][P1.getY()-1] == P2Five || board[P1.getX()+1][P1.getY()-1] == P2Six || board[P1.getX()+1][P1.getY()-1] == P2Seven || board[P1.getX()+1][P1.getY()-1] == P2Eight || board[P1.getX()+1][P1.getY()-1] == P2Nine || board[P1.getX()+1][P1.getY()-1] == P2Ten || board[P1.getX()+1][P1.getY()-1] == P2Eleven || board[P1.getX()+1][P1.getY()-1] == P2Twelve) && board[P1.getX()+2][P1.getY()-2] == placeholder)
        {
          P1.kingDownLeft();
          P1.kingDownLeft();
          board[P1.getX()-1][P1.getY()+1] = placeholder;
          board[P1.getX()-2][P1.getY()+2] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P2count--;
          killcounter = 1;
          P1kingMove(P1);
        }   
        //basic movement
        else if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == placeholder) && killcounter != 1)
        {
          P1.kingDownLeft(); 
          board[P1.getX()-1][P1.getY()+1] = placeholder;
          board[P1.getX()][P1.getY()] = P1;
          P1run = false;
          P2run = true;
        }
        else if (choice.equals("DownL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P1run = false;
          P2run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }     
      }
    }
    else if (P1.getX() == 0 || P1.getX() == 1)
    {
      //kills at upper bound
      if ((P1.getX() == 0 && choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == P2One || board[P1.getX()+1][P1.getY()-1] == P2Two || board[P1.getX()+1][P1.getY()-1] == P2Three || board[P1.getX()+1][P1.getY()-1] == P2Four || board[P1.getX()+1][P1.getY()-1] == P2Five || board[P1.getX()+1][P1.getY()-1] == P2Six || board[P1.getX()+1][P1.getY()-1] == P2Seven || board[P1.getX()+1][P1.getY()-1] == P2Eight || board[P1.getX()+1][P1.getY()-1] == P2Nine || board[P1.getX()+1][P1.getY()-1] == P2Ten || board[P1.getX()+1][P1.getY()-1] == P2Eleven || board[P1.getX()+1][P1.getY()-1] == P2Twelve) && board[P1.getX()+2][P1.getY()-2] == placeholder) || (P1.getX() == 1 && choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == P2One || board[P1.getX()+1][P1.getY()-1] == P2Two || board[P1.getX()+1][P1.getY()-1] == P2Three || board[P1.getX()+1][P1.getY()-1] == P2Four || board[P1.getX()+1][P1.getY()-1] == P2Five || board[P1.getX()+1][P1.getY()-1] == P2Six || board[P1.getX()+1][P1.getY()-1] == P2Seven || board[P1.getX()+1][P1.getY()-1] == P2Eight || board[P1.getX()+1][P1.getY()-1] == P2Nine || board[P1.getX()+1][P1.getY()-1] == P2Ten || board[P1.getX()+1][P1.getY()-1] == P2Eleven || board[P1.getX()+1][P1.getY()-1] == P2Twelve) && board[P1.getX()+2][P1.getY()-2] == placeholder))
      {
        P1.kingDownLeft();
        P1.kingDownLeft();
        board[P1.getX()-1][P1.getY()+1] = placeholder;
        board[P1.getX()-2][P1.getY()+2] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P2count--;
        killcounter = 1;
        P1kingMove(P1);
      }   
      else if ((P1.getX() == 0 && choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == P2One || board[P1.getX()+1][P1.getY()+1] == P2Two || board[P1.getX()+1][P1.getY()+1] == P2Three || board[P1.getX()+1][P1.getY()+1] == P2Four || board[P1.getX()+1][P1.getY()+1] == P2Five || board[P1.getX()+1][P1.getY()+1] == P2Six || board[P1.getX()+1][P1.getY()+1] == P2Seven || board[P1.getX()+1][P1.getY()+1] == P2Eight || board[P1.getX()+1][P1.getY()+1] == P2Nine || board[P1.getX()+1][P1.getY()+1] == P2Ten || board[P1.getX()+1][P1.getY()+1] == P2Eleven || board[P1.getX()+1][P1.getY()+1] == P2Twelve) && board[P1.getX()+2][P1.getY()+2] == placeholder) || (P1.getX() == 1 && choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == P2One || board[P1.getX()+1][P1.getY()+1] == P2Two || board[P1.getX()+1][P1.getY()+1] == P2Three || board[P1.getX()+1][P1.getY()+1] == P2Four || board[P1.getX()+1][P1.getY()+1] == P2Five || board[P1.getX()+1][P1.getY()+1] == P2Six || board[P1.getX()+1][P1.getY()+1] == P2Seven || board[P1.getX()+1][P1.getY()+1] == P2Eight || board[P1.getX()+1][P1.getY()+1] == P2Nine || board[P1.getX()+1][P1.getY()+1] == P2Ten || board[P1.getX()+1][P1.getY()+1] == P2Eleven || board[P1.getX()+1][P1.getY()+1] == P2Twelve) && board[P1.getX()+2][P1.getY()+2] == placeholder))
      {
        P1.kingDownRight();
        P1.kingDownRight();
        board[P1.getX()-1][P1.getY()-1] = placeholder;
        board[P1.getX()-2][P1.getY()-2] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P2count--;
        killcounter = 1;
        P1kingMove(P1); 
      }       
    }
    else if (P1.getX() == 6 || P1.getX() == 7)
    {
      //kills at lower bound
      if ((P1.getX() == 6 && choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder) || (P1.getX() == 7 && choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == P2One || board[P1.getX()-1][P1.getY()-1] == P2Two || board[P1.getX()-1][P1.getY()-1] == P2Three || board[P1.getX()-1][P1.getY()-1] == P2Four || board[P1.getX()-1][P1.getY()-1] == P2Five || board[P1.getX()-1][P1.getY()-1] == P2Six || board[P1.getX()-1][P1.getY()-1] == P2Seven || board[P1.getX()-1][P1.getY()-1] == P2Eight || board[P1.getX()-1][P1.getY()-1] == P2Nine || board[P1.getX()-1][P1.getY()-1] == P2Ten || board[P1.getX()-1][P1.getY()-1] == P2Eleven || board[P1.getX()-1][P1.getY()-1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
      {
        P1.kingUpLeft();
        P1.kingUpLeft();
        board[P1.getX()+1][P1.getY()+1] = placeholder;
        board[P1.getX()+2][P1.getY()+2] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P2count--;
        killcounter = 1;
        P1kingMove(P1);
      }      
      else if ((P1.getX() == 6 && choice.equals("UpR") && board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve && board[P1.getX()-2][P1.getY()-2] == placeholder) || (P1.getX() == 7 && choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == P2One || board[P1.getX()-1][P1.getY()+1] == P2Two || board[P1.getX()-1][P1.getY()+1] == P2Three || board[P1.getX()-1][P1.getY()+1] == P2Four || board[P1.getX()-1][P1.getY()+1] == P2Five || board[P1.getX()-1][P1.getY()+1] == P2Six || board[P1.getX()-1][P1.getY()+1] == P2Seven || board[P1.getX()-1][P1.getY()+1] == P2Eight || board[P1.getX()-1][P1.getY()+1] == P2Nine || board[P1.getX()-1][P1.getY()+1] == P2Ten || board[P1.getX()-1][P1.getY()+1] == P2Eleven || board[P1.getX()-1][P1.getY()+1] == P2Twelve) && board[P1.getX()-2][P1.getY()-2] == placeholder))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
      {
        P1.kingUpRight();
        P1.kingUpRight();
        board[P1.getX()+1][P1.getY()-1] = placeholder;
        board[P1.getX()+2][P1.getY()-2] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P2count--;
        killcounter = 1;
        P1kingMove(P1); 
      }
    }
    //left boundary
    else if ((P1.getY() == 0 && choice.equals("UpL")) || (P1.getY() == 0 && choice.equals("DownL")))
    {
      System.out.println("You can only move right.");
    }
    else if (P1.getY() == 0 && choice.equals("UpR"))
    {
      if (choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingUpRight(); 
        board[P1.getX()+1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
      else
      {
        System.out.println("You can't move there."); 
      }
    }
    else if (P1.getY() == 0 && choice.equals("DownR"))
    {
      if (choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingDownRight(); 
        board[P1.getX()-1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
      else
      {
        System.out.println("You can't move there."); 
      }
    }
    
    //right boundary
    else if ( (P1.getY() == 7 && choice.equals("UpR")) || (P1.getY() == 7 && choice.equals("DownR"))) 
    {
      System.out.println("You can only move left.");
    }
    else if (P1.getY() == 7 && choice.equals("UpL"))
    {
      if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingUpLeft(); 
        board[P1.getX()+1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
      else
      {
        System.out.println("You can't move there."); 
      }
    }
    else if (P1.getY() == 7 && choice.equals("DownL"))
    {
      if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingDownLeft(); 
        board[P1.getX()-1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
      else
      {
        System.out.println("You can't move there."); 
      }
    }
    
    //no boundary
    else if ((P1.getX() == 1) || (P1.getX() == 6))
    {
      if (choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingUpRight(); 
        board[P1.getX()+1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }            
      else if (choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingDownRight(); 
        board[P1.getX()-1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }      
      else if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingUpLeft(); 
        board[P1.getX()+1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingDownLeft(); 
        board[P1.getX()-1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
    }
    //upper and lower boundary movement
    else if (P1.getX() == 0)
    {
      if (choice.equals("DownR") && (board[P1.getX()+1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingDownRight(); 
        board[P1.getX()-1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }      
      
      else if (choice.equals("DownL") && (board[P1.getX()+1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingDownLeft(); 
        board[P1.getX()-1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("DownL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }
    }
    else if (P1.getX() == 7)
    {
      if (choice.equals("UpR") && (board[P1.getX()-1][P1.getY()+1] == placeholder) && killcounter != 1)
      {
        P1.kingUpRight(); 
        board[P1.getX()+1][P1.getY()-1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpR") && killcounter == 1)
      {
        System.out.println("No more kills avaiable");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }   
      else if (choice.equals("UpL") && (board[P1.getX()-1][P1.getY()-1] == placeholder) && killcounter != 1)
      {
        P1.kingUpLeft(); 
        board[P1.getX()+1][P1.getY()+1] = placeholder;
        board[P1.getX()][P1.getY()] = P1;
        P1run = false;
        P2run = true;
      }
      else if (choice.equals("UpL") && killcounter == 1)
      {
        System.out.println("No more kills available.");
        killcounter = 0;
        P1run = false;
        P2run = true;
      }        
    }
    else
    {
      System.out.println("You can't move there."); 
    }    
  }  
  
  
  
  
  //method for king P2
  public static void P2kingMove(pieces P2)
  {
    System.out.println("Where would you like to move? (UpL, DownL, UpR, DownR)");
    String choice = user.nextLine();
    //Upper and lower boundaries restrictions
    if ((P2.getX() == 0 && choice.equals("UpL")) || (P2.getX() == 0 && choice.equals("UpR")) || (P2.getX() == 7 && choice.equals("DownL")) || (P2.getX() == 7 && choice.equals("DownR")))
    {
      System.out.println("You can't move there.");
    }
    if (P2.getX() >= 2 || P2.getX() <= 5)
    {
      //left boundary
      if ((P2.getY() == 0 && choice.equals("UpL")) || (P2.getY() == 0 && choice.equals("DownL")))
      {
        System.out.println("You can only move right.");
      }
      else if (P2.getY() == 0 && choice.equals("UpR"))
      {
        //kill
        if ((choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == P1One || board[P2.getX()-1][P2.getY()+1] == P1Two || board[P2.getX()-1][P2.getY()+1] == P1Three || board[P2.getX()-1][P2.getY()+1] == P1Four || board[P2.getX()-1][P2.getY()+1] == P1Five || board[P2.getX()-1][P2.getY()+1] == P1Six || board[P2.getX()-1][P2.getY()+1] == P1Seven || board[P2.getX()-1][P2.getY()+1] == P1Eight || board[P2.getX()-1][P2.getY()+1] == P1Nine || board[P2.getX()-1][P2.getY()+1] == P1Ten || board[P2.getX()-1][P2.getY()+1] == P1Eleven || board[P2.getX()-1][P2.getY()+1] == P1Twelve) && board[P2.getX()-2][P2.getY()+2] == placeholder))
        {
          P2.kingUpRight();
          P2.kingUpRight();
          board[P2.getX()+1][P2.getY()-1] = placeholder;
          board[P2.getX()+2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2); 
        }
        
        //basic movement
        else if (choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.kingUpRight(); 
          board[P2.getX()+1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("UpR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      else if (P2.getY() == 0 && choice.equals("DownR"))
      {
        //kill
        if ((choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder))
        {
          P2.kingDownRight();
          P2.kingDownRight();
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()-2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2); 
        }
        
        //basic movement
        else if (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.kingDownRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("DownR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      //right boundary
      else if ( (P2.getY() == 7 && choice.equals("UpR")) || (P2.getY() == 7 && choice.equals("DownR"))) 
      {
        System.out.println("You can only move left.");
      }
      else if (P2.getY() == 7 && choice.equals("UpL"))
      {
        //kill
        if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == P1One || board[P2.getX()-1][P2.getY()-1] == P1Two || board[P2.getX()-1][P2.getY()-1] == P1Three || board[P2.getX()-1][P2.getY()-1] == P1Four || board[P2.getX()-1][P2.getY()-1] == P1Five || board[P2.getX()-1][P2.getY()-1] == P1Six || board[P2.getX()-1][P2.getY()-1] == P1Seven || board[P2.getX()-1][P2.getY()-1] == P1Eight || board[P2.getX()-1][P2.getY()-1] == P1Nine || board[P2.getX()-1][P2.getY()-1] == P1Ten || board[P2.getX()-1][P2.getY()-1] == P1Eleven || board[P2.getX()-1][P2.getY()-1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder)
        {
          P2.kingUpLeft();
          P2.kingUpLeft();
          board[P2.getX()+1][P2.getY()+1] = placeholder;
          board[P2.getX()+2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2);
        }
        
        //basic movement
        if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.kingUpLeft(); 
          board[P2.getX()+1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("UpL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      else if (P2.getY() == 7 && choice.equals("DownL"))
      {
        //kill
        if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder)
        {
          P2.kingDownLeft();
          P2.kingDownLeft();
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()-2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2);
        }
        
        //basic movement
        if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.kingDownLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("DownL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }
      }
      
      
      //no boundary
      else if ((P2.getX() > 0) && (P2.getX() < 7) && (P2.getY() > 0) && (P2.getY() < 7))
      {
        //kill
        if ((choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == P1One || board[P2.getX()-1][P2.getY()+1] == P1Two || board[P2.getX()-1][P2.getY()+1] == P1Three || board[P2.getX()-1][P2.getY()+1] == P1Four || board[P2.getX()-1][P2.getY()+1] == P1Five || board[P2.getX()-1][P2.getY()+1] == P1Six || board[P2.getX()-1][P2.getY()+1] == P1Seven || board[P2.getX()-1][P2.getY()+1] == P1Eight || board[P2.getX()-1][P2.getY()+1] == P1Nine || board[P2.getX()-1][P2.getY()+1] == P1Ten || board[P2.getX()-1][P2.getY()+1] == P1Eleven || board[P2.getX()-1][P2.getY()+1] == P1Twelve) && board[P2.getX()-2][P2.getY()+2] == placeholder))
        {
          P2.kingUpRight();
          P2.kingUpRight();
          board[P2.getX()+1][P2.getY()-1] = placeholder;
          board[P2.getX()+2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2); 
        }
        
        //basic movement
        else if (choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.kingUpRight(); 
          board[P2.getX()+1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("UpR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        
        //kill
        else if ((choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder))
        {
          P2.kingDownRight();
          P2.kingDownRight();
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()-2][P2.getY()-2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2); 
        }    
        //basic movement
        else if (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
        {
          P2.kingDownRight(); 
          board[P2.getX()-1][P2.getY()-1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("DownR") && killcounter == 1)
        {
          System.out.println("No more kills avaiable");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }      
        //kill
        else if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == P1One || board[P2.getX()-1][P2.getY()-1] == P1Two || board[P2.getX()-1][P2.getY()-1] == P1Three || board[P2.getX()-1][P2.getY()-1] == P1Four || board[P2.getX()-1][P2.getY()-1] == P1Five || board[P2.getX()-1][P2.getY()-1] == P1Six || board[P2.getX()-1][P2.getY()-1] == P1Seven || board[P2.getX()-1][P2.getY()-1] == P1Eight || board[P2.getX()-1][P2.getY()-1] == P1Nine || board[P2.getX()-1][P2.getY()-1] == P1Ten || board[P2.getX()-1][P2.getY()-1] == P1Eleven || board[P2.getX()-1][P2.getY()-1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder)
        {
          P2.kingUpLeft();
          P2.kingUpLeft();
          board[P2.getX()+1][P2.getY()+1] = placeholder;
          board[P2.getX()+2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2);
        }      
        //basic movement
        else if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.kingUpLeft(); 
          board[P2.getX()+1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("UpL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P2run = false;
          P1run = true;
        } 
        //kill
        else if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder)
        {
          P2.kingDownLeft();
          P2.kingDownLeft();
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()-2][P2.getY()+2] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P1count--;
          killcounter = 1;
          P2kingMove(P2);
        }   
        //basic movement
        else if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
        {
          P2.kingDownLeft(); 
          board[P2.getX()-1][P2.getY()+1] = placeholder;
          board[P2.getX()][P2.getY()] = P2;
          P2run = false;
          P1run = true;
        }
        else if (choice.equals("DownL") && killcounter == 1)
        {
          System.out.println("No more kills available.");
          killcounter = 0;
          P2run = false;
          P1run = true;
        }
        else
        {
          System.out.println("You can't move there."); 
        }     
      }
      else if (P2.getX() == 0 || P2.getX() == 1 || P2.getX() == 6 || P2.getX() == 7)
      {
        //kills
        if (P2.getX() == 0 || P2.getX() == 1)
        {
          if (P2.getX() == 0 && (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder) || ((P2.getX() == 1 && choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == P1One || board[P2.getX()+1][P2.getY()-1] == P1Two || board[P2.getX()+1][P2.getY()-1] == P1Three || board[P2.getX()+1][P2.getY()-1] == P1Four || board[P2.getX()+1][P2.getY()-1] == P1Five || board[P2.getX()+1][P2.getY()-1] == P1Six || board[P2.getX()+1][P2.getY()-1] == P1Seven || board[P2.getX()+1][P2.getY()-1] == P1Eight || board[P2.getX()+1][P2.getY()-1] == P1Nine || board[P2.getX()+1][P2.getY()-1] == P1Ten || board[P2.getX()+1][P2.getY()-1] == P1Eleven || board[P2.getX()+1][P2.getY()-1] == P1Twelve) && board[P2.getX()+2][P2.getY()-2] == placeholder)))
          {
            P2.kingDownLeft();
            P2.kingDownLeft();
            board[P2.getX()-1][P2.getY()+1] = placeholder;
            board[P2.getX()-2][P2.getY()+2] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P1count--;
            killcounter = 1;
            P2kingMove(P2);
          }   
          else if ((P2.getX() == 0 && (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder)) || (P2.getX() == 1 && choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == P1One || board[P2.getX()+1][P2.getY()+1] == P1Two || board[P2.getX()+1][P2.getY()+1] == P1Three || board[P2.getX()+1][P2.getY()+1] == P1Four || board[P2.getX()+1][P2.getY()+1] == P1Five || board[P2.getX()+1][P2.getY()+1] == P1Six || board[P2.getX()+1][P2.getY()+1] == P1Seven || board[P2.getX()+1][P2.getY()+1] == P1Eight || board[P2.getX()+1][P2.getY()+1] == P1Nine || board[P2.getX()+1][P2.getY()+1] == P1Ten || board[P2.getX()+1][P2.getY()+1] == P1Eleven || board[P2.getX()+1][P2.getY()+1] == P1Twelve) && board[P2.getX()+2][P2.getY()+2] == placeholder))
          {
            P2.kingDownRight();
            P2.kingDownRight();
            board[P2.getX()-1][P2.getY()-1] = placeholder;
            board[P2.getX()-2][P2.getY()-2] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P1count--;
            killcounter = 1;
            P2kingMove(P2); 
          }   
        }
        else if (P2.getX() == 6 || P2.getX() == 7)
        {
          if ((P2.getX() == 6 && choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == P1One || board[P2.getX()-1][P2.getY()-1] == P1Two || board[P2.getX()-1][P2.getY()-1] == P1Three || board[P2.getX()-1][P2.getY()-1] == P1Four || board[P2.getX()-1][P2.getY()-1] == P1Five || board[P2.getX()-1][P2.getY()-1] == P1Six || board[P2.getX()-1][P2.getY()-1] == P1Seven || board[P2.getX()-1][P2.getY()-1] == P1Eight || board[P2.getX()-1][P2.getY()-1] == P1Nine || board[P2.getX()-1][P2.getY()-1] == P1Ten || board[P2.getX()-1][P2.getY()-1] == P1Eleven || board[P2.getX()-1][P2.getY()-1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder) || (P2.getX() == 7 && choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == P1One || board[P2.getX()-1][P2.getY()-1] == P1Two || board[P2.getX()-1][P2.getY()-1] == P1Three || board[P2.getX()-1][P2.getY()-1] == P1Four || board[P2.getX()-1][P2.getY()-1] == P1Five || board[P2.getX()-1][P2.getY()-1] == P1Six || board[P2.getX()-1][P2.getY()-1] == P1Seven || board[P2.getX()-1][P2.getY()-1] == P1Eight || board[P2.getX()-1][P2.getY()-1] == P1Nine || board[P2.getX()-1][P2.getY()-1] == P1Ten || board[P2.getX()-1][P2.getY()-1] == P1Eleven || board[P2.getX()-1][P2.getY()-1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
          {
            P2.kingUpLeft();
            P2.kingUpLeft();
            board[P2.getX()+1][P2.getY()+1] = placeholder;
            board[P2.getX()+2][P2.getY()+2] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P1count--;
            killcounter = 1;
            P2kingMove(P2);
          }      
          else if ((P2.getX() == 6 && choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == P1One || board[P2.getX()-1][P2.getY()+1] == P1Two || board[P2.getX()-1][P2.getY()+1] == P1Three || board[P2.getX()-1][P2.getY()+1] == P1Four || board[P2.getX()-1][P2.getY()+1] == P1Five || board[P2.getX()-1][P2.getY()+1] == P1Six || board[P2.getX()-1][P2.getY()+1] == P1Seven || board[P2.getX()-1][P2.getY()+1] == P1Eight || board[P2.getX()-1][P2.getY()+1] == P1Nine || board[P2.getX()-1][P2.getY()+1] == P1Ten || board[P2.getX()-1][P2.getY()+1] == P1Eleven || board[P2.getX()-1][P2.getY()+1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder) || (P2.getX() == 7 && choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == P1One || board[P2.getX()-1][P2.getY()+1] == P1One || board[P2.getX()-1][P2.getY()+1] == P1Three || board[P2.getX()-1][P2.getY()+1] == P1Four || board[P2.getX()-1][P2.getY()+1] == P1Five || board[P2.getX()-1][P2.getY()+1] == P1Six || board[P2.getX()-1][P2.getY()+1] == P1Seven || board[P2.getX()-1][P2.getY()+1] == P1Eight || board[P2.getX()-1][P2.getY()+1] == P1Nine || board[P2.getX()-1][P2.getY()+1] == P1Ten || board[P2.getX()-1][P2.getY()+1] == P1Eleven || board[P2.getX()-1][P2.getY()+1] == P1Twelve) && board[P2.getX()-2][P2.getY()-2] == placeholder))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
          {
            P2.kingUpRight();
            P2.kingUpRight();
            board[P2.getX()+1][P2.getY()-1] = placeholder;
            board[P2.getX()+2][P2.getY()-2] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P1count--;
            killcounter = 1;
            P2kingMove(P2); 
          }
        }
        //left boundary
        else if ((P2.getY() == 0 && choice.equals("UpL")) || (P2.getY() == 0 && choice.equals("DownL")))
        {
          System.out.println("You can only move right.");
        }
        else if (P2.getY() == 0 && choice.equals("UpR"))
        {
          if (choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingUpRight(); 
            board[P2.getX()+1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
          else
          {
            System.out.println("You can't move there."); 
          }
        }
        else if (P2.getY() == 0 && choice.equals("DownR"))
        {
          if (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingDownRight(); 
            board[P2.getX()-1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
          else
          {
            System.out.println("You can't move there."); 
          }
        }
        
        //right boundary
        if ( (P2.getY() == 7 && choice.equals("UpR")) || (P2.getY() == 7 && choice.equals("DownR"))) 
        {
          System.out.println("You can only move left.");
        }
        else if (P2.getY() == 7 && choice.equals("UpL"))
        {
          if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingUpLeft(); 
            board[P2.getX()+1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
          else
          {
            System.out.println("You can't move there."); 
          }
        }
        else if (P2.getY() == 7 && choice.equals("DownL"))
        {
          if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingDownLeft(); 
            board[P2.getX()-1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
          else
          {
            System.out.println("You can't move there."); 
          }
        }
        
        //no boundary
        else if (P2.getX() == 1 || P2.getX() == 6)
        {
          if (choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingUpRight(); 
            board[P2.getX()+1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }            
          else if (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingDownRight(); 
            board[P2.getX()-1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }      
          else if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingUpLeft(); 
            board[P2.getX()+1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingDownLeft(); 
            board[P2.getX()-1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
        }
        //upper and lower boundary movement
        else if (P2.getX() == 0)
        {
          if (choice.equals("DownR") && (board[P2.getX()+1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingDownRight(); 
            board[P2.getX()-1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;       
          }      
          
          else if (choice.equals("DownL") && (board[P2.getX()+1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingDownLeft(); 
            board[P2.getX()-1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("DownL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }
        }
        else if (P2.getX() == 7)
        {
          if (choice.equals("UpR") && (board[P2.getX()-1][P2.getY()+1] == placeholder) && killcounter != 1)
          {
            P2.kingUpRight(); 
            board[P2.getX()+1][P2.getY()-1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpR") && killcounter == 1)
          {
            System.out.println("No more kills avaiable");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }   
          else if (choice.equals("UpL") && (board[P2.getX()-1][P2.getY()-1] == placeholder) && killcounter != 1)
          {
            P2.kingUpLeft(); 
            board[P2.getX()+1][P2.getY()+1] = placeholder;
            board[P2.getX()][P2.getY()] = P2;
            P2run = false;
            P1run = true;
          }
          else if (choice.equals("UpL") && killcounter == 1)
          {
            System.out.println("No more kills available.");
            killcounter = 0;
            P2run = false;
            P1run = true;
          }   
        }
        else
        {
          System.out.println("You can't move there."); 
        }    
      }
    }
  }
}







