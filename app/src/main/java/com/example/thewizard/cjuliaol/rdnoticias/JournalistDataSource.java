package com.example.thewizard.cjuliaol.rdnoticias;

import com.parse.ParseObject;

/**
 * Created by cjuliaol on 13-Dec-15.
 */
public class JournalistDataSource {

    public static final String TAG ="JournalistDataSourceLog";

    public void save(Journalist journalist) {

        ParseObject journal = new ParseObject("journalist");

        journal.put("name",journalist.getName());
        journal.put("lastname",journalist.getLastName());
        journal.put("sex",journalist.getSex());
   //     journal.put("birthdate",journalist.getBirthDate());
        journal.put("journalist",journalist.getJournalistId());

        journal.saveInBackground();

    }

}
