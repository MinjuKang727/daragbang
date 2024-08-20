package part4.role;

public interface StaffRole {
    default void recordAttendance() {
        System.out.println("출근");
    }

    default void recordLeaving() {
        System.out.println("퇴근");
    }
}
