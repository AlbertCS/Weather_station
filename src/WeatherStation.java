/**
 * Fitxer: WeatherStations.java
 * @author Albert Cañellas Solé
 * mail: albert.canellas@estudiants.urv.cat
 */

public class WeatherStation {

	public static void main(String[] args) {

		/* Constructors de les estacions sense parametres */
		FunctionWeatherStation tarragona = new FunctionWeatherStation(41.1f, 1.2f);
		System.out.println("\nLes coordenades de Tarragona són: Latitut="+tarragona.getlatitude()+" i longitut="+tarragona.getlongitude()+ ".");
		FunctionWeatherStation girona = new FunctionWeatherStation(41.98f, 2.82f);
		System.out.println("Les coordenades de Girona són: Latitut=" + girona.getlatitude() + " i longitut="+girona.getlongitude() + ".");
		FunctionWeatherStation lleida = new FunctionWeatherStation(41.61f, 0.64f);
		System.out.println("Les coordenades de Lleida són: Latitut=" + lleida.getlatitude() + " i longitut="+ lleida.getlongitude() + ".");
		System.out.println("\n*******************************************************************************************************************\n");

		/* Getter de tots el parametres(Tarragona) */
		System.out.println("Parametres de Tarragona: ");
		System.out.println("Latitut:" + tarragona.getlatitude() + "/Longitut:" + tarragona.getlongitude() + "/Maxtemp:"+ tarragona.getmaxtemp() + "/Mintemp:" + tarragona.getmintemp() + "/Temp:" + tarragona.gettemp());
		System.out.println("Windsp:" + tarragona.getwindsp() + "/Maxwind:" + tarragona.getmaxwind() + "/Minwind:"+ tarragona.getminwind() + "/Rain:" + tarragona.getrain() + "/Totalrain:" + tarragona.gettotalrain());
		System.out.println("Data del update: "+tarragona.getday()+"/"+tarragona.getmonth()+" a la hora "+tarragona.gethour()+":"+tarragona.getmin());
		System.out.println("La data amb la temperatura màxima: "+tarragona.getdaymaxt()+"/"+tarragona.getmonthmaxt()+" a la hora "+tarragona.gethourmaxt()+":"+tarragona.getminmaxt());
		System.out.println("El numero d'actualitzacions són:" + tarragona.getnumup());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Getter de tots el parametres(Girona) */
		System.out.println("Parametres de Girona:");
		System.out.println("Latitut:" + girona.getlatitude() + "/Longitut:" + girona.getlongitude() + "/Maxtemp:"+ girona.getmaxtemp() + "/Mintemp:" + girona.getmintemp() + "/Temp:" + girona.gettemp());
		System.out.println("Windsp:" + girona.getwindsp() + "/Maxwind:" + girona.getmaxwind() + "/Minwind:"+ girona.getminwind() + "/Rain:" + girona.getrain() + "/Totalrain:" + girona.gettotalrain());
		System.out.println("Data del update: "+girona.getday()+"/"+girona.getmonth()+" a la hora "+girona.gethour()+":"+girona.getmin());
		System.out.println("La data amb la temperatura màxima: "+girona.getdaymaxt()+"/"+girona.getmonthmaxt()+"a la hora "+girona.gethourmaxt()+":"+girona.getminmaxt());
		System.out.println("El numero d'actualitzacions són:" + girona.getnumup());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Getter de tots els parametres(Lleida) */
		System.out.println("Parametres de Lleida:");
		System.out.println("Latitut:" + lleida.getlatitude() + "/Longitut:" + lleida.getlongitude() + "/Maxtemp:"+ lleida.getmaxtemp() + "/Mintemp:" + lleida.getmintemp() + "/Temp:" + lleida.gettemp());
		System.out.println("Windsp:" + lleida.getwindsp() + "/Maxwind:" + lleida.getmaxwind() + "/Minwind:"+ lleida.getminwind() + "/Rain:" + lleida.getrain() + "/Totalrain:" + lleida.gettotalrain());
		System.out.println("Data del update: "+lleida.getday()+"/"+lleida.getmonth()+"a la hora "+lleida.gethour()+":"+lleida.getmin());
		System.out.println("La data amb la temperatura màxima: "+lleida.getdaymaxt()+"/"+lleida.getmonthmaxt()+" a la hora "+lleida.gethourmaxt()+":"+lleida.getminmaxt());
		System.out.println("El numero d'actualitzacions són:" + lleida.getnumup());
		System.out.println("\n*******************************************************************************************************************\n");

		/* Update dels dades de les estacions (temperatura, windspeed, rain, day, month, hour, min)*/
		/* Tarragona */
		System.out.println("Update de les dades de Tarragona:");
		tarragona.update(20.6f, 18, 0, 29, 9, 13, 27);
		System.out.println("Maxtemp:" + tarragona.getmaxtemp() + "/Mintemp:" + tarragona.getmintemp() + "/Temp:"+ tarragona.gettemp() + "/Windsp:" + tarragona.getwindsp() + "/Maxwind:" + tarragona.getmaxwind()+ "/Minwind:" + tarragona.getminwind());
		System.out.println("Data del update: "+tarragona.getday()+"/"+tarragona.getmonth()+" a la hora "+tarragona.gethour()+":"+tarragona.getmin());
		tarragona.update(19.8f, 22, 1, 15, 9, 12, 41);
		System.out.println("Maxtemp:" + tarragona.getmaxtemp() + "/Mintemp:" + tarragona.getmintemp() + "/Temp:"+ tarragona.gettemp() + "/Windsp:" + tarragona.getwindsp() + "/Maxwind:" + tarragona.getmaxwind()+ "/Minwind:" + tarragona.getminwind());
		System.out.println("Data del update: "+tarragona.getday()+"/"+tarragona.getmonth()+" a la hora "+tarragona.gethour()+":"+tarragona.getmin());
		tarragona.update(21.9f, 21, 0, 1, 10, 10, 8);
		System.out.println("Maxtemp:" + tarragona.getmaxtemp() + "/Mintemp:" + tarragona.getmintemp() + "/Temp:"+ tarragona.gettemp() + "/Windsp:" + tarragona.getwindsp() + "/Maxwind:" + tarragona.getmaxwind()+ "/Minwind:" + tarragona.getminwind());
		System.out.println("Data del update: "+tarragona.getday()+"/"+tarragona.getmonth()+" a la hora "+tarragona.gethour()+":"+tarragona.getmin());
		System.out.println("La data amb la temperatura màxima: "+tarragona.getdaymaxt()+"/"+tarragona.getmonthmaxt()+" a la hora "+tarragona.gethourmaxt()+":"+tarragona.getminmaxt());
		System.out.println("El total de pluja de Tarragona és:" + tarragona.gettotalrain());
		System.out.println("El numero d'actualitzacions són:" + tarragona.getnumup());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Girona */
		System.out.println("Update de les dades de Girona:");
		girona.update(15, 19, 17, 17, 9, 12, 3);
		System.out.println("Maxtemp:" + girona.getmaxtemp() + "/Mintemp:" + girona.getmintemp() + "/Temp:"+ girona.gettemp() + "/Windsp:" + girona.getwindsp() + "/Maxwind:" + girona.getmaxwind() + "/Minwind:"+ girona.getminwind());
		System.out.println("Data del update: "+girona.getday()+"/"+girona.getmonth()+" a la hora "+girona.gethour()+":"+girona.getmin());
		girona.update(21.1f, 32, 0, 22, 9, 10, 55);
		System.out.println("Maxtemp:" + girona.getmaxtemp() + "/Mintemp:" + girona.getmintemp() + "/Temp:"+ girona.gettemp() + "/Windsp:" + girona.getwindsp() + "/Maxwind:" + girona.getmaxwind() + "/Minwind:"+ girona.getminwind());
		System.out.println("Data del update: "+girona.getday()+"/"+girona.getmonth()+" a la hora "+girona.gethour()+":"+girona.getmin());
		System.out.println("La data amb la temperatura màxima: "+girona.getdaymaxt()+"/"+girona.getmonthmaxt()+"a la hora "+girona.gethourmaxt()+":"+girona.getminmaxt());
		System.out.println("El total de pluja de Girona és:" + girona.gettotalrain());
		System.out.println("El numero d'actualitzacions són:" + girona.getnumup());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Lleida */
		System.out.println("Update de les dades de Lleida:");
		lleida.update(17.6f, 23, 1, 14, 9, 14, 22);
		System.out.println("Maxtemp:" + lleida.getmaxtemp() + "/Mintemp:" + lleida.getmintemp() + "/Temp:"+ lleida.gettemp() + "/Windsp:" + lleida.getwindsp() + "/Maxwind:" + lleida.getmaxwind() + "/Minwind:"+ lleida.getminwind());
		System.out.println("Data del update: "+lleida.getday()+"/"+lleida.getmonth()+"a la hora "+lleida.gethour()+":"+lleida.getmin());
		lleida.update(20, 24, 3, 23, 9, 13, 2);
		System.out.println("Maxtemp:" + lleida.getmaxtemp() + "/Mintemp:" + lleida.getmintemp() + "/Temp:"+ lleida.gettemp() + "/Windsp:" + lleida.getwindsp() + "/Maxwind:" + lleida.getmaxwind() + "/Minwind:"+ lleida.getminwind());
		System.out.println("Data del update: "+lleida.getday()+"/"+lleida.getmonth()+"a la hora "+lleida.gethour()+":"+lleida.getmin());
		lleida.update(20.1f, 12, 10, 1, 10, 15, 58);
		System.out.println("Maxtemp:" + lleida.getmaxtemp() + "/Mintemp:" + lleida.getmintemp() + "/Temp:"+ lleida.gettemp() + "/Windsp:" + lleida.getwindsp() + "/Maxwind:" + lleida.getmaxwind() + "/Minwind:"+ lleida.getminwind());
		System.out.println("Data del update: "+lleida.getday()+"/"+lleida.getmonth()+"a la hora "+lleida.gethour()+":"+lleida.getmin());
		lleida.update(19.1f, 15, 0, 30, 9, 14, 55);
		System.out.println("Maxtemp:" + lleida.getmaxtemp() + "/Mintemp:" + lleida.getmintemp() + "/Temp:"+ lleida.gettemp() + "/Windsp:" + lleida.getwindsp() + "/Maxwind:" + lleida.getmaxwind() + "/Minwind:"+ lleida.getminwind());
		System.out.println("Data del update: "+lleida.getday()+"/"+lleida.getmonth()+"a la hora "+lleida.gethour()+":"+lleida.getmin());
		System.out.println("La data amb la temperatura màxima: "+lleida.getdaymaxt()+"/"+lleida.getmonthmaxt()+" a la hora "+lleida.gethourmaxt()+":"+lleida.getminmaxt());
		System.out.println("El total de pluja de Lleida és:" + lleida.gettotalrain());
		System.out.println("El numero d'actualitzacions són:" + lleida.getnumup());
		System.out.println(	"\n*******************************************************************************************************************\n");

		/* Transforma en farenheit */
		/* Tarragona */
		System.out.println("La temperatura de Tarragona és de " + tarragona.transformFarenheit() + "ºC o Farenheit");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Girona */
		System.out.println("La temperatura de Girona és de " + girona.transformFarenheit() + "ºC o Farenheit");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Lleida */
		System.out.println("La temperatura de Lleida és de " + lleida.transformFarenheit() + "ºC o Farenheit");
		System.out.println("\n*******************************************************************************************************************\n");

		/* Transforma la velocitat del vent mph */
		System.out.println("La velocitat del vent Tarragona és de " + tarragona.getwindsp() + "km/h o "+ tarragona.transformmph() + " mph");
		System.out.println("La velocitat del vent Girona és de " + girona.getwindsp() + "km/h o "+ girona.transformmph() + " mph");
		System.out.println("La velocitat del vent Lleida és de " + lleida.getwindsp() + "km/h o "+ lleida.transformmph() + " mph");
		System.out.println("\n*******************************************************************************************************************\n");

		/* Comparacio estacio mes pluja entre Tarragona i Girona */
		System.out.println("Comparació estació amb més pluja entre Tarragona i Girona:");
		System.out.println("Parametres de l'instancia amb més pluja:");
			System.out.println(tarragona.mostRain(girona));
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Comparacio estacio mes pluja entre Tarragona i Lleida */
		System.out.println("Comparació de l'estació amb més pluja entre Tarragona i Lleida:");
		System.out.println("Parametres de l'instancia amb més pluja:");			
		System.out.println(tarragona.mostRain(lleida));
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		/* Comparacio estacio mes pluja entre Girona i Lleida */
		System.out.println("Comparació estació amb més pluja entre Girona i Lleida:");
		System.out.println("Parametres de l'instancia amb més pluja:");
		System.out.println(girona.mostRain(lleida));
		System.out.println("\n*******************************************************************************************************************\n");

		/* Comparacio de la estacio amb la temperatura mes alta */
		System.out.println("Comparació de l'estació amb la temperatura més alta:");
		if (tarragona.maxTemperatura(girona, lleida) == 1)
			System.out.println(tarragona.write());
		else if (tarragona.maxTemperatura(girona, lleida) == 2)
			System.out.println(girona.write());
		else
			System.out.println(lleida.write());
		System.out.println("\n*******************************************************************************************************************\n");

		/* Total de pluja entre les 3 estacions */
		System.out.println("La pluja total entre les 3 estacions es de: " + tarragona.totalglobalrain(girona, lleida));
		System.out.println("\n*******************************************************************************************************************\n");
		
		/*Reset(només de girona per no resetejar totes les dades de totes les estacion i aixi poder seguir treballant */
		girona.reset();
		System.out.println("Reset de totes les dades de l'estació de girona:");
		System.out.println("Latitut:" + girona.getlatitude() + "/Longitut:" + girona.getlongitude() + "/Maxtemp:"+ girona.getmaxtemp() + "/Mintemp:" + girona.getmintemp() + "/Temp:" + girona.gettemp() + ",");
		System.out.println("Windsp:" + girona.getwindsp() + "/Maxwind:" + girona.getmaxwind() + "/Minwind:"+ girona.getminwind() + "/Rain:" + girona.getrain() + "/Totalrain:" + girona.gettotalrain() + "/Day:"+ girona.getday() + ",");
		System.out.println("Month:" + girona.getmonth() + "/Hour:" + girona.gethour() + "/Min:" + girona.getmin()+ "/Daymaxtemp:" + girona.getdaymaxt() + "/Monthmaxtemp:" + girona.getmonthmaxt() + ",");
		System.out.println("Hourmaxtemp:" + girona.gethourmaxt() + "/Minmaxtemp:" + girona.getminmaxt() + "/NumUpdates:"+ girona.getnumup() + ".");
		System.out.println("\n*******************************************************************************************************************\n");

		/* Copiar valors de l'estacio actual a una altre */
		girona.copydata(tarragona);
		System.out.println("Copia de les dades de l'estació de Tarragona a Girona:");
		System.out.println("Latitut:" + girona.getlatitude() + "/Longitut:" + girona.getlongitude() + "/Maxtemp:"+ girona.getmaxtemp() + "/Mintemp:" + girona.getmintemp() + "/Temp:" + girona.gettemp() + ",");
		System.out.println("Windsp:" + girona.getwindsp() + "/Maxwind:" + girona.getmaxwind() + "/Minwind:"+ girona.getminwind() + "/Rain:" + girona.getrain() + "/Totalrain:" + girona.gettotalrain() + "/Day:"+ girona.getday() + ",");
		System.out.println("Month:" + girona.getmonth() + "/Hour:" + girona.gethour() + "/Min:" + girona.getmin()+ "/Daymaxtemp:" + girona.getdaymaxt() + "/Monthmaxtemp:" + girona.getmonthmaxt() + ",");
		System.out.println("Hourmaxtemp:" + girona.gethourmaxt() + "/Minmaxtemp:" + girona.getminmaxt() + "/NumUpdates:"+ girona.getnumup() + ".");
		System.out.println("\n*******************************************************************************************************************\n");

	}

}
