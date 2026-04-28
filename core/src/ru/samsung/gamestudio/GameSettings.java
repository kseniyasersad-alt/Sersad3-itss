package ru.samsung.gamestudio;

public class GameSettings {

    // device settings

    public static final int SCREEN_WIDTH = 720;
    public static final int SCREEN_HEIGHT = 1280;

    // physics settings

    public static final float STEP_TIME = 1f / 60f;
    public static final int VELOCITY_ITERATIONS = 6;
    public static final int POSITION_ITERATIONS = 6;
    public static final float SCALE = 0.05f;

    public static int BULLET_VELOCITY = 200;
    public static int COIN_VELOCITY = 50;
    public static float SHIP_FORCE_RATIO = 10;
    public static float TRASH_VELOCITY = 20;
    public static long STARTING_TRASH_APPEARANCE_COOL_DOWN = 2000;
    public static long STARTING_COIN_APPEARANCE_COOL_DOWN = 3000;
    public static int SHOOTING_COOL_DOWN = 1000; // in [ms] - millisecond

    public static final short TRASH_BIT = 1;
    public static final short SHIP_BIT = 2;
    public static final short BULLET_BIT = 4;
    public static final short COIN_BIT = 1;

    // object sizes

    public static final int SHIP_WIDTH = 150;
    public static final int SHIP_HEIGHT = 150;
    public static final int TRASH_WIDTH = 120;
    public static final int TRASH_HEIGHT = 100;
    public static final int BULLET_WIDTH = 15;
    public static final int BULLET_HEIGHT = 45;
    public static final int COIN_WIDTH = 60;
    public static final int COIN_HEIGHT = 60;
}





//     /\   /\           ___
//    //\\_//\\       --|>_<|
//   =|  0 - 0 |=  / \  \___/
//     \ \ >\ \   /  /
//     /\> > >/| /  /
//   _/  |  |  |/  /
//  |_|__=|__-|=\ /
