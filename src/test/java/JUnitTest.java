import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest{
    @DisplayName("1 + 2는 3이다") //테스트 이름
    @Test
    public void junitTest(){

        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a+b);
    }

//    @DisplayName("2+4는 5이다")
//    @Test
//    public void junitTest2(){
//        int a=2;
//        int b=4;
//        int sum=5;
//
//        Assertions.assertEquals(sum, a+b);
//    }
}