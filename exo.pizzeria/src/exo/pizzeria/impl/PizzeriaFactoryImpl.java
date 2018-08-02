package exo.pizzeria.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import exo.pizzeria.Pizza;
import exo.pizzeria.Tomate;
import exo.pizzeria.Jambon;
import exo.pizzeria.Fromage;
import exo.pizzeria.Pizzeria;
import exo.pizzeria.Table;
import exo.pizzeria.Client;
import exo.pizzeria.Recette;
import exo.pizzeria.Oeuf;
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
	public Pizzeria createPizzeria()
	{
		Pizzeria result = new PizzeriaImpl();
		return result;
	}
	public Table createTable()
	{
		Table result = new TableImpl();
		return result;
	}
	public Client createClient()
	{
		Client result = new ClientImpl();
		return result;
	}
	public Recette createRecette()
	{
		Recette result = new RecetteImpl();
		return result;
	}
	public Oeuf createOeuf()
	{
		Oeuf result = new OeufImpl();
		return result;
	}
}
