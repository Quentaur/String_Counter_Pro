String Counter Pro
Developed by Q Cooke, Using IntelliJ IDEA, with Maven and JUnit.

First things first, I changed the name on purpose.

This is a useful architecture if you have a text file full of strings that you want to count in a hurry.

stringCounter.properties contains the configuration of the StringCounter class, the string match and
delimiter expressions are written in regex, so these are reasonably flexible.

The ConfigParser class is a more general config parsing tool. This could be extended in future with
functionality to filter out any unwanted data from the input text file, before any subsequent
processing takes place.  This class could alternatively be made even more generalised and might
therefore be useful as a config parsing utility file.

Speaking of utilities, this architecture could also benefit from the future addition of a proper
logging class, and more detailed error messages, rather than just printing logging messages to screen.

I wrote a unit test just to demonstrate I have some experience with how that is done.

Special Thanks to Laurie and Mark at DGIT for your kind consideration of my application.