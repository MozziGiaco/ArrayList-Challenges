import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{

		public static void main(String[] args)
			{
				printNames();
				printAlphabetically();
				printFirstAndLast();

			}

		private static void printNames()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("Broncos");
				names.add("dog");
				names.add("cat");

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
				names.add("Broncos");
				names.add("dog");
				names.add("cat");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");

				Collections.sort(names);
				for (String n : names)
					{
						System.out.println(n);
					}

			}

		private static void printFirstAndLast()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("Broncos");
				names.add("dog");
				names.add("cat");

				names.add("wolf");

				names.add("walrus");

				names.add("wombat");

				names.add("snake");

				names.add("llama");

				names.add("alpaca");
				names.add("elephant");
				Collections.sort(names);
				System.out.println(names.get(0));
				System.out.println(names.get(9));

			}

		private static void printRemoveStrings()
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("Broncos");
				names.add("dog");
				names.add("cat");

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

	}
