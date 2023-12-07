package pluhy.service;

import pluhy.entity.Movie;

import java.io.IOException;
import java.util.List;

public interface CsvReader {

    List<Movie> readCsv(String filePath) throws IOException;
}
