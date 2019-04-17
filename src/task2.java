public class task2 {
    public static void main(String[] args) {
        char startPositionSymbol = 'd';
        int startPositionNumber = 5;

        char targetPositionSymbol = 'f';
        int targetPositionNumber = 6;

        String[][] mas = new String[8][8];

//        char a = 97;
    int numStartSymbol = Character.getNumericValue(startPositionSymbol) - 9;
    int numTargetSymbol = Character.getNumericValue(startPositionSymbol) - 9;
        System.out.print(numStartSymbol);

        if ((Math.abs(numTargetSymbol - numStartSymbol) == 2) & (Math.abs(targetPositionNumber - startPositionNumber) == 1))
            System.out.println("Ход возможен");
        if ((Math.abs(numTargetSymbol - numStartSymbol) == 1) & (Math.abs(targetPositionNumber - startPositionNumber) == 1))
            System.out.println("Ход возможен");
        else
            System.out.println("Ход не возможен");
    }
}

