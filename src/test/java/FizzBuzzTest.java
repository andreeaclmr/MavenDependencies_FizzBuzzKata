import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test si el número es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_thenReturnFizz(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();


        //When
        String result = fizzbuzz.checkNumber(9);


        //Then
        assertEquals("Fizz", result);
    }

@Test
@DisplayName("test si el numero es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz() {
        //Given
    Fizzbuzz objectOfFizzBuzz = new Fizzbuzz();

        //When
    String result = objectOfFizzBuzz.checkNumber(10);


        //Then
    assertEquals("Buzz", result);

}

@Test
@DisplayName("test si el numero es divisible por 5 y por 3")
    void test_whenTheNumberIsDivisibleByFiveAndThree_thenReturnFizzBuzz(){
    //Given
    Fizzbuzz objectOfFizzBuss = new Fizzbuzz();


    //When
String result = objectOfFizzBuss.checkNumber(15);

    //Then
        assertEquals("Fizzbuzz", result);
}

@Test
@DisplayName("test si el numero no es multiple de 3 y 5")
    void test_whenTheNumberIsNotDivisibleByFiveAndThree_thenReturnNumber(){
    //Given
    Fizzbuzz objectOfFizzNumber = new Fizzbuzz();


    //When
String result = objectOfFizzNumber.checkNumber(7);

    //Then
    assertEquals("result", result);
}
}

