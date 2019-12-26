package jc;
import java.util.Date;
public class Manager extends Employee {
    private Integer bonus;
    public Manager(){
        System.out.println("执行Manager的无参数的构造方法");
    }
    public Manager(String name, Date hireDay, Integer
                   salary, Integer bonus){
        super(name,hireDay,salary);
        this.bonus=bonus;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
    //子类可以覆盖父类的方法，我们称为复习或者覆盖，可以使用@override注解
    @Override
    public Integer getSalary( ){
        if(bonus==null){
            return super.getSalary();
        }
        return super.getSalary()+bonus;
    }
}
