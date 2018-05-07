/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarray;

import java.util.Scanner;

/**
 *
 * @author benu
 */
public class TugasArray {
    
    protected static Scanner sc = new Scanner(System.in);
    
    protected static String[] nama = new String[5];
    protected static double[] uts = new double[5];
    protected static double[] uas = new double[5];
    protected static double[] nilai_akhir = new double[5];
    protected static double nilai_total = 0;
    protected static double nilai_rerata;
    protected static double nilai_max = 0;
    protected static double nilai_min = 100;
    
    public static void main(String[] args) {
        new ArraywithNilai().main_func();
    }
    
    protected static void printOut()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("============================================");
            
            System.out.print("- Nama : ");
            nama[i] = sc.nextLine();
            System.out.print("- Nilai UTS : ");
            uts[i] = sc.nextDouble();
            System.out.print("- Nilai UAS : ");
            uas[i] = sc.nextDouble();
            
            nilai_akhir[i] = (0.4 * uts[i]) + (0.6 * uas[i]);
            System.out.println("** Nama : "+nama[i]);
            System.out.println("** Nilai Akhir : "+nilai_akhir[i]);
            
            System.out.println("============================================");
            sc.nextLine();
        }
    }
    
}
