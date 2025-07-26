package Projects.Project2;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {

        VideoStore videoStore = new VideoStore();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice between 1 and 6: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of video which you want to add : ");
                    videoStore.addVideo(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter the name of video which you want to checkout : ");
                    videoStore.doCheckout(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the name of video which you want to return : ");
                    videoStore.doReturn(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the name of video which you want to give rating : ");
                    String name = sc.nextLine();
                    System.out.print("Rating for this video: ");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(name, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.print("Exit!! Thanks for reaching.");
                    break;
                default:
                    System.out.print("You entered wrong choice, please try again!");
            }
        }
        while (choice != 6);
    }
}
