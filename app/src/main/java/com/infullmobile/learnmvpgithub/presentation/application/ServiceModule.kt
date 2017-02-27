package com.infullmobile.learnmvpgithub.presentation.application

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.infullmobile.learnmvpgithub.services.GitHubService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ServiceModule {

    @Provides fun providesGetAllReposService(gson: Gson, okHttpClient: OkHttpClient): GitHubService {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .build()

        return retrofit.create(GitHubService::class.java)
    }

    @Provides fun providesGson(): Gson {
        return GsonBuilder()
                .create()
    }

    @Provides fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder().
                addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()
    }

    companion object {
        private const val BASE_URL = "https://api.github.com"

    }

}

