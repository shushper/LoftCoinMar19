package com.loftschool.loftcoin.screens.wallets;

import android.app.Application;

import com.loftschool.loftcoin.data.db.model.CoinEntity;
import com.loftschool.loftcoin.data.db.model.TransactionModel;
import com.loftschool.loftcoin.data.db.model.WalletModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

abstract class WalletsViewModel extends AndroidViewModel {


    public WalletsViewModel(@NonNull Application application) {
        super(application);
    }


    public abstract LiveData<Object> selectCurrency();

    public abstract LiveData<Boolean> walletsVisible();

    public abstract LiveData<Boolean> newWalletVisible();

    public abstract LiveData<List<WalletModel>> wallets();

    public abstract LiveData<List<TransactionModel>> transactions();


    abstract void getWallets();

    abstract void onNewWalletClick();

    abstract void onCurrencySelected(CoinEntity coinEntity);

    abstract void onWalletChanged(int position);


}
