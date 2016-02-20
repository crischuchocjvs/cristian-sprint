/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristian.spring;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 *
 * @author cris__000
 */
@Component
public class MiTomcatsito implements EmbeddedServletContainerCustomizer{

    @Override
    public void customize(ConfigurableEmbeddedServletContainer c) {
         c.setPort(9999);
    }
    
}
