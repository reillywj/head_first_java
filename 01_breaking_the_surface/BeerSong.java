public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;

        while(beerNum > 0) {
            main_stanza(beerNum);
            beerNum--;
            last_stanza(beerNum);
        }
    }

    public static String phrase(int num) {
        if (num == 1) return 1 + " bottle of beer";
        else          return num + " bottles of beer";
    }

    private static void main_stanza(int num) {
        String phrase = phrase(num);
        System.out.println(phrase + " on the wall,");
        System.out.println(phrase + ".");
        System.out.println("Take one down.\nPass it around.");
    }

    private static void last_stanza(int num) {
        if (num > 0) System.out.println(phrase(num) + " on the wall.");
        else         System.out.println("No more bottles of beer on the wall.");
    }
}
