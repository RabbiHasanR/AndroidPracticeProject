package com.example.android.miwok;

/**
 * Created by Rabbi hasan on 10/21/2017.
 */

public class Word {
    /** Default translation for the word */
    private  String mDefaultTranslation;

    /**Miwok translation for the word */
    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language the the user is already familir with
     *                           (such as English)
     *@param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
