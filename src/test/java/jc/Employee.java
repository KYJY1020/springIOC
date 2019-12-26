package jc;
import java.util.Date;
public class Employee {
    private String name;
    private Date hireDay;
    private Integer salary;
    public Employee(){
        System.out.println("执行Employee 的构造器 ");
    }
    public Employee(String name,Date hireDay,Integer salary){
        System.out.println("执行Employee 的有参数构造器");}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public void printInfo(){
        StringBuilder tmp=new StringBuilder();
        tmp.append("姓名：");
        tmp.append(getName());
        tmp.append("入职时间");
        tmp.append(getHireDay());
        tmp.append(",薪水标准");
        tmp.append(getSalary());
        System.out.println(tmp.toString());

    }
}
