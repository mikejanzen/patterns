

static void (* pourSodaImp)();
//SodaImpSingleton- a Singleton to hold the current SodaImp

   
void SodaImp_set( void( * func )() ) {
	pourSodaImp = func;
}
    
void * SodaImp_get() 
{
	return pourSodaImp;
}
