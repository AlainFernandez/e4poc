package exo.pizzeria.impl;

import exo.pizzeria.Pizza;

// This class overrides the generated class and will be instantiated by factory
public class PizzaImpl extends MPizzaImpl implements Pizza
{
	public PizzaImpl() {
		super();
		System.out.println("Creation d'une Pizza");
	}

}
