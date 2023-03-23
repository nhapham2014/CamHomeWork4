package camjava_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Bai3 {
    /*Viết giải thuật nhận vào một danh sách các ký tự bất kỳ, hãy tính tổng các số có trong dãy đó*/
    public int Tong(String[] DS) {
        int tong = 0;
        for (String kytu : DS) {
            if (Character.isDigit(kytu.charAt(0))) {
                int number = Integer.parseInt(kytu);
                tong = tong + number;
            }
        }
        return tong;
    }

    @Test
    public void Test_Tong() {
        String[] DS = {"A", "i", "12", "!", "8", "0", "h", "96"};
        int expect = 116;
        int actual = this.Tong(DS);
        Assert.assertEquals(expect, actual);
    }
}
