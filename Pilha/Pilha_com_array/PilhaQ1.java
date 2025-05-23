public class PilhaQ1 {
    public static void main(String[] args) {
        PilhaArray pp = new PilhaArray(10, 0);
            pp.push(5);
            pp.push(3);
            pp.pop();
            pp.push(2);
            pp.push(8);
            pp.pop();
            pp.pop();
            pp.push(9);
            pp.push(1);
            pp.pop();
            pp.push(7);
            pp.push(6);
            pp.pop();
            pp.pop();
            pp.push(4);
            pp.pop();
            pp.pop();
            System.out.println(pp.top());
    }
}
