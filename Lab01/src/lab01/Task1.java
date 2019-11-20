package lab01;


public class Task1 {
    public static void main(String[] args) {
        //Question 4
        String yodaSays = "Do. Or do not. There is no try.";
        
        int number = 0;
        
        // add code here
        
        for(int i = 0; i < yodaSays.length(); i++) {
            if (yodaSays.toLowerCase().charAt(i) == 'o') {
                number++;
            }
        }
        
        System.out.println("There are " + number + " o's in " + yodaSays);
    }
}