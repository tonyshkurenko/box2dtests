package com.box2d.game.utils;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by cullycross on 3/29/15.
 */
public class Constants {

    public static final int APP_WIDTH = 800;
    public static final int APP_HEIGHT = 480;
    public static final Vector2 WORLD_GRAVITY = new Vector2(0, -10);

    public static final float GROUND_X = 0;
    public static final float GROUND_Y = 0;
    public static final float GROUND_WIDTH = 50f;
    public static final float GROUND_HEIGHT = 2f;
    public static final float GROUND_DENSITY = 0f;

    public static final float RUNNER_X = 2;
    public static final float RUNNER_Y = GROUND_Y + GROUND_HEIGHT;
    public static final float RUNNER_RADIUS = 2f;
    public static final float RUNNER_GRAVITY_SCALE = 3f;
    public static final float RUNNER_DODGE_X = RUNNER_X;
    public static final float RUNNER_DODGE_Y = RUNNER_Y;
    public static final Vector2 RUNNER_JUMPING_LINEAR_IMPULSE = new Vector2(0, 13f);
    public static final float RUNNER_DENSITY = 0.5f;

    private Constants(){}
}
