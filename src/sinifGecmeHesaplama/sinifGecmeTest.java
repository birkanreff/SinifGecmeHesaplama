package sinifGecmeHesaplama;

import java.util.Scanner;

public class sinifGecmeTest {

	public static void main(String[] args) {
		int toplam=0;
		int sayac=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik dersinizin sınav notunu giriniz: ");
		int math=input.nextInt();
		
		if (math >= 0 & math <=100) {
			toplam += math ;
			sayac++ ;
			
			
		}
		
		System.out.print("Fizik dersinizin sınav notunu giriniz: ");
		int physics=input.nextInt();
		
		if (physics >= 0 & physics <= 100) {
			toplam += physics;
			sayac++;
			
		}
		System.out.print("Türkçe dersinizin sınav notunu giriniz: ");
		int trk=input.nextInt();
		
		if (trk>=0 & trk <=100) {
			toplam += trk;
			sayac++;
			
		}
		System.out.print("Kimya dersinizin sınav notunu giriniz: ");
		int chem=input.nextInt();
		
		if (chem >= 0 & chem <= 100) {
			toplam += chem;
			sayac++;
			
		}
		System.out.print("Müzik dersinizin sınav notunu giriniz: ");
		int music=input.nextInt();
		
		if (music >=0 & music <=100) {
			toplam += music;
			sayac++;
			
		}
		
		double ortalama = toplam/sayac;
		
		
		
		if(ortalama >= 55) {
			System.out.println("Geçerli notlarınızın ortalaması:  " + ortalama );
			
			System.out.println ("Sınıfı geçtiniz tebrik ederim :) ");
			
			
		} else {
			System.out.println("Geçerli notlarınızın ortalaması:  " + ortalama );
			
			System.out.println("Sınıfı geçemediniz üzgünüm. ");
			
		}
		
		
		
		
		
		
		
		
		

	}

}
