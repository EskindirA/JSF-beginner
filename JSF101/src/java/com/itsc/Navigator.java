/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itsc;

/**
 *
 * @author eskindir
 */
public class Navigator {
    /**
     * frustrated over not seeing the url change?
     * you can add the <redirect/> tag just before your
     * navigation case closes. It will enforce re-writing the url. 
     */
    
    //a typical navigation action definition;
    //you may choose to make it static.
    private String second="second";

    //our getter methods are what are bound to our form element
    //actions, later to be checked with the value contained in
    //faces-config:from-outcome
    public String getSecond() {
        return second;
    }
    
}
