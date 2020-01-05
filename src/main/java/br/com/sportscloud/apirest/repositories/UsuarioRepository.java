package br.com.sportscloud.apirest.repositories;

import br.com.sportscloud.apirest.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
