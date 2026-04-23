package ru.samsung.gamestudio.objects;

import com.badlogic.gdx.physics.box2d.World;
import ru.samsung.gamestudio.GameSettings;

import java.util.Random;

public class CoinObject extends GameObject{

    private static final int paddingHorizontal = 300;
    public boolean wasHit;

    public CoinObject(int width, int height, String texturePath, World world) {
        super(
                width / 2 + paddingHorizontal + (new Random()).nextInt((GameSettings.SCREEN_WIDTH - 2 * paddingHorizontal - width)),
                GameSettings.SCREEN_HEIGHT + height / 2,
                width, height,
                GameSettings.COIN_BIT,
                texturePath,
                world
        );
    }

    public boolean hasToBeDestroyed() {
        return wasHit || (getY() - height / 2 > GameSettings.SCREEN_HEIGHT);

    }
        @Override
    public void hit() {
        wasHit = true;
    }
}
