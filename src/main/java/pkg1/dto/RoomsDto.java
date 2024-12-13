package pkg1.dto;

import pkg1.entity.RoomsEntity;

public class RoomsDto {
	private long locationId;
	private RoomsEntity room;
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public RoomsEntity getRoom() {
		return room;
	}
	public void setRoom(RoomsEntity room) {
		this.room = room;
	}
}