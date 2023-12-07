package pluhy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    String name;
    String genre;
    String studio;
    int audienceScore;
    double profitability;
    int rottenTomatoes;
    String worldWideGross;
    int year;
}
