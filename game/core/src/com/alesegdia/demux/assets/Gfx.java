package com.alesegdia.demux.assets;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;

public class Gfx {

	public static Animation playerWalk;
	public static Animation playerStand;
	public static Animation playerJumpUp;
	public static Animation playerJumpDown;
	public static Spritesheet playerSheet;

	public static void Initialize()
	{
		playerSheet = new Spritesheet("tiacascoanim.png", 3, 3);
		playerStand = new Animation(0.2f, playerSheet.get(0));
		playerJumpUp = new Animation(0.2f, playerSheet.get(1));
		playerJumpDown = new Animation(0.2f, playerSheet.get(1));
		playerWalk = new Animation(0.1f, playerSheet.getRange(2, 4));
		playerWalk.setPlayMode(PlayMode.LOOP_PINGPONG);
	}
	
}
