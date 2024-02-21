import org.junit.jupiter.api.*;

public class JUnitCycleTest{
    @BeforeAll //전체 테스트를 시작하기 전에 1회 실행하므로 메서드는 static으로 선언
    //딱 한번만 선언되는 애들은 static으로 선언해야함!
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach //테스트 케이스를 시작하기 전마다 실행
    //각 인스턴스에 대해 메서드를 호출해야하므로 static으로 선언되면 안됨
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }

    @AfterAll //전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach //얘도 static으로 선언 ㄴㄴ
    public void afterEach(){
        System.out.println("@AfterEach");
    }
}