import java.util.Scanner;

public class Xacaahorcadonuevo 
{
 	static Scanner scanner = new Scanner(System.in); 
	static int seleccionar = -1; 
    public static void main(String[] args) 
    {

        while(seleccionar != 0)
        {
        	
		System.out.println("___  ___          _             _          _                        ");
		System.out.println("|  \\/  |         | |           | |        (_)                       ");
		System.out.println("| .  . | ___   __| | ___     __| | ___     _ _   _  ___  __ _  ___  ");
		System.out.println("| |\\/| |/ _ \\ / _` |/ _ \\   / _` |/ _ \\   | | | | |/ _ \\/ _` |/ _ \\ ");
		System.out.println("| |  | | (_) | (_| | (_) | | (_| |  __/   | | |_| |  __/ (_| | (_) |");
		System.out.println("\\_|  |_/\\___/ \\__,_|\\___/   \\__,_|\\___|   | |\\__,_|\\___|\\__, |\\___/ ");
		System.out.println("                                         _/ |            __/ |      ");
		System.out.println("                                        |__/            |___/       ");

		System.out.println(" __         ______                    _                  _                                  _     _           ");
		System.out.println("/  |        | ___ \\                  | |                | |                                | |   (_)          ");
		System.out.println("`| |        | |_/ /___  ___  ___ __ _| |_ __ _    __ _  | | __ _  __  ____ _  ___ __ _  ___| |__  _  ___ __ _ ");
		System.out.println(" | |        |    // _ \\/ __|/ __/ _` | __/ _` |  / _` | | |/ _` | \\ \\/ / _` |/ __/ _` |/ __| '_ \\| |/ __/ _` |");
		System.out.println("_| |_  _    | |\\ \\  __/\\__ \\ (_| (_| | || (_| | | (_| | | | (_| |  >  < (_| | (_| (_| | (__| | | | | (_| (_| |");
		System.out.println("\\___/ (_)   \\_| \\_\\___||___/\\___\\__,_|\\__\\__,_|  \\__,_| |_|\\__,_| /_/\\_\\__,_|\\___\\__,_|\\___|_| |_|_|\\___\\__,_|");

		System.out.println(" _____       ___  _                                                                                                                _                                _       _ ");
		System.out.println("/ __  \\     / _ \\| |                                                                                                              | |                              (_)     | |");
		System.out.println("`' / /'    / /_\\ \\ |__   ___  _ __ ___ __ _    __ _  __  ____ _  ___ __ _   _ __   __ _ _ __ __ _    __ _  __ _ _ __   __ _ _ __  | |_ _   _   _ __   __ _ _ __ ___ _  __ _| |");
		System.out.println("  / /      |  _  | '_ \\ / _ \\| '__/ __/ _` |  / _` | \\ \\/ / _` |/ __/ _` | | '_ \\ / _` | '__/ _` |  / _` |/ _` | '_ \\ / _` | '__| | __| | | | | '_ \\ / _` | '__/ __| |/ _` | |");
		System.out.println("./ /____   | | | | | | | (_) | | | (_| (_| | | (_| |  >  < (_| | (_| (_| | | |_) | (_| | | | (_| | | (_| | (_| | | | | (_| | |    | |_| |_| | | |_) | (_| | | | (__| | (_| | |");
		System.out.println("\\_____(_)  \\_| |_/_| |_|\\___/|_|  \\___\\__,_|  \\__,_| /_/\\_\\__,_|\\___\\__,_| | .__/ \\__,_|_|  \\__,_|  \\__, |\\__,_|_| |_|\\__,_|_|     \\__|\\__,_| | .__/ \\__,_|_|  \\___|_|\\__,_|_|");
		System.out.println("                                                                           | |                       __/ |                                    | |                             ");
		System.out.println("                                                                           |_|                      |___/                                     |_|                             ");

		System.out.println(" _____       __   __                            _          _    _  _    _ _____ ");
		System.out.println("|____ |      \\ \\ / /                           | |        | |  | || |  | |  ___|");
		System.out.println("    / /       \\ V /  __ _  ___ __ _    _   _   | | __ _   | |  | || |  | | |__  ");
		System.out.println("    \\ \\       /   \\ / _` |/ __/ _` |  | | | |  | |/ _` |  | |/\\| || |/\\| |  __| ");
		System.out.println(".___/ /  _   / /^\\ \\ (_| | (_| (_| |  | |_| |  | | (_| |  \\  /\\  /\\  /\\  / |___ ");
		System.out.println("\\____/  (_)  \\/   \\/\\__,_|\\___\\__,_|   \\__, |  |_|\\__,_|   \\/  \\/  \\/  \\/\\____/ ");
		System.out.println("                                        __/ |                                   ");
		System.out.println("                                       |___/                                    ");

                                                                                                                                                                                                                           

				seleccionar = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(seleccionar){

					case 1:
					Scanner s = new Scanner(System.in);
        			int vidasdelxaca = 6;
        			String palabra;
        			int avance = 0;
        			int largo;
        			String opcion;
        			int contador = 0;
        			String[] palabras = new String[]{"XACACLETA", "HOLAMUNDO", "PROGRAMAR", "XACACOCHE", "XACACUEVA"};
        			char[] respuesta;
        			palabra = palabras[(int) (Math.random() * 5)];
        			largo = palabra.length();
        			respuesta = new char[largo];
         
         
        			for (int i = 0; i < largo; i++) 
        			{
        			    respuesta[i] = '+';
        			}

        			while (avance != largo && vidasdelxaca != 0) 
        			{
        			    System.out.println("Rapido Alcanza a la xacachica     Vidas del xaca="+vidasdelxaca +" Avanzado hasta el momento= "+avance);
        			    dibujar(vidasdelxaca);
        			    System.out.println("");
        			    for (int i = 0; i < largo; i++) 
            			{
 						
           			 		System.out.print("->" + respuesta[i] + "<--  ");
            			}
            			System.out.println("\nIngresa una letra: ");
            			opcion = s.next();
            			if (palabra.contains(opcion)) 
            			{
            			    for (int i = 0; i < largo; i++) 
            			    {
            			        if (palabra.charAt(i) == opcion.charAt(0)) 
            			        {
            			            respuesta[i] = opcion.charAt(0);
            			            contador++;
            			        }
            			    }
 			
            			    avance = avance + contador;
            			} 
            			else 
            			{
            			    vidasdelxaca--;
            			}
 			
            			contador = 0;
        			}
        			if(vidasdelxaca==0)
        			{
            			dibujar(vidasdelxaca);
        			}
        			else
        			{
            			System.out.println("");
            			for (int i = 0; i < largo; i++) 
            			{
 	
                		System.out.print("->" + respuesta[i] + "<--  ");
            			}
            			System.out.println("  ");

						System.out.println("______                    _            _                 _                                  _     _                 _______ ");
						System.out.println("| ___ \\                  | |          | |               | |                                | |   (_)              _( )  _  \\");
						System.out.println("| |_/ /___  ___  ___ __ _| |_ __ _ ___| |_ ___    __ _  | | __ _  __  ____ _  ___ __ _  ___| |__  _  ___ __ _    (_)/| | | |");
						System.out.println("|    // _ \\/ __|/ __/ _` | __/ _` / __| __/ _ \\  / _` | | |/ _` | \\ \\/ / _` |/ __/ _` |/ __| '_ \\| |/ __/ _` |       | | | |");
						System.out.println("| |\\ \\  __/\\__ \\ (_| (_| | || (_| \\__ \\ ||  __/ | (_| | | | (_| |  >  < (_| | (_| (_| | (__| | | | | (_| (_| |    _  | |/ / ");
						System.out.println("\\_| \\_\\___||___/\\___\\__,_|\\__\\__,_|___/\\__\\___|  \\__,_| |_|\\__,_| /_/\\_\\__,_|\\___\\__,_|\\___|_| |_|_|\\___\\__,_|   (_) |___/  ");
                        
                        System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");                                                                                                   
                        
						System.out.println("+;:,:,;:':,:,::':::,:,':;:,:,;:;:,:,;:':,:,::':::,:,':::,:,;:;:,:,;:':,:,::+");
						System.out.println("+':,:,;:':,:,;:':::,;:':;:,::':':,:,;:':,:,;:+:::,;:':;:,::':;:,::':':,:,;:+");
						System.out.println("+;,,,,:,',,,.:,',:,.:,',;,.,,;,;,.,,;,',,,.:,',,,.:,',:,.:,',;,.,,;,',,,,:,+");
						System.out.println("#'':';''++;+'#+#+'+'++#+'+;++#+++;+'#+++;+'#+#+'+'++#+'+;++#+++;++#+++;+'#+#");
						System.out.println("+;,,,,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+:,,,,:,'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,.:,+@@@@@@@@@@@@@::@@++@';@@:;'@@;#@@:;'@#;@@++#@;::@@:;@@@@@@@@@@@@@@@");
						System.out.println("+:....,.'@@@@@@@@@@@@.@@:@'@+@@`.@@;+'@.@.@,@+.@'@'@,;@`@,.@@@@@@@@@@@@@@@@@");
						System.out.println("+':,:,;:#@@@@@@@@@@@@`@`#::;@,:@ '@@@;@ '@;`@' @;@;;@@# @@` `@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,:,+@@@@@@@@@@@:` `@.:@@@`,  @@#;,` @ .@ `.;#@',@` @,`'@@@@@@@@@@@@@@@@");
						System.out.println("#++;+'++@@@@@@@@@@@@;,@.@,'@#@,...@;+'@#.@.,@.#@'#'':@,.@:,@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@';@;+'++@';@@;;'@@@@;@;;@;@@@##+#@;;@';;;@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@:@@@@,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@`@.@@@@@.@@@.@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@# @`@@@@:`@@#`@`#@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,` .:@@@ .@@:` `,@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:+@+;@@@,,@+;+@+;@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'@@@+@@@;'+#+@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@#+@@,@#:@@+';+@+:@@+';+@,@####+';+@#:@@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@#;@``@`@;@'@+`@`@;@'@+`@`@####;@+`@`@;@@@@@@@@@@@@@@@@@");
						System.out.println("#@@@@@@@@@@@@@@@@@@@@@@.:@; @:@:@@@; @:@:@@@; @;#;#:@@@; @:@@@@@@@@@@@@@@@@@");
						System.out.println("+';';;;;+@@@@@@@@@@@@@#,,@``,;#;#@@``,;#;#@@``,;#;#;#@@``,;#@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,:,+@@@@@@@@@@@@#'@,,,@@+#'#+,,@@+#'#+,,,@##'@'#+,,@@+#@@@@@@@@@@@@@@@@");
						System.out.println("+:....,.'@@@@@@@@@@@@@#@@''@@@@##+@'@@@@##+@''@@@#@##+@'@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,;,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,.,.:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+';:;;';#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@';:;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;;:;:;;+@@@@@@@@@@@@@@@@@@@@@@@@@@@@':::#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@:,:,+@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+:....,.'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;''@@@+;'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,;,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'+;@@@+:,'@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,.,.:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@+''''@@@,:'@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+'':';''#@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'''+@@':.'@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;,,,,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'@'#@@,  `@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("+;;:;:;;';';;;;';';;;;';';;;;';';';;;:;;::;;`. .;;;;';';;;;';';;;;';';';;;;'");
						System.out.println("+;,,,,:,',,,.:,',:,.:,',;,.,,;,;,.,,;,',,,.:,',,,.:,',:,.,,;,;,.,,;,',,,.:,+");
						System.out.println("+:....,.:....,.:.,....:.:....:.:....,.:....,.:.,..,.:.,....:.:....,.:....,.;");

                                                                                                                       
        			}
        			break;

        			case 2:
        			Scanner s1 = new Scanner(System.in);
        			int bonificaciones = 5;
        			String palabra1;
        			int notas_salvadas = 0;
        			int largo1;
        			String opcion1;
        			int contador1 = 0;
        			String[] palabras1 = new String[]{"SUPLETORIO", "REMEDIALES", "CHANCLETAS", "ENDULZADAS"};
        			char[] respuesta1;
        			palabra1 = palabras1[(int) (Math.random() * 4)];
        			largo1 = palabra1.length();
        			respuesta1 = new char[largo1];
         
         
        			for (int j = 0; j < largo1; j++) 
        			{
        			    respuesta1[j] = '+';
        			}

        			while (notas_salvadas != largo1 && bonificaciones != 0) 
        			{
        			    System.out.println("Mision Ganar el semestre     bonificaciones="+bonificaciones +" Total de notas del semestre= "+notas_salvadas);
        			    dibujar1(bonificaciones);
        			    System.out.println("");
        			    for (int j = 0; j < largo1; j++) 
            			{
 						
           			 		System.out.print("->" + respuesta1[j] + "<--  ");
            			}
            			System.out.println("\nIngresa una letra: ");
            			opcion1 = s1.next();
            			if (palabra1.contains(opcion1)) 
            			{
            			    for (int j = 0; j < largo1; j++) 
            			    {
            			        if (palabra1.charAt(j) == opcion1.charAt(0)) 
            			        {
            			            respuesta1[j] = opcion1.charAt(0);
            			            contador1++;
            			        }
            			    }
 			
            			    notas_salvadas = notas_salvadas + contador1;
            			} 
            			else 
            			{
            			    bonificaciones--;
            			}
 			
            			contador1 = 0;
        			}
        			if(bonificaciones==0)
        			{
            			dibujar1(bonificaciones);
        			}
        			else
        			{
            			System.out.println("");
            			for (int j = 0; j < largo1; j++) 
            			{
 	
                		System.out.print("->" + respuesta1[j] + "<--  ");
            			}
            			System.out.println("  ");
            			System.out.println("  ");
            			System.out.println("  ");

						System.out.println(" _____                       _              _   _____                          _                    ______ ");
						System.out.println("|  __ \\                     | |            | | /  ___|                        | |               _   |  _  \\");
						System.out.println("| |  \\/ __ _ _ __   __ _ ___| |_ ___    ___| | \\ `--.  ___ _ __ ___   ___  ___| |_ _ __ ___    (_)  | | | |");
						System.out.println("| | __ / _` | '_ \\ / _` / __| __/ _ \\  / _ \\ |  `--. \\/ _ \\ '_ ` _ \\ / _ \\/ __| __| '__/ _ \\        | | | |");
						System.out.println("| |_\\ \\ (_| | | | | (_| \\__ \\ ||  __/ |  __/ | /\\__/ /  __/ | | | | |  __/\\__ \\ |_| | |  __/    _   | |/ / ");
						System.out.println(" \\____/\\__,_|_| |_|\\__,_|___/\\__\\___|  \\___|_| \\____/ \\___|_| |_| |_|\\___||___/\\__|_|  \\___|   (_)  |___/  ");

						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");

						System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
						System.out.println("`                                            ");
						System.out.println("`                                            ");
						System.out.println("`          ;;;;;;;                           ");
						System.out.println("`       #@@@@@@@@@`                          ");
						System.out.println("`      ,@'`      @`                          ");
						System.out.println("`      ,@        @;                          ");
						System.out.println("`      :@        @@                          ");
						System.out.println("`      +@        #@                          ");
						System.out.println("`      +@        #@                          ");
						System.out.println("`      +@        #@                          ");
						System.out.println("`      +@     ';''@                          ");
						System.out.println("`      +@  `'+'+++':                         ");
						System.out.println("`      +@  ;'';::;;,                         ");
						System.out.println("`      +@  ';,..,,::                         ");
						System.out.println("`      +@  '':;:,,::                         ");
						System.out.println("`      +@  ';,#+'+''#@                       ");
						System.out.println("`      +@ `;:,,+'','+.                       ");
						System.out.println("`      +@ `:,:,,:;,;,                        ");
						System.out.println("`      +@   ;;;'''''.                        ");
						System.out.println("`      +@    ';''';'                         ");
						System.out.println("`      +@     :'';';  ;                      ");
						System.out.println("`      +@       '';,,.             +++#.     ");
						System.out.println("`      +@       `  `              .`   ;;    ");
						System.out.println("`      +@       ` ;               .     +    ");
						System.out.println("`      +@       . ;               . : + +    ");
						System.out.println("`      +@       ,  `              .     ,    ");
						System.out.println("`      +@       :  +              `;' +'     ");
						System.out.println("`      +@          +`           .  .@;;.     ");
						System.out.println("`      +@          +'           @    '       ");
						System.out.println("`      +@          + ;           '   '       ");
						System.out.println("`      +@          ' `           #   '    ,  ");
						System.out.println("`      +@          ;  +          `;  '    ,  ");
						System.out.println("`      +@          :  .           :++# `,@   ");
						System.out.println("`      +@          .   :             @,.     ");
						System.out.println("`      ,@              ;             '       ");
						System.out.println("`      ,@                            '       ");
						System.out.println("`      `@         `                  '       ");
						System.out.println("`       @                           `##      ");
						System.out.println("`  ;####@######                     #  #     ");
						System.out.println("`  +@@@@@@@@@@@                    '   `;    ");
						System.out.println("`                                            ");
						System.out.println("`                                            ");
					
					}
					break;

					case 3:
					Scanner s2 = new Scanner(System.in);
        			int derribos = 3;
        			String palabra2;
        			int ronda = 0;
        			int largo2;
        			String opcion2;
        			int contador2 = 0;
        			String[] palabras2 = new String[]{"JCREATOR", "NETBEANS", "MATRICES", "TERNARIO"};
        			char[] respuesta2;
        			palabra2 = palabras2[(int) (Math.random() * 4)];
        			largo2 = palabra2.length();
        			respuesta2 = new char[largo2];
         
         
        			for (int j = 0; j < largo2; j++) 
        			{
        			    respuesta2[j] = '+';
        			}

        			while (ronda != largo2 && derribos != 0) 
        			{
        			    System.out.println("and here its ion cena     Derribos en ronda="+derribos +" Ronda actual= "+ronda);
        			    dibujar2(derribos);
        			    System.out.println("");
        			    for (int j = 0; j < largo2; j++) 
            			{
 						
           			 		System.out.print("->" + respuesta2[j] + "<--  ");
            			}
            			System.out.println("\nIngresa una letra: ");
            			opcion2 = s2.next();
            			if (palabra2.contains(opcion2)) 
            			{
            			    for (int j = 0; j < largo2; j++) 
            			    {
            			        if (palabra2.charAt(j) == opcion2.charAt(0)) 
            			        {
            			            respuesta2[j] = opcion2.charAt(0);
            			            contador2++;
            			        }
            			    }
 			
            			    ronda = ronda + contador2;
            			} 
            			else 
            			{
            			    derribos--;
            			}
 			
            			contador2 = 0;
        			}
        			if(derribos==0)
        			{
            			dibujar2(derribos);
        			}
        			else
        			{
            			System.out.println("");
            			for (int j = 0; j < largo2; j++) 
            			{
 	
                		System.out.print("->" + respuesta2[j] + "<--  ");
            			}
            			System.out.println("  ");
            			System.out.println("  ");
            			System.out.println("  ");
						
						System.out.println("______   _ _      _     _           _                                       _                      _     _        _                           _             "); 
						System.out.println("|  ___| | (_)    (_)   | |         | |                                     | |                    | |   | |      | |                         (_)            "); 
						System.out.println("| |_ ___| |_  ___ _  __| | __ _  __| | ___  ___    ___ _ __ ___  ___    ___| | __      _____  _ __| | __| |   ___| |__   __ _ _ __ ___  _ __  _  ___  _ __  "); 
						System.out.println("|  _/ _ \\ | |/ __| |/ _` |/ _` |/ _` |/ _ \\/ __|  / _ \\ '__/ _ \\/ __|  / _ \\ | \\ \\ /\\ / / _ \\| '__| |/ _` |  / __| '_ \\ / _` | '_ ` _ \\| '_ \\| |/ _ \\| '_ \\ "); 
						System.out.println("| ||  __/ | | (__| | (_| | (_| | (_| |  __/\\__ \\ |  __/ | |  __/\\__ \\ |  __/ |  \\ V  V / (_) | |  | | (_| | | (__| | | | (_| | | | | | | |_) | | (_) | | | |"); 
						System.out.println("\\_| \\___|_|_|\\___|_|\\__,_|\\__,_|\\__,_|\\___||___/  \\___|_|  \\___||___/  \\___|_|   \\_/\\_/ \\___/|_|  |_|\\__,_|  \\___|_| |_|\\__,_|_| |_| |_| .__/|_|\\___/|_| |_|"); 
						System.out.println("                                                                                                                                       | |                  "); 
						System.out.println("                                                                                                                                       |_|                  "); 

						System.out.println("  ");
            			System.out.println("  ");
            			System.out.println("  ");

            		}
            		break;

        			default:
					System.out.println("No mames >:v deja la pendejada");
					break;
        		}
        	
        }
    }  			 

	public static void dibujar(int i) 
    {
        switch (i) 
        {
            case 6:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("Hola me llamo xaca.");
			System.out.println("Te he convocado aqui por esta razon: ");
			System.out.println("bowser a secuestrado a mi chica");  
			System.out.println("ayudame a rescatarla de las manos de el");
			System.out.println("asi llevaras a cambio un bonificacion papu :v");
			System.out.println("  ");

			System.out.println("TUTORIAL");
			System.out.println("  ");
			System.out.println("Puedes ayudarme de la siguiente manera: ");
			System.out.println("en este mundo tienes solamente 6 vidas ");
			System.out.println("pero cuidado ya que tu eres el que les dara uso");
			System.out.println("en este mundo todo funciona a travez de palabras clave");
			System.out.println("puede salir cualquier palabra pero como pista te dare el tema");
			System.out.println("principal que es (lo mas mencionado en los memes y por mi xacarana)");
			System.out.println("ademas de cosas relacionadas con mi post holamundo.co ");
			System.out.println("cada palabra contiene 9 letras deberas adivinar cada una de ellas");
			System.out.println("para decifrar la palabra secreta con la palabra secreta tendras la llave");
			System.out.println("para llegar hasta la xacachica BUENA SUERTE!!!");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("BIEN EMPEZEMOS :D");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
 			System.out.println(";@@@@@@@@@@@@....,.:......:.,....,.:....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@,....:.,....,.:......:.,...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@,...,.:.,....:.,...,,.:....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@:,,,,:,:,,,,:,;,,,,,,;,:,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@'''''''''''''''''''''''''''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;#;#;'#;#'@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;,;::;,;'@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@:'+#''@:''@''#;@+@:+@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@''#@''@+''@''@'''@''#@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@+@@@@@@'@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;'++#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;.,,+@@@@@@@@@@@@@@#`@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;,+'+@@@@@@@@@@@@+ +'@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@::,::@@@@@@@@@@@@:',++#@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'';'@@@@@@@@@@@@+':+ `'.@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''+;;@@@@@@@@@@@@@#:.'+`+#@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''';@@@@@@@@@@@@@@@:';,++:@@@@@@@@@@@@@`"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,'''+@@@@@@@@@@@@@@;,;'+; @@@@@@@@@@@#:;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'''+@@@@@@@@@@@@@@@@#+`''@@@@@@@@@@@'@;"); 
 			System.out.println(";@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'#@@@@@@@@@@@@@@@@@@@@:;, @@@@@@@@@@;@@;"); 
 			System.out.println(";@@##,:..`,+.  .;+;`   ,'+:`   ,'',   `:'',   `:+;.   .;+;.   .'+:`   ,;"); 
 			System.out.println(";@@#+,:...,+.;;;''';;;;;''';;;;;''';;;;''';;;;;''';;;;;''';;;;;''';;;;;,"); 
 			System.out.println(";@@+`'`` `:`+;;;;;;;;;;;;';;;;;;';;;;;;;;';;;;;;';;;;;;;;;;;;;;;';;;;;;,"); 
 			System.out.println(";@@+.',.`.:.+;''##+';;'+##+';;'+##+';;'+##+';''+#+'';''##+';;'+##+';;'+;"); 
 			System.out.println(";@@#@;';;;;#:++####++++####++++####++++####++++####+++#####+++####++++#;"); 
 			System.out.println(";@@##,:....+.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@@#++++#+@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@+,',,`,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@#,',,.,;,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@##.,```.+`@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@##.:..`.+.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@#.'..`.;.#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 
 			System.out.println(";@@+.',.`.:.+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;"); 

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
            break;
 
            case 5:
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			
			
			System.out.println(",..;.#.:..,.#.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(".`.:.#,,....+.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;:'@@@@@@@@@@@@@@@@@@");
			System.out.println("+######+######@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'.'''@@@@@@@@@@@@@@@@@@");
			System.out.println("..`.+.',,`.;.+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@`;;'';@@@@@@@@@@@@@@@@");
			System.out.println("::;;#:';:::+:+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'`+',+@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@....,.:......:.,....,.:....@@@@@@@@@@@@@+:`.+,@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,....:.,....,.:......:.,...#@@@@@@@@@@@;;,'+,'@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,...,.:.,....:.,....,.:....@@@@@@@@@@@@@;++''.@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,,,,,:,:,,,,:,:,,,,,,:,:,,,#@@@@@@@@@@@@@@+::+@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@'''''''''''''''''''''''''''@@@@@@#@@@@@@@@,```@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+''+@@@@;#:#;'#:#'@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@:'#,+'+#'#;'#,+'@@@@@@@@@@@@@@@@#::'+@@@@@:;,;::;,;;@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@''#''++''#''#'''@@@@@@@@@@@@@@@@.:'#@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@#+@@+@@'@@#+@@'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@+;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@';:;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@':::#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@#:,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@#;+';@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@'+;;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@'''''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'");
			System.out.println("@@@@@@@@@@@@@@@@@@@@,;'''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@';#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@'@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:@#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'@@,");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@+");
			System.out.println("@@@@##,,...,+.  .'':`   ,'',`  `:'',   `:';.   `;+;.   .;+;`   ,'':`   ,'.");
			System.out.println("@@@@#+,,...,+.;;;''';;;;;'';;;;;;'';;;;;''';;;;;''';;;;;''';;;;;''';;;;;',");
			System.out.println("@@@@#`;`` `;`+;;;';;;;;;;;';;;;;;';;;;;;;;;;;;;;;';;;;;;;';;;;;;;';;;;;;'.");
			System.out.println("@@@@+.'..`.;.+;''##+';;'+##+';;'+##+';;'+##'';''+#+';;''##+';;'+##+';;'+#.");
			System.out.println("@@@@#@;':;';#:++####++++####++++####++++####++++###++++####++++####++++##;");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("        __         _              _     _                                            ");
			System.out.println("       /  |       | |            (_)   | |                                  _        ");
			System.out.println(" ______`| |     __| | ___  __   ___  __| | __ _   _ __   __ _ _ __  _   _  (_)   ___ ");
			System.out.println("|______|| |    / _` |/ _ \\ \\ \\ / / |/ _` |/ _` | | '_ \\ / _` | '_ \\| | | |      / __|");
			System.out.println("       _| |_  | (_| |  __/  \\ V /| | (_| | (_| | | |_) | (_| | |_) | |_| |  _  | (__ ");
			System.out.println("       \\___/   \\__,_|\\___|   \\_/ |_|\\__,_|\\__,_| | .__/ \\__,_| .__/ \\__,_| (_)  \\___|");
			System.out.println("                                                 | |         | |                     ");
			System.out.println("                                                 |_|         |_|                     ");            

            break;
 
            case 4:
			
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");


			System.out.println("@@@@@@@@@@@@@@....,.:......:.,....,.:....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,....:.,....,.:......:.,...#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,...,.:.,....:.,...,,.:....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@,,,,,:,:,,,,:,:,,,,,,:,:,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@'''''''''''''''''''''''''''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:#:#:;+:#'@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;,;,:;,;;@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''+'''#:''@''+@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''@#''@+'#@''@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@###@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+;'###@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@.:#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+';''##@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@#+'.:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#;,.,;'#@@@@@@@@@@@@#");
			System.out.println("@@@@@@@@++;,'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#':+::;#@@@@@@@@@@@@'");
			System.out.println("@@@@@@'``+,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@###@@@@#:::,,:#@@@@@@@@@@@@@");
			System.out.println("@@@@@;'+;,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+';;:.;@@@#';';#@#@@@@@@@@@@@@@");
			System.out.println("@@@@@.':,,'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'+'++@@@@##;+''@@@@@@@@@@@@@@.");
			System.out.println("@@@@++..;,'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@';''#@@@@@@@@@@@@:;");
			System.out.println("@@@@#;'.+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@#'',#@@@@@@@@@@#:@#");
			System.out.println("@@@@@#.''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@''''@@@@@@@@@@@'@@,");
			System.out.println("@@@@@:,.:+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@'@#@@@@@@@@;@@@+");
			System.out.println("@@@@##,,...,+.  .'':`   ,'',`  `:'',   `:';.   .;+;.  `,;':`   ,'+:`   ,'.");
			System.out.println("@@@@#+,,...,+.;;;''';;;;;''';;;;;'';;;;;''';;;;;''';;;;;''';;;;;''';;;;;',");
			System.out.println("@@@@#`;`` `;`+;;;';;;;;;;;';;;;;;';;;;;;;';;;;;;;';;;;;;;';;;;;;;';;;;;;'.");
			System.out.println("@@@@+.'..`.;.+;'+##+';;'+##+';;'+##+';;'+##'';''+#+';;''##+';;'+##+';;'+#.");
			System.out.println("@@@@#@;':;';#:++####++++####++++####++++####++++####+++####++++####++++##'");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("        _____       _              _     _                    _     _           _       _ ");
			System.out.println("       / __  \\     | |            (_)   | |                  (_)   | |         | |     | |");
			System.out.println(" ______`' / /'   __| | ___  __   ___  __| | __ _    ___ _   _ _  __| | __ _  __| | ___ | |");
			System.out.println("|______| / /    / _` |/ _ \\ \\ \\ / / |/ _` |/ _` |  / __| | | | |/ _` |/ _` |/ _` |/ _ \\| |");
			System.out.println("       ./ /___ | (_| |  __/  \\ V /| | (_| | (_| | | (__| |_| | | (_| | (_| | (_| | (_) |_|");
			System.out.println("       \\_____/  \\__,_|\\___|   \\_/ |_|\\__,_|\\__,_|  \\___|\\__,_|_|\\__,_|\\__,_|\\__,_|\\___/(_)");
                                                                                          
            break;
 
            case 3:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");


			System.out.println("++#+@+#++++@+#++++++#++++++###++++#+#++++++#++++++#+#++++++#++++++#+#++++#");
			System.out.println(",`,:,#,:.,.,+.@@@@@@@@@@@;:+@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(",.,;,+,:,,,,+,@@@@@@@@@@@@'+.,@@@@@@@@@@@@@@@@@@@:''@:''@:''@@@@@@@@@@@@@@");
			System.out.println("````+.;`` `;.+@@@@@@@@@@@@+',+@@@@@@@@@@@@@@@@@@@#'+@#'+@#'+@@@@@@@@@@@@@@");
			System.out.println("..`.+.'..`.;.+@@@@@@@@@@.;:;#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(",..;.#.:..,.#.@@@@@@@@@.++,+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(".`.:.#,,....+.@@@@@@@@#+,.':,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''@@@");
			System.out.println("+######+######@@@@@@@@+''.;,@@@@@@@@@@@@@@@@@@@@@@@##+@@@@@@@@@@@@@@:,+'@@");
			System.out.println(",.`.+,',,`.;.+@@@@@@@@@++,'@@@@@@@@@@@@@@@@@@@@@@@#';,;,#@@@@@@@@@@;;,.''@");
			System.out.println("::;;#:'::::+:+@@@@@@@@@+,+#@@@@@@@@@@@@@@@@@@@@@@@@#'''#@@@@@@@@@@@;;+,:'@");
			System.out.println("@@@@@@@@@@@@@@....,.:.; ``,,.,....,.:....@@@@@@@@@@@@@@@@@@@@@@@@@';',,'#@");
			System.out.println("@@@@@@@@@@@@@@,....:.,....,.:......:.,...#@@@@@@@@@@@@@@@@@@@@@@@@;;':::@@");
			System.out.println("@@@@@@@@@@@@@@,...,.:.,....:.,...,,.:....@@@@@@@@@@@@@@@@@@@@@@@@#;''+@@@@");
			System.out.println("@@@@@@@@@@@@@@,,,,,:,:,,,,:,:,,,,,,:,:,,,#@@@@@@@@@@@@@@@@@@@@@@#''''+@@@@");
			System.out.println("@@@@@@@@@@@@@@'''''''''''''''''''''''''''@@@@@@@@@@@@@@@@@@@@@@@#''':#@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:#:#:;+:#'@+@+'@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;,;,:;,;;@@+@'@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:@#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'@@,");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@+");
			System.out.println("@@@@##,,...,+.  .'':`   ,'',`  `:'',   `:';.   .;+;.   .;+;`   ,'+:`   ,'.");
			System.out.println("@@@@#+,,...,+.;;;''';;;;;''';;;;;'';;;;;''';;;;;''';;;;;''';;;;;''';;;;;',");
			System.out.println("@@@@#`;`` `;`+;;;';;;;;;;;';;;;;;';;;;;;;';;;;;;;';;;;;;;';;;;;;;';;;;;;'.");
			System.out.println("@@@@+.'..`.;.+;'+##+';;'+##+';;'+##+';;'+##'';''+#+';;''##+';;'+##+';;'+#.");
			System.out.println("@@@@#@;':;';#:++####++++####++++####++++####++++###++++####++++####++++##'");

                
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("       _____       _              _     _         _                              _         _                   _ _            _   _             _ ");
			System.out.println("      |____ |     | |            (_)   | |       | |                            | |       | |                 (_) |          | | | |    _      | |");
			System.out.println(" ______   / /   __| | ___  __   ___  __| | __ _  | |_ ___    __ _ _   _  ___  __| | __ _  | | __ _   _ __ ___  _| |_ __ _  __| | | |   (_)   __| |");
			System.out.println("|______|  \\ \\  / _` |/ _ \\ \\ \\ / / |/ _` |/ _` | | __/ _ \\  / _` | | | |/ _ \\/ _` |/ _` | | |/ _` | | '_ ` _ \\| | __/ _` |/ _` | | |        / _` |");
			System.out.println("      .___/ / | (_| |  __/  \\ V /| | (_| | (_| | | ||  __/ | (_| | |_| |  __/ (_| | (_| | | | (_| | | | | | | | | || (_| | (_| | |_|    _  | (_| |");
			System.out.println("      \\____/   \\__,_|\\___|   \\_/ |_|\\__,_|\\__,_|  \\__\\___|  \\__, |\\__,_|\\___|\\__,_|\\__,_| |_|\\__,_| |_| |_| |_|_|\\__\\__,_|\\__,_| (_)   (_)  \\__,_|");
			System.out.println("                                                               | |                                                                                ");
			System.out.println("                                                               |_|                                                                                ");

            break;
 
            case 2:
              
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("''''''''''''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(":,.,.,......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("';;;;;;;;;;;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@:,,.,.:,:,:.:,:,:,:,:,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@,,.,.,.:.:.:.,,:,:,:,:,:'@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@;'#:'+@@@@,.,.,,,,:,:,:,:,:,:,:,:,+@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@+'@#'@@@@@:,.,.,.:,,.:.,,:,,,:,:,:'@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;''''';'@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;';';';'@@@@@@@@@@");
			System.out.println("@@@@@@@@#'''+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@';.:+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@;,;::#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("#@@@@@#@;:,:+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@#@@#'''+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@+'';'#@::;;'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+@+:#@@@@@");
			System.out.println("@@@@@#@;'';#@@#+'++@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@::'+@@@@@@");
			System.out.println("@@@@@#@;''@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+:+#@@@@@");
			System.out.println("@@@@@#+'''##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;'.,'@@@@");
			System.out.println("@@@@@@#'#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:+,'''@@@");
			System.out.println("#@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:''+.@@;");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+';'@'@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@',++#@#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@',,`#@@@");
			System.out.println("#@@@.`.`.`.`;;;;;;;;;;;;;;;;;;;;;:::::::,,,,,,,,`,:.....```````` ");
			System.out.println("@@@@,,,,,,,,;''''''''''''''''''''''''''';;;;;;;;;;;;;;;;;;;;;;;;;");
			System.out.println("@@@@`.`.`.`.';;;;;;';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			System.out.println("@@@@.,.,.,.,#++#+#+#+#+#+#+#++++++++++++++++++++++'''''''''''''''");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("          ___     ___   _     _   _                           _         _                              _               _____         _     _              __           ");
			System.out.println("         /   |   / _ \\ | |   | | | |                         | |       | |                            | |             / __  \\       (_)   | |             \\ \\  _       ");
			System.out.println(" ______ / /| |  / /_\\ \\| |   | | | |  _   _  __ _   ___  ___ | | ___   | |_ ___    __ _ _   _  ___  __| | __ _ _ __   `' / /' __   ___  __| | __ _ ___     \\ \\(_)_   __");
			System.out.println("|______/ /_| |  |  _  || |   | | | | | | | |/ _` | / __|/ _ \\| |/ _ \\  | __/ _ \\  / _` | | | |/ _ \\/ _` |/ _` | '_ \\    / /   \\ \\ / / |/ _` |/ _` / __|     > > \\ \\ / /");
			System.out.println("       \\___  |  | | | || |___\\ \\_/ / | |_| | (_| | \\__ \\ (_) | | (_) | | ||  __/ | (_| | |_| |  __/ (_| | (_| | | | | ./ /___  \\ V /| | (_| | (_| \\__ \\    / / _ \\ V / ");
			System.out.println("           |_/  \\_| |_/\\_____/\\___/   \\__, |\\__,_| |___/\\___/|_|\\___/   \\__\\___|  \\__, |\\__,_|\\___|\\__,_|\\__,_|_| |_| \\_____/   \\_/ |_|\\__,_|\\__,_|___/   /_/ (_) \\_/  ");
			System.out.println("                                       __/ |                                         | |                                                                               ");
			System.out.println("                                      |___/                                          |_|                                                                               ");			

            break;
 
            case 1:
               
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("+,.,.,.:.:.:'@@@@@@@@@@@@@@@@@@@@@@@@@@@###@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("+,.,.,.,.,.:'@@@@@@@@@@@@@@@@@@@@@@@@@@@#''+'@@;'@@@@@@@@@@@@@@@@");
			System.out.println("+.,.,.:.:.:.@@@@@@@@@@@@@@@@@@@@@@@@@@@#';,,;#@''@@@@@@@@@@@@@@@@");
			System.out.println("+.,.,.,.,.,.@@@@@@@@@@@@@@@@@@@@@@@@@@@#:,';:#@@@@@@@@@@@@@@@@@@@");
			System.out.println("+,.,.:.:.:.:'@@@@@@@@@@@@@@@@@@@@@@@@@#@+;:,'#@@@@@@@@@@@@@@@@@@@");
			System.out.println("+,.,.,.,.,.:'@@@@@@@@@@@@@@@@@@@@@@@@@@#++''##@@@@@@@@@@@@@@@@@@@");
			System.out.println("+.,.:.:.:.:.@@@@@@@@@@@@@@@@@@@@@@@@@@#''''+#@@@@@@@@@@@@@@@@@@@@");
			System.out.println("+.,.,.,.,.,.@@@@@@@@@@@@@@@@@@@@@@@@@@#;'':#@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@;,:,:,:,:,:,:,:,;,;,;,;,'#'''#@#@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@;:,:,:,:,:,:,:,:,:,:,:,::##@#@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@;,:,:,:,:,:,:,:,:,:,:,:,'@#'@#:#@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@;:,:,:,:,:,:,:,:,:,:,:,::@@@@@;'@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@#########################@@@@@+;'@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'@@+#+#+#'@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@''''''''@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'.;@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#;':#@@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:;+@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;+`.#@@@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@::,+;@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+,.:@@@@@@@@@@@@:");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@++,'+:@@@@@@@@@@@;@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.,,'@@@@@@@@@@@:@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.+#@@@@@@@@@@;@@@");
			System.out.println("@@@@;;,;,;,;'''''''''''';''';;+;;;;;;;;;;;;:::::,:;;:::,,,,,,,,,,");
			System.out.println("@@@@:,.,.,.,'''''''''''';;;;;;;;;;;;;;;;;:::::::::::::::::::::::,");
			System.out.println("@@@@;,;,;,;,+;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			System.out.println("@@@@,.,.,.,.#+++++++++++++++++++'''''''''''''''''''''''''''''''';");
			System.out.println("#@@@;;,;,;,;+####################################################");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("       _____   _                              _         __          _     _                           _                 _                         _                     _    _ ");
			System.out.println("      |  ___| | |                            | |       /  |        (_)   | |                         (_)               | |                       (_)                   | |  | |");
			System.out.println(" _____|___ \\  | |_ ___    __ _ _   _  ___  __| | __ _  `| |  __   ___  __| | __ _    __ _  __ _ _   _ _   _ __   ___   | |__   __ _ _   _   _ __  ___   _____  ___  ___| |  | |");
			System.out.println("|______|  \\ \\ | __/ _ \\  / _` | | | |/ _ \\/ _` |/ _` |  | |  \\ \\ / / |/ _` |/ _` |  / _` |/ _` | | | | | | '_ \\ / _ \\  | '_ \\ / _` | | | | | '_ \\| \\ \\ / / _ \\/ _ \\/ _ \\ |  | |");
			System.out.println("      /\\__/ / | ||  __/ | (_| | |_| |  __/ (_| | (_| | _| |_  \\ V /| | (_| | (_| | | (_| | (_| | |_| | | | | | | (_) | | | | | (_| | |_| | | | | | |\\ V /  __/  __/  __/ |  |_|");
			System.out.println("      \\____/   \\__\\___|  \\__, |\\__,_|\\___|\\__,_|\\__,_| \\___/   \\_/ |_|\\__,_|\\__,_|  \\__,_|\\__, |\\__,_|_| |_| |_|\\___/  |_| |_|\\__,_|\\__, | |_| |_|_| \\_/ \\___|\\___|\\___|_|  (_)");
			System.out.println("                            | |                                                              | |                                     __/ |                                     ");
			System.out.println("                            |_|                                                              |_|                                    |___/                                      ");

            break;
 
            case 0:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");			


			System.out.println("...,.,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.#");
			System.out.println(".,,,,:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@',");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+;");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;#");
			System.out.println("@@@@@@@@@@@+++;@;'+@@+@+;@;''@@@;'++@#@@;@;'+@++;@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@+@@#@;@'@#++';@;''@@@;@@#@#@@;@;'+##+'@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@'#;+,,,;+;++@,:,:@@@@,@@'@'@:,,,;@;''@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@;#@..,@:':'@@`,`@@@@@`@@;@+@.@``@@:+;@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@;;,,`@@@','@@ .  `@@@,`:;@@:,@  `,,+;:@@@@##@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;,:;@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;'@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''#@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+;#@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.+;;@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;'+;'#@;.'.+,");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:+.;+@@;,',+:");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'',;;#@.;.'.#");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+:+@@@@:':+:#");
			System.out.println(",.,.,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,:@@@@;,',':");
			System.out.println(";;;;;;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@';+;+'");
			System.out.println(".,.,.:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,;,',#");
			System.out.println("''''''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'+'+'#");
			System.out.println(":.,.,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;,',':");
			System.out.println("++++++@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+++++#");



			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" _____                                             _        __      _    _                               __              ");                                   
			System.out.println("|  __ \\                                           | |      / _|    | |  (_)                              \\ \\  _          ");                                   
			System.out.println("| |  \\/ __ _ _ __ ___   ___    _ __ ___   __ _  __| | __ _| |_ __ _| | ___ _ __      _____   _____ _ __   \\ \\(_)  __   __");                                   
			System.out.println("| | __ / _` | '_ ` _ \\ / _ \\  | '_ ` _ \\ / _` |/ _` |/ _` |  _/ _` | |/ / | '_ \\    / _ \\ \\ / / _ \\ '__|   > >    \\ \\ / /");                                   
			System.out.println("| |_\\ \\ (_| | | | | | |  __/  | | | | | | (_| | (_| | (_| | || (_| |   <| | | | |  | (_) \\ V /  __/ |     / / _    \\ V / ");                                   
			System.out.println(" \\____/\\__,_|_| |_| |_|\\___|  |_| |_| |_|\\__,_|\\__,_|\\__,_|_| \\__,_|_|\\_\\_|_| |_|   \\___/ \\_/ \\___|_|    /_/ (_)    \\_/  ");                                   
                                                                                                                                                            
                                                                                                                                                            
			System.out.println(" _   _         _                           _                                 _                       _                                  _     _             ");
			System.out.println("| \\ | |       | |                         | |                               | |                     | |                                | |   (_)            ");
			System.out.println("|  \\| | ___   | | ___   __ _ _ __ __ _ ___| |_ ___   _ __ ___  ___  ___ __ _| |_ __ _ _ __    __ _  | | __ _  __  ____ _  ___ __ _  ___| |__  _  ___ __ _   ");
			System.out.println("| . ` |/ _ \\  | |/ _ \\ / _` | '__/ _` / __| __/ _ \\ | '__/ _ \\/ __|/ __/ _` | __/ _` | '__|  / _` | | |/ _` | \\ \\/ / _` |/ __/ _` |/ __| '_ \\| |/ __/ _` |  ");
			System.out.println("| |\\  | (_) | | | (_) | (_| | | | (_| \\__ \\ ||  __/ | | |  __/\\__ \\ (_| (_| | || (_| | |    | (_| | | | (_| |  >  < (_| | (_| (_| | (__| | | | | (_| (_| |_ ");
			System.out.println("\\_| \\_/\\___/  |_|\\___/ \\__, |_|  \\__,_|___/\\__\\___| |_|  \\___||___/\\___\\__,_|\\__\\__,_|_|     \\__,_| |_|\\__,_| /_/\\_\\__,_|\\___\\__,_|\\___|_| |_|_|\\___\\__,_(_)");
			System.out.println("                        __/ |                                                                                                                               ");
			System.out.println("                       |___/                                                                                                                                ");

            break;
        }
    }

    public static void dibujar1(int i) 
    {
        switch (i) 
        {
        	case 5:
        	
        	System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("BIENVENIDO LINCE HOY ES NUESTRO PRIMER DIA");
			System.out.println("DE LA CLASE DE LOGICA DE PROGRAMACION");
			System.out.println("ESTE SEMESTRE VEREMOS SI LA PASAS O NO >:)");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("TUTORIAL");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("oh!!! NOOO has quedado ligado este semestre a");
			System.out.println("la guerra de las antibonificaciones");
			System.out.println("vamos no dejes darte de baja por ellas");
			System.out.println("pero cuidado con perder tus bonificaciones");
			System.out.println("xacarana intentara quitartelas :'v");
			System.out.println("la unica forma de salvarlas es adivinar la palabra clave");
			System.out.println("que esta en tu examen RAPIDO! que xacarana esta acechandote");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("PD: ESTE JUEGO NO ES VALIDO PARA SEBASTIAN Y CHAKA ELLOS YA ESTAN ELIMINADOS :v");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("PISTA: las palabras estan ligadas a acciones o cosas dichas por xacarana");
			System.out.println("cuando los estudiantes no le estudian o para ganar el semestre al final");
			System.out.println("ademas de algo que todos estamos cansados de llevar a las clases de logica");


			System.out.println("'                                                 ");   
			System.out.println("'                    ,::;';:,.`                   ");   
			System.out.println("'                  ,'';;;;;;;;;:`                 ");   
			System.out.println("'                `;''';;';;''''';.                ");   
			System.out.println("'              `:'''''''';';;''''';`              ");   
			System.out.println("'         `,::'++'''++'''++;'''''+';:             ");   
			System.out.println("'        :;''++++''++++''+++++++++'';;`           ");   
			System.out.println("'       .;''++++++'''+++++++++++++''''',          ");   
			System.out.println("'       ,;;;;+++'''''''+++++++++++++++''`         ");   
			System.out.println("'       :;;;+';;;'''';;'''++++++++++++''          ");   
			System.out.println(";      `;'''''';''''::::;;;;''''';;'++'.          ");   
			System.out.println("'      :;''''''';'';;::,,,,,:::;::::;;;           ");   
			System.out.println(";     `;'''';''';;:,::,,,,,,,,,,,::::::           ");   
			System.out.println("'     .'''';;;;:.............,,,,,:::::`          ");   
			System.out.println(";     :;';;;;;;,.........,,,,,,,,,,::::,          ");   
			System.out.println("'     :;';;;;;;,........,,,,,,,,,,,:::;:          ");   
			System.out.println(";     :;;;;;;;:,,,,,,,,,,,,,,,,,,,,,::::,         ");   
			System.out.println(";     ;;;;';;;;:,,,,,,,,,,,,..,,,,,,,::::         ");   
			System.out.println("'     :;;'''';;;:,,,,,,,,.....,,,,,,,,,,,`        ");   
			System.out.println(";     ;'''''';;::::,,,,,..,,:::::::::::::.        ");   
			System.out.println("'     ;;''''';;::::,,,,.,:;''';;:::::;;;''.       ");   
			System.out.println(";     :'''''';::,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:");   
			System.out.println("'     ,;';;;;;:,,@@,;@.@@@@@@@@@''#@@.#+.@@@@@@@@:");   
			System.out.println(";     .;;;;;;:,,,#@.,#`#@@@@@@@@';#@@`+'`#@@@@@@#:");   
			System.out.println("'     .;;;;;;:,,,,@@' @ #@@@@@@@';#@@@`,@ @@@@@@  ");   
			System.out.println(";    ``,,,:;:,,,,,,#@@ @`.@@@@#'';,:@@@' @ +@@@   ");   
			System.out.println(";   `.:;;;:::,,,,,,,;@@@@@@@@';;;:,,:@@@@@@@@#    ");   
			System.out.println("'   .:;;';:,,:,,,,,,,;;;'''++;;;;::,:+++'':,,,    ");   
			System.out.println(";   .;',,;;,,:,,,,,,.....,,::::;;:,,,;;;::,       ");   
			System.out.println("'   .;;.;';.,,,,:,,,,....,,,:::;:,,.,:;::::       ");   
			System.out.println(";   `,,,;';.,:::::,,,,,,,,,:::;:,,,,,::;:::       ");   
			System.out.println("'    `,,::,,::::::::::,:::::;;';:::::::;;;;`      ");   
			System.out.println(";      ,:,,:;;;;:::::::;;;;;'';''''';;;'';;`      ");   
			System.out.println(";       .:;;';;;::::;;;;';'''''''+'''+';'';       ");   
			System.out.println(";         `:;;'';:::;;''''++'''''++''+''''.       ");   
			System.out.println(";          `;;;';::;;'''''+'''''''''''+'+'        ");   
			System.out.println("'           `;;''::;;'''''+'++''''''';+'':        ");   
			System.out.println(";            ,;'';;;''''''''''';;;:::'+;'.        ");   
			System.out.println("'             ;''';;'''''''';'''''''''';'         ");   
			System.out.println(";              ,+''''''''''';;;;;;;;';;;;         ");   
			System.out.println("'               `;+''''''''';;;;;;;;;;;;,         ");   
			System.out.println(";                 .'++'''''';;;;;;;';;;;`         ");   
			System.out.println(";                   ;++'+''';;;;;;''';;;          ");   
			System.out.println(";                    ;++++++';::::;'';';          ");   
			System.out.println(";                     ,++++++';;::;;;;':          ");   
			System.out.println("'                       ,'++++'';;;;'''`          ");   
			System.out.println(";                         `,'++'''''';            ");   
			System.out.println("'                             .;+'';:             ");   
			System.out.println(";                                `                ");

        	System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("                                                                    | |                             \\ \\  _  |  _  \\");
			System.out.println("  ___ ___  _ __     __ _ _   _  ___    ___  ___  __ _ ___   _ __ ___| |_ __ _ _ __ _ __ ___   ___    \\ \\(_) | | | |");
			System.out.println(" / __/ _ \\| '_ \\   / _` | | | |/ _ \\  / _ \\/ __|/ _` / __| | '__/ _ \\ __/ _` | '__| '_ ` _ \\ / _ \\    > >   | | | |");
			System.out.println("| (_| (_) | | | | | (_| | |_| |  __/ | (_) \\__ \\ (_| \\__ \\ | | |  __/ || (_| | |  | | | | | |  __/   / / _  | |/ / ");
			System.out.println(" \\___\\___/|_| |_|  \\__, |\\__,_|\\___|  \\___/|___/\\__,_|___/ |_|  \\___|\\__\\__,_|_|  |_| |_| |_|\\___|  /_/ (_) |___/  ");
			System.out.println("                      | |                                                                                          ");
			System.out.println("                      |_|                                                                                          ");

			break;

			case 4:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("``````````````````````````````````````````````");
			System.out.println("`````````'#@###'``````````````````````````````");
			System.out.println("```````.+       `@````````````````````````````");
			System.out.println("``````,`          .:``````````````````````````");
			System.out.println("`````.,             ,`````````````````````````");
			System.out.println("`````#        +,    +`````````````````````````");
			System.out.println("````'     '      +:  ,````````````````````````");
			System.out.println("````; :+:`     ';#+  #````````````````````````");
			System.out.println("```.  '@+.    +  ; ; ;````````````````````````");
			System.out.println("```; `    #   #  .+; :````````,.'#@@#:,....::'");
			System.out.println("```+ '   @ #   @' :  .````````,`              ");
			System.out.println("```+ `..#+.,     #,  ;````````' :             ");
			System.out.println("```.   ;`+       .;  @````````# #             ");
			System.out.println("````,   ;         +  .````````: '             ");
			System.out.println("````'    ,'###':, + +`````````` .             ");
			System.out.println("`````# #`         '#```````````:        :.    ");
			System.out.println("``````#           #````````````# ;     #  .``;");
			System.out.println("```````+.       '::````````````+ #     + :    ");
			System.out.println("`````````'#++#+. :..```````````. #     + `    ");
			System.out.println("``````````;..    ' +```````````` '     #  `   ");
			System.out.println("``````````# `:  ;   #```````````,,     .  +   ");
			System.out.println("``````````#   .`  ; `.``````````+      +  #   ");
			System.out.println("``````````'       ;  @``````````# `     , :   ");
			System.out.println("``````````' '      : ```````````+ ,     + .   ");
			System.out.println("``````````# '      +  '`````````: +      ,    ");
			System.out.println("``````````# '       ` +`````````. +      + `  ");
			System.out.println("``````````' '       + ``````````. +       .'  ");
			System.out.println("``````````, '       '  ,``````````:       ##  ");
			System.out.println("``````````` #       `  #``````````.,,+###'#+  ");
			System.out.println("``````````  #        ; ;``````````````````:;  ");
			System.out.println("`````````.  #        # ```````````````````+,  ");
			System.out.println("`````````;  #        :  ``````````````````#   ");
			System.out.println("`````````+  #        `  ;```````````.'#'',#   ");
			System.out.println("````````,   :         , +`.;+##++@@++;.'#,`   ");
			System.out.println("````````#        ``.;##:`   .'#;;##+,        `");
			System.out.println("````````,  ;  .:`:'+##'''#;  ''``;@@#####':,.:");
			System.out.println("```````;   +..:#;;+##'::+#:#.        ``````   ");
			System.out.println("````.'#'`                                     ");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" __                _   _ _                 _  __ _                _             ");
			System.out.println("/  |              | | (_) |               (_)/ _(_)              (_)            ");
			System.out.println("`| |    __ _ _ __ | |_ _| |__   ___  _ __  _| |_ _  ___ __ _  ___ _  ___  _ __  ");
			System.out.println(" | |   / _` | '_ \\| __| | '_ \\ / _ \\| '_ \\| |  _| |/ __/ _` |/ __| |/ _ \\| '_ \\ ");
			System.out.println("_| |_ | (_| | | | | |_| | |_) | (_) | | | | | | | | (_| (_| | (__| | (_) | | | |");
			System.out.println("\\___/  \\__,_|_| |_|\\__|_|_.__/ \\___/|_| |_|_|_| |_|\\___\\__,_|\\___|_|\\___/|_| |_|");

			break;

			case 3:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("```````````````````````````````````````````````");
			System.out.println("```````````````````````````;@@@;```````````````");
			System.out.println("`````````````````````````;@@@@@@@``````````````");
			System.out.println("````````````````````````.@@@@   @@`````````````");
			System.out.println("````````````````````````:@@@@   @@`````````````");
			System.out.println("````````````````.:@@@@@@@@@,@   @@`````````````");
			System.out.println("`````````````:#@;`       @` :@@@@@:````````````");
			System.out.println("````````````@;           @# '@ @@@:````````````");
			System.out.println("``````````++            ` @@@@@@@@,````````````");
			System.out.println("````````;@::::          ;  #@@@@@+@````````````");
			System.out.println("```````#@@@@@@@@         #, .'''  '@```````````");
			System.out.println("``````@@@@@`   @@        @###@@;    @``````````");
			System.out.println("`````@#@@@'    #@'      @ @@@,  #+   +,````````");
			System.out.println("````# @@@@+    :@@     @ @   #`   #` `@````````");
			System.out.println("````#'@@@@@    ,@@`    ;#          @   @```````");
			System.out.println("```# '@@@@@'  `@@@`   :`#           @  `#``````");
			System.out.println("``.# `@@   @@@@@@@`   ' #            @  @``````");
			System.out.println("``@   ##   @#;@@@@`   ' +            ,,  @`````");
			System.out.println("``@  . @@#@@  @@@@`   '               @` '`````");
			System.out.println("`:.  + +@@@@` @@@@    +               @.  @````");
			System.out.println("`#    # .@@@@@@@@` +   :               @  @````");
			System.out.println("`+     ,: ;@@@@@. `+   @               .` ,'```");
			System.out.println("`+       .        `+   '`               +  #```");
			System.out.println("`+               #`     @               @  #```");
			System.out.println("`+             :. #      .              .` #```");
			System.out.println("`,              ,+       #              `; #```");
			System.out.println("``@        .`;@#         +               + #```");
			System.out.println("``@                       @`             ` #```");
			System.out.println("``+;                      :'             ;;#```");
			System.out.println("```@                       @               #```");
			System.out.println("```'                        +             .#```");
			System.out.println("````@                       @`            '````");
			System.out.println("````@                       `#`          `@````");
			System.out.println("````.:                        #`         #+````");
			System.out.println("`````@                         @         @`````");
			System.out.println("``````;                             .   @:`````");
			System.out.println("``````';                        :#  #@@#.``````");
			System.out.println("```````,#                     @@'    :@````````");
			System.out.println("`````````+#                         ;@.````````");
			System.out.println("`````````` @                        @``````````");
			System.out.println("```````````+@+                `'@@@;```````````");
			System.out.println("``````````:```#@@```````    :@'````````````````");
			System.out.println("``````````@``````......@###;```````````````````");
			System.out.println("``````````@````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````,````````````````````````````````````");
			System.out.println("``````````@````````````````````````````````````");
			System.out.println("``````````@````````````````````````````````````");
			System.out.println("``````````,;```````````````````````````````````");
			System.out.println("```````````@```````````````````````````````````");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" _____               _   _ _                 _  __ _                _                       ");
			System.out.println("/ __  \\             | | (_) |               (_)/ _(_)              (_)                      ");
			System.out.println("`' / /'   __ _ _ __ | |_ _| |__   ___  _ __  _| |_ _  ___ __ _  ___ _  ___  _ __   ___  ___ ");
			System.out.println("  / /    / _` | '_ \\| __| | '_ \\ / _ \\| '_ \\| |  _| |/ __/ _` |/ __| |/ _ \\| '_ \\ / _ \\/ __|");
			System.out.println("./ /___ | (_| | | | | |_| | |_) | (_) | | | | | | | | (_| (_| | (__| | (_) | | | |  __/\\__ \\");
			System.out.println("\\_____/  \\__,_|_| |_|\\__|_|_.__/ \\___/|_| |_|_|_| |_|\\___\\__,_|\\___|_|\\___/|_| |_|\\___||___/");

			break;

			case 2:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("                   `,;';:`                   ");
			System.out.println("               `#@@@@@@@@@@@@,               ");
			System.out.println("             ;@@@@@+:,,,:;#@@@@+             ");
			System.out.println("           :@@@#,............;@@@+           ");
			System.out.println("          @@@'.................,@@@`         ");
			System.out.println("        `@@#.....................:@@;        ");
			System.out.println("       ,@@;........................@@+       ");
			System.out.println("      ,@@,..........................#@+      ");
			System.out.println("     `@@,............................#@;     ");
			System.out.println("     @@,..............................#@`    ");
			System.out.println("    #@'..::,................;+',.......@@    ");
			System.out.println("   `@@.+@##@@:............#@@#@@@,.....,@'   ");
			System.out.println("   @@.+@    `@:..........@@     '@,.....#@   ");
			System.out.println("  `@#.@  #@@; @.........@#  #@@@,,@......@+  ");
			System.out.println("  @@.#: #@@@@:'#.......,@  #@@@@@`@'.....#@  ");
			System.out.println("  @@.@  @@@@@@ @.......#;  @@@@@@#.@.....,@. ");
			System.out.println(" ,@;.@  @@@@@@ @.......@   @@@@@@# @......@# ");
			System.out.println(" #@.,@  @@@@@+ @,......@   #@@@@@` @......#@ ");
			System.out.println(" @@..@   @@@@  @,......@....@@@@;..@......:@ ");
			System.out.println(" @@..@,,,,,,,,,@.......@,,,,,,,,,,,@......,@`");
			System.out.println(" @#..#@@@@@@@@@@.......#@@@@@#,,,@@'.......@,");
			System.out.println(" @+...........................,,,..........@:");
			System.out.println(" @+...........................,,...........@;");
			System.out.println(" @+............................,...........@:");
			System.out.println(" @#........................................@,");
			System.out.println(" @@..............;@@@##@@+................,@`");
			System.out.println(" @@............+@:.......,@#..............;@ ");
			System.out.println(" #@..........,@+...........'@.............#@ ");
			System.out.println(" ,@'........,@:.............:@............@# ");
			System.out.println("  @@........':...............:#..........,@. ");
			System.out.println("  @@,....................................#@  ");
			System.out.println("  `@#....................................@+  ");
			System.out.println("   @@,..................................#@   ");
			System.out.println("   `@@.................................,@'   ");
			System.out.println("    #@+................................@@    ");
			System.out.println("     @@:..............................@@`    ");
			System.out.println("     `@@,............................#@;     ");
			System.out.println("      .@@:..........................#@+      ");
			System.out.println("       ,@@'........................@@+       ");
			System.out.println("        `@@@.....................;@@;        ");
			System.out.println("          @@@#.................:@@@`         ");
			System.out.println("           ,@@@@:............'@@@+           ");
			System.out.println("             ;@@@@@#':::;+@@@@@+             ");
			System.out.println("               `+@@@@@@@@@@@#.               ");
			System.out.println("                   `.:;:,`                   ");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" _____               _   _ _                 _  __ _                _                       ");
			System.out.println("|____ |             | | (_) |               (_)/ _(_)              (_)                      ");
			System.out.println("    / /   __ _ _ __ | |_ _| |__   ___  _ __  _| |_ _  ___ __ _  ___ _  ___  _ __   ___  ___ ");
			System.out.println("    \\ \\  / _` | '_ \\| __| | '_ \\ / _ \\| '_ \\| |  _| |/ __/ _` |/ __| |/ _ \\| '_ \\ / _ \\/ __|");
			System.out.println(".___/ / | (_| | | | | |_| | |_) | (_) | | | | | | | | (_| (_| | (__| | (_) | | | |  __/\\__ \\");
			System.out.println("\\____/   \\__,_|_| |_|\\__|_|_.__/ \\___/|_| |_|_|_| |_|\\___\\__,_|\\___|_|\\___/|_| |_|\\___||___/");

			break;

			case 1:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");


			System.out.println("```````````````````````````..';````````````````````````````````````");
			System.out.println("`````````````````````````````.`,#.`````````````````````````````````");
			System.out.println("````````````````````````````````.``.:;`````````````````````````````");
			System.out.println("````````````````````..:'++++',.``````..'```````````````````````````");
			System.out.println("`````````````````.'#@@';:,``:;#@#:`````:```````````````````````````");
			System.out.println("```````````````;@#'`            `##'```````````````````````````````");
			System.out.println("`````````````.@@,                  +@,`````````````````````````````");
			System.out.println("````````````##'                      @+````````````````````````````");
			System.out.println("```.`;'````#@.                        '@.``````````````````````````");
			System.out.println("````````.`@@                           ,@,`````````````````````````");
			System.out.println("```.`````@#`                            `@;```#.```````````````````");
			System.out.println("````````;@`                               @.``.'```````````````````");
			System.out.println("````````@.                                `#,``````````````````````");
			System.out.println("```````;#                                  '#.`,```````````````````");
			System.out.println("```````@:                                   #``+```````````````````");
			System.out.println("```````@                                    ;:`````````````````````");
			System.out.println("``+```:#            `;@@+##,           `    `#`````````````````````");
			System.out.println("``.;`.@'          ;@;.     '#.      :;:` `:':@``'.`````````````````");
			System.out.println("```,``@`                     :@,``''+@` .#,`,@``#``````````````````");
			System.out.println("`````,#                         .` :'@@@'`  `#.`,``````````````````");
			System.out.println("`````;#              :++###+;         `    ` #.`#``````````````````");
			System.out.println("``,``'#             @.;#'';# +#.    ` ;#@@'+##:``,`````````````````");
			System.out.println("``'``+#               :''` `# `:     @;'@#.` ';````````````````````");
			System.out.println("``'``'+               ,'@#':#        ,''  @` ';````````````````````");
			System.out.println("`````'#             .;@@@ ; '        `;@':@  ''````````````````````");
			System.out.println("`````,#            ,+#@@####:        ;#` +@..;+````````````````````");
			System.out.println("``````#`           .@':+#+'@@#       ;#@@#@:`@+````````````````````");
			System.out.println("``````#'             `  ;#+.,#       ,#@#@#; #+``.`````````````````");
			System.out.println("``````:@                   `              `,,#+``;.````````````````");
			System.out.println("```````@'                                    :#``,.````````````````");
			System.out.println("```````:@`                                   ++````````````````````");
			System.out.println("````````+#`                     '##'@`       #,``'`````````````````");
			System.out.println("`````````+#,                  `#.    #:      @`.`:`````````````````");
			System.out.println("``````````;@;              .@@@. '#@;`#@    '@```.`````````````````");
			System.out.println("```````````:@#,           .#:+  :'+;` @+`` `@:```#`````````````````");
			System.out.println("``````.``````+##.         .#,    ;.,. +#`  :@````#`````````````````");
			System.out.println("`````````````.`+@@+.       `     # `'  , `.@;.`````````````````````");
			System.out.println("````````.:```````:#@@;`                  :@+````,``````````````````");
			System.out.println("````````````````````:#@@;`            ``+#'``.`,'``````````````````");
			System.out.println("`````````````````````.`;@@@@#;::``   :@@#.`.``` ```````````````````");
			System.out.println("``````````````````````,@:+`:'#+#@#@@##;```.````````````````````````");
			System.out.println("`````````````````````+@#.@,``````````..``.+````````````````````````");
			System.out.println("````````````````````+@.@`,@.````````..:````````````````````````````");
			System.out.println("```````````````````#@`:#``+:`````````'.````````````````````````````");
			System.out.println("``````````````````+@.`'+``.@.``````````````````````````````````````");
			System.out.println("`````````````````'#.``#;```'+``````````````````````````````````````");
			System.out.println("````````````````:#,``.@:````#,`````````````````````````````````````");
			System.out.println("``````````````.,@;````#.````,@`````````````````````````````````````");
			System.out.println("```````````````#'````.#``````#+````````````````````````````````````");
			System.out.println("``````````````##`````:#``````.#.```````````````````````````````````");
			System.out.println("````````````.,@.`````#+```````+#```````````````````````````````````");
			System.out.println("````````````.@:`````.@:````````@'.`````````````````````````````````");
			System.out.println("````````````:#```````@.````````,#;```..+#;`````````````````````````");
			System.out.println("````````````+:.`````.@``````````:@+``.`````':````````````````````.`");
			System.out.println("````````````#:.`````;@```````````,@@;`.`'#+`..+`````.`````,,+'##@@#");
			System.out.println("```````````.:@:`````+#````.'`````.`'@@+#@.+#+.,.``;'#@@@###+''';;;;");
			System.out.println("`````````````:@+``.`#:`````.##```````:@#@`  @#+@@@##'';;;;;;;;;;;;;");
			System.out.println("`````````````.`+@@;`@````##@'.'#```````@.  .##''''+#@@#+';;;;;;;;;;");
			System.out.println("`````````````````,#@@':.+@. @:.,+,:+##@#@'#@#''+'''';';'##+;';;;;;;");
			System.out.println("```````````````````,@+#@@' `+#@#@#+'''''###@@###+##+'+''''##;;;;;;;");
			System.out.println("````````````````.``;#```;@###+'##'''####@##+#+#+'''+#;''#@+#;;;;;;;");
			System.out.println("``````````````````.+#@@#+'++''++###+###''+##+++###''''@@'+#'';;;;;;");
			System.out.println("``````````````..'##+''''''';'@@#@+'++@@#@#+'+##+'''+@+'+#';;;;;;;;;");
			System.out.println("````````...:+##@#@+;'''';'##+'''+@@@@+'''##+''''+@#''##'';;';';;;;;");
			System.out.println("``..:'@@@@@##+';;;#@+''''''''+#+''''+###+'''++@#'+#@+';;;;;;;;;;;;;");
			System.out.println("@@@@@#+';;;;'';';;;'#@+'''''+####+''''''+#@#+'+@@+;;;';;;;;;;;;;;;;");
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;#@+''''''';''+#@#+''+#@#';;;;;;;;;;;;;;;;;;;;");
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;;'#@@####@@##+++####';;;;;;;;;;;;;;;;;;;;;;;;");
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;'+####+''';;;;;;;';;;;;;;;;;;;;;;;;;;;;;");
			System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("   ___               _   _ _                 _  __ _                _                       ");
			System.out.println("  /   |             | | (_) |               (_)/ _(_)              (_)                      ");
			System.out.println(" / /| |   __ _ _ __ | |_ _| |__   ___  _ __  _| |_ _  ___ __ _  ___ _  ___  _ __   ___  ___ ");
			System.out.println("/ /_| |  / _` | '_ \\| __| | '_ \\ / _ \\| '_ \\| |  _| |/ __/ _` |/ __| |/ _ \\| '_ \\ / _ \\/ __|");
			System.out.println("\\___  | | (_| | | | | |_| | |_) | (_) | | | | | | | | (_| (_| | (__| | (_) | | | |  __/\\__ \\");
			System.out.println("    |_/  \\__,_|_| |_|\\__|_|_.__/ \\___/|_| |_|_|_| |_|\\___\\__,_|\\___|_|\\___/|_| |_|\\___||___/");

			break;

			case 0:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("````````````````````````````````````````````````:");
			System.out.println("````````````````'#+,`````````````:+#@@###+++++;;:");
			System.out.println("`````````````+:      #``````````#                ");
			System.out.println("````````````#         ;`````````     ;` `.````   ");
			System.out.println("```````````@           @```````:    .            ");
			System.out.println("``````````              '``````:    :            ");
			System.out.println("``````````.             #``````:    :            ");
			System.out.println("`````````';#            :``````'    ,            ");
			System.out.println("````,#'+  ;+  ;         '``````'    ;      ..`...");
			System.out.println("````  .;; '            :@``````'    :      `     ");
			System.out.println("````# :+##`@       `.   ```````'    .      `     ");
			System.out.println("```'.@@::``#'          +```````'           `     ");
			System.out.println("``'`.;;@` # `:        +````````'           .     ");
			System.out.println("``'`,:;```@   @     #;`````````;           .     ");
			System.out.println("```'````;`'    `++'`.#`````````:    :      .     ");
			System.out.println("````@`:.``          ,`@````````,    :      `     ");
			System.out.println("`````````:          ;`,.```````,    :       .,...");
			System.out.println("`````````#          ;``@````````    :            ");
			System.out.println("`````````@          '``,````````    ;            ");
			System.out.println("`````````@          '```,```````+   '        `   ");
			System.out.println("`````````+          '```#````````@',,##';':.:''''");
			System.out.println("`````````'`         ,```@`````````````````@  `  .");
			System.out.println("`````````, `   :,. .,;;..,,. .````.##'+##;   .  `");
			System.out.println("`````````,.     ;. ,,.,,,...```...., , @     ,   ");
			System.out.println("`````````; @     ;@@@##'''::''++'...           ..");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("                          _ _     _                                               _ _                                          _            ");
			System.out.println("                         | (_)   | |                                             | (_)                                        | |           ");
			System.out.println(" _   _  __ _  __   ____ _| |_ ___| |_ ___  __   _____ _ __ __ _  __ _    __ _  __| |_  ___  ___   ___  ___ _ __ ___   ___  ___| |_ _ __ ___ ");
			System.out.println("| | | |/ _` | \\ \\ / / _` | | / __| __/ _ \\ \\ \\ / / _ \\ '__/ _` |/ _` |  / _` |/ _` | |/ _ \\/ __| / __|/ _ \\ '_ ` _ \\ / _ \\/ __| __| '__/ _ \\");
			System.out.println("| |_| | (_| |  \\ V / (_| | | \\__ \\ ||  __/  \\ V /  __/ | | (_| | (_| | | (_| | (_| | | (_) \\__ \\ \\__ \\  __/ | | | | |  __/\\__ \\ |_| | |  __/");
			System.out.println(" \\__, |\\__,_|   \\_/ \\__,_|_|_|___/\\__\\___|   \\_/ \\___|_|  \\__, |\\__,_|  \\__,_|\\__,_|_|\\___/|___/ |___/\\___|_| |_| |_|\\___||___/\\__|_|  \\___|");
			System.out.println("  __/ |                                                    __/ |                                                                            ");
			System.out.println(" |___/                                                    |___/                                                                             ");

			break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		}
	}

	public static void dibujar2(int i) 
    {
    	switch(i)
    	{
    		case 3:

    		System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("BIENVENIDO A LAS LUCHAS DE LA WWE");
			System.out.println("ERES LO SUFICIENTEMENTE HOMBRE PARA GANARLAS");
			System.out.println("SIGUE ADELANTE SI ACEPTAS EL RETO");
			System.out.println("NO HAY VUELTA ATRAS");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("TUTORIAL");
			System.out.println("  ");
			System.out.println("primero que todo debes saber que en las luchas");
			System.out.println("cuando el arbitro cuenta hasta 3 la ronda ha terminado");
			System.out.println("no debes dejar que la cuenta llegue a 0 porque perderas el campeonato");
			System.out.println("cada vez que avances en una ronda sera notificado en el marcador");
			System.out.println("recuerda dolo es una cuenta de 3 a 0");
			System.out.println("por cierto el arbitro soy io ;v");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("PISTA");
			System.out.println("  ");
			System.out.println("son palabras referentes a programacion como herramientas o temas vistos en la clase");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");			


			System.out.println("#@@@@@@@@@@@@####@@@@@@@@@@@###@@@#@@##+####+####@++#######@#");
			System.out.println("#@@@@@@@@@@@@@@@#@#@@@@@@@@##@@@@@@@@#@@@#@@@@@@@+#@@#@##@@@#");
			System.out.println("#@@@@@@@@@@@@@@@@@#@@@@@@##@@@@@@@@@@+@@+@@@@@@@'+'''@@@@@@@#");
			System.out.println("#@@@@@@@@@@@@@@@+''#@@@@@@@@@@@@@@@@@#@@#@@@@@@':,.:;@@@@@@@#");
			System.out.println("#@@@@@@@@@@@@@@+''+#@@@@@@@@@@@@@@@@@#@##@@@@@@;,,,:'#@@@@@@#");
			System.out.println("#@@@@@@@@@;'#@@+++#@@@@@@@@@@@@@@@@@@@@#@@@@@@#':';,::@@@@@@#");
			System.out.println("####@@@@@''''@@+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;,;::;'@@@@@@#");
			System.out.println("#@@##+++;'+++@@''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#''';:::#@@#@#");
			System.out.println("#@@@@@#;;'+#+@@#;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;;+;:::;'@@@#");
			System.out.println("#@@@@@';'++##@@#@@+###@@@@@@@@@@@@@@@@@@@@@@@@@@@#;;;;::;@@@#");
			System.out.println("#@@@@';++#@@@#@'#@'@##+++++#@@@@@@@@@@@@@@@@@@@@@;'';;:::#@@#");
			System.out.println("#@@@@;'+@@@@@++++@'@@@@@@@###++++#@@@@@@@@@@@@@@@;+':;+#;#@@#");
			System.out.println("#@@@+''#@@@@###+##+@@@@@@@@@@@@@###+++##@@@@@@@@:'++#####@@@#");
			System.out.println("#@@@+#'@@@@@'#++@'@@@@@@@@@@@@@@@@@@@@@#+++@@@@@'#++@###'@@@#");
			System.out.println("++@@@#@@@@@@++##+'@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+++'+###+:#@@#");
			System.out.println("'###@#@@@#@@@+#@++@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'''+####+@@@#");
			System.out.println("#@@@+#@@@##@@@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'''':;'@#@@+#");
			System.out.println("#@@@@#@###@@@@@#++@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;;'::;'##@@@#");
			System.out.println("#@@@@#+##@#@@@@#'+##:+#@@@@@@@@@@@@@@@@@@@@@@@@@;;;``;''@@@@#");
			System.out.println("+;++@+#@@@@@@@@#'#@@..:.`#@@@@@@@@@@@@@@@@@@@@@#;;``.,'+@@@@#");
			System.out.println("+#+@@@@@@@@@@@@#@@@@@@@#'@@###,:'#@@@@@@@@@@@@@++#``.@'#@@@@#");
			System.out.println("''#@@@@@@@@@@#@##@@@@@@@@@@@@@:,:,`:##@@@@@@@@@##```#@@#@@@@#");
			System.out.println("+@@@@@@@@@@@@@@#'#@@@@@@@@@@@@@@@@##;,,'##@@@@@;.```@@#@@@@@#");
			System.out.println("##@@@@@@@#@@##@#++#;:+@@@@@@@@@@@@@@@@@@#@@###::;;::@@@;@@@@#");
			System.out.println("+@@@@@@@@#@@@###'#@@@@@#':'#@#@@@@@@@@@@@@@@@#:;'++'#@@@@@@@#");
			System.out.println("+@@@@@@@##@@@##@###@###@@@#@#':;#@@@@@@@@@@@@:::++''+@@@###@#");
			System.out.println("#@@@@@@@+:;@@@#@##@@#@@@@@##@#@#@#':;+@@@@@@@::;;''''@@@@@@@#");
			System.out.println("#@@@@@@@@@@@@@@@#########@@@#########@@+;:+@':;;''''+#@@@@@@#");
			System.out.println("#@@@@@@@@#@@@@@@##':;####@@@########+#@###@@::;;''''#+##@@@@#");
			System.out.println("#@@@@@@@@#@@@@@###@#@@#':'#@@###@+#@######@@;;;''''#++++@@@@#");
			System.out.println("#@@@'#@@@@@@@@@@##@#@@@##@@#':'#@#########@#..'''''#+''':;+#+");
			System.out.println("#@@@@@#;:+@@@@@@@#@#@##@##@@@@@@#;:'##@#####;.,,;'#++';###@#+");
			System.out.println("#@@@###@@@@@@@#@######+###@@#@#@#@###+;:'#'###',,'#++''######");
			System.out.println("#@@++++##@@@@@@#':'###+++#+###@#@@##@###@@.'@##@;'##+''#@####");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			break;

			case 2:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##:###+###");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@####@@@@@@#@#+###+''");
			System.out.println("#@@@@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@;:+#@@@@@@@@'+###+#'");
			System.out.println("#@@@@@@@######@@@@@@@@@@@@@@@@@@':+#@@@@:::##@##@@@@@:####++'");
			System.out.println("#@@@@@@@@@@@###@@@#@@@@@@@@@@@@#':;+.'+#:;:;@@@@@@@@@+;###++'");
			System.out.println("#@@@@@@@@@@@@@@@@@@@###@######.:,;;',..,+'';@@@@@@@@#'+###++;");
			System.out.println("'+#####+++';:::#@@@@####@@@@@@@@@@@@;,,:;+#;@@@@@@@@#',#+#+#;");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@##@@@@@@@@@#@@,,:;;;,.,:@@@@@@+;####+;");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@################,,:::,.::,;@@@@@#;####+'");
			System.out.println("#@@@@@@@@@#####@###@@################,::,,,,:.:++@@@@#;#'::'+");
			System.out.println("#@@@@#@###@#########+#########+#@####,;:::,:':,#+#+;;+'+#@@@#");
			System.out.println("#@@#@#########################@####@#,::;;'+';'+#:@@@@@@@@#@#");
			System.out.println("#@@#####@#+####+####+@########'##@#@,,,:;'+#@@@##@@@#########");
			System.out.println("#@@#@@@@#@#######@#@#+@@@##+;;;+...,',,:;'@@@##############+#");
			System.out.println("#@@@@@@@#@#######@@@@@++++#..#+':,,.;'':;#####++;;;::;;;'++++");
			System.out.println("##@@#@@##@@@####@@#''@'#@@@'+##++'::':'+#@;';+'++++'+#;';#+++");
			System.out.println("###@@#@#@@+#';'#@@@@#+;@@@@@##@#;+##+;,'+@+;:+'';+'''''++++++");
			System.out.println("##@@#+;:'++::'#+@@@@@;;@@##;;#++';+':..,#+##############+++++");
			System.out.println("''##@###'';,;,'##;:::+##;:#+'#,''+++..,:#######+++'';;:::::;'");
			System.out.println("##@@#@##@',,';;;;,:;#;,:':.''+#+;+#,.,:;#####################");
			System.out.println("#@@@@@@#+':,,''',:,:;`;';:.';+#####.,:;,,:;+#################");
			System.out.println("#@++@#;::,;::'':,,,:'.:,:;:#######'+,:...........,:'+########");
			System.out.println("+;;;#+;'+.+:++;::::,',,:,''+###;..;;',....................:;+");
			System.out.println("#'#;''';+++++#+''';:,,:;;++:::#,..;+#.......................:");
			System.out.println("+';';;'+##':'###+#++;::+##@;''@;...;,:......................:");
			System.out.println("#'++##':+###########'..,@@@+;@@....,::......................:");
			System.out.println("++;;+###########+:..........;;;,,...#@:.....................:");
			System.out.println("++###########;.........,...,;;..,,,.,##.....................:");
			System.out.println("#########',..........,......,;..,,...#@.....................:");
			System.out.println("#####+;............,.,,....,':.,,,...##,....................:");
			System.out.println("##',................,,,,,,,:+:..,,,,,+@,....................:");
			System.out.println(";...............,,,,,,,,,..;:,..,.,,'+'.,,..................:");
			System.out.println(";..............,,,,,,......:;;'....:@#,,,.............:,`..,:");
			System.out.println(";..............,,,,,.......:::,....::,,,,,............,..::::");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" _____ _                  _                     ____ _____ _   __");
			System.out.println("/  ___| |                (_)              _    / ___|  _  (_) / /");
			System.out.println("\\ `--.| |_ __ _ _ __ ___  _ _ __   __ _  (_)  / /___| |/' |  / / ");
			System.out.println(" `--. \\ __/ _` | '_ ` _ \\| | '_ \\ / _` |      | ___ \\  /| | / /  ");
			System.out.println("/\\__/ / || (_| | | | | | | | | | | (_| |  _   | \\_/ \\ |_/ // / _ ");
			System.out.println("\\____/ \\__\\__,_|_| |_| |_|_|_| |_|\\__,_| (_)  \\_____/\\___//_/ (_)");

			break;

			case 1:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@##@@@@@@@@##@@@@@@@@@@@#@@#@##+'''+';");
			System.out.println("@@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@#+#+++''++'++@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@#''#@@@@@@@###+''++++'+#@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@###++';;'''+##@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@##+'';''';;+###+''';;''@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("+'++++++##@@@@@@@@@@@@@###+''';;:;.@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@######:.::+######@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@##',,'#:##@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@###########@@@@@###';:'::#@##@@@@@@@@@@@#########");
			System.out.println("@@@@@@@@@@#####@@@@@@@#@@#++##:,'';,;@@@@##+######@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@+#+'''++'+'''';,;:#;:;'#@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@#@@@@@@@@@+#+###++'+'''':,'+@@@@@@@@@@@@@@@@@#@@@@");
			System.out.println("@@@###########++#;'+'@@@####++++;+'++@@@@@@@@@@##@@@@@@@@###");
			System.out.println(",#:::;##@@@@@@@@@@@@@@@@@@@+':;'''@@#@@##@@@@#@@@#@###@@@###");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@#@#'::##++@####@##@@@############+#");
			System.out.println("@@@@@@@@@@@@#@@@@####@@@####':;#@'#@#@@#+###@########+'';++'");
			System.out.println("+@#####@#@#@##@@###@@@#@@###'+#######@#@@@#+';;'++#####@###;");
			System.out.println("##':'#@###################+#+;'+#';;;+####@#########'@+####+");
			System.out.println("######+;;+#++#######+'';;'+##+'#+#++#'+####@######+++#++##++");
			System.out.println("######@###,'+''+#@###@#@@@@##''#'++########@#@#####+'';;;#'#");
			System.out.println("###@#@@##+.#####@###@####++#''+#+++######+';;;'+########+###");
			System.out.println("####@#@###.###@#@#@+#####;#+''#':.,'###@@@@@@@@@#########;@#");
			System.out.println("#@##@##@##.@#+@@###'':;;;''+::'+:.,@@@@#@@#@@;'@@+'######'++");
			System.out.println("+++++''''':'#'##@######'###@::'@::;'+##@'####'';@;.';;:;';#'");
			System.out.println("##'+#+####.@##@#@@@@###@#@+#':'+###'#++#+':,:;'++;,';':#+'''");
			System.out.println("+''#+#+##+,###@#@#+#';@#+;;;#++:###:;+;##':;;''+++;'++#++#++");
			System.out.println("+++'###+##,'++#@'';::,:;+:;;###++#';':'++++++++#########++#+");
			System.out.println("##+;####+#,,#''+#:++:;'+#;;;'@++;;###+#+##+++########++':,..");
			System.out.println("#++'+;,'#+,'##.:;''+++###++++++#;;##+#####+';:,.............");
			System.out.println(";,;++''#++,#++++#######++#++##@#;;:,........................");
			System.out.println("++++++++++,+++######+';:,.....@'@...........................");
			System.out.println("+++++++++#:;:,...............'#+#...........................");
			System.out.println("+#######'....................,:#++,.........................");
			System.out.println("#####+:......................,,:++;.........................");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" _____ _                  _                    _____  _____ _   __");
			System.out.println("/  ___| |                (_)              _   / __  \\|  _  (_) / /");
			System.out.println("\\ `--.| |_ __ _ _ __ ___  _ _ __   __ _  (_)  `' / /'| |/' |  / / ");
			System.out.println(" `--. \\ __/ _` | '_ ` _ \\| | '_ \\ / _` |        / /  |  /| | / /  ");
			System.out.println("/\\__/ / || (_| | | | | | | | | | | (_| |  _   ./ /___\\ |_/ // / _ ");
			System.out.println("\\____/ \\__\\__,_|_| |_| |_|_|_| |_|\\__,_| (_)  \\_____/ \\___//_/ (_)");
			System.out.println("                                                                  ");

			break;

			case 0:

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@#@@@@@##@@@@;+#@@@@@");
			System.out.println("#':'####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+#@@@@@#;+#@@@@@@@");
			System.out.println("#+.+'+:,@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'''@@@#''#@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'''++''+@@@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.`:++#'''`@@@@@@@@@@@#");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,:'++#'#::+.@@@@@###@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+,++:#+#;,..'+@@##@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+;#;+::;#+;;+::'@@@@@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+'+@@;+@;'+##++++#+@@#@@@@@##");
			System.out.println("#@#@@@@@@#@@@@@@@##@@@@@@######@@@@@##@@@;+######+'@@#@@####+");
			System.out.println("+'';'++''+####+';;+#++++#@@@@@@@@@@@#@@@@@'''++'@@######+'#@@");
			System.out.println("#@@@@@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@';@@@@;+####,@###'#@@@@@@");
			System.out.println("#@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@@@@';+@@@;+;;:#+++@@@@@@@@@@");
			System.out.println("+''+##@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@#';:;;+####':::@@@@@@@@@@");
			System.out.println("########++''+#@@#@@@@@@@@@@@@@@@@@@#,.` :+:'@@@+'##@@@@@@@@@@");
			System.out.println("#@@@@@@##@@@@@@@###+''+#@@@@#+######`..,'@'#@@@#+#;@@@@@#@#''");
			System.out.println("#@@@@@@##@@#@@@#@#@####'#+:;++'++'+#,:;'+@##@@@#::'@#+''##@@@");
			System.out.println("::;.:##+#########@#@@@@@@@@@@@@@##@@+''+####@@@;::++#######@#");
			System.out.println("#@@@@@@#@@@@@@#@@@@@@@@@@@@@@@###,#@@#;'+++#'+#'+###########@");
			System.out.println("####++''''''+++##@@@@@@@@@@###@@@,#@@#''+###@##+@#####+###@##");
			System.out.println("##@@#@######@##@#@@@@@####+++'''+++###++####@##@##@#########@");
			System.out.println("#@@###+#@#@##+@@@@@@@########@#######@####@#@@#@@@@###@#+';'+");
			System.out.println("######+##########@#@####@########,##@####@###@##+'#;''#@@#@@#");
			System.out.println("#@#########@+@#@##@#@###@#@##;#@#:#######';,;@@@';':;'::'+#@'");
			System.out.println("#####+######+##++++'+++'''##;::,'+++'::,:;;;::;+';';;;,:+'@#'");
			System.out.println("##'##+######@#######@###@;##:::,;:;;,::::;''':::''';;',,+;##'");
			System.out.println("##@#####@#+++@##@##@@###::,:::,,,;'':,:;:;;;::;;;'':,:,,+;++;");
			System.out.println("#####'######++##@@######:::::::::#+';::;;;;';::'';;:,,,:'++++");
			System.out.println("##@''###++#++'##'+:#####;;''';;;;#+++;;'''::;:;'''';,;;;',,,,");
			System.out.println("#@'++#++;'#++####;,'#@#@'++++''''##++:;:,##;;+;'+:.,;;;;,....");
			System.out.println("+#+##############;;;@@+@'######+@+@##;':::#;'+#+';;:,,,......");
			System.out.println("'::######@@##@@@@'+#':,,,,,:::;';;:,,;'';'#+;;;:,............");
			System.out.println(";..+@@#+'':....,;;;:::,,............,:';;;:,.................");
			System.out.println(";...,:;;:,,..................................................");

			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");

			System.out.println(" _____ _                  _                    _____ _   __");
			System.out.println("/  ___| |                (_)              _   |  _  (_) / /");
			System.out.println("\\ `--.| |_ __ _ _ __ ___  _ _ __   __ _  (_)  | |/' |  / / ");
			System.out.println(" `--. \\ __/ _` | '_ ` _ \\| | '_ \\ / _` |      |  /| | / /  ");
			System.out.println("/\\__/ / || (_| | | | | | | | | | | (_| |  _   \\ |_/ // / _ ");
			System.out.println("\\____/ \\__\\__,_|_| |_| |_|_|_| |_|\\__,_| (_)   \\___//_/ (_)");
			System.out.println(" _____                                        _   _                __            _    _                             ");
			System.out.println("|  __ \\                                      | | | |              / _|          | |  (_)                            ");
			System.out.println("| |  \\/ __ _ _ __ ___   ___   _ __ ___   ___ | |_| |__   ___ _ __| |_ _   _  ___| | ___ _ __     _____   _____ _ __ ");
			System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | '_ ` _ \\ / _ \\| __| '_ \\ / _ \\ '__|  _| | | |/ __| |/ / | '_ \\   / _ \\ \\ / / _ \\ '__|");
			System.out.println("| |_\\ \\ (_| | | | | | |  __/ | | | | | | (_) | |_| | | |  __/ |  | | | |_| | (__|   <| | | | | | (_) \\ V /  __/ |   ");
			System.out.println(" \\____/\\__,_|_| |_| |_|\\___| |_| |_| |_|\\___/ \\__|_| |_|\\___|_|  |_|  \\__,_|\\___|_|\\_\\_|_| |_|  \\___/ \\_/ \\___|_|   ");

			break;
                                                                                                                    
                                                                                                                    
                                                           
                                                                                                                             

                                                                 
                                                                 

    	}
    }









}




    				
    					

                                                                                                                           
                                                                                                          
                                                                                                          

                                                                                          


