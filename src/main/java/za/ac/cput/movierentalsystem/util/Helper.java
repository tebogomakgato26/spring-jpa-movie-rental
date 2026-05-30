package za.ac.cput.movierentalsystem.util;

public class Helper {

    public static boolean isNullOrEmpty(String value){
        return value == null || value.isEmpty();
    }
    public static boolean isValidMovieId(String movieId){
        if(movieId.matches("^MOV\\d{3}$")){
            return true;
        }
        return false;
    }
    public static boolean isValidPrice(double rentalPrice){
        return rentalPrice > 0;
    }
}
