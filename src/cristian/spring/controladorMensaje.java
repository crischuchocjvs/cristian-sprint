/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristian.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author cris__000
 */
@Controller
@RequestMapping("/")
public class controladorMensaje {
    @RequestMapping(value = "/mensaje",method = RequestMethod.GET,headers = {"Accept=application/json"})
    @ResponseBody String buscartodos()throws Exception{
        //esto va a ser obtenido a  travez de DAOmensaje y su metodo obtener todos
        Mensaje m1=new Mensaje();
        m1.setTitulo("Springboot");
        m1.setCuerpo("Springboot es la neta camioneta");
        Mensaje m2=new Mensaje();
        m2.setTitulo("Java 3");
        m2.setCuerpo("Esta materia es facil'Segun'");
        Mensaje m3=new Mensaje();
        m3.setTitulo("Jessi");
        m3.setCuerpo("Tu no vas a pasar muajaja");
        
        ArrayList <Mensaje> arreglo = new ArrayList<Mensaje>();
        arreglo.add(m1);
        arreglo.add(m2);
        arreglo.add(m3);
        //vamos a usar una clase que se llama objectmapper para traducir a jason
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(arreglo);
    }
}
