import java.util.Scanner;
import java.lang.Math;

// class game which contains all functions
class game {
    public char[] user_input = new char[9];

    ////function to initilise the input array with board numbers
    void initialset() {
        user_input[0] = '1';
        user_input[1] = '2';
        user_input[2] = '3';
        user_input[3] = '4';
        user_input[4] = '5';
        user_input[5] = '6';
        user_input[6] = '7';
        user_input[7] = '8';
        user_input[8] = '9';
    }

    ///function to set the input of user
    void setter(int k, int n) {
        if (k == 1) {
            user_input[n - 1] = 'X';
        } else {
            user_input[n - 1] = 'O';
        }
    }

    //function to print the values stored in user input array
    void print() {
        System.out.println(" " + user_input[0] + "  |  " + user_input[1] + "  |  " + user_input[2]);
        System.out.println("---------------");
        System.out.println(" " + user_input[3] + "  |  " + user_input[4] + "  |  " + user_input[5]);
        System.out.println("---------------");
        System.out.println(" " + user_input[6] + "  |  " + user_input[7] + "  |  " + user_input[8]);

    }

    ////function to check the winning of player X
    void check_winner_X() {
        if (user_input[0] == 'X') {
            if (user_input[1] == 'X' && user_input[2] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
            if (user_input[3] == 'X' && user_input[6] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);

            }
        }
        if (user_input[4] == 'X') {
            if (user_input[3] == 'X' && user_input[5] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
            if (user_input[1] == 'X' && user_input[7] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
            if (user_input[6] == 'X' && user_input[2] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
            if (user_input[0] == 'X' && user_input[8] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
        }
        if (user_input[8] == 'X') {
            if (user_input[5] == 'X' && user_input[2] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }
            if (user_input[7] == 'X' && user_input[6] == 'X') {
                System.out.println("player X won the match");
                System.exit(0);
            }

        }


    }

    //function to check the wiinning of player Y
    void check_winner_Y() {
        if (user_input[0] == 'O') {
            if (user_input[1] == 'O' && user_input[2] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
            if (user_input[3] == 'O' && user_input[6] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
        }

        if (user_input[4] == 'O') {
            if (user_input[3] == 'O' && user_input[5] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
            if (user_input[1] == 'O' && user_input[7] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
            if (user_input[6] == 'O' && user_input[2] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
            if (user_input[0] == 'O' && user_input[8] == 'O') {
                System.out.println("player Y won the match");
                System.exit(0);
            }

        }
        if (user_input[8] == 'Y') {
            if (user_input[5] == 'Y' && user_input[2] == 'Y') {
                System.out.println("player Y won the match");
                System.exit(0);
            }
            if (user_input[7] == 'Y' && user_input[6] == 'Y') {
                System.out.println("player Y won the match");
                System.exit(0);
            }

        }
    }


    void check_center() {
        if (user_input[4] != 'X') {
            user_input[4] = 'O';
        } else {
            user_input[0] = 'O';
        }
    }

    //function to check  postions of player x for computer vs palyer mode
    Boolean twins() {
        if (user_input[0] == 'X' && user_input[1] == 'X') {
            if (user_input[2] == '3') {
                user_input[2] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[1] == 'X' && user_input[2] == 'X') {
            if (user_input[0] == '1') {
                user_input[0] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[0] == 'X' && user_input[2] == 'X') {
            if (user_input[1] == '2') {
                user_input[1] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[3] == 'X' && user_input[4] == 'X') {
            if (user_input[5] == '6') {
                user_input[5] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[4] == 'X' && user_input[5] == 'X') {
            if (user_input[3] == '4') {
                user_input[3] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[3] == 'X' && user_input[5] == 'X') {
            if (user_input[4] == '5') {
                user_input[4] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[6] == 'X' && user_input[7] == 'X') {
            if (user_input[8] == '9') {
                user_input[8] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[7] == 'X' && user_input[8] == 'X') {
            if (user_input[6] == '7') {
                user_input[6] = 'O';
                return true;
            } else {
                return false;
            }

        } else if (user_input[6] == 'X' && user_input[8] == 'X') {
            if (user_input[7] == '8') {
                user_input[7] = 'O';
                return true;
            } else {
                return false;
            }
        }
        //////////////////////////////////////////////////////
        else if (user_input[0] == 'X' && user_input[3] == 'X') {
            if (user_input[6] == '7') {
                user_input[6] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[6] == 'X' && user_input[3] == 'X') {
            if (user_input[0] == '1') {
                user_input[0] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[0] == 'X' && user_input[6] == 'X') {
            if (user_input[3] == '4') {
                user_input[3] = 'O';
                return true;
            } else {
                return false;
            }
        }
        //////////////////////////////////////////////////////////////
        else if (user_input[6] == 'X' && user_input[8] == 'X') {
            if (user_input[7] == '8') {
                user_input[7] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[1] == 'X' && user_input[4] == 'X') {
            if (user_input[7] == '8') {
                user_input[7] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[4] == 'X' && user_input[7] == 'X') {
            if (user_input[1] == '2') {
                user_input[1] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[1] == 'X' && user_input[7] == 'X') {
            if (user_input[4] == '5') {
                user_input[4] = 'O';
                return true;
            } else {
                return false;
            }
        }
        //////////////////////////////////////////////////

        else if (user_input[2] == 'X' && user_input[5] == 'X') {
            if (user_input[8] == '9') {
                user_input[8] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[5] == 'X' && user_input[8] == 'X') {
            if (user_input[2] == '3') {
                user_input[2] = 'O';
            }
        } else if (user_input[2] == 'X' && user_input[8] == 'X') {
            if (user_input[5] == '6') {
                user_input[5] = 'O';
                return true;
            } else {
                return false;
            }
        }
        //////////////////////////////////////////////////////////////

        else if (user_input[0] == 'X' && user_input[4] == 'X') {
            if (user_input[8] == '9') {
                user_input[8] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[4] == 'X' && user_input[8] == 'X') {
            if (user_input[0] == '1') {
                user_input[0] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[0] == 'X' && user_input[8] == 'X') {
            if (user_input[4] == '5') {
                user_input[4] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[2] == 'X' && user_input[4] == 'X') {
            if (user_input[6] == '7') {
                user_input[6] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[4] == 'X' && user_input[6] == 'X') {
            if (user_input[2] == '3') {
                user_input[2] = 'O';
                return true;
            } else {
                return false;
            }
        } else if (user_input[6] == 'X' && user_input[2] == 'X') {
            if (user_input[4] == '5') {
                user_input[4] = 'O';
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    void random() {
        int rand = (int) (Math.random() * 9 + 0);
        if (user_input[rand] != 'X' && user_input[rand] != 'O') {
            user_input[rand] = 'O';
        } else {
            random();
        }
    }
}

public class TicTacToe {
    public static void main(String[] args) {

        System.out.println("Enter 0 to play with computer and 1 to play player vs player");
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        game g = new game();
        System.out.println("welcome to tic tac toe game . Enter the numbers mentioned in the table to put your sign there  ");
        g.initialset();
        g.print();
        int count = 0;
        if (type == 1) {
            while (true) {
                count++;
                System.out.println("Enter your no (Player X)");
                Scanner sc = new Scanner(System.in);
                int input_x = sc.nextInt();
                g.setter(1, input_x);
                g.check_winner_X();
                g.print();
                if (count == 9) {
                    System.out.println("No one wins ");
                    return;
                } else {
                    System.out.println("Enter your no (Player O)");
                    count++;
                    int input_y = sc.nextInt();
                    g.setter(0, input_y);
                    g.check_winner_Y();
                    g.print();
                }
            }
        } else {
            count++;
            System.out.println("enter your no ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            g.setter(1, x);
            g.print();
            System.out.println("computer turn ");
            g.check_center();
            g.print();
            for (int i = 0; i < 4; i++) {


                count++;
                System.out.println("enter your no ");
                x = sc.nextInt();
                g.setter(1, x);
                g.print();
                g.check_winner_X();

                if (count != 5) {
                    System.out.println("computer turn");
                    if (g.twins() == true) {
                        g.print();

                    } else {
                        g.random();
                        g.print();
                    }
                    g.check_winner_Y();
                } else {
                    System.out.println("match draw");
                }

            }
        }
    }
}



