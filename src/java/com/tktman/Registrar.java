/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tktman;

/**
 *
 * @author rick
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomNumberEditor;

public class Registrar implements PropertyEditorRegistrar {
    private static Log log = LogFactory.getLog(Registrar.class);
    public static class NumberEditor extends CustomNumberEditor {
        public NumberEditor(Class clas) {
            super(clas, true);
        }

        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (text.equals("")) {
                log.debug("changing empty string to 0");
                text = "0";
            }
            super.setAsText(text);
        }

    }
 public void registerCustomEditors(PropertyEditorRegistry registry) {
     registry.registerCustomEditor(Float.class, new NumberEditor(Float.class));
     registry.registerCustomEditor(Double.class, new NumberEditor(Double.class));
     registry.registerCustomEditor(Integer.class, new NumberEditor(Integer.class));
     registry.registerCustomEditor(Long.class, new NumberEditor(Long.class));
     registry.registerCustomEditor(float.class, new NumberEditor(Float.class));
     registry.registerCustomEditor(double.class, new NumberEditor(Double.class));
     registry.registerCustomEditor(int.class, new NumberEditor(Integer.class));
     registry.registerCustomEditor(long.class, new NumberEditor(Long.class));
 }
}
