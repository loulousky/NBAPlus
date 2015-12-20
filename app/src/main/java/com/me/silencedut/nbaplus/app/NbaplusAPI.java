package com.me.silencedut.nbaplus.app;


import com.me.silencedut.nbaplus.model.News;
import com.me.silencedut.nbaplus.model.Statistics;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by SilenceDut on 2015/11/28.
 */
public interface NbaplusAPI {
    @GET("api/v1.0/update/{type}")
    Observable<News> updateNews(@Path("type") String type);
    @GET("api/v1.0/loadmore/{type}/{newsId}")
    Observable<News> loadMoreNews(@Path("type") String type,@Path("newsId") String newsId );
    @GET("api/v1.0/perstat/{statKind}")
    Observable<Statistics> getPerStats(@Path("statKind") String statKind);

}