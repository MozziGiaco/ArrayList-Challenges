import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{

		public static void main(String[] args)
			{
				printNames();
				printAlphabetically();
				printFirstAndLast();
				printRemoveStrings();
				printFewestAndMost();

			}

		private static void printNames()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("broncos");
				names.add("dog");
				names.add("cats");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");

				for (String n : names)
					{
						System.out.println(n);
					}
			}

		private static void printAlphabetically()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("broncos");
				names.add("dog");
				names.add("cats");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");

				Collections.sort(names);
				System.out.println("");
				for (String n : names)
					{
						System.out.println(n);
					}

			}

		private static void printFirstAndLast()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("broncos");
				names.add("dog");
				names.add("cats");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");
				Collections.sort(names);
				System.out.println("");
				System.out.println(names.get(0));
				System.out.println(names.get(9));

			}

		private static void printRemoveStrings()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("broncos");
				names.add("dog");
				names.add("cats");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");

				for (int i = 0; i < names.size(); i++)
					{
						
					}
			}

		private static void printFewestAndMost()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("Broncos");
				names.add("dog");
				names.add("cats");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");
				System.out.println("");
				System.out.println("dog");
				System.out.println("elephant");
			}

	}
