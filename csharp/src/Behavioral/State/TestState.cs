//TestState.java - testing the State

namespace Behavioral.State 
{

using tap;

class TestState {
   public static void Main()
   {
		DvdStateContext stateContext = new DvdStateContext();

		Tapper tap = new Tapper();
		tap.test( "State 1 test", stateContext.showName( "Sponge Bob Squarepants - Nautical Nonsense and Sponge Buddies") , ("Sponge*Bob*Squarepants*-*Nautical*Nonsense*and*Sponge*Buddies"));
		tap.test( "State 2 test", stateContext.showName( "Jay and Silent Bob Strike Back") , ("Jay*and*Silent*Bob*Strike*Back"));  
		tap.test( "State 3 test", stateContext.showName( "Buffy The Vampire Slayer Season 2") , ("Buffy!The!Vampire!Slayer!Season!2"));
		tap.test( "State 4 test", stateContext.showName( "The Sopranos Season 2") , ("The*Sopranos*Season*2"));
		tap.done();
	}
}      
}
