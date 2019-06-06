/**
 * @ClassName VampireNum
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/23 14:49
 * @Version 1.0
 */

public class VampireNum {


    public static void main(String[] args) {

        VampireNum();
    }

    public static void VampireNum() {
        var k = 0;
        var n1 = 0;
        var n2 = 0;
        var bit_i = 0;
        var tenPlace_I = 10;
        for (var i = 10; i < 100; i++) {
            var array = new int[4];
            array[0] = bit_i;
            array[1] = tenPlace_I / 10;
            n1 = bit_i + tenPlace_I;
            if (bit_i == 9) {
                bit_i = 0;
                tenPlace_I = i + 1;
            } else {
                bit_i++;
            }
            var bit_j = 0;
            var tenPlace_j = 10;
            for (var j = 10; j < 100; j++) {
                array[2] = bit_j;
                array[3] = tenPlace_j / 10;
                n2 = bit_j + tenPlace_j;
                if (bit_j == 9) {
                    bit_j = 0;
                    tenPlace_j = j + 1;
                } else {
                    bit_j++;
                }
                k = n1 * n2;
                for (var a : array) {
                    System.out.print(a + " ");
                }
                System.out.println();
                System.out.println("-------");
                var newK = 0;
                if (k >= 1000) {
                    if (newK == k) {
                        System.out.println(k + " = " + n1 + " * " + n2);
                    }
                }
            }
        }
    }
}


/*
for (var c1 = 0; c1 < 4; c1++) {
        if (array[c1] == 0) {
        continue;
        } else {
        newK = array[c1] * 1000;
        for (var c2 = 0; c2 < 4; c2++) {
        if (c2 == c1) {
        continue;
        } else {
        newK += array[c2] * 100;
        for (var c3 = 0; c3 < 4; c3++) {
        if (c3 == c1 || c3 == c2) {
        continue;
        } else {
        newK += array[c3] * 10;
        for (var c4 = 0; c4 < 4; c4++) {
        if (c4 == c3 || c4 == c2 || c4 == c1) {
        continue;
        } else {
        newK += array[c4];
        if (newK == k) {
        System.out.println(k + " = " + n1 + " * " + n2);
        }
        }
        }
        }
        }
        }
        }
        }
        }*/
