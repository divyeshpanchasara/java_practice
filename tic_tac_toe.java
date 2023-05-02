import java.util.Scanner;


class player {
    public static char player1;
    public static char player2;
}

class board {
    public static char myBoard[] = {'0','1','2','3','4','5','6','7','8','9'};
}


public class tic_tac_toe {

    public static void game_Board(char a[]) {
        System.out.printf(" %c | %c | %c \n",a[7],a[8],a[9]);
        System.out.println(" ---------");
        System.out.printf(" %c | %c | %c \n",a[4],a[5],a[6]);
        System.out.println(" ---------");
        System.out.printf(" %c | %c | %c \n",a[1],a[2],a[3]);
    }

    public static void update_board(byte choice, byte p,char myBoard[]) {
        if(p==1) {
            myBoard[choice]=player.player1;
        }
        else {
            myBoard[choice]=player.player2;
        }
    }

    public static void user_input(byte p,char myBoard[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Player %d's choice: ",p);
        byte choice = sc.nextByte();
        update_board(choice,p,myBoard);
    }

    public static int check_row(char myBoard[]) {
        int a[]={1,4,7};
        for(int i =0;i<3;i++){
            int k = a[i];
            if(myBoard[k] == myBoard[k+1] && myBoard[k] == myBoard[k+2] && myBoard[k+1] == myBoard[k+2]){
                if(myBoard[k]==player.player1)
                    return 1;
                else
                    return 2;
            }
        }
        return 0;
    }

    public static int check_coloumn(char myBoard[]) {
        int a[]={1,2,3};
        for(int i =0;i<3;i++){
            int k = a[i];
            if(myBoard[k] == myBoard[k+3] && myBoard[k] == myBoard[k+6] && myBoard[k+3] == myBoard[k+6]){
                if(myBoard[k]==player.player1)
                    return 1;
                else
                    return 2;
            }
        }
        return 0;
    }

    public static int check_diagonal(char myBoard[]) {
        if(myBoard[7] == myBoard[5] && myBoard[7] == myBoard[3] && myBoard[5] == myBoard[3]){
            if(myBoard[5]==player.player1)
                return 1;
            else
                return 2;
        }
        if(myBoard[1] == myBoard[5] && myBoard[1] == myBoard[9] && myBoard[5] == myBoard[9]){
            if(myBoard[5]==player.player1)
                return 1;
            else
                return 2;
        }
        return 0;
    }

    public static int win_or_draw(char myBoard[]) {

        if(check_row(myBoard)==1 || check_coloumn(myBoard)==1 || check_diagonal(myBoard)==1) {
            System.out.println("Player 1 Wins The Game");
            return 0;
        }
        
        if(check_row(myBoard)==2 || check_coloumn(myBoard)==2 || check_diagonal(myBoard)==2) {
            System.out.println("Player 2 Wins The Game");
            return 0;
        }

        byte count=0;
        for(int i=1;i<10;i++){
            if(myBoard[i]=='X' || myBoard[i]=='O')
                count++;
        }
        if(count==9) {
            System.out.println("OOOPS! Its A Draw!!");
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter your choice X or O: "));
        player.player1 = sc.next().charAt(0);
        if(player.player1 == 'X'){
            player.player2 = 'O';
        }
        else{
            player.player1 = 'O';
            player.player2 = 'X';
        }

        char myboard[] = board.myBoard;
        game_Board(myboard); 
        byte p=1;
        boolean game_on = true;
        int result;
        while(game_on){
            if( p%2 == 0) { 
                p = 2;
            }
            else {
                p = 1;
            }

            user_input(p,myboard);
            game_Board(myboard);
            result = win_or_draw(myboard);
            if(result == 1){
                game_on = true;
            }
            else{
                game_on = false;
            }
            p++;
        }
        sc.close();
    }
}