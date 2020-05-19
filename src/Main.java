
public class Main {
    public static void main(String[] args) {
        int i = 10;
        //System.out.println(testLamda(i,()->System.out.println("HEHE")));
        testLamda(i,()->System.out.println("HEHE"));
        Imyinterface inter = ()->System.out.println("HEHE");
        inter.test();
    }
    static void testLamda(int i,Imyinterface interfaceMine){
        interfaceMine.test();
    }
}
interface Imyinterface{
    public void test();
}


