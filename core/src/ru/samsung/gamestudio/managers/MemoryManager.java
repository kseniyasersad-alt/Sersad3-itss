package ru.samsung.gamestudio.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.utils.Json;

import java.util.ArrayList;

import static com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.table;

public class MemoryManager {
    private static final Preferences preferences = Gdx.app.getPreferences("User saves");

    public static void saveTableOfRecords(ArrayList<Integer> table) {}

    public static ArrayList<Integer> loadRecordsTable() {
        Json json = new Json();
        String tableInString = json.toJson(table);
        preferences.putString("recordTable", tableInString);
        preferences.flush();
        return null;
    }

    public static boolean loadIsSoundOn() {
        return preferences.getBoolean("isSoundOn", true);
    }

    public static void saveSoundSettings(boolean isOn) {
        preferences.putBoolean("isSoundOn", isOn);
        preferences.flush();
    }

    public static boolean loadIsMusicOn() {
        return preferences.getBoolean("isMusicOn", true);
    }

    public static void saveMusicSettings(boolean isOn) {
        preferences.putBoolean("isMusicOn", isOn);
        preferences.flush();
    }
}
//     /\   /\           ___
//    //\\_//\\       --|>_<|
//   =|  0 - 0 |=  / \  \___/
//     \ \ >\ \   /  /
//     /\> > >/| /  /
//    /  |  |  |/  /
//    |__=|__-|=\ /