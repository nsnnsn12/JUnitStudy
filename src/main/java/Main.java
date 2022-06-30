public class Main {
    public static void main(String[] args) {
        //given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);
        //when
        int actualResult = collection.arithmeticMean();
        System.out.println(actualResult);
    }
}
