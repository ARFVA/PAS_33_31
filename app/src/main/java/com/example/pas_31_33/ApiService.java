package com.example.pas_31_33;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getPremierLeagueTeams();

    @GET("/api/v1/json/3/search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getSpanishLeagueTeams();

    @GET("lookup_all_teams.php?id=4328")
    Call<TeamResponse> getEFLLeagueTeams();
}
