package com.raf.reservationservice.dto;

import com.raf.reservationservice.domain.Period;

import java.util.ArrayList;
import java.util.List;

public class FreeTermsDto {

    private RoomLayoutDto roomLayoutDto;
    private Period period;
    private List<RoomDto> rooms;

    public FreeTermsDto() {
        rooms = new ArrayList<>();
    }



    public RoomLayoutDto getRoomLayoutDto() {
        return roomLayoutDto;
    }

    public void setRoomLayoutDto(RoomLayoutDto roomLayoutDto) {
        this.roomLayoutDto = roomLayoutDto;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
