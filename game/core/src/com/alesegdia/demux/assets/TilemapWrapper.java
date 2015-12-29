package com.alesegdia.demux.assets;

import com.alesegdia.troidgen.room.Room;
import com.alesegdia.troidgen.room.RoomInfo;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TilemapWrapper {

	public TiledMap tilemap;
	public OrthogonalTiledMapRenderer renderer;
	private RoomInfo rinfo;

	public TilemapWrapper (String path)
	{
		tilemap = new TmxMapLoader().load(path);
		float unitScale = 1.f / 16.f;
		renderer = new OrthogonalTiledMapRenderer(tilemap, unitScale);
		
		rinfo = new TmxRoomInfoLoader().load(tilemap);
	}

	public void render(OrthographicCamera cam) {
		renderer.setView(cam);
		renderer.render();		
	}

	public Room createRoom() {
		return Room.CreateFromInfo(this.rinfo);
	}
	
}
