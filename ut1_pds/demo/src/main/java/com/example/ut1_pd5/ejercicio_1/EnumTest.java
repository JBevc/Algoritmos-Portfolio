package com.example.ut1_pd5.ejercicio_1;
import com.example.ut1_pd5.ejercicio_1.Main.Day;

public class EnumTest {
  Day day;

  public EnumTest(Day day) {
    this.day = day;
}

  public void tellItLikeItIs() {
    switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
                
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
                     
        case SATURDAY: case SUNDAY:
            System.out.println("Weekends are best.");
            break;
                    
        default:
            System.out.println("Midweek days are so-so.");
            break;
    }
    }   
}

