package exo.pizzeria;

import exo.pizzeria.impl.PizzeriaFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface PizzeriaFactory extends MPizzeriaFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	PizzeriaFactory eINSTANCE = PizzeriaFactoryImpl.init();
				
	public Pizza createPizza();
	public Tomate createTomate();
	public Jambon createJambon();
	public Fromage createFromage();
	public Pizzeria createPizzeria();
	public Table createTable();
	public Client createClient();
	public Recette createRecette();
	public Oeuf createOeuf();
}
