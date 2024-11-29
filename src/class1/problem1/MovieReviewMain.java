package class1.problem1;

public class MovieReviewMain {
    public static void main(String[] args) {
//        MovieReview inception = new MovieReview();
//        inception.title = "인셉션";
//        inception.review = "인생은 무한 루프";
//
//        MovieReview aboutTime = new MovieReview();
//        aboutTime.title = "어바웃 타임";
//        aboutTime.review = "인생 시간 영화!";
//
//        MovieReview[] movieReviews = {inception, aboutTime};
//
//        for(int i=0; i<movieReviews.length; i++) {
//            System.out.println("영화 제목:" + movieReviews[i].title + ", 영화 리뷰:" + movieReviews[i].review);
//        }

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for(MovieReview review : reviews){
            System.out.println("영화 제목: " + review.title
            + ", 리뷰: " + review.review);
        }
    }
}
