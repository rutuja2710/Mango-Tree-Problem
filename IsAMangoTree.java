import java.util.*;

public class IsAMangoTree {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of rows in rectangle garden - ");
        int rows = scanner.nextInt();

        System.out.println("enter number of columns in rectangle garden - ");
        int columns = scanner.nextInt();

        System.out.println("enter number of tree to check mango tree or not - ");
        int treeNumber = scanner.nextInt();

        if(treeNumber<0 || treeNumber<=rows*columns) {
            // treeNumber<=columns - if mango tree is present in first row
            // treeNumber%columns==0 - if mango tree is present in last column
            // treeNumber%columns==1 - if mango tree is present in first column
            if (treeNumber <= columns || treeNumber % columns == 0 || treeNumber % columns == 1)
                System.out.println("YES! It is a mango tree.");
            else
                System.out.println("NO! It is not a mango tree.");
        }
        else
            System.out.println("Tree with entered number does not exit !");
    }
}
