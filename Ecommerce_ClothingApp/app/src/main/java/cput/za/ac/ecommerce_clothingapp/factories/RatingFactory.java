package ac.za.factory;

import ac.za.domain.Rating;

import java.util.Map;

/**
 * Created by Admin on 2016-04-30.
 */
public class RatingFactory {
    private static  RatingFactory instance=null;

    private RatingFactory(){}

    public static RatingFactory getInstance() {
        if (instance == null) {
            instance = new RatingFactory();

        }
        return instance;
    }

    public static Rating createRating(Map<String,String> value){
        return new Rating.Builder()
                .name(value.get("name"))
                .description(value.get("description"))
                .build();


    }
}
