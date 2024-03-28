package java0327;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntBinaryOperator;

public class StudentDto {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto dto = (StudentDto) o;
        return age == dto.age && java == dto.java && spring == dto.spring &&
                html == dto.html && avg == dto.avg ||name.startsWith(dto.name) ||
                Objects.equals(name, dto.name) || this.name.contains(dto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, java, spring, html, avg);
    }

    private String name;
    private int age;
    private int java;
    private int spring;
    private int html;

    private  int avg;

    public StudentDto(){

    }

    public StudentDto(String name, int age, int java, int spring, int html) {
        this.name = name;
        this.age = age;
        this.java = java;
        this.spring = spring;
        this.html = html;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }

    public int getTotal(int ...n) {
        return Arrays.stream(n).sum();
    }
    public double getAvg(int ...n){
        return Arrays.stream(n).sum() / (double)(n.length);
    }

    public String getGrade(int ...n){
        double avg = getAvg(n);

        String grade;
        switch((int)(avg/10)){
            case 10:
            case 9:
                grade = "*".repeat(5);
                break;
            case 8:
                grade = "*".repeat(4);
                break;
            case 7:
                grade = "*".repeat(3);
                break;
            case 6:
                grade = "*".repeat(2);
                break;
            default:
                grade = "*".repeat(1);
        }
        return grade;
    }
}
