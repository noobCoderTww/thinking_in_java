package package70;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ause on 2019-05-06.
 * 对一组学生进行筛选，只选取分数大于等于90分的学生，并按倒叙排列
 */


class Student {
    Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String toString() {
        return score + "";
    }
}


public class StreamDemo1_ScoreFilter {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Student> resultList = new ArrayList<>();
        List<Student> resultList2 = new ArrayList<>();

        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();
        Student stu5 = new Student();

        stu1.setScore(90);
        stu2.setScore(89);
        stu3.setScore(76);
        stu4.setScore(100);
        stu5.setScore(91);

        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);

        System.out.println("原始结果集:" + studentList);

        //传统的做法，迭代，挨个判断
        for (Student stu : studentList
        ) {
            if (stu.getScore() >= 90) {
                resultList.add(stu);
            }
        }

        //再对对结果集排序
        resultList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore().compareTo(o1.getScore());
            }
        });

        System.out.println("处理后的结果集:" + resultList);

        //stream结合lambda的方式
        resultList2 =
                studentList.stream().filter(stu -> stu.getScore() >= 90).sorted((s1, s2) -> s2.getScore().compareTo(s1.getScore())).collect(Collectors.toList());
        System.out.println("处理后的结果集:" + resultList2);

        //stream只能用一次
        Stream<Student> stream = studentList.stream();
        //第一次
        System.out.println("第一次使用流遍历");
        stream.map(student -> student.getScore() * 2).forEach(System.out::println);
        //第二次
        System.out.println("第二次使用同一个流遍历");
        stream.forEach(System.out::println);
    }


}

