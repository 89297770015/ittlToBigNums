import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Андрей on 17.04.2016.
 */
public class LitlToBig {

    private int[][] bigNum = new int[5][5];

    List<BigNums> bigNums = new ArrayList<BigNums>();
    private static final int[][] NUM_1 = {
        {0,0,1,0,0},
        {0,0,1,0,0},
        {0,0,1,0,0},
        {0,0,1,0,0},
        {0,1,1,1,0},
    };

    private static final int[][] NUM_2 = {
            {0,0,2,0,0},
            {0,2,0,2,0},
            {0,0,0,2,0},
            {0,0,2,0,0},
            {0,2,2,2,0},
    };




    public void setBigNum(int num) {
        if(num == 1) bigNums.add(new BigNums(num, NUM_1));
        if(num == 2) bigNums.add(new BigNums(num, NUM_2));
    }




    public void setRes(int num){
        if(num == 1) this.bigNum = NUM_1;
        if(num == 2) this.bigNum = NUM_2;
    }



    private String getLines(int[][] res) {
        for(int i = 0;i<res.length;i++) {
            System.out.println(Arrays.toString(res[i]));
        }
        return null;
    }



    public void print(int num) {
        setBigNum(num);
//        for(int i = 0; i<this.bigNum.length; i++) {
//            System.out.println(Arrays.toString(this.bigNum[i]));
//        }
        System.out.println(
                Arrays.deepToString(
                        bigNums.get(0).getBigNum()
                )
        );
    }

    public void print(int ... nums){
      //  for (int i : nums )
     }


}
