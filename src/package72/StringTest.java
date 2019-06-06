package package72;

import java.util.stream.IntStream;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/23 14:19
 * @Version 1.0
 */

public class StringTest {

    @Override
    public String toString() {
        return "" + super.toString();
    }

    public static void main(String[] args) {
        //System.out.println(new StringTest());

        var a = "abcdefghijklmnopqrstuvwxyz";
        var b = new char[10];
        a.getChars(0, 2, b, 1);
        byte[] bytes = a.getBytes();
        for (var i : bytes) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(new String(bytes));
        var str = new String(b);
        System.out.println(str);
    }


    private static class Eqi {
        public static void main(String[] args) {
            var str1 = "AbcDeFgh";
            var str2 = "aBCdEfGH";
            System.out.println(str1.equalsIgnoreCase(str2));
        }
    }


    private static class Com {
        public static void main(String[] args) {
            var str1 = "abcdef";
            var str2 = "aadfgh";
            System.out.println(str1.compareTo(str2));
            System.out.println(str1.contains("a"));
        }
    }


    private static class ContentsEquals {
        public static void main(String[] args) {
            var str1 = "abc";
            var str2 = "abc";
            var sb1 = new StringBuilder("abc");
            System.out.println(str1.contentEquals(sb1)); //equals只能比较string对象 ，contentEquals 可以比较StringBuilder对象。

        }
    }

    private static class EqualsIgnoreCase {
        public static void main(String[] args) {
            var str1 = "aBcdEfGhIjKl";
            var str2 = "AbCDeFgHIjKL";
            System.out.println(str1.equalsIgnoreCase(str2));
        }
    }

    private static class RegionMatcher {
        public static void main(String[] args) {
            var str1 = "一条龙";
            var str2 = "一只猪";
            System.out.println(str1.regionMatches(0, str2, 0, 1));
            var str3 = "abcdefgh";
            var str4 = "bcdefGh";
            System.out.println(str3.regionMatches(true, 1, str4, 0, str4.length()));
        }
    }

    private static class StartsWith {
        public static void main(String[] args) {
            var str1 = "abcdefg";
            System.out.println(str1.startsWith("a"));
            System.out.println(str1.startsWith("b", 1));
        }
    }

    private static class EndWith {
        public static void main(String[] args) {
            var str1 = "abcdefg";
            System.out.println(str1.endsWith("g"));
            short a = 'a';
            System.out.println(Integer.MAX_VALUE);
        }
    }


    private static class IndexOf {
        public static void main(String[] args) {
            var str1 = "aaa luck 2019";
            var i = str1.indexOf(97); //
            System.out.println(i);
            var j = str1.indexOf('a', 3);
            System.out.println(j);
            var k = str1.indexOf("luck");
            System.out.println(k);
            var l = str1.lastIndexOf("a");
        }
    }

    private static class SubString {
        public static void main(String[] args) {
            var str1 = "打篮球";
            var i = str1.substring(1);
            System.out.println(i);
            var j = str1.substring(1, 2);
            System.out.println(j);
        }
    }

    private static class Equals {
        public static void main(String[] args) {
            var str1 = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDO94yBttei6vhApPX4OqsrS/UKyHYkUiwr7BeLJQKX65kEeBBZJu1B3q+b6bEYzc5XLUL8ih+qLtwlqki4OsDn48iJ1DXpskAafCPLx4OnTHsn3i1yqy04CJSsnhvFRrlrt515zrGInOhpcixBkdL0xGZScq8sxl/QqgwRFmw+cltkKQuyKjfy/8kxdQeu4c/niY0cQyOwf0+CiNS+jGEmnVSM19ysMMpxdJ9m6TlopfLsmUmXDxbMuhWbjexDuU98MmXniSfvWZCRBOYxMghy6fVJN+fdTHZGuX03nO+htHEIN2D2uRKng4+spSNXSiyxs/Q+3I4bYIbsyolSMukJ 121086062@qq.com";
            var str2 = "";
        }
    }
}

