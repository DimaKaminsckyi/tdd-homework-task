import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerate {

    private final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String DIGITS = "0123456789";

    private Random random = new Random();

    public StringBuilder generate(int passwordSize) {

        if (passwordSize < 8) throw new PasswordGenerateException();

        StringBuilder password = new StringBuilder();
        List<String> symbolList = new ArrayList<>(3);
        symbolList.add(LOWER);
        symbolList.add(UPPER);
        symbolList.add(DIGITS);

        for (int i = 0; i < passwordSize ;i++){
            String charCategory = symbolList.get(random.nextInt(symbolList.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        return password;
    }
}
