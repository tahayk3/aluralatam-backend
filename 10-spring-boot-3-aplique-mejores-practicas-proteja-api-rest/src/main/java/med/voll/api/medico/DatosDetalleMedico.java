package med.voll.api.medico;

import med.voll.api.direccion.*;

public record DatosDetalleMedico(Long id, String nombre, String telefono, String email, String documento, Especialidad especialidad) {
}
