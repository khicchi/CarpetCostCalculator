package com.lespania.enums;

public enum ERoomType {
    room_bedroom("bedroom"),
    room_livingRoom("living room"),
    room_kitchen("kitchen");

    private String roomName;

    ERoomType(String roomName){
        this.roomName = roomName;
    }
}
