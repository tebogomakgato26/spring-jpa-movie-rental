package za.ac.cput.movierentalsystem.factory;

import za.ac.cput.movierentalsystem.domain.Movie;
import za.ac.cput.movierentalsystem.util.Helper;

public class MovieFactory {

    public static Movie createMovie(String movieId, String title, String gentre, double rentalPrice){
        if(Helper.isNullOrEmpty(movieId)  || !Helper.isValidMovieId(movieId)){
            return null;
        }
        if(Helper.isNullOrEmpty(title)){
            return null;
        }
        if(Helper.isNullOrEmpty(gentre)){
            return null;
        }
        if(!Helper.isValidPrice(rentalPrice)){
            return null;
        }
        return new Movie.Builder()
                .setMovieId(movieId)
                .setTitle(title)
                .setGentre(gentre)
                .setRentalPrice(rentalPrice)
                .build();
    }
}
