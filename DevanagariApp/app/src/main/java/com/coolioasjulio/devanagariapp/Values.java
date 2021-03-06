package com.coolioasjulio.devanagariapp;


import android.content.Context;

import java.util.Locale;

public class Values {
    public static final int NUM_CHARS = 36;

    public static final String SESSION_LENGTH_KEY      = "SESSION_LENGTH";
    public static final String TIMEOUT_KEY             = "TIMEOUT";
    public static final String NUM_CORRECT_KEY         = "NUM_CORRECT";
    public static final String INCORRECT_BREAKDOWN_KEY = "SCORE_BREAKDOWN";

    public static final int CORRECT_PROMPT_TIMEOUT     = 1; // in seconds

    //public static final Locale LOCALE = Locale.US;
    public static final Locale LOCALE = new Locale("hi","IN");

    public static String toLetter(Context c, int character){
        String[] letters = c.getResources().getStringArray(R.array.letters);
        return letters[character];
    }
}
