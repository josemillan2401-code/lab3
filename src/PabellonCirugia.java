import java.util.Objects;

public class PabellonCirugia {
    private int  Numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int Numero, String especialidad) {
this.Numero=Numero;
this.especialidad=especialidad;
    }
    public int getNumero() {
        return Numero;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PabellonCirugia{" +
                "especialidad='" + especialidad + '\'' +
                ", numero=" + Numero +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == Estado.DISPONIBLE || getClass() != o.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) o;
        return Numero == that.Numero && Objects.equals(especialidad, that.especialidad) && estado == that.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Numero, especialidad, estado);
    }
}
