package com.loftschool.loftcoin.data.db.room;


import com.loftschool.loftcoin.data.db.Database;
import com.loftschool.loftcoin.data.db.model.CoinEntity;

import java.util.List;

public class DatabaseImplRoom implements Database {

    private AppDatabase appDatabase;

    public DatabaseImplRoom(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    @Override
    public void saveCoins(List<CoinEntity> coins) {
        appDatabase.coinDao().saveCoins(coins);
    }

    @Override
    public List<CoinEntity> getCoins() {
        return appDatabase.coinDao().getCoins();
    }
}
