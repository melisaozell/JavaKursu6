package Gun09;

import java.util.Scanner;

public class _06_JavaIf
{
    public static void main(String[] args) {
        //girilen bir cümlede a harfinin geçip geçmediğini bulun
        //geçiyorsa evet geçmiyorsa hayır yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cumle=oku.nextLine();

        boolean varMi=cumle.contains("a");

        if(varMi==true)
            System.out.println("evet");
        if (varMi==false)
            System.out.println("hayır");

        //2.yol
        if(cumle.contains("a")==true)
            System.out.println("evet");
        if (cumle.contains("a")==false)
            System.out.println("hayır");

        //3.yol
        if(cumle.contains("a"))
            System.out.println("evet");
        if (!cumle.contains("a")) // içerisinde a geçiyor DEĞİLSE(!)
            System.out.println("hayır");

        //Alternatif
        cumle.contains("a"); // a içeriyor mu
        cumle.indexOf("a");//a içeriyor ise indexini verir (0-....)

        if(cumle.indexOf("a")>=0)
            System.out.println("evet");
        if (cumle.indexOf("a")==-1)
            System.out.println("hayır");




    }


}
