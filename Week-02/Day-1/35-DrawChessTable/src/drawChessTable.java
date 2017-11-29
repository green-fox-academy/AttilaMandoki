public class drawChessTable {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
/*
Crate a program that draws a chess table like this

% % % %
 % % % %
% % % %
 % % % %
% % % %
 % % % %
% % % %
 % % % %

*/


/*  #SortOfCheating

for (int i = 0; i < 8; i++){
        if (i % 2 == 0) {
        System.out.println("%%%%");
        } else {
        System.out.println(" %%%%");
        }
        }
*/