/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarray;
/**
 *
 * @author benu
 */
public class ArraywithNilai extends TugasArray {
    
    public void main_func()
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
            
            nilai_total = (nilai_total+nilai_akhir[i]);
            
            if(nilai_max < nilai_akhir[i])
            {
                nilai_max = nilai_akhir[i];
            }
            
            if(nilai_min > nilai_akhir[i])
            {
                nilai_min = nilai_akhir[i];
            }
            
        }
        
        nilai_rerata = nilai_total / nilai_akhir.length;
        
        System.out.println("- Rata-rata \t : "+nilai_rerata);
        System.out.println("- Nilai Max \t : " + nilai_max);
        System.out.println("- Nilai Min \t : " + nilai_min);
    }


}
