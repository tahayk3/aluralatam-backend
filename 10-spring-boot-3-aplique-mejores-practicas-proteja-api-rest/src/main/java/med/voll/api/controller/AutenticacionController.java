package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuario.DatosAutenticacion;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.infra.segurity.DatosTokenJWT;
import med.voll.api.infra.segurity.TokenService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DatosAutenticacion datos){
        try{
            var authenticationToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
            var autenticacion = manager.authenticate(authenticationToken);

            var tokenJWT = tokenService.generarToken((Usuario) autenticacion.getPrincipal());

            return ResponseEntity.ok(new DatosTokenJWT(tokenJWT));


        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}






















