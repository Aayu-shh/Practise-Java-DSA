package Java8;

import Array.Arrays2D;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(LocalDate.now().plusDays(2));

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println(now);

        List<Integer> myList = new ArrayList<>();
    }
}
