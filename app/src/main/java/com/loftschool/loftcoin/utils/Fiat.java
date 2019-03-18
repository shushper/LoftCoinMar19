package com.loftschool.loftcoin.utils;

public enum Fiat {
    USD("$"),
    EUR("€"),
    RUB("₽");

    public String symbol;

    Fiat(String symbol) {
        this.symbol = symbol;
    }
}
