package ru.samsung.gamestudio.objects;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import ru.samsung.gamestudio.GameSettings;

import java.util.Random;

public class CoinObject extends GameObject{

    public static final int paddingHorizontal = 300;
    public boolean wasHit;
    public int livesLeft;

    public CoinObject(int width, int height, String texturePath, World world) {
        super(width / 2 + paddingHorizontal + (new Random()).nextInt((GameSettings.SCREEN_WIDTH - 2 * paddingHorizontal - width)), GameSettings.SCREEN_HEIGHT + height / 2,
                width, height,
                GameSettings.TRASH_BIT,
                texturePath,
                world
        );

        body.setLinearVelocity(new Vector2(0, -GameSettings.TRASH_VELOCITY));
        livesLeft = 1;
    }

    public boolean isAlive() {
        return livesLeft > 0;
    }

    public boolean hasToBeDestroyed() {
        return wasHit || (getY() - height / 2 > GameSettings.SCREEN_HEIGHT);

    }

    @Override
    public void hit() {
        wasHit = true;
    }
}
