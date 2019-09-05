/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import java.util.Scanner;



/**
 *
 * @author santuy
 */
public class CumaCobaCoba {
   public static void main (String [] args) {
        int harian,laporan,ujian,akhir;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan nilai harian: ");
        harian = scanner.nextInt();
        harian = harian * 30 / 100;
        System.out.println("nilai harian:" + harian);
        System.out.println("masukkan nilai laporan: ");
        laporan = scanner.nextInt();
        laporan = laporan * 20 / 100 ;
        System.out.println("nilai laporan: "+ laporan);
        System.out.println("masukkan nilai ujian: ");
        ujian = scanner.nextInt();
        ujian = ujian * 50 / 100;
         System.out.println("nilai ujian: "+ ujian );
         akhir = harian + laporan + ujian;
         System.out.println("nilai akhir:" + akhir ) ;
         if (akhir <= 40) {
             System.out.println("anda mendapat predikat F");
             System.out.println("Anda tidak lulus , tingkatkan belajar anda");
         }else if (akhir <= 55) {
             System.out.println ("anda mendapat predikat E");
             System.out.println("Anda tidak lulus , tingkatkan belajar anda");
         }else if (akhir <= 75) {
             System.out.println (" anda mendapat predikat D");
             System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
         }else if (akhir <= 85) {
             System.out.println (" anda mendapat predikat C");
             System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
         }else if (akhir <= 92) {
             System.out.println ("anda mendapat predikat B");
             System.out.println("Anda lulus dengan baik, pertahankan prestasimu");
         }else if (akhir <= 100){
             System.out.println("anda mendapat predikat A");
             System.out.println("Anda lulus, Excellent");
         }
      
        
        
       
      } 
    }
    

