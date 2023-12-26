package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        LocalDate localDate = LocalDate.parse(val1, DateTimeFormatter.ofPattern("yyyyMMdd"));
        DayOfWeek w =localDate.getDayOfWeek();

        if (w.getValue() ==1) {
            return "実行結果:Monday";
        }

        else if (w.getValue() ==2) {
            return "実行結果:Tuesday";
        }

        else if (w.getValue() ==3) {
            return "実行結果:Wednesday";
        }

        else if (w.getValue() ==4) {
            return "実行結果:Thursday";
        }

        else if (w.getValue() ==5) {
            return "実行結果:Friday";
        }

        else if (w.getValue() ==6) {
            return "実行結果:Saturday";
        }

        else {
            return "実行結果:Sunday";
        }
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }

     @GetMapping("/times/{val1}/{val2}")
     public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
         int res = 0;
         res = val1 * val2;
         return "実行結果：" + res;
     }

     @GetMapping("/divide/{val1}/{val2}")
     public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
         int res = 0;
         res = val1 / val2;
         return "実行結果：" + res;
     }
}