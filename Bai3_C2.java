package camjava_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai3_C2 {
    /*Viết giải thuật nhận vào một danh sách các ký tự bất kỳ, hãy tính tổng các số có trong dãy đó*/
    public int Tong(String[] DS) {
        int Tong;
        List<String> so = Arrays.asList(DS);
        List<Integer> kq = new ArrayList<>();
        Tong = so.stream().filter(n -> Character.isDigit(n.charAt(0))).mapToInt(Integer::parseInt).sum();

        return Tong;
    }

    @Test
    public void Test_Tong() {
        String[] DS = {"A", "i", "12", "!", "8", "0", "h", "96"};
        int expect = 116;
        int actual = this.Tong(DS);
        Assert.assertEquals(expect, actual);

    }
}
