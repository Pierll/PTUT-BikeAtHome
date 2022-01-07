/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Liste
 * Date : 05/01/2022 00:06:02
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.equipefitness.bikeathome.wdgen;


import com.equipefitness.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Liste extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Liste
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Tâches
 */
class GWDZR_Taches extends WDZoneRepeteeFichierEnMemoire
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste.ZR_Tâches
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_ID
 */
class GWDATT_ID extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste.ZR_Tâches.ATT_ID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_ID");

super.setLiaisonFichier("item", "idtache");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste.ZR_Tâches.ATT_ID

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_ID mWD_ATT_ID = new GWDATT_ID();

/**
 * ATT_Puissance
 */
class GWDATT_Puissance extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste.ZR_Tâches.ATT_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Puissance");

super.setLiaisonFichier("item", "puissancei");

super.setChampAssocie(mWD_SAI_Puissance);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste.ZR_Tâches.ATT_Puissance

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Puissance mWD_ATT_Puissance = new GWDATT_Puissance();

/**
 * ATT_Frequence
 */
class GWDATT_Frequence extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste.ZR_Tâches.ATT_Frequence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Frequence");

super.setLiaisonFichier("item", "frequence");

super.setChampAssocie(mWD_SAI_Frequence);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste.ZR_Tâches.ATT_Frequence

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Frequence mWD_ATT_Frequence = new GWDATT_Frequence();

/**
 * ATT_Heure
 */
class GWDATT_Heure extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste.ZR_Tâches.ATT_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Heure");

super.setLiaisonFichier("item", "duree");

super.setChampAssocie(mWD_LIB_SansNom1);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste.ZR_Tâches.ATT_Heure

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Heure mWD_ATT_Heure = new GWDATT_Heure();

/**
 * ATT_Nom
 */
class GWDATT_Nom extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Liste.ZR_Tâches.ATT_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Nom");

super.setLiaisonFichier("item", "nom");

super.setChampAssocie(mWD_LIB_Nom);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste.ZR_Tâches.ATT_Nom

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Nom mWD_ATT_Nom = new GWDATT_Nom();

/**
 * SAI_Puissance
 */
class GWDSAI_Puissance extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste.ZR_Tâches.SAI_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,19,28);
super.setRectCompPrincipal(19,2,51,28);
super.setQuid(2435023384879917081l);

super.setChecksum("626332164");

super.setNom("SAI_Puissance");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(58, 8);

super.setTailleInitiale(70, 32);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("item", "puissancei");

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

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

/**
 * Traitement: A chaque modification de SAI_Puissance ( ZR_Tâches )
 */
public void modification()
{
super.modification();

// Item.PuissanceI = SAI_Puissance;


// Item.PuissanceI = SAI_Puissance;
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("puissancei").setValeur(this);

// HModifie(Item, Numéro d'enregistrement, Options);
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("item"));

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
public GWDSAI_Puissance mWD_SAI_Puissance = new GWDSAI_Puissance();

/**
 * SAI_Frequence
 */
class GWDSAI_Frequence extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Liste.ZR_Tâches.SAI_Frequence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,19,28);
super.setRectCompPrincipal(19,2,56,28);
super.setQuid(2435907911876340594l);

super.setChecksum("583186902");

super.setNom("SAI_Frequence");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(144, 9);

super.setTailleInitiale(75, 32);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("item", "frequence");

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

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

/**
 * Traitement: A chaque modification de SAI_Frequence ( ZR_Tâches )
 */
public void modification()
{
super.modification();

// Item.Frequence = SAI_Frequence; 


// Item.Frequence = SAI_Frequence; 
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("frequence").setValeur(this);

// HModifie(Item);
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("item"));

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
public GWDSAI_Frequence mWD_SAI_Frequence = new GWDSAI_Frequence();

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Liste.ZR_Tâches.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436142395719183597l);

super.setChecksum("686513375");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(265, 22);

super.setTailleInitiale(67, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * LIB_Nom
 */
class GWDLIB_Nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Liste.ZR_Tâches.LIB_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436146471544284610l);

super.setChecksum("587651433");

super.setNom("LIB_Nom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(33, -3);

super.setTailleInitiale(241, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setLiaisonFichier("item", "nom");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_Nom mWD_LIB_Nom = new GWDLIB_Nom();

/**
 * IMG_Eclair
 */
class GWDIMG_Eclair extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Liste.ZR_Tâches.IMG_Eclair
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437802258898088462l);

super.setChecksum("739823755");

super.setNom("IMG_Eclair");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(46, 16);

super.setTailleInitiale(26, 31);

super.setValeurInitiale("Z:\\PTUT-BikeAtHome\\BikeAtHome\\eclair.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Bg_Sheet@dpi1x.png?_3NP_10_10_10_10", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {10, 10, 10, 10}, 0xFFFFFFFF, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_Eclair mWD_IMG_Eclair = new GWDIMG_Eclair();

/**
 * IMG_Frequence
 */
class GWDIMG_Frequence extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Liste.ZR_Tâches.IMG_Frequence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437802550957768051l);

super.setChecksum("741727284");

super.setNom("IMG_Frequence");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(144, 15);

super.setTailleInitiale(31, 30);

super.setValeurInitiale("Z:\\PTUT-BikeAtHome\\BikeAtHome\\frequence.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Bg_Sheet@dpi1x.png?_3NP_10_10_10_10", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {10, 10, 10, 10}, 0xFFFFFFFF, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_Frequence mWD_IMG_Frequence = new GWDIMG_Frequence();

/**
 * IMG_Horloge
 */
class GWDIMG_Horloge extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Liste.ZR_Tâches.IMG_Horloge
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437803268220422072l);

super.setChecksum("744843040");

super.setNom("IMG_Horloge");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(233, 16);

super.setTailleInitiale(28, 26);

super.setValeurInitiale("Z:\\PTUT-BikeAtHome\\BikeAtHome\\horloge.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Bg_Sheet@dpi1x.png?_3NP_10_10_10_10", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {10, 10, 10, 10}, 0xFFFFFFFF, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_Horloge mWD_IMG_Horloge = new GWDIMG_Horloge();
/**
 * Initialise tous les champs de FEN_Liste.ZR_Tâches
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste.ZR_Tâches
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_ID.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_ID);
mWD_ATT_Puissance.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Puissance);
mWD_ATT_Frequence.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Frequence);
mWD_ATT_Heure.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Heure);
mWD_ATT_Nom.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Nom);
mWD_SAI_Puissance.initialiserObjet();
super.ajouterChamp("SAI_Puissance",mWD_SAI_Puissance);
mWD_SAI_Frequence.initialiserObjet();
super.ajouterChamp("SAI_Frequence",mWD_SAI_Frequence);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouterChamp("LIB_SansNom1",mWD_LIB_SansNom1);
mWD_LIB_Nom.initialiserObjet();
super.ajouterChamp("LIB_Nom",mWD_LIB_Nom);
mWD_IMG_Eclair.initialiserObjet();
super.ajouterChamp("IMG_Eclair",mWD_IMG_Eclair);
mWD_IMG_Frequence.initialiserObjet();
super.ajouterChamp("IMG_Frequence",mWD_IMG_Frequence);
mWD_IMG_Horloge.initialiserObjet();
super.ajouterChamp("IMG_Horloge",mWD_IMG_Horloge);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(5,5,310,48);
super.setQuid(2351855900102604966l);

super.setChecksum("556362379");

super.setNom("ZR_Tâches");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuel(mWD_MENU_Tache);

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 396);

super.setValeurInitiale("");

super.setPlan(0);

super.setSourceRemplissage("item", "positionzr", "", true, "", false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(5);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 310, 48);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(true, null);

super.setDeplacementParDnd(2);

super.setSwipe(2, "", false, false, "", false, false);

super.setRecyclageChamp(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\images\\bg.png?_3NP_15_4_7_7", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {7, 7, 4, 15}, 0xFFFFFFFF, 5, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(true, 0xDDDDDD);

super.setStyleSeparateurHorizontaux(1, 0xE5E5E5);

super.setDessinerLigneVide(false);

super.setCadreCelluleSelection(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\ActivAndroid 4-HoloLight_Select.png?E5_3NP_4_4_4_4", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xEFD385, 1, 5));

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0x0, 0xEFD385, 0xFFFFFFFF);

super.setImagePlusMoins("");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Fin d'initialisation de ZR_Tâches
 */
public void finInit()
{
super.finInit();

// POUR i = 1 À MoiMême.Occurrence(toAffichée)


// POUR i = 1 À MoiMême.Occurrence(toAffichée)
// POUR i = 1 À MoiMême.Occurrence(toAffichée)
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(WDAPIZoneRepetee.zoneRepeteeOccurrence(WDContexte.getMoiMeme(),4));vWD_i.opInc())
{
// 	d est une Durée;
WDObjet vWD_d = new WDDuree();



// 	d.Seconde				= MoiMême[i].LIB_SansNom1;
vWD_d.setProp(EWDPropriete.PROP_SECONDE,WDContexte.getMoiMeme().get(vWD_i).get("LIB_SansNom1"));

// 	MoiMême[i].LIB_SansNom1	= DuréeVersChaîne(d, "MM:SS"); //on affiche la duree totale
WDContexte.getMoiMeme().get(vWD_i).get("LIB_SansNom1").setValeur(WDAPIDate.dureeVersChaine(vWD_d,new WDChaineU("MM:SS")));

}

}




/**
 * Traitement: Affichage d'une ligne de ZR_Tâches
 */
public void affichageLigne()
{
super.affichageLigne();

// 


// LIB_Aucun..Visible = Faux
mWD_LIB_Aucun.setProp(EWDPropriete.PROP_VISIBLE,false);

}




/**
 * Traitement: A chaque modification de ZR_Tâches
 */
public void modification()
{
super.modification();

// 


// SauvePositions()
fWD_sauvePositions();

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurAffichageLigne();
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Taches mWD_ZR_Taches;

/**
 * LIB_Aucun
 */
class GWDLIB_Aucun extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste.LIB_Aucun
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2352332693070407507l);

super.setChecksum("614799050");

super.setNom("LIB_Aucun");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Aucune tâche créée pour l'instant");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(38, 195);

super.setTailleInitiale(245, 20);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_Aucun mWD_LIB_Aucun;

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437296715320154159l);

super.setChecksum("582312898");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(133, 314);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("Z:\\PTUT-BikeAtHome\\BikeAtHome\\ajouter@dpi1x.png", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xC06B5C, 0x400000, 0xC06B5C, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xAB4939, 0x2B0000, 0xAB4939, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// NouvelleTâche();


// NouvelleTâche();
fWD_nouvelleTache();

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
public GWDBTN_Flottant mWD_BTN_Flottant;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Liste
////////////////////////////////////////////////////////////////////////////
//  Résumé : Edite une tâche
// 
public void fWD_editeTache( WDObjet vWD_nIDTache )
{
// PROCEDURE EditeTâche(nIDTâche est un entier)
initExecProcLocale("EditeTâche");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sNom = new WDChaineU();



vWD_nIDTache = WDParametre.traiterParametre(vWD_nIDTache, 1, false, 8);


// sNom est une chaîne


// HLitRecherche(Item,IDTâche,nIDTâche)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("item"),WDAPIHF.getRubriqueSansCasseNiAccent("idtache"),vWD_nIDTache);

// Si htrouve(Item) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("item")).getBoolean())
{
// 	sNom = Item.Nom
vWD_sNom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("nom"));

// 	SELON Saisie("Nom de la tâche :",sNom) 
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 	SELON Saisie("Nom de la tâche :",sNom) 
WDObjet _WDExpSelon0 = WDAPIDialogue.saisie(1,vWD_sNom);
if(_WDExpSelon0.opEgal(1, 0))
{
// 			SI sNom <> "" ALORS
if(vWD_sNom.opDiff(""))
{
// 				Item.Nom = sNom
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("nom").setValeur(vWD_sNom);

// 				HModifie(Item)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("item"));

// 				ZoneRépétéeAffiche(ZR_Tâches,taRéExecuteRequete)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Taches,new WDChaineU("Reexecute"));

}
else
{
// 				Erreur("Veuillez entrer un nom pour la tâche.")
WDAPIDialogue.erreur("Veuillez entrer un nom pour la tâche.");

}

}
else if(_WDExpSelon0.opEgal(2, 0))
{
}

}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Crée une nouvelle tâche
// 
public void fWD_nouvelleTache()
{
// PROCEDURE NouvelleTâche()
initExecProcLocale("NouvelleTâche");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_TableauRetour = WDVarNonAllouee.ref;


// TableauRetour est un tableau de 4 chaînes;
vWD_TableauRetour = new WDTableauSimple(1, new int[]{4}, 0, 16);

// TableauRetour = Ouvre(FEN_Saisie_Item);
vWD_TableauRetour.setValeur(WDAPIFenetre.ouvre(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Item));

// SI TableauRetour[3] = "ERREUR" ALORS
if(vWD_TableauRetour.get(3).opEgal("ERREUR", 0))
{
}
else
{
// 	HRAZ(Item)
WDAPIHF.hRaz(WDAPIHF.getFichierSansCasseNiAccent("item"));

// 	Item.IDListe	= Session.IDListe
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("idliste").setValeur(WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("idliste"));

// 	Item.PositionZR	= ZR_Tâches..Occurrence + 1
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("positionzr").setValeur(mWD_ZR_Taches.getProp(EWDPropriete.PROP_OCCURRENCE).opPlus(1));

// 	Item.PuissanceI	= TableauRetour[1];
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("puissancei").setValeur(vWD_TableauRetour.get(1));

// 	Item.Frequence	= TableauRetour[2];
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("frequence").setValeur(vWD_TableauRetour.get(2));

// 	Item.Duree		= TableauRetour[3];
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("duree").setValeur(vWD_TableauRetour.get(3));

// 	Item.Nom		= TableauRetour[4];
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("nom").setValeur(vWD_TableauRetour.get(4));

// 	HAjoute(Item)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("item"));

// 	ZoneRépétéeAffiche(ZR_Tâches,taRéExecuteRequete)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Taches,new WDChaineU("Reexecute"));

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Sauve l'ordre des tâches
//  
public void fWD_sauvePositions()
{
// PROCEDURE SauvePositions()
initExecProcLocale("SauvePositions");


try
{
// POUR i = 1 _a_ ZR_Tâches..Occurrence
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier8(mWD_ZR_Taches.getProp(EWDPropriete.PROP_OCCURRENCE));
// POUR i = 1 _a_ ZR_Tâches..Occurrence
for(WDObjet vWD_i = new WDEntier8(1);vWD_i.opInfEgal(_WDExpBorneMax0);vWD_i.opInc())
{
// 	HLitRecherche(Item,IDTâche,ZR_Tâches[i].ATT_ID)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("item"),WDAPIHF.getRubriqueSansCasseNiAccent("idtache"),mWD_ZR_Taches.get(vWD_i).get("ATT_ID"));

// 	SI HTrouve(Item) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("item")).getBoolean())
{
// 		Item.PositionZR = i
WDAPIHF.getFichierSansCasseNiAccent("item").getRubriqueSansCasseNiAccent("positionzr").setValeur(vWD_i);

// 		HModifie(Item)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("item"));

}

}
}

}
finally
{
finExecProcLocale();
}

}




/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xCC3399, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_Nouveau extends WDOptionMenu
{
public GWDMOPT_Nouveau(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2351926307507461123l);

super.setNom("OPT_Nouveau");

super.setType(40001);

super.setLibelle("Nouvelle tâche");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(1);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(4);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// 


// NouvelleTâche()
fWD_nouvelleTache();

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Nouveau mWD_OPT_Nouveau = new GWDMOPT_Nouveau(true);

public void initialiserSousObjets()
{
mWD_OPT_Nouveau.initialiserObjet();
super.ajouterMenu(mWD_OPT_Nouveau);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3036839747143306216l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



class GWDMMENU_Tache extends WDMenuContextuel
{

class GWDMOPT_Renommer extends WDOptionMenu
{
public GWDMOPT_Renommer(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_Tache.this);
super.setQuid(2352210058842879790l);

super.setNom("OPT_Renommer");

super.setType(40001);

super.setLibelle("Renommer");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(3);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// 


// EditeTâche(ATT_ID)
fWD_editeTache(mWD_ZR_Taches.mWD_ATT_ID);

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Renommer mWD_OPT_Renommer = new GWDMOPT_Renommer(true);

public void initialiserSousObjets()
{
mWD_OPT_Renommer.initialiserObjet();
super.ajouterMenu(mWD_OPT_Renommer);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2352210058842814254l);

super.setNom("MENU_Tâche");

super.setType(40001);

super.setTitreMenu("");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return false;
}
}
public GWDMMENU_Tache mWD_MENU_Tache;



/**
 * Traitement: Déclarations globales de FEN_Liste
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// procedure FEN_Liste(gnIDListe est un entier)
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gnIDListe = WD_tabParam[0];
}
else { vWD_gnIDListe = null; }
super.ajouterVariableGlobale("gnIDListe",vWD_gnIDListe);



vWD_gnIDListe = WDParametre.traiterParametre(vWD_gnIDListe, 1, false, 8);


// MaFenêtre..Titre = Session.Nom
WDContexte.getMaFenetre().setProp(EWDPropriete.PROP_TITRE,WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom"));

// HFiltre(Item,IDListe,gnIDListe)
WDAPIHF.hFiltre(WDAPIHF.getFichierSansCasseNiAccent("item"),WDAPIHF.getRubriqueSansCasseNiAccent("idliste"),vWD_gnIDListe);

}




/**
 * Traitement: Fermeture de FEN_Liste
 */
public void fermetureFenetre()
//  Sauve la position des tâches
{
super.fermetureFenetre();

// 


// SauvePositions()
fWD_sauvePositions();

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gnIDListe = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Liste
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Taches = new GWDZR_Taches();
mWD_LIB_Aucun = new GWDLIB_Aucun();
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();
mWD_MENU_Tache = new GWDMMENU_Tache();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Liste
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2351846807674645672l);

super.setChecksum("578541911");

super.setNom("FEN_Liste");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5E5);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Liste");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Taches.initialiserObjet();
super.ajouter("ZR_Tâches", mWD_ZR_Taches);
mWD_LIB_Aucun.initialiserObjet();
super.ajouter("LIB_Aucun", mWD_LIB_Aucun);
mWD_BTN_Flottant.initialiserObjet();
super.ajouter("BTN_Flottant", mWD_BTN_Flottant);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);
mWD_MENU_Tache.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_Tache);

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
return 1;
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
return true;
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
return false;
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
return GWDPBikeAtHome.getInstance().mWD_FEN_Liste;
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
