/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Saisie_Item
 * Date : 05/01/2022 00:06:02
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.equipefitness.bikeathome.wdgen;


import com.equipefitness.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Saisie_Item extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Saisie_Item
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Saisie_Item.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435915694367021473l);

super.setChecksum("593083692");

super.setNom("BTN_Valider");

super.setType(4);

super.setBulle("");

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(166, 226);

super.setTailleInitiale(121, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Btn_Std@dpi1x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de BTN_Valider
 */
public void init()
{
super.init();

// BTN_Valider.Grisé = Vrai;


// BTN_Valider.Grisé = Vrai;
this.setProp(EWDPropriete.PROP_GRISE,true);

}




/**
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// ItemRetour est un tableau de 4 chaînes;



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ItemRetour = WDVarNonAllouee.ref;
WDObjet vWD_d = new WDDuree();



// ItemRetour est un tableau de 4 chaînes;
vWD_ItemRetour = new WDTableauSimple(1, new int[]{4}, 0, 16);

// ItemRetour[1] = SAI_Puissance;
vWD_ItemRetour.get(1).setValeur(mWD_SAI_Puissance);

// ItemRetour[2] = SAI_Fréquence;
vWD_ItemRetour.get(2).setValeur(mWD_SAI_Frequence);

// d est une duree;


// d.Seconde = SAI_Seconde;
vWD_d.setProp(EWDPropriete.PROP_SECONDE,mWD_SAI_Seconde);

// d.Minute = SAI_Minutes;
vWD_d.setProp(EWDPropriete.PROP_MINUTE,mWD_SAI_Minutes);

// ItemRetour[3] = d.EnSecondes;
vWD_ItemRetour.get(3).setValeur(vWD_d.getProp(EWDPropriete.PROP_ENSECONDES));

// ItemRetour[4] = SAI_Nom;
vWD_ItemRetour.get(4).setValeur(mWD_SAI_Nom);

// Ferme(FEN_Saisie_Item, ItemRetour);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Item,vWD_ItemRetour);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Valider mWD_BTN_Valider;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Saisie_Item.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435915694367087009l);

super.setChecksum("593149228");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setBulle("");

super.setLibelle("Annuler");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 226);

super.setTailleInitiale(110, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Btn_Std@dpi1x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// ItemRetour est un tableau de 3 chaînes;



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ItemRetour = WDVarNonAllouee.ref;


// ItemRetour est un tableau de 3 chaînes;
vWD_ItemRetour = new WDTableauSimple(1, new int[]{3}, 0, 16);

// ItemRetour[3] = "ERREUR";
vWD_ItemRetour.get(3).setValeur("ERREUR");

// Ferme(FEN_Saisie_Item, ItemRetour);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Item,vWD_ItemRetour);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SansNom2 mWD_BTN_SansNom2;

/**
 * SAI_Puissance
 */
class GWDSAI_Puissance extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Saisie_Item.SAI_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,93,40);
super.setRectCompPrincipal(93,2,129,40);
super.setQuid(2435916055150775240l);

super.setChecksum("599630228");

super.setNom("SAI_Puissance");

super.setType(20004);

super.setBulle("");

super.setLibelle("Puissance");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(227, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

super.setParamSaisieInvalide(false, "", "", true, false, false, true);

super.setStyleLibelleErreurSaisieInvalide(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Puissance mWD_SAI_Puissance;

/**
 * SAI_Fréquence
 */
class GWDSAI_Frequence extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Saisie_Item.SAI_Fréquence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,93,40);
super.setRectCompPrincipal(93,2,129,40);
super.setQuid(2435916149640535285l);

super.setChecksum("600109783");

super.setNom("SAI_Fréquence");

super.setType(20004);

super.setBulle("");

super.setLibelle("Fréquence");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 52);

super.setTailleInitiale(227, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

super.setParamSaisieInvalide(false, "", "", true, false, false, true);

super.setStyleLibelleErreurSaisieInvalide(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Frequence mWD_SAI_Frequence;

/**
 * SAI_Nom
 */
class GWDSAI_Nom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Saisie_Item.SAI_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,52,40);
super.setRectCompPrincipal(52,2,170,40);
super.setQuid(2436146020564159449l);

super.setChecksum("579091791");

super.setNom("SAI_Nom");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 160);

super.setTailleInitiale(222, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

super.setParamSaisieInvalide(false, "", "", true, false, false, true);

super.setStyleLibelleErreurSaisieInvalide(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Nom mWD_SAI_Nom;

/**
 * SAI_Minutes
 */
class GWDSAI_Minutes extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Saisie_Item.SAI_Minutes
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,68,40);
super.setRectCompPrincipal(68,2,55,40);
super.setQuid(2436180204274628049l);

super.setChecksum("644905947");

super.setNom("SAI_Minutes");

super.setType(20004);

super.setBulle("");

super.setLibelle("Minute");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 108);

super.setTailleInitiale(123, 44);

super.setValeurInitiale("0");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("+9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

super.setParamSaisieInvalide(false, "", "", true, false, false, false);

super.setStyleLibelleErreurSaisieInvalide(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SAI_Minutes
 */
public void modification()
{
super.modification();

// 


// IF SAI_Seconde = 0  ET SAI_Minutes = 0 ALORS
if((mWD_SAI_Seconde.opEgal(0, 0) & this.opEgal(0, 0)))
{
// 	BTN_Valider.Etat = Grisé;
mWD_BTN_Valider.setProp(EWDPropriete.PROP_ETAT,4);

}
else
{
// 	BTN_Valider.Etat = Actif;
mWD_BTN_Valider.setProp(EWDPropriete.PROP_ETAT,0);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Minutes mWD_SAI_Minutes;

/**
 * SAI_Seconde
 */
class GWDSAI_Seconde extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Saisie_Item.SAI_Seconde
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,68,40);
super.setRectCompPrincipal(68,2,61,40);
super.setQuid(2436180371779381024l);

super.setChecksum("645934417");

super.setNom("SAI_Seconde");

super.setType(20004);

super.setBulle("");

super.setLibelle("Seconde");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(148, 108);

super.setTailleInitiale(129, 44);

super.setValeurInitiale("0");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("+9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

super.setParamSaisieInvalide(false, "", "", true, false, false, false);

super.setStyleLibelleErreurSaisieInvalide(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SAI_Seconde
 */
public void modification()
{
super.modification();

// IF SAI_Seconde = 0  ET SAI_Minutes = 0 ALORS


// IF SAI_Seconde = 0  ET SAI_Minutes = 0 ALORS
if((this.opEgal(0, 0) & mWD_SAI_Minutes.opEgal(0, 0)))
{
// 	BTN_Valider.Etat = Grisé;
mWD_BTN_Valider.setProp(EWDPropriete.PROP_ETAT,4);

}
else
{
// 	BTN_Valider.Etat = Actif;
mWD_BTN_Valider.setProp(EWDPropriete.PROP_ETAT,0);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Seconde mWD_SAI_Seconde;

/**
 * Traitement: Déclarations globales de FEN_Saisie_Item
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Saisie_Item
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();
mWD_SAI_Puissance = new GWDSAI_Puissance();
mWD_SAI_Frequence = new GWDSAI_Frequence();
mWD_SAI_Nom = new GWDSAI_Nom();
mWD_SAI_Minutes = new GWDSAI_Minutes();
mWD_SAI_Seconde = new GWDSAI_Seconde();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Saisie_Item
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2435915694366824865l);

super.setChecksum("599495269");

super.setNom("FEN_Saisie_Item");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 625);

super.setTitre("Saisie_Item");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Saisie_Item
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);
mWD_SAI_Puissance.initialiserObjet();
super.ajouter("SAI_Puissance", mWD_SAI_Puissance);
mWD_SAI_Frequence.initialiserObjet();
super.ajouter("SAI_Fréquence", mWD_SAI_Frequence);
mWD_SAI_Nom.initialiserObjet();
super.ajouter("SAI_Nom", mWD_SAI_Nom);
mWD_SAI_Minutes.initialiserObjet();
super.ajouter("SAI_Minutes", mWD_SAI_Minutes);
mWD_SAI_Seconde.initialiserObjet();
super.ajouter("SAI_Seconde", mWD_SAI_Seconde);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPBikeAtHome.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPBikeAtHome.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Item;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN INDIGO#WM";
}
}
