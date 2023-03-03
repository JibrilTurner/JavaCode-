
public class Temperature
{
	/* getSport returns a sport based on the parameter temp
	 *	temp >= 80 : swimming
	 *  60 <= temp < 80: tennis
	 *  40 <= temp < 60: golf
	 *  temp < 40: skiing */
	public static String getSport(int temp)
	{
		return "";
	}

    public static void main(String[] args)
    {
    	int temperature = 52;
		System.out.println(getSport(temperature));	//outs golf

		temperature = 90;
		System.out.println(getSport(temperature ));	//outs swimming

		temperature = 32;
		System.out.println(getSport(temperature ));	//outs skiing

		temperature = 74;
		System.out.println(getSport(temperature ));	//outs tennis
    }
}