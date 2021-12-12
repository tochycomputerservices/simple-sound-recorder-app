package com.example.soundrecorder.listeners;

/**
 * Created by Tochy on 5/22/2021.
 * Listen for add/rename items in database
 */
public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}