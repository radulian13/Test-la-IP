package com.example.test;
import com.example.babies.babies;
import com.example.student.student;

/**
 * Created by VoldHouse on 10/26/2014.
 */
public class Test {
    public static void main(String[] args){
        //aceasta este functia main care va fi apelata
        //si va rula toate functiile

        System.out.println("Bine ati venit la Lab2!");

        String[] ArrayOfStrings={"Subpunctul1","Subpunctul2","Subpunctul3"};
        for(String string:ArrayOfStrings){
            System.out.println("Vom realiza in acest lab: "+ string );
        }
        System.out.println(ArrayOfStrings[0]);
        //am creat o clasa separata babies, am importat-o si am creat un obiect de tip babies
        babies b=new babies("Andrei",true,20,90,2);
        //am creat o clasa separata studenti, am importat-o si acum creez obiect de tip student
        student s=new student("Defta","Marina",false,9.78,13);
        b.afisare();//functie de afisare in clasa babies
        s.afisare_student();
        //setez numele bebelusului alexandru
        b.setNume("Alexandru");
        b.afisare();
        System.out.println(ArrayOfStrings[1]);
        for(int i=0;i<=ArrayOfStrings.length;i++){
            try{
                System.out.println("This is a string: "+ ArrayOfStrings[i] );
            }
            catch(Exception e)
            {
                System.out.println("Exceptia este: "+e);
            }

        }
        System.out.println(ArrayOfStrings[2]);
        System.out.println("Am creat fisierul .gitignore!");
    }
}
