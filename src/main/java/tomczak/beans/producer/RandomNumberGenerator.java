package tomczak.beans.producer;

import java.util.*;
import javax.enterprise.inject.*;

public class RandomNumberGenerator
{

   private java.util.Random random = new java.util.Random(System.currentTimeMillis());

   @Produces @Random public int getRandomNumber()
   {
	return random.nextInt(100);
   }

   @Produces @Random private double fpRand = random.nextDouble();

   @Produces @RandomField public int getRandomNumberForField()
   {
        System.out.println("Field injection comes here");
	return random.nextInt(100);
   }
}
