package Ch08;

public class Inheritance04 {
    public static void main(String[] args) {
        
        SubSon objSon = new SubSon();
        objSon.printSon();
        objSon.printFather();

        SubDaughter objDaughter = new SubDaughter();
        objDaughter.printDaughter();
        objSon.printFather();
    }
    
}
