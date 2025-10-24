package com.joliveira.usuario.business;

import com.joliveira.usuario.business.converter.UsuarioConverter;
import com.joliveira.usuario.business.dto.UsuarioDTO;
import com.joliveira.usuario.infrastructure.entity.Usuario;
import com.joliveira.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
