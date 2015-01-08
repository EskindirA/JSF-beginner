/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itsc;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author eskindir
 */
public class Localize {
    private String locale;
    
    private static Map<String,Object> countries;
    
    //a static block to initiate our supported locales up on loading 
    static{
        countries=new LinkedHashMap<>();
        countries.put("ENGLISH", Locale.ENGLISH); // available as a static member of the class Locale 
        countries.put("FRENCH", Locale.FRENCH); // available as a static member of the class Locale
        countries.put("AMHARIC", new Locale("am", "et")); // new locale definition
        
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Map<String, Object> getCountries() {
        return countries;
    }

    public static void setCountries(Map<String, Object> countries) {
        Localize.countries = countries;
    }

    /**
     * This binding is also typical example to show how event listeners
     * are bound to JSF components 
     * @param e 
     */
    public void localeChanged(ValueChangeEvent e){
        //retrieves the newely selected option value component
        String newLocaleValue=e.getNewValue().toString();
        //iterate over the binding map
        for(Map.Entry entry:countries.entrySet()){
            //see if this value has an entry in the map
            //making this check is perhaps unnecessary but vital
            //if you are not certain of the existence of multiple map entry
            //definitions and you can't tell which is which.
            if(entry.getValue().toString().equals(newLocaleValue)){
                //get the pre-request state information and change the locale
                //from then on, this info will pass over each phase listener and 
                //finally be rendered in response.
                FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)entry.getValue());
            }
        }
    }
}
