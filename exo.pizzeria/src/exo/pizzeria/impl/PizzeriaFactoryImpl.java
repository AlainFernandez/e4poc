package exo.pizzeria.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import exo.pizzeria.Pizza;
import exo.pizzeria.Ingredient;
import exo.pizzeria.Tomate;
import exo.pizzeria.Jambon;
import exo.pizzeria.Fromage;
import exo.pizzeria.PizzeriaFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class PizzeriaFactoryImpl extends MPizzeriaFactoryImpl implements PizzeriaFactory
{
	
	public static PizzeriaFactory init() {
		
		try {
			Object fact = MPizzeriaFactoryImpl.init();
			if ((fact != null) && (fact instanceof PizzeriaFactory))
					return (PizzeriaFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PizzeriaFactoryImpl(); 
		 }
	
	public Pizza createPizza()
	{
		Pizza result = new PizzaImpl();
		return result;
	}
	public Ingredient createIngredient()
	{
		Ingredient result = new IngredientImpl();
		return result;
	}
	public Tomate createTomate()
	{
		Tomate result = new TomateImpl();
		return result;
	}
	public Jambon createJambon()
	{
		Jambon result = new JambonImpl();
		return result;
	}
	public Fromage createFromage()
	{
		Fromage result = new FromageImpl();
		return result;
	}
}
