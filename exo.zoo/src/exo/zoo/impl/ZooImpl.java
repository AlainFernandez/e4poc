package exo.zoo.impl;

import exo.zoo.Zoo;

// This class overrides the generated class and will be instantiated by factory
public class ZooImpl extends MZooImpl implements Zoo
{
	public ZooImpl() {
		super();
		System.out.println("Creation d'un nouveau Zoo");
	}
}
