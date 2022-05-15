import java.util.*;
import java.io.*;
import java.lang.*;

class Player_X{
    boolean topright(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][0]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean topmiddle(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][1]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean topbottom(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][2]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_first(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[0][i]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_middle(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[1][i]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_last(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[2][i]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean diagonal1(String[][] board,int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][i]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean diagonal2(String[][] board,int grid)
    {
        int win=0;
        for(int i=grid-1,j=0;i>=0 && j<grid;i--,j++)
        {
            if(board[i][j]=="  X ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    public void Winner(String[][] board,int grid)
    {
        if(topright(board,grid) || topmiddle(board,grid) || topbottom(board,grid) || c_first(board, grid) || c_middle(board,grid) ||c_last(board, grid) || diagonal1(board,grid) || diagonal2(board, grid))
        {
            System.out.println("Hurray! Player Two Wins");
            System.exit(0);
        }


    }

    void fill(String[][] board,int index1,int index2,Scanner sc,int grid)
    {
        int played;
        while(board[index1][index2]!=null)
        {
            System.out.println("It is already marked please press another key");
            played=sc.nextInt();
            index1=(played-1)/grid;
            index2=(played-1)%grid;
        }
        board[index1][index2]="  X ";
    }
}
class Player_O{

    void fill(String[][] board,int index1,int index2,Scanner sc,int grid)
    {
        int played;
        while(board[index1][index2]!=null)
          {
              System.out.println("It is already marked please press another key");
              played=sc.nextInt();
              index1=(played-1)/grid;
              index2=(played-1)%grid;
          }

            board[index1][index2]="  O ";
    }
    boolean topright(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
                if(board[i][0]=="  O ")
            {
                win++ ;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean topmiddle(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][1]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean topbottom(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][2]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_first(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[0][i]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_middle(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[1][i]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean c_last(String board[][],int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[2][i]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean diagonal1(String[][] board,int grid)
    {
        int win=0;
        for(int i=0;i<grid;i++)
        {
            if(board[i][i]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    boolean diagonal2(String[][] board,int grid)
    {
        int win=0;
        for(int i=grid-1,j=0;i>=0 && j<grid;i--,j++)
        {
            if(board[i][j]=="  O ")
            {
                win++;
            }
        }
        if(win==grid)
        {
            return true;
        }
        return false;
    }
    public void Winner(String[][] board,int grid)
    {
        if(topright(board,grid) || topmiddle(board,grid) || topbottom(board,grid) || c_first(board, grid) || c_middle(board,grid) ||c_last(board, grid) || diagonal1(board,grid) || diagonal2(board, grid))
        {
            System.out.println("Hurray! Player One Wins");
            System.exit(0);
        }


    }

}

public class XOGame {
    static final int grid = 3;
    static String[][] board = new String[grid][grid];
    public static void Game_Board()
    {
        System.out.println("\n=========================================");
        System.out.println("       >>>>>    XO BOARD     <<<<");
        System.out.println("=========================================\n");

        int c=0;
        for(int i=0;i<grid;i++) {
            c=1;
            System.out.print("  >>           ");
            for (int j = 0; j < grid; j++) {
                if(c==grid)
                {
                    System.out.print(board[i][j]);
                }
                else {
                    System.out.print(board[i][j] + "  |  ");
                }
                c++;
            }
            System.out.println("\n");

        }
    }
    public static void instruction() {
        System.out.println();
        System.out.println("\n=================================================");
        System.out.println("       >>>>>    XO BOARD INSTRUCTION     <<<<");
        System.out.println("==================================================\n");
        int c = 0;
        int number=1;
        for (int i = 0; i < grid; i++) {
            c = 1;
            System.out.print("  >>        ");
            for (int j = 0; j < grid; j++) {
                if (c == grid) {
                    System.out.print("Press" + number);
                } else {
                    System.out.print("Press" + number+"   | ");
                }
                c++;
                number++;
            }
            System.out.println("\n");

        }
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        instruction();
        Game_Board();
        System.out.println("=====================================");
        System.out.println("Game starts");
        System.out.println(">>  Player 1 will marked as O and Player 2 will marked as X");
        int turns=grid*grid,player_turn=1;
        int played,index1,index2;
        while(turns!=0)
        {
            if(player_turn%2==0)
            {
                System.out.println("Player 2's turn");
                played = sc.nextInt();
                index1=(played-1)/grid;
                index2=(played-1)%grid;
                while(!(played<=9 && played>0) && (board[index1][index2]==null || board[index1][index2]!="O")){
                    instruction();
                    System.out.println("Please check the instruction and Press the correct key");
                    played = sc.nextInt();
                    index1=(played-1)/grid;
                    index2=(played-1)%grid;
                }
                Player_X Player2 = new Player_X();
                Player2.fill(board,index1,index2,sc,grid);

                Game_Board();
                Player2.Winner(board,grid);
            }
            else{
                System.out.println("Player 1's turn");
                played = sc.nextInt();
                index1=(played-1)/grid;
                index2=(played-1)%grid;
                while(!(played<=9 && played>0)){
                    instruction();
                    System.out.println("Please check the instruction and Press the correct key");
                    played = sc.nextInt();
                    index1=(played-1)/grid;
                    index2=(played-1)%grid;
                }

                Player_O Player1 = new Player_O();
                Player1.fill(board,index1,index2,sc,grid);
                Game_Board();
                Player1.Winner(board,grid);
            }


            player_turn++;
            turns--;
        }
        System.out.println("===DRAW===");

    }
}
