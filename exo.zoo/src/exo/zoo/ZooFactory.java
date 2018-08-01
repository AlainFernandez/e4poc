package exo.zoo;

import exo.zoo.impl.ZooFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ZooFactory extends MZooFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ZooFactory eINSTANCE = ZooFactoryImpl.init();
				
	public Zoo createZoo();
	public Parc createParc();
	public Animal createAnimal();
	public Lion createLion();
	public Monkey createMonkey();
}
