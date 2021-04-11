package br.com.alura.estoque.retrofit;

import br.com.alura.estoque.retrofit.service.ProdutoService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Instancia do retrofit
 * Declarar no construtor da classe o objeto retrofit. Com esse objeto
 * eu declaro o baseUrl e então o Build.
 */


public class EstoqueRetrofit{

    private final ProdutoService produtoService;

    public EstoqueRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.109:8081/")
                //.client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        produtoService = retrofit.create(ProdutoService.class);
    }

    public ProdutoService getProdutoService(){
        return produtoService;
    }
}
