import java.util.Scanner;

public class Test {
    // 이 변수는 메서드 영역에 저장되는 정적 변수입니다.
    static int staticVar = 10;

    // 이 변수는 실행시 힙 영역에 저장되는 인스턴스 변수입니다.
    int instanceVar;

    // 생성자
    public Test(int var) {
        // 생성자의 매개변수는 스택에 저장됩니다.
        this.instanceVar = var;
    }

    // 메서드 호출시 각 매개변수는 스택 영역에 저장됩니다.
    public void show(int a) {
            // 로컬 변수는 메서드 호출 시 스택 영역에 저장됩니다.
            int localVar = a;
            System.out.println("Static Variable: " + staticVar);
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // 객체 생성 구문 'new'는 힙 영역에 저장되는 인스턴스를 생성합니다.
        Test example = new Test(5);
        // 메서드 호출은 스택 영역에 프레임을 생성합니다.
        example.show(20);
    }
}
