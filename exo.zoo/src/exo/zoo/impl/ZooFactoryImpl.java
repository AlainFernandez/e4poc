package exo.zoo.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import exo.zoo.Zoo;
import exo.zoo.Parc;
import exo.zoo.Animal;
import exo.zoo.Lion;
import exo.zoo.Monkey;
import exo.zoo.ZooFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class ZooFactoryImpl extends MZooFactoryImpl implements ZooFactory
{
	
	public static ZooFactory init() {
		
		try {
			Object fact = MZooFactoryImpl.init();
			if ((fact != null) && (fact instanceof ZooFactory))
					return (ZooFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZooFactoryImpl(); 
		 }
	
	public Zoo createZoo()
	{
		Zoo result = new ZooImpl();
		return result;
	}
	public Parc createParc()
	{
		Parc result = new ParcImpl();
		return result;
	}
	public Animal createAnimal()
	{
		Animal result = new AnimalImpl();
		return result;
	}
	public Lion createLion()
	{
		Lion result = new LionImpl();
		return result;
	}
	public Monkey createMonkey()
	{
		Monkey result = new MonkeyImpl();
		return result;
	}
}
