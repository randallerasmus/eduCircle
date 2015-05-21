package com.mycompany.educircle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Event user1 = new Event.Builder("Lokesh", "Gupta")
	.age(30)
	.phone("1234567")
	.address("Fake address 1234")
	.build();

    }
}
