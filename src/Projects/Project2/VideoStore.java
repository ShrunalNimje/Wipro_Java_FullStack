package Projects.Project2;

public class VideoStore {

    Video[] store = new Video[10];
    int count = 0;

    public void addVideo(String name) {
        store[count++] = new Video(name);
        System.out.println("Video \"" + name + "\" added successfully!");
    }

    public void doCheckout(String name) {
        for(int i = 0; i < count; i++) {
            if(store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name +"\" checkout successfully!");
                return;
            }
        }
        System.out.println("\"" + name + "\" Video not found!");
    }

    public void doReturn(String name) {
        for(int i = 0; i < count; i++) {
            if(store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name +"\" return successfully!");
                return;
            }
        }
        System.out.println("\"" + name + "\" Video not found!");
    }

    public void receiveRating(String name, int rating) {
        for(int i = 0; i < count; i++) {
            if(store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Video \"" + name +"\" receive rating successfully!");
                return;
            }
        }
        System.out.println("\"" + name + "\" Video not found!");
    }

    public void listInventory() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Video Name \t | Checkout Status \t | Rating ");
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].getName() + "\t | \t " + store[i].getCheckout() + "\t | \t " + store[i].getRating());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
