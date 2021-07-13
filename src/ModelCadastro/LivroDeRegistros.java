/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelCadastro;

/**
 *
 * @author nonat
 */
public class LivroDeRegistros {
    
    //atributos
    private String paciente; 
    private String medico;
    private String data;
    private String horario;
        
    //construtor
    public LivroDeRegistros(){
    }

    public LivroDeRegistros(String paciente, String medico, String data, String horario) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
    }
  
    //encapsulamento

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    }
    
   
