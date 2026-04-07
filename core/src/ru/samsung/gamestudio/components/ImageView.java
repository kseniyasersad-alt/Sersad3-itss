package ru.samsung.gamestudio.components;

import com.badlogic.gdx.graphics.Texture;

public class ImageView extends View{
    Texture texture;

    public ImageView(float x, float y, String imagePath) {
        super(x, y);
        texture = new Texture(imagePath);
        this.width = texture.getWidth() ;
        this.height = texture.getHeight() ;
    }
}
