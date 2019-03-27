/**
 * Fitxer: FunctionWheatherStation.java
 * @author Albert Ca�ellas Sol�
 * mail: albert.canellas@estudiants.urv.cat
 */

public class FunctionWeatherStation {
	/*S'inicialitza mintemp i minwind a 20, perque si s'inicialitzen a 0 fins que no 
	 * hi hagues un valor negatiu(en cas del vent impossible) no podriem veure una actualitzaci�*/
	private float latitude, longitude, maxtemp, mintemp, temp;
	private int totalrain, rain, day, month, hour, min, windsp, maxwind, minwind;
	private int daymaxt, monthmaxt, hourmaxt, minmaxt, numup;

	/** Constructor sense parametres.
	 * @param latitude= latitut de l'estaci�
	 * @param longitude= longitut de l'estaci� */
	public FunctionWeatherStation(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		temp = 0;
		maxtemp=0;
		mintemp=20;
		windsp = 0;
		maxwind=0;
		minwind=20;
		totalrain = 0;
		rain = 0;
		day = 0;
		month = 0;
		hour = 0;
		min = 0;
		daymaxt = 0;
		monthmaxt = 0;
		hourmaxt = 0;
		minmaxt = 0;
		numup = 0;
	}

	/** Getter de la latitut.
	 * @return latitude 
	 */
	public float getlatitude() {
		return (latitude);
	}

	/** Getter de la longitut.
	 * @return longitude */
	public float getlongitude() {
		return (longitude);
	}

	/** Getter de la temperatura m�xima. 
	 * @return maxtemp 
	 */
	public float getmaxtemp() {
		return (maxtemp);
	}

	/** Getter de la temperatura m�nima. 
	 * @return mintemp
	 */
	public float getmintemp() {
		return (mintemp);
	}

	/** Getter de la temperatura actual. 
	 * @return temp 
	 */
	public float gettemp() {
		return (temp);
	}

	/** Getter de la velocitat del vent. 
	 * @return windsp 
	 */
	public int getwindsp() {
		return (windsp);
	}

	/** Getter de la m�xima velocitat del vent. 
	 * @return maxwind 
	 */
	public int getmaxwind() {
		return (maxwind);
	}

	/** Getter de la m�nima velocitat del vent. 
	 * @return minwind 
	 */
	public int getminwind() {
		return (minwind);
	}

	/** Getter de la pluja. 
	 * @return rain 
	 */
	public int getrain() {
		return (rain);
	}

	/** Getter de la pluja total. 
	 * @return totalrain 
	 */
	public int gettotalrain() {
		return (totalrain);
	}

	/** Getter del dia. 
	 * @return day 
	 */
	public int getday() {
		return (day);
	}

	/** Getter del mes. 
	 * @return month 
	 */
	public int getmonth() {
		return (month);
	}

	/** Getter de l'hora. 
	 * @return hour 
	 */
	public int gethour() {
		return (hour);
	}

	/** Getter dels minuts. 
	 * @return min 
	 */
	public int getmin() {
		return (min);
	}

	/** Getter del dia amb la temperatura m�xima. 
	 * @return daymaxt 
	 */
	public int getdaymaxt() {
		return (daymaxt);
	}

	/** Getter del mes amb la temperatura m�xima. 
	 * @return monthmaxt 
	 */
	public int getmonthmaxt() {
		return (monthmaxt);
	}

	/** Getter de l'hora amb la temperatura m�xima. 
	 * @return hourmaxt 
	 */
	public int gethourmaxt() {
		return (hourmaxt);
	}

	/** Getter dels minuts amb la temperatura m�xima. 
	 * @return minmaxt 
	 */
	public int getminmaxt() {
		return (minmaxt);
	}

	/** Getter del numero de vegades que s'han actualitzat les dades.
	 * @return numup 
	 */
	public int getnumup() {
		return (numup);
	}

	/** Method que fa un update de les condicions meteorol�giques
	 * @param temp=temperatura
	 * @param windsp=velocitat del vent
	 * @param rain=pluja en el moment
	 * @param day=dia
	 * @param month=mes
	 * @param hour=hora
	 * @param min=minuts 
	 */
	public void update(float temp, int windsp, int rain, int day, int month, int hour, int min) {
		this.temp = temp;
		updatetemp(temp);
		this.windsp = windsp;
		updatewind(windsp);
		this.rain = rain;
		totalrain = rain + totalrain;
		this.day = day;
		this.month = month;
		this.hour = hour;
		this.min = min;
		numup++;
	}

	/** Method privat que actualitzen les temperatures max i min, es utilitzat per update.
	 * @param temp=temperatura actual
	 */
	private void updatetemp(float temp) {
		if (temp > this.maxtemp) {
			this.maxtemp = temp;
			this.daymaxt = day;
			this.monthmaxt = month;
			this.hourmaxt = hour;
			this.minmaxt = min;
		}
		if (temp < this.mintemp) {
			this.mintemp = temp;
		}
	}

	/** Method privat que actualitzen les velocitats del vent max i min, es utilitzat per update.
	 * @param windsp=velocitat del vent actual
	 */
	private void updatewind(int windsp) {
		if (windsp > this.maxwind) {
			this.maxwind = windsp;
		}
		if (windsp < this.minwind) {
			this.minwind = windsp;
		}
	}

	/** Method que fa un reset de tots el parametres menys les coordenades de l'estaci�.
	 * (s'inicialitzen a 20 mintemp i minwind, perque si ho fesin a 0 fins que no 
	 * hi hagues un valor negatiu(en cas del vent impossible) no podriem veure una actualitzaci�
	 */
	public void reset() {
		maxtemp = 0;
		mintemp = 20;
		temp = 0;
		windsp = 0;
		maxwind = 0;
		minwind = 20;
		rain = 0;
		totalrain = 0;
		day = 0;
		month = 0;
		hour = 0;
		min = 0;
		daymaxt = 0;
		monthmaxt = 0;
		hourmaxt = 0;
		minmaxt = 0;
		numup = 0;
	}
	
	/** Method que retorna la temperatura de Celcius a Farenheit.
	 * @return tempf= temperatura en graus Farenheit
	 */
	public float transformFarenheit() {
		float tempf = 0;
		tempf = (float) (temp * 1.8 + 32);
		return (tempf);
	}

	/** Method que retorna la velocitat de km/h a milles per hora.
	 * @return mph= velocitat en milles per hora 
	 */
	public int transformmph() {
		int mph = 0;
		mph = (int) (windsp / 1.6);
		return (mph);
	}

	/** Method que retorna el resultat de la comparaci� de la estaci� amb m�s pluja.
	 * @param a=estacio a comparar
	 * @return l'instancia amb m�s pluja
	 */
	public FunctionWeatherStation mostRain(FunctionWeatherStation a) {
		FunctionWeatherStation soport = new FunctionWeatherStation(0.0f, 0.0f);
		if(this.totalrain > a.totalrain){
			soport.latitude = this.latitude;
			soport.longitude = this.longitude;
			soport.maxtemp = this.maxtemp;
			soport.mintemp = this.mintemp;
			soport.temp = this.temp;
			soport.windsp = this.windsp;
			soport.maxwind = this.maxwind;
			soport.minwind = this.minwind;
			soport.rain = this.rain;
			soport.totalrain = this.totalrain;
			soport.day = this.day;
			soport.month = this.month;
			soport.hour = this.hour;
			soport.min = this.min;
			soport.daymaxt = this.daymaxt;
			soport.monthmaxt = this.monthmaxt;
			soport.hourmaxt = this.hourmaxt;
			soport.minmaxt = this.minmaxt;
			soport.numup = this.numup;
		}
		else
			soport = a;
		
		return (soport);
	}

	/** Method que retorna el resultat de la comparacio de la estacio amb m�s pluja.
	 * @param a=primera estacio a comparar
	 * @param b=segona estacio a comparar
	 * @return resultat de la comparacio
	 */
	public int maxTemperatura(FunctionWeatherStation a, FunctionWeatherStation b) {
		int station = 0;
		if ((maxtemp > a.maxtemp) && (maxtemp > b.maxtemp))
			station = 1;
		if ((a.maxtemp > maxtemp) && (a.maxtemp > b.maxtemp))
			station = 2;
		if ((b.maxtemp > maxtemp) && (b.maxtemp > a.maxtemp))
			station = 3;
		return (station);
	}

	/** Method que calcula el total de pluja acumulada en les 3 estacions.
	 * @param a=primera estaci� a comparar
	 * @param b=segona estaci� a comparar
	 * @return total=total de pluja de les 3 estacions
	 */
	public int totalglobalrain(FunctionWeatherStation a, FunctionWeatherStation b) {
		int total = 0;
		total = totalrain + a.totalrain + b.totalrain;
		return (total);
	}

	/** Method que copia les ultimes dades resgistrades d'una altre estaci� a.
	 * @param a=estaci� a 
	 */
	public void copydata(FunctionWeatherStation a) {
		this.temp = a.temp;
		this.windsp = a.windsp;
		this.rain = a.rain;
	}

	/** Method "toString" per escriure latitut, longitut i la pluja total d'una estaci�.
	 * @return missatge= el missatge a escriure
	 */
	public String write() {
		String message;
		message = "Latitut:" + latitude + "/Longitut:" + longitude + "/M�xima temperatura:" + maxtemp+"\nData amb la m�xima temperatura:"+daymaxt+"/"+monthmaxt+" a l'hora "
				+hourmaxt+":"+minmaxt;
		return message;
	}
	
	/** Method "toString" per escriure els parametres d'una estaci�. */
	public String toString() {
		String message;
		message ="Latitut:"+latitude+" / Longitut:"+longitude+" / M�xima temperatura:"+maxtemp+" / M�nima temperatura:"+mintemp+" / Temperatura:"
				+temp+" /\nVelocitat del vent:"+windsp+" / Velocitat m�xima del vent:"+maxwind+" / Velocitat m�nima del vent:"+minwind+" / Pluja actual:"
				+rain+" /\nTotal pluja:"+totalrain+" / Data de l'ultima actualitzaci�:"+day+"/"+month+" a la hora "+hour+":"+min+"\nData amb la m�xima temperatura:"+daymaxt+"/"+monthmaxt+" a l'hora "
				+hourmaxt+":"+minmaxt+"\nNumero de vegades acutualitzat:"+numup;
		return message;
	}

}







