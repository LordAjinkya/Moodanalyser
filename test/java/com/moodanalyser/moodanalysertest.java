package com.moodanalyser;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class moodanalysertest<moodanalyser> {
    moodanalyser moodAnalyser = new moodanalyser();

    @org.junit.Test
    public void given_Message_When_Sad_Should_Return_Sad() {
        moodanalyser moodAnalyser= new moodanalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }

    @org.junit.Test
    public void given_Message_When_Null_Should_Return_Happy() {
        moodanalyser moodAnalyser= new moodanalyser();
        String mood = moodAnalyser.moodAnalyseMoodContainsNull(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void given_Message_When_Null_ReturnCustomException(){
        try {
            moodanalyser moodAnalyser = new moodanalyser();
            String mood = moodAnalyser.moodAnalyzerException(null);
            Assertions.assertEquals("HAPPY", mood);
        }catch (moodanalyserException e){
            // Assertions.assertEquals("Enter Valid Mood",e.getMessage());
            e.printStackTrace();
        }
    }

}
