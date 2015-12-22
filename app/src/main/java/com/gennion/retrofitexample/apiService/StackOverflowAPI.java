package com.gennion.retrofitexample.apiService;

import com.gennion.retrofitexample.object.StackOverflowQuestions;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Carlos on 18/12/15.
 */
public interface StackOverflowAPI {

    @GET("/2.2/search?order=desc&sort=activity&tagged=android&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestionsCall(@Query("tagged")String tags);

}
