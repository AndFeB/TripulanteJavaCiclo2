package view;

import model.Curso;

public class Vista {
    
public static void main(String[] args) {
    Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 7400 , "Guillaume");
    System.out.println(cursoFrances.getCodigo());
    System.out.println(cursoFrances.getJornada());
    System.out.println(cursoFrances.getNombre());
    System.out.println(cursoFrances.getFormador().getNombre());
    System.out.println(cursoFrances.getFormador().getCodigo());

}












}
