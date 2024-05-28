package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
//        jt.수업하기();
        Teacher ht = new HtmlTeacher();
        ht.수업하기();
    }
}
