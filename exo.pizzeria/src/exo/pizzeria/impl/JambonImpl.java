package exo.pizzeria.impl;

import exo.pizzeria.Jambon;

// This class overrides the generated class and will be instantiated by factory
public class JambonImpl extends MJambonImpl implements Jambon
{
	public JambonImpl() {
		super();
		this.price = 1.25;
		System.out.println("Ingredient Jambon added (prix 1.25 euros)");
	}
}
