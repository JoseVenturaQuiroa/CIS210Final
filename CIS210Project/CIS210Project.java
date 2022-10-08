import java.util.Scanner;

public class CIS210Project
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner ( System.in );

    System.out.print( "Enter your first name: " );
    String firstName = scan.nextLine( ); // Scans name

    System.out.print( "Enter a binary number: " );
    String number = scan.next( ); // Scans number

	if ( firstName.contains(" ") ) // name contains space
	{
	    System.out.print( "First name has a space\n");
	} else
	{
    	String firstNameStart = firstName.substring( 0, 1);
    	firstNameStart = firstNameStart.toUpperCase( );
    	String firstNameRemainder = firstName.substring( 1 );
    	firstNameRemainder = firstNameRemainder.toLowerCase( );
    	firstName = firstNameStart + firstNameRemainder;
    	System.out.println( "\n" + firstName );
	}
    if ( number.contains(" ") ) // number contains space
    {
        System.out.print( "Invalid Binary Number\n");
        System.exit(0);
    }

    for( int i = 0; i < number.length(); i++ )
    {
      char binaryNum = number.charAt( i );

      if ( binaryNum != '0' && binaryNum != '1' ) // non-binary number
      {
        System.out.print( "Invalid Binary Number\n");
        System.exit(0);
      }
    }
    if ( (number.charAt( number.length( ) - 1 ) ) == '1' )
    {
      System.out.println( "Odd\n" );
    }
    else if ( (number.charAt( number.length( ) - 1 ) ) == '0' )
    {
      System.out.println( "Even\n" );
    }
    return;
  }
}