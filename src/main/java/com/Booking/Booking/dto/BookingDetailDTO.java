package com.Booking.Booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailDTO {
    private int detailId;
    private String reserveTime;
    private String endTime;
    private String returnTime;
    private String acceptTime;
    private int status;
    private int roomId;
    private String roomName;
    private int roomStatus;
    private String roomPhoto;
    private String roomDescription;
    private int countOfSeats;
    private double area;
    private int userId;
    private String userName;
    private int eventId;
    private String eventName;
    private int typeid;
    private String typeName;
}
