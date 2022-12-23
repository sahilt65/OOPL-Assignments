/*
Identify commonalities and differences between Publication, Book and Magazine classes. Title,
Price, Copies are common instance variables and saleCopy is common method. The differences
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue,
receiveissue().Write a program to find how many copies of the given books are ordered and
display total sale of publication. 
*/

package Assignment3;
import java.util.Scanner;

class Publicaion{
    String title;
    int price, copies;


    int saleCopy(int copies, int price){
        return copies*price;
    }

}

class Book extends Publicaion{
    String author;
//    int bprice, bcopies;

    public void orderCopies(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of Book");
        title = sc.nextLine();

        System.out.println("Enter the name of Author");
        author = sc.nextLine();

        System.out.println("Enter number of Book copies");
        copies = sc.nextInt();

        System.out.println("Enter the price of Book");
        price = sc.nextInt();

    }


    int saleCopy() {
        System.out.println("Total Sale of Books is : ");
        return (copies* price);
    }
}


class Magzine extends Publicaion{
    String currIssue;
    int orderQty,mprice;

    public void recievedIssue(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of Magazines");
        title = sc.nextLine();

        System.out.println("Enter the Issue period of magazine");
        currIssue = sc.nextLine();

        System.out.println("Enter order quantity of magazines");
        orderQty = sc.nextInt();

        System.out.println("Enter the price of Magazine");
        price = sc.nextInt();
    }
    int saleCopy(){
        System.out.println("Total Sale of Magazines is : ");
        return (orderQty*price);
    }
}


public class assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        Book b = new Book();
        b.orderCopies();
        b.saleCopy();

        Magzine m = new Magzine();
        m.recievedIssue();
        m.saleCopy();
        int total = b.saleCopy() + m.saleCopy();
        System.out.println("The total sale of Books is\n"+ b.saleCopy());
        System.out.println("The total sale of Magazines is\n"+m.saleCopy());
        System.out.println("The total sale of the Publication is\n"+total);
    }
}
