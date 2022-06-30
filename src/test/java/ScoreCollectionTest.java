import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScoreCollectionTest {

    @Test
    public void answerArithmeticMeanOfTwoNumbers(){
        //given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);
        //when
        int actualResult = collection.arithmeticMean();
        //then
        assertEquals(actualResult, 6);
    }
}