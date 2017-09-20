package com.stockholm.library.calendar.month;


public interface OnMonthClickListener {

    void onClickThisMonth(int year, int month, int day);

    void onClickLastMonth(int year, int month, int day);

    void onClickNextMonth(int year, int month, int day);

}