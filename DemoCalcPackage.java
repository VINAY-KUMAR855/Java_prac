import calcPackage.AdvCalc;
import calcPackage.Calc;
// import calcPackage.*; // * means all files. remember not folders.
public class DemoCalcPackage {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        AdvCalc obj2 = new AdvCalc();
        System.out.println(obj1.add(2,3));
        System.out.println(obj2.div(4,2));
    }
}
