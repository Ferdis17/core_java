package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Hero {

	private String name;
	private boolean canFly;

	public Hero(String name, boolean canFly) {
		super();
		this.name = name;
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public static List<String> getNamesMeetingCondition(List<Hero> heroList, Predicate<Hero> condition) {
		List<String> foundNames = new ArrayList<>();
		for (Hero hero : heroList) {
			if (condition.test(hero)) {
				foundNames.add(hero.name);
			}
		}
		return foundNames;
	}

	public static void main(String[] aargs) {

		List<Hero> heroes = Arrays.asList(new Hero("Hulk", false), new Hero("Superman", true),
				new Hero("Batman", false));

		List<String> result = getNamesMeetingCondition(heroes, h -> h.canFly);
		result = getNamesMeetingCondition(heroes, h -> h.name.contains("man"));
	}

}
