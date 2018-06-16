package framework;

public class Helper {

    public static String getRandomTextCat() {

        return "mvCat" + (int) (Math.random() * 150 + 1);
    }

    public static String getRandomTextReg() {
        return "mvReg" + (int) (Math.random() * 200 + 1);
    }

    public static String getRandomTextPor() {
        return "mvPor" + (int) (Math.random() * 250 + 1);
    }

}
