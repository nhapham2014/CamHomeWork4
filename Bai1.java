package camjava_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public String[] DS(String[] hoten) {
        List<String> kq = new ArrayList<>();
        for (String name : hoten) {
            name = name.toLowerCase();
            String[] arrayname = name.split(" ");
            for (int i = 0; i < arrayname.length; i++) {
                String element = arrayname[i];
                String firstChar = element.substring(0, 1).toUpperCase();
                arrayname[i] = firstChar + element.substring(1);
            }
            kq.add(String.join(" ", arrayname));
        }

        return kq.toArray(new String[0]);
    }

    @Test
    public void test_DSHOTEN() {
        String[] hoten = {"Hung tran", "lan le", "NGUYEN THI HIEN"};
        String[] expect = {"Hung Tran", "Lan Le", "Nguyen Thi Hien"};
        String[] actual = this.DS(hoten);
        Assert.assertArrayEquals(expect, actual);


    }
}
