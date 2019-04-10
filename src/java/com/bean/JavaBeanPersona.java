/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entidades.Persona;
import com.jpa.controlador.PersonaJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sotosanchez
 */
public class JavaBeanPersona {
    private EntityManagerFactory emf;
    private PersonaJpaController personaControl;
            
    public JavaBeanPersona(){
        emf = Persistence.createEntityManagerFactory("MiAplicacionWebPU");
        personaControl = new PersonaJpaController(emf);
    }
    
    public void guardar (Persona persona){
        try {   
            personaControl.create(persona);
        } catch (Exception ex) {
            Logger.getLogger(JavaBeanPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
