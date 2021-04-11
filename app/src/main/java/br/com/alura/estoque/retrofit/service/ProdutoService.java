package br.com.alura.estoque.retrofit.service;
import java.util.List;
import br.com.alura.estoque.model.Produto;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * A call é a entidade que vai representar a minha requisição e vai permitir
 * com que ela seja requisitada. Qualquer tipo de requisição do service, eu tenho que
 * devolver obrigatóriamente uma call.
 */


public interface ProdutoService {

    @GET("produto")
    Call<List<Produto>> buscaTodos();

}
