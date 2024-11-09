package test.unit;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import test.HinhVuong;

public class MathUtilTest {

    @Test
    void test1(){
        Assertions.assertEquals(HinhVuong.chuVi(1),4);
    }
}
