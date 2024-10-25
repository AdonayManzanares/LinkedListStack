//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedListStack lstack = new LinkedListStack();
        lstack.push(5);
        System.out.println(lstack.peak());
        lstack.push(10);
        System.out.println(lstack.peak());
        lstack.pop();
        System.out.println(lstack.peak());
        lstack.push(50);
        lstack.push(20);
        System.out.println(lstack.peak());
        lstack.pop();
        System.out.println(lstack.peak());


    }
}