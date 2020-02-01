package Enfermedades;

import Controlador.Controlador;
import Árbol.Persona;

public class Enfermedad {
    private Controlador controlador;
    protected boolean sobrepeso;    
    Persona persona;
    
    public Enfermedad(Persona persona){
      this.persona = persona;
      sobrepeso = false;
    }
    
    public void setControlador(Controlador controlador){
    this.controlador = controlador;
    }

    public boolean isSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(boolean sobrepeso) {
        this.sobrepeso = sobrepeso;
    }
    
    public void calcporLabioLep(){
        if(persona.getDatos().isLabioL()==true)
            //se le asiga el 100 porciento porque ya lo tiene. o lo tuvo
            persona.getDatos().setPorcLabioL(100);
        else{
                //cuando la madre existe y tiene labio le porino
                if(persona.getMadre() != null && persona.getMadre().getDatos().isLabioL()==true){
                    persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+30);
                    //si la madre tiene diabetes aporta 15 porciento a que su hijo tenga labio leporino.
                    if(persona.getMadre().getDatos().isDiabetes()==true)
                    persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+15);
                }
                //cuando su padre existe y tiene labio leporino.
                if(persona.getPadre() !=null && persona.getPadre().getDatos().isLabioL()==true){
                persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+30);
                }
                
            }//fin else
    }//fin calcporLabiolep()
    
    
    public void calcporCancerMP(){
        if(persona.getDatos().isCancerMP()==true)
            persona.getDatos().setPorcCancerMP(100);
        else{
            //si es mujer, tiene mas probabilidad de contraer el cancer de mama.
            if(persona.getDatos().getSexo()=='m'){
                persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 25);
            //si tiene mas de 50 años, tiene mas probabilidad de desarrllar el cancer
            if(persona.getDatos().getEdad()>50)
                persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 20);
            
            if(persona.getMadre()!= null && persona.getMadre().getDatos().isCancerMP()==true)
                persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 25 );
            
            if(persona.getDatos().isObesidad()==true)
                persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 15 );
    
            if(persona.getDatos().isPregHist4()==true)
                persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+25);
            }
            else {//cuando es hombre
                if(persona.getDatos().getEdad()>50)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 20);
                if(persona.getPadre()!=null && persona.getPadre().getDatos().isCancerMP()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 20);
                if(persona.getDatos().isObesidad()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 15);
                if(persona.getDatos().isPregHabito1()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
                if(persona.getDatos().isPregHabito2()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
                if(persona.getDatos().isPregHabito4()==false)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
                else
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()- 10);
                if(persona.getDatos().isPregHabito7()==false)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
                if(persona.getDatos().isPregHist9()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
                if(persona.getDatos().isPregHist10()==true)
                    persona.getDatos().setPorcCancerMP(persona.getDatos().getPorcCancerMP()+ 10);
            }
        }//fin else
        
        //faltan los factores externos, consumo de alcohol, tabaquismo
    }
    
    public void calpordiabetes(){
        if(persona.getDatos().isDiabetes()==true)
            persona.getDatos().setPorcDiabetes(100);
        else{
            if(persona.getMadre()!= null && persona.getMadre().getDatos().isDiabetes()==true)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcDiabetes()+4);
            if(persona.getPadre()!=null && persona.getPadre().getDatos().isDiabetes()==true)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcDiabetes()+6);
            if(persona.getDatos().isObesidad()==true)
               persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcDiabetes() + 10);
            if(persona.getDatos().isPregHabito4()==false)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcCancerMP()+15);
            else 
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcCancerMP()- 10);
            if(persona.getDatos().isPregHabito3()==true)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcCancerMP()+ 15);
            if(persona.getDatos().isPregHabito8()==true)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcDiabetes()+9);
            if(persona.getDatos().isPregHabito5()==true)
                persona.getDatos().setPorcDiabetes(persona.getDatos().getPorcDiabetes()+4);
            //faltan lo de los habitos, es de que no entiendo las respuestas de bethssssssss
        }
    }
    
    public void calportuboneural(){
        if(persona.getDatos().isDefectosTN()==true)
            persona.getDatos().setPorcDefectosTN(100);
        else{
            if(persona.getMadre()!= null){
                if(persona.getMadre().getDatos().isDefectosTN()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+2);
                if(persona.getMadre().getDatos().isObesidad()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+15);
                if(persona.getMadre().getDatos().isDiabetes()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+15);
                if(persona.getMadre().getDatos().isPregHist5()==true)
                    persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+19);
                if(persona.getMadre().getDatos().isPregHabito9()==true)
                    persona.getDatos().setPorcLabioL(persona.getDatos().getPorcLabioL()+20);
            }
            if(persona.getPadre()!=null){
                if(persona.getPadre().getDatos().isDefectosTN()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+2);
                if(persona.getPadre().getDatos().isObesidad()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+10);
                if(persona.getPadre().getDatos().isDiabetes()==true)
                    persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+10);
            if(persona.getDatos().isPregHist8()==true)
                persona.getDatos().setPorcDefectosTN(persona.getDatos().getPorcDefectosTN()+10);
                //método completo.
            }
        }
    }
    
    public void calporhipertension(){
        if(persona.getDatos().isHipertension()==true)
            persona.getDatos().setPorcHipertension(100);
        else{
            
            if(persona.getMadre()!=null && persona.getMadre().getDatos().isHipertension()==true)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+10);
            if(persona.getPadre()!=null && persona.getPadre().getDatos().isHipertension()==true)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+10);
            if(persona.getDatos().getEdad()>60)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+60);
            if(persona.getDatos().getEdad()>18 && persona.getDatos().getEdad()<60)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+23);
            if(persona.getDatos().isObesidad())
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+20);
            if(persona.getDatos().isPregHabito2()==true)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+15);
            if(persona.getDatos().isPregHabito3()==true)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+15);
            if(persona.getDatos().isPregHabito1()==true)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+15);
            if(persona.getDatos().isPregHabito4()==false)
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()+15);
            else
                persona.getDatos().setPorcHipertension(persona.getDatos().getPorcHipertension()-20);
            //sedentarismo, ingesta de alcohol, malos habitos alimenticios, tabaquismo
        }
    }
    
    public void calporobesidad(){
        if(persona.getDatos().isObesidad()==true)
            persona.getDatos().setPorcObesidad(100);
        else{
            if(persona.getMadre()!=null && persona.getMadre().getDatos().isObesidad()==true)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+20);
            if(persona.getPadre()!=null && persona.getPadre().getDatos().isObesidad()==true)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+20);
            if(persona.getDatos().isPregHabito1()==true)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+10);
            if(persona.getDatos().isPregHabito2()==true)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+10);
            if(persona.getDatos().isPregHabito3()==true)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+30);
            else 
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()-10);
            if(persona.getDatos().isPregHabito4()==false)
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()+10);
            else 
                persona.getDatos().setPorcObesidad(persona.getDatos().getPorcObesidad()-20);
            //faltan los factores externos, alimentacion, alcohol, sedentarismo, tabaquismo
        }
    }
    
    public void calporcesquizofrenia(){
        //que alguno de los dos padres lo tiene.
        if(persona.getMadre()!= null && persona.getMadre().getDatos().isEsquizofrenia()==true && persona.getPadre()!=null && persona.getPadre().getDatos().isEsquizofrenia()==false
                || persona.getMadre()!=null && persona.getMadre().getDatos().isEsquizofrenia()==false && persona.getPadre()!=null &&persona.getPadre().getDatos().isEsquizofrenia()==true)
            persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+13);
        //que ambos padres lo tienen
        if(persona.getMadre()!=null && persona.getMadre().getDatos().isEsquizofrenia()==true && persona.getPadre()!=null && persona.getPadre().getDatos().isEsquizofrenia()==true)
            persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+36);
        
        if(persona.getMadre()!=null && persona.getMadre().getMadre()!=null)//exixste abuela materna
            if(persona.getMadre().getMadre().getDatos().isEsquizofrenia()==true)//y tiene esquizofrenia.
                persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+4);
        
        if(persona.getMadre().getPadre()!=null)//exixste abuelo materno
            if(persona.getMadre().getPadre().getDatos().isEsquizofrenia()==true)//y tiene esquizofrenia.
                persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+4);
        
        if(persona.getPadre().getMadre()!=null)//exixste abuela paterna
            if(persona.getPadre().getMadre().getDatos().isEsquizofrenia()==true)//y tiene esquizofrenia.
                persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+4);
        
        if(persona.getPadre().getPadre()!=null)//exixste abuelo paterno
            if(persona.getPadre().getPadre().getDatos().isEsquizofrenia()==true)//y tiene esquizofrenia.
                persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+4);
        if(persona.getDatos().isPregHist2()==true)
            persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+15);
        
        if(persona.getDatos().isPregHabito6()==true)
            persona.getDatos().setPorcEsquizofrenia(persona.getDatos().getPorcEsquizofrenia()+15);
        //faltan los fcatores externos
    }
    
    public void calporchemofilia(){
        if(persona.getDatos().isHemofilia()==true)
            persona.getDatos().setPorcHemofilia(100);
        //si solo la madre lo tiene, 50 porciento
        if((persona.getMadre()!=null && persona.getMadre().getDatos().isHemofilia()==true) &&(persona.getPadre()!=null &&persona.getPadre().getDatos().isHemofilia()==false))
            persona.getDatos().setPorcHemofilia(50);
        //si solo el padre lo tiene, 0 porciento
        if((persona.getMadre()!=null && persona.getMadre().getDatos().isHemofilia()==false) &&(persona.getPadre()!=null &&persona.getPadre().getDatos().isHemofilia()==true))
            persona.getDatos().setPorcHemofilia(0);
        //si ambos lo tienen 
        if((persona.getMadre()!=null && persona.getMadre().getDatos().isHemofilia()==true) &&(persona.getPadre()!=null &&persona.getPadre().getDatos().isHemofilia()==true))
            persona.getDatos().setPorcHemofilia(25);
        //si ambos NO lo tienen, no afecta en nada.
        if((persona.getMadre()!=null && persona.getMadre().getDatos().isHemofilia()==false) &&(persona.getPadre()!=null &&persona.getPadre().getDatos().isHemofilia()==false))
            persona.getDatos().setPorcHemofilia(0);
        
        if(persona.getDatos().isPregHist1()==true)
            persona.getDatos().setPorcHemofilia(persona.getDatos().getPorcHemofilia()+15);
        if(persona.getDatos().isPregHist3()==true)
            persona.getDatos().setPorcHemofilia(persona.getDatos().getPorcHemofilia()+15);
        
        //despues van los fcatores externos, para que ese cero de aqui arriba no afecte.
        
    }
    

    private float IMC(float peso, float estatura){
        
        double altura = estatura*100;
        float imc = (float) (peso/Math.pow(altura, 2));
        
        return imc;
        
    }
    
    public void rangoObesidad(float peso, float estatura){
        
        if(IMC(peso, estatura) < 18.5f){
            persona.getDatos().setObesidad(false);
            setSobrepeso(false);
        }else{
            if(IMC(peso, estatura) > 27.0f && IMC(peso, estatura) < 29.9f){
                setSobrepeso(true);
                persona.getDatos().setObesidad(false);
            }else{
                if(IMC(peso, estatura) > 30.0f && IMC(peso, estatura) < 49.9f){
                    setSobrepeso(true);
                    persona.getDatos().setObesidad(true);
                }
            }
        }
            
    }  
}