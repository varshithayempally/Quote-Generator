import java.util.Random;
public class Quotegenerator {
    public static void main(String[]args){
        String[]quotes={"The best way to predict the future is to invent it.",
        "Life is 10% what happens to us and 90% how we react to it.",
        "Success is not final,failure is not fatal:itis the courage to continue that counts.",
        "Believe you can and you're halfway there.",
        "Don't watch the clock;do what it does.keep going.",
        "Happiness is not something ready made.it comes from your own actions."};
        Random random=new Random();
        int RandomIndex=random.nextInt(quotes.length);
        System.out.println("here is your random quote:");
        System.out.println(quotes[RandomIndex]);
    }
    
}
