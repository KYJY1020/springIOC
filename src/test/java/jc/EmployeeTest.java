package jc;

import org.testng.annotations.Test;

import java.util.Date;

public class EmployeeTest {
    @Test
    public void testPrint(){
        Employee  yg1=new Employee();
       yg1.setHireDay(new Date());
        yg1.setName("员工1");
        yg1.setSalary(100);
        yg1.printInfo();
        Manager jl1=new Manager();
          jl1.setName("经理1");
          jl1.setHireDay(new Date());
          jl1.setSalary(100);
          jl1.setBonus(50);
         jl1.printInfo();
    }

}
