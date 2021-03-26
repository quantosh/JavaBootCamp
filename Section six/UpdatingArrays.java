import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        String menuString = Arrays.toString(menu);

        // Creating new array that can hold 5 
        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++){
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
