import java.util.Scanner;

public class CreateRandomCode {

    public static final int BITS = 6; // 随机数位数

    /**
     * 获取随机数字符串
     * @return
     */
    public static String getRandom() {
        StringBuffer randomCode = new StringBuffer();
        for (int i = 0; i < BITS; i++) {
            randomCode.append((int) (Math.random()*10));
        }
        return randomCode.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if ("GET".equals(input)) {
            System.out.println(getRandom());
        }
        in.close();
    }

}
