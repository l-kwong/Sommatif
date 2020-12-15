/*
* Author : laurenkwong
* Date : 15-Dec-2020
* Description : Ce méthode permet de faire la somme des nombres premiers contenus dans un tableau de 100 nombres entiers générés
au hasard
*/
public class Methode
	{

		public static void main(String[] args)
			{
				int []myTab=new int[100];
				for(int i=0; i<100; i++)
				{
					myTab[i]=(int)(Math.random()*(i+1));
				}
				
				System.out.println(calculerSomme(myTab));
			}
		
		static int nombrePremier(int n)
			{
				int cpt=0; 
				for(int i=2; i<=n/2; i++)
				{
					if(n%i==0) 
						cpt++;
				}
				return cpt;
			}
		static int calculerSomme(int[]cpt)
			{
				int somme=0;
				for(int i=0;i<cpt.length;i++)
					somme+=cpt[i]; 
				return somme;
			}
		 

	}
