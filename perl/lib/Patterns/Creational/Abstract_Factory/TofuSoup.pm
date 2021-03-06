package Patterns::Creational::Abstract_Factory::TofuSoup;

use Moo;
extends 'Patterns::Creational::Abstract_Factory::Soup';

sub BUILDARGS
{
   {
      soupName => "Tofu Soup",
      soupIngredients => [
        "1 Pound tofu",
        "1 cup carrot juice",
        "1/4 cup spirolena",
      ]
    }
}

1;
