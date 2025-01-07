package com.example.moviechart.service;


import com.example.moviechart.model.Movie;
import com.example.moviechart.repository.MovieRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    @PostConstruct
    public void initData() {

        List<Movie> movies = Arrays.asList(
            new Movie(null, "https://img.megabox.co.kr/SharedImg/2021/02/01/qDLdOQKdvIeLyniUM7DX567IaJeyJmbv_420.jpg", "무한열차편", "2021.01.27", "하나에 나츠키", "소토자키 하루오"),
            new Movie(null, "https://img.megabox.co.kr/SharedImg/2021/06/10/7deO12OmPdV0fCZlT1YA68dpI6mOGDKI_420.jpg", "캐시트럭", "2021.06.09", "제이슨 스타뎀", "가이 리치"),
            // 나머지 데이터를 JSON 데이터에서 추가
            new Movie(null, "https://img.megabox.co.kr/SharedImg/2021/05/21/L1u1sOkUsSQ0Ut8erY62YQxGtOMcInj2_420.jpg", "500일의 썸머", "2021.05.26", "클로이 모레츠", "마크 웹")
        );
        movieRepository.saveAll(movies);
    }
}
