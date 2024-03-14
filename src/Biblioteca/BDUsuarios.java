package Biblioteca;

import java.util.ArrayList;

public class BDUsuarios {
    private ArrayList<Usuario> baseDatos;

    public BDUsuarios() {
        this.baseDatos = new ArrayList<>();
    }

    public void AgregarUser(Usuario usuario) {
        baseDatos.add(usuario);
    }

    public void MostraUsuarios() {
        for (Usuario usuario : baseDatos) {
            System.out.println(usuario);
        }
    }

    public Usuario EncontrarUserId(int id) {
        for (Usuario usuario : baseDatos) {
            if (usuario.getIdUser() == id) {
                return usuario;
            }
        }
        return new Usuario();
    }

    @Override
    public String toString() {
        String contenido = "";
        for (Usuario usuario : baseDatos) {
            contenido += usuario.getNombre() + ',' + usuario.getDireccion() + ',' + usuario.getEdad() + '\n';
        }
        contenido = contenido.trim();
        return contenido;
    }
}
