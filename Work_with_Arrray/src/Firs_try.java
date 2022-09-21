import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Firs_try {
    private String y_word;


    public void setY_word(String y_word1) {
        y_word = y_word1;
    }

    public String getY_word() {
        return y_word;
    }

    public String srtoka() {
        Scanner console = new Scanner(System.in);
        String srtoka = console.nextLine();
        return srtoka;

    }



    public static void main(String[] args) {
        String num=null;
        Firs_try Ft = new Firs_try();
        Search sea = new Search();
        num=Ft.srtoka();
        switch (num){
            case "first":
                System.out.println(sea.sub(Ft.srtoka(),Ft.srtoka()));
                break;
            case "second":
                sea.sub2(Ft.srtoka(),Ft.srtoka());
                break;


        }



        //System.out.println(sea.sub(Ft.srtoka(),Ft.srtoka()));
        //sea.sub2(sea.split());
    }

}

class Search {


    public String[] split() {
        Firs_try Ft = new Firs_try();
        Ft.setY_word(Ft.srtoka());

        String str = Ft.getY_word();
        String[] words = str.split("");
        return words;
    }


    public static boolean sub(String string, String substring) {
        // Keep track of our position in the string.
        int index = 0;

        // Выполните итерацию по всем символам в подстроке.
        for (char character : substring.toCharArray()) {
            // Найдите текущий символ, начиная с последнего символа, на котором мы остановились.
            index = string.indexOf(character, index);
            // Если метод вернул значение -1, символ не был найден, поэтому результат равен false.
            if (index == -1)
                return false;
        }

        // Если мы достигнем этой точки, это означает, что все символы были найдены, так что результат верен.
        return true;
    }

    public void sub2(String string,String substring) {




           System.out.println(string.contains(substring));




    }
}

