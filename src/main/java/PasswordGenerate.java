public class PasswordGenerate {

    private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public StringBuilder generate(int passwordSize){

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordSize;i++){
            password.append(alphabet[(int) (Math.random() * 26)]);
        }
        return password;
    }
}
