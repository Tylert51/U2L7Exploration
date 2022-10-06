public class StringMethods {
    public static void main(String[] args) {
        String fire = "CRACKLE!";
        String witch = "CACKLE!";
        String str5 = fire.substring(2);
        System.out.println(str5);
        String str6 = witch.substring(witch.length() - 4);
        System.out.println(str6);
        int loc = str5.indexOf(str6);
        System.out.println(loc);
        String str7 = fire.substring(loc, loc + 3);
        System.out.println("the hidden word is: " + str7);





    }
}
