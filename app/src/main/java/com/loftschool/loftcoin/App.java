package com.loftschool.loftcoin;

import android.app.Application;

import com.loftschool.loftcoin.data.api.Api;
import com.loftschool.loftcoin.data.api.ApiInitializer;
import com.loftschool.loftcoin.data.db.Database;
import com.loftschool.loftcoin.data.db.DatabaseInitializer;
import com.loftschool.loftcoin.data.prefs.Prefs;
import com.loftschool.loftcoin.data.prefs.PrefsImpl;

import timber.log.Timber;

public class App extends Application {

    private Prefs prefs;
    private Api api;
    private Database database;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        prefs = new PrefsImpl(this);
        api = new ApiInitializer().init();
        database = new DatabaseInitializer().init(this);
    }


    public Prefs getPrefs() {
        return prefs;
    }

    public Api getApi() {
        return api;
    }

    public Database getDatabase() {
        return database;
    }
}
