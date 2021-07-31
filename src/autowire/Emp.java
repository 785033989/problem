package autowire;

/**
 * @author zhazhahui
 * @create 2021-07-23 15:45
 */
public class Emp {
    private Dept dept;



    public void setDept(Dept dept) {
        System.out.println("这也行？？？");
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
    public void test(){
        System.out.println(dept);
    }
}
