/*
* Author : laurenkwong
* Date : 15-Dec-2020
* Description des erreurs : 
* 1. le public class doit être le nom du class et non pas le nom du java projet
* 2. John n'est pas un variable donc on doit le mettre dans des "" parce que c'est le nom qui remplace le variable nom
* 3. on doit ajouter un return message parce que le méthode saluerAmi il n'a pas un void
* 4. ajouter static au public String saluerAmi(String nom) parce que si non c'est un méthode non statique sans un void
*/
public class Erreurs
	{

		public static void main(String[] args)
			{
				System.out.println(saluerAmi("John"));

			}
		/* 
		* Méthode permettant de saluer un ami en
		* utilisant son nom
		*/
			
		public static String saluerAmi(String nom)
		{
				String message="Bonjour mon ami " + nom;
				return message;
		}
	}
