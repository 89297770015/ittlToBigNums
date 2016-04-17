/**
 * Created by Андрей on 17.04.2016.
 */
public class TestLitlToBig {
    /*
    даны цыфрв 0..9
    нужно напечатать их в виде
    [0, 0, 1, 0, 0]
    [0, 0, 1, 0, 0]
    [0, 0, 1, 0, 0]
    [0, 0, 1, 0, 0]
    [0, 1, 1, 1, 0]

    [0, 0, 2, 0, 0]
    [0, 2, 0, 2, 0]
    [0, 0, 2, 0, 0]
    [0, 2, 0, 0, 0]
    [0, 2, 2, 2, 0]
    и т.д
    * */

    public static void main(String[] args){
        LitlToBig ltb = new LitlToBig();
        ltb.print(1);
        System.out.println();
        ltb.print(2);
    }


}
