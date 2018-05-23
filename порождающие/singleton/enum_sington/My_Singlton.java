package порождающие.singleton.enum_sington;

import java.util.Arrays;

public enum My_Singlton {
    INSTANCE;
    int value;
    private String[] favoriteSongs =
            { "Hound Dog", "Heartbreak Hotel" };

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }

}
