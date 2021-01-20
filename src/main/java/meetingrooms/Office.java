package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    public List<MeetingRoom> meetingRoomList = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomList.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom mr : meetingRoomList) {
            System.out.println(mr.getName());
        }
    }


    public void printNamesReverse() {

        for (int i = meetingRoomList.size() - 1; i >= 0; i--) {
            System.out.println(meetingRoomList.get(i).getName());

        }
    }

    public void printEventNames() {
        for (int i = 0; i < meetingRoomList.size() - 1; i = i + 2) {
            System.out.println(meetingRoomList.get(i).getName());

        }
    }

    public void printAreas() {
        for ( int i = 0; i < meetingRoomList.size() - 1; i++) {
            System.out.println(meetingRoomList.get(i).getArea());
        }
    }

    public List<MeetingRoom> printMeetingRoomsWithName(String name) {
        List<MeetingRoom> nameContains = new ArrayList<>();
        for (MeetingRoom item : meetingRoomList) {
            if ( item.equals(name)) {
                nameContains.add(item);
            }
        }
        return nameContains;
    }

    public void printMeetingRoomsContains(String part) {
        List<String> containsPart = new ArrayList<>();
        for (int i = 0; i < meetingRoomList.size() - 1; i++) {
            if(meetingRoomList.get(i).getName().contains(part)) {
                containsPart.add(meetingRoomList.get(i).getName());
            }
        }
        System.out.println(containsPart);
    }


    public void printAreasLargerThan(int area) {
        for (MeetingRoom mr : meetingRoomList) {
            if ( mr.getArea() > area) {
                System.out.println(mr.getFullInfo());
            }
        }
    }
}
