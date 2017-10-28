package apps.cursos.com.mascotasrvyav;

/**
 * Created by Usuario on 27/10/2017.
 */
public class Mascota {
    private String nombre;
    private int likes;
    private int foto;


    public Mascota(String nombre,int likes,int foto){
        this.nombre=nombre;
        this.likes=likes;
        this.foto=foto;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
