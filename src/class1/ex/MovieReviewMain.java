package class1.ex;

import java.util.Scanner;

public class MovieReviewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        System.out.print("영화 제목 : ");
        movieReview1.title = scanner.nextLine();
        System.out.print("리뷰 : ");
        movieReview1.review = scanner.nextLine();

        MovieReview movieReview2 = new MovieReview();
        System.out.print("영화 제목 : ");
        movieReview2.title = scanner.nextLine();
        System.out.print("리뷰 : ");
        movieReview2.review = scanner.nextLine();

        //영화 리뷰 정보 출력
        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목 : " + movieReview.title + ", 리뷰 : " + movieReview.review);
        }

    }
}
