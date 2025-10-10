package com.example.demo.service;

import com.example.demo.dto.UsuarioCreateDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.models.Usuario;
import com.example.demo.repository.UsuarioRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioDTO toDto (Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

    private Usuario toEntity (UsuarioCreateDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        return usuario;
    }

    public UsuarioDTO salvar (UsuarioCreateDTO dto) {
        if (usuarioRepository.existsByEmail(dto.getEmail())) {
            throw new EntityExistsException("Já existe um usuário cadastrado com o e-mail informado.");
        }

        Usuario usuario = toEntity(dto);
        return toDto(usuarioRepository.save(usuario));
    }
    public List<UsuarioDTO> listarTodos(){
        return usuarioRepository.findAll()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public UsuarioDTO buscarPorId(UUID id){
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Usuário não encontrado"));
        return toDto(usuario);
    }
    public UsuarioDTO atualizar(UUID id, UsuarioCreateDTO dto) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        return toDto(usuarioRepository.save(usuario));
    }

    public UsuarioDTO deletar(UUID id) {
        Usuario removido = usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        usuarioRepository.delete(removido);
        return toDto(removido);
    }
}
