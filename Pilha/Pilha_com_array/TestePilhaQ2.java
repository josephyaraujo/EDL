public class TestePilhaQ2 {
    public static void main(String[] args) {
        PilhaArray tt = new PilhaArray(1, 10);
        long timeI = System.currentTimeMillis();
        for (int i = 0; i< 1000000; i++){
            tt.push(i); 
        }
        System.out.println("Tempo final FC 10: "+(System.currentTimeMillis()-timeI));

        PilhaArray cc = new PilhaArray(1, 100);
        long timeC = System.currentTimeMillis();
        for (int i = 0; i< 1000000; i++){
            cc.push(i); 
        }
        System.out.println("Tempo final FC 100: "+(System.currentTimeMillis()-timeC));

        PilhaArray mm = new PilhaArray(1, 1000);
        long timeM = System.currentTimeMillis();
        for (int i = 0; i< 1000000; i++){
            mm.push(i);   
        }
        System.out.println("Tempo final FC 1000: "+(System.currentTimeMillis()-timeM));

        PilhaArray dd = new PilhaArray(1, 0);
        long timeD = System.currentTimeMillis();
        for (int i = 0; i< 1000000; i++){
            dd.push(i); 
        }
        System.out.println("Tempo final Dup: "+(System.currentTimeMillis()-timeD));
    }
}
