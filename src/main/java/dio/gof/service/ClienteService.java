package dio.gof.service;

import dio.gof.model.Cliente;
import org.springframework.context.annotation.Bean;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 *
 * @author marimaccos
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId (Long id);

    void inserir (Cliente cliente);

    void atualizar (Long id, Cliente cliente);

    void deletar (Long id);
}