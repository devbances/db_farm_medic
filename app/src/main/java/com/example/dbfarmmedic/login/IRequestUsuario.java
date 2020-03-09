package com.example.dbfarmmedic.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IRequestUsuario {
    @GET("/login/{user}/{pass}")
    Call<Usuario> getJSONUsuario(@Path("user") String user, @Path("pass") String pass);

    @POST("/save")
    Call<Usuario> addUsuario(@Body Usuario usuario);
}
