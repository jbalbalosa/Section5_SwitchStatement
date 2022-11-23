public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Section 5: Switch Statements");
        int value = 1;
        if (value ==1){
            System.out.println("Value was 1");
        } else if (value ==2){
            System.out.println("Value was 2");
        } else{
            System.out.println("value was not 1 or 2");
        }

        int switchValue = 2;
        switch(switchValue){
            case 1:
                System.out.printf("value was 1");
                break;
            case 2:
                System.out.printf("value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

    }
}