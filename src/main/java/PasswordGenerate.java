import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerate {

    private final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private Random random = new Random();

    public StringBuilder generate(int passwordSize){

        StringBuilder password = new StringBuilder();
        List<String> symbolList = new ArrayList<String>(2);
        symbolList.add(LOWER);
        symbolList.add(UPPER);

        for (int i = 0; i < passwordSize ;i++){
            String charCategory = symbolList.get(random.nextInt(symbolList.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return password;
    }
}
