/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chemasmas.controller;
// some import statements are omitted for brevity.


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Button;

public class RegistrationComposer extends SelectorComposer<Component> {
    @Wire
    private Button submitButton;

    @Wire
    private Checkbox acceptTermBox;
    
    
    @Listen("onCheck = #acceptTermBox")
    public void changeSubmitStatus(){
        if (acceptTermBox.isChecked()){
            submitButton.setDisabled(false);
            submitButton.setImage("/images/submit.png");
        }else{
            submitButton.setDisabled(true);
            submitButton.setImage("");
        }
    }
    
    @Listen("onClick = #submitButton")
    public void register(){
        System.err.println("Registrado");
    }
}