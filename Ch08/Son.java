package Ch08;

public class Son extends Father {
    String name = "홍길동";

    void printDetails() {
        System.out.println("나의 이름은 " + this.name);
        System.out.println("나의 아버지는 " + this.familyName);
        System.out.println("나의 집은 " + this.houseAddress);
    }
    
}
