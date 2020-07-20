/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author jgale
 */
public class ProgramarProyecto {
    private Proyecto miProyecto;
    private Responsable responsable1, responsable2, responsable3, responsable4, 
            responsable5, responsable6, responsable7, responsable8, responsable9;
    
    public ProgramarProyecto(){
        creaResponsables();
        creaProyectoPrincipal();
        creaSubProAnalisis();
        creaSubProDiseno();
        creaSubProDesarrollo();
        creaSubProImplementacion();
        miProyecto.imprimir();
    }
    
    public void creaResponsables(){
        responsable1 = new Responsable("PEDRO PEREZ PADILLA");
        responsable2 = new Responsable("ARMANDO LIOS");
        responsable3 = new Responsable("FULANITO MENGANO");
        responsable4 = new Responsable("PABLO PEREZ PADILLA");
        responsable5 = new Responsable("ARMANDO CUEVAS");
        responsable6 = new Responsable("MANOLITO MENGANO");
        responsable7 = new Responsable("MANUEL MARULANDA");
        responsable8 = new Responsable("ROBERTO GOMEZ BOLAÑOS");
        responsable9 = new Responsable("ROBERTO CAMELO");
    }
    
    public void creaProyectoPrincipal(){
        miProyecto = new Proyecto("CREAR UN PROYECTO",responsable1);
    }
    
    public void creaSubProAnalisis(){
        
        Proyecto subProyecto = new Proyecto("ANALISIS", responsable2);
        
        Tarea tarea1 = new Tarea("IDENTIFICACIÓN DE INTERESADOS",responsable3, 0);
        Tarea subTarea11 = new Tarea("IDENTIFICAR USUARIOS",responsable4, 36);
        Tarea subTarea12 = new Tarea("IDENTIFICAR TÉCNICOS",responsable5, 12);
        tarea1.agregarItemTarea(subTarea11);
        tarea1.agregarItemTarea(subTarea12);
        
        Tarea tarea2 = new Tarea("IDENTIFICACIÓN DE INTERESADOS",responsable6, 0);
        Tarea subTarea21 = new Tarea("IDENTIFICAR USUARIOS",responsable6, 72);
        Tarea subTarea22 = new Tarea("IDENTIFICAR TÉCNICOS",responsable6, 24);
        tarea2.agregarItemTarea(subTarea21);
        tarea2.agregarItemTarea(subTarea22);
        
        Tarea tarea3 = new Tarea("ANALISIS DE REQUERIMIENTOS", responsable7, 72);
        
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        subProyecto.agregarItemProyecto(tarea3);
        
        miProyecto.agregarItemProyecto(subProyecto);
    }
    
    public void creaSubProDiseno(){
        
        Proyecto subProyecto = new Proyecto("DISEÑO", responsable2);
        
        Tarea tarea1 = new Tarea("DISEÑO DE CASOS DE USO", responsable8, 34);
        Tarea tarea2 = new Tarea("DISEÑO DE SECUENCIA", responsable8, 24);
        Tarea tarea3 = new Tarea("DIAGRAMAS DE UML", responsable8, 30);
        
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        subProyecto.agregarItemProyecto(tarea3);
        
        miProyecto.agregarItemProyecto(subProyecto);
    }
    
    public void creaSubProDesarrollo(){
        
        Proyecto subProyecto = new Proyecto("DESARROLLO", responsable2);
        
        Tarea tarea1 = new Tarea("DEFINICIÓN DEL LENGUAJE A USAR", responsable9, 12);
        Tarea tarea2 = new Tarea("DESAROOLAR CÓDIGO", responsable5, 0);
        Tarea subTarea21 = new Tarea("CÓDIGO DE CAPA DE DATOS", responsable1, 18);
        Tarea subTarea22 = new Tarea("CÓDIGO DE CAPA LÓGICA", responsable2, 18);
        Tarea subTarea23 = new Tarea("CÓDIGO DE CAPA DE PRESENTACIÓN", responsable3, 12);
        
        tarea2.agregarItemTarea(subTarea21);
        tarea2.agregarItemTarea(subTarea22);
        tarea2.agregarItemTarea(subTarea23);
        
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        
        miProyecto.agregarItemProyecto(subProyecto);
    }
    
    public void creaSubProImplementacion(){
        
        Proyecto subProyecto = new Proyecto("IMPLEMENTACIÓN", responsable2);
        
        Tarea tarea1 = new Tarea("CONFIGURACIÓN DEL SERVIDOR", responsable9, 12);
        Tarea tarea2 = new Tarea("IMPLEMENTACIÓN DEL SOFTWARE", responsable5, 0);
        
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        
        miProyecto.agregarItemProyecto(subProyecto);
    }
    
}