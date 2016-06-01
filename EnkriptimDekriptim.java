package DetyratGjateJaveve;

public class EnkriptimDekriptim {

		

		public static double ShkronjeNumerHex(String a)
		{
			String lower = a.toLowerCase();
			double numeric = 0;
			switch(lower)
			{
			case "a":
				numeric = 61;
				break;
			case "b":
				numeric = 62;
				break;
			case "c":
				numeric = 63;
				break;
			case "d":
				numeric = 64;
				break;
			case "e":
				numeric = 65;
				break;
			case "f":
				numeric = 66;
				break;
			case "g":
				numeric = 67;
				break;
			case "h":
				numeric = 68;
				break;
			case "i":
				numeric = 69;
				break;
			case "j":
				numeric = 70;
				break;
			case "k":
				numeric = 71;
				break;
			case "l":
				numeric = 72;
				break;
			case "m":
				numeric = 73;
				break;
			case "n":
				numeric = 74;
				break;
			case "o":
				numeric = 75;
				break;
			case "p":
				numeric = 76;
				break;
			case "q":
				numeric = 78;
				break;
			case "r":
				numeric = 79;
				break;
			case "s":
				numeric = 80;
				break;
			case "t":
				numeric = 81;
				break;
			case "u":
				numeric = 82;
				break;
			case "v":
				numeric = 83;
				break;
			case "w":
				numeric = 84;
				break;
			case "x":
				numeric = 85;
				break;
			case "y":
				numeric = 86;
				break;
			case "z":
				numeric = 87;
				break;
						
			}
		return	numeric;
		}
		
		
		public static String NumerShkronje(double n)
		{	int  num = (int)(n);
			String string = "";
			switch(num)
			{
			case 61:
				string = "a";
				break;
			case 62:
				string = "b";
				break;
			case 63:
				string = "c";
				break;
			case 64:
				string = "d";
				break;
			case 65:
				string = "e";
				break;
			case 67:
				string = "f";
				break;
			case 68:
				string = "g";
				break;
			case 69:
				string = "h";
				break;
			case 70:
				string = "i";
				break;
			case 71:
				string = "j";
				break;
			case 72:
				string = "k";
				break;
			case 73:
				string = "l";
				break;
			case 74:
				string = "m";
				break;
			case 75:
				string = "n";
				break;
			case 76:
				string = "o";
				break;
			case 77:
				string = "p";
				break;
			case 78:
				string = "q";
				break;
			case 79:
				string = "r";
				break;
			case 80:
				string = "s";
				break;
			case 81:
				string = "t";
				break;
			case 82:
				string = "u";
				break;
			case 83:
				string = "v";
				break;
			case 84:
				string = "w";
				break;
			case 85:
				string = "x";
				break;
			case 86:
				string = "y";
				break;
			case 87:
				string = "z";
				break;
				
			}
		return string;	
		}
		
	

}
