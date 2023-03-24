package camjava_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai2_C2 {
    /*Viết giải thuật nhận vào một danh sách các số nguyên bất kỳ, hãy trả ra danh sách các số nguyên tố có trong dãy*/
    public boolean CheckSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
    public List<Integer> DSSoNT(Integer[] numbers){
        List<Integer> kq= Arrays.asList(numbers);
       kq= kq.stream().filter((so)->{
            return CheckSoNguyenTo(so);
        }).collect(Collectors.toList());
        return kq;

    }
    @Test
    public void Test_DSSoNT(){
        Integer[] numbers ={1, 2, 3, 8, 9, 11, 13, 15};
        Integer[] expect={2,3,11,13};
        List<Integer> actual=this.DSSoNT(numbers);
        Assert.assertArrayEquals(expect,actual.toArray(new Integer[0]));
    }
}
