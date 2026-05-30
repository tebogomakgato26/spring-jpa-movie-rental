package za.ac.cput.movierentalsystem.domain;

public class Movie {

    private String movieId;
    private String title;
    private String gentre;
    private double rentalPrice;


    public Movie(Builder builder){
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.gentre = builder.gentre;
        this.rentalPrice = builder.rentalPrice;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGentre() {
        return gentre;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", title='" + title + '\'' +
                ", gentre='" + gentre + '\'' +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
    public static class Builder {
        private String movieId;
        private String title;
        private String gentre;
        private double rentalPrice;

        public  Builder setMovieId(String movieId){
            this.movieId = movieId;
            return this;
        }
        public Builder setTitle(String title){
            this.title = title;
            return this;
        }
        public Builder setGentre(String gentre){
            this.gentre = gentre;
            return this;
        }
        public Builder setRentalPrice(double rentalPrice){
            this.rentalPrice = rentalPrice;
            return this;
        }
        public Builder copy(Movie movie){
            this.movieId = movie.movieId;
            this.title = movie.title;
            this.gentre = movie.gentre;
            this.rentalPrice = movie.rentalPrice;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }

    }
}
