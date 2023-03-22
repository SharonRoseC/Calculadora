import calculadoraPackage.CalculadoraCientifica;
import calculadoraPackage.CalculadoraComum;
import org.junit.jupiter.api.Test;
import java.lang.Math;

import static org.junit.jupiter.api.Assertions.*;


class  CalculadoraTest {

    CalculadoraComum calculadoraComum = new CalculadoraComum() ;
    CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();


    @Test
    public void soma(){
        calculadoraComum.setNum1(-8.62);
        calculadoraComum.setNum2(8);
        assertEquals(calculadoraComum.soma(), calculadoraComum.getNum1()+calculadoraComum.getNum2());
    }

    @Test
    public void subtracao(){
        calculadoraComum.setNum1(-50);
        calculadoraComum.setNum2(8);
        assertEquals(calculadoraComum.subtracao(), calculadoraComum.getNum1()-calculadoraComum.getNum2());
    }

    @Test
    public void multiplicacao(){
        calculadoraComum.setNum1(7);
        calculadoraComum.setNum2(100);
        assertEquals(calculadoraComum.multiplicacao(), calculadoraComum.getNum1()*calculadoraComum.getNum2());
    }

    @Test
    public void divisao(){
        calculadoraComum.setNum1(100);
        calculadoraComum.setNum2(0);
        if(calculadoraComum.getNum2() == 0){
            calculadoraComum.setNum2(2);
            assertEquals(calculadoraComum.dividir(), calculadoraComum.getNum1()/calculadoraComum.getNum2());
        }
        assertEquals(calculadoraComum.dividir(), calculadoraComum.getNum1()/calculadoraComum.getNum2());

    }


    @Test
    public  void  exponenciar(){
        calculadoraCientifica.setNum1(8);
        calculadoraCientifica.setNum2(7);
        assertEquals(calculadoraCientifica.exponenciar(),Math.pow(calculadoraCientifica.getNum1(),calculadoraCientifica.getNum2()));
    }

    @Test
    public void seno(){
        calculadoraCientifica.setNum1(-874.34);
        assertEquals(calculadoraCientifica.calcularSeno(),Math.sin(calculadoraCientifica.getNum1()));
    }

    @Test
    public  void cosseno(){
        calculadoraCientifica.setNum1(-545.65);
        assertEquals(calculadoraCientifica.calcularCosseno(),Math.cos(calculadoraCientifica.getNum1()));
    }

    @Test
    public  void tangente(){
        calculadoraCientifica.setNum1(-665);
        assertEquals(calculadoraCientifica.calcularTangente(),Math.tan(calculadoraCientifica.getNum1()));
    }

    @Test
    public  void log(){
        calculadoraCientifica.setNum1(-656);
        assertEquals(calculadoraCientifica.calcularLogaritmo(),Math.log10(calculadoraCientifica.getNum1()));
    }




}