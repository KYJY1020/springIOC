package classObjects;
import org.testng.annotations.Test;
public class VarTest {
    public static int count=0;
    //index用来存放是当前类的第几个实例
    public int index;
    public VarTest(){

    }
    public VarTest(int index,int count){
    this.index=index;
    this.count=count;
    }
    @Test
    public  void testVar(){

    }
    public void println(){

    }

    public static void main(String [] args){
        VarTest v1=new VarTest();
        v1.index=1;
        VarTest.count++;
        System.out.println("当前创建第"+v1.index+"个实例，共"+VarTest.count+"个");
        VarTest v2=new VarTest();
        v2.index=1;
        v2.count++;
        System.out.println("当前创建第"+v2.index+"个实例，共"+VarTest.count+"个");
        VarTest v3=new VarTest(3,3);
        System.out.println("看到的index"+v3.index+"看到的count"+v3.count);

    }
}
