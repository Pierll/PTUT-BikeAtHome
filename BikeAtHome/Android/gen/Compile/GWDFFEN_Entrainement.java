/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Entrainement
 * Date : 05/03/2022 19:19:40
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.equipefitness.bikeathome.wdgen;


import com.equipefitness.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.champs.jauge.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.style.degrade.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.types.collection.*;
import fr.pcsoft.wdjava.core.allocation.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCSTPItem extends WDStructure
{
public WDObjet mWD_duSec = new WDDuree();
public WDObjet mWD_duSecMAX = new WDDuree();
public WDObjet mWD_nPuissance = new WDEntier4();
public WDObjet mWD_nFrequence = new WDEntier4();
public WDObjet mWD_sNom = new WDChaineU();



public GWDCSTPItem()
{
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
protected WDObjet getMembreByName(String sNomMembre)
{
if(sNomMembre.equals("dusec")) return mWD_duSec;
if(sNomMembre.equals("dusecmax")) return mWD_duSecMAX;
if(sNomMembre.equals("npuissance")) return mWD_nPuissance;
if(sNomMembre.equals("nfrequence")) return mWD_nFrequence;
if(sNomMembre.equals("snom")) return mWD_sNom;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_duSec; membre.m_strNomMembre = "mWD_duSec"; membre.m_bStatique = false; membre.m_strNomMembreWL = "duSec"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 1 : membre.m_refMembre = mWD_duSecMAX; membre.m_strNomMembre = "mWD_duSecMAX"; membre.m_bStatique = false; membre.m_strNomMembreWL = "duSecMAX"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 2 : membre.m_refMembre = mWD_nPuissance; membre.m_strNomMembre = "mWD_nPuissance"; membre.m_bStatique = false; membre.m_strNomMembreWL = "nPuissance"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 3 : membre.m_refMembre = mWD_nFrequence; membre.m_strNomMembre = "mWD_nFrequence"; membre.m_bStatique = false; membre.m_strNomMembreWL = "nFrequence"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 4 : membre.m_refMembre = mWD_sNom; membre.m_strNomMembre = "mWD_sNom"; membre.m_bStatique = false; membre.m_strNomMembreWL = "sNom"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;

default: return super.getMembreByIndex(nIndice - 5, membre);
}
}
protected WDPropriete getProprieteByName(String sNomPropriete)
{
return super.getProprieteByName(sNomPropriete);
}
protected WDPropriete getProprieteByIndex(int nIndice)
{
switch(nIndice)
{
default: return super.getProprieteByIndex(nIndice - 0);
}
}
}
public class GWDFFEN_Entrainement extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Entrainement
////////////////////////////////////////////////////////////////////////////

/**
 * JAUGE_JaugeLCD
 */
class GWDJAUGE_JaugeLCD extends WDJaugeCirculaire
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Entrainement.JAUGE_JaugeLCD
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,244,243);
super.setQuid(2435924834140555310l);

super.setChecksum("676216505");

super.setNom("JAUGE_JaugeLCD");

super.setType(10);

super.setBulle("");

super.setLibelle("Jauge");

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(55, 154);

super.setTailleInitiale(244, 243);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(-1);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", 0.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xB4B4B4, 0x343434, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setParamJauge(0, 100, 100, true);

super.setStyleJauge(500.000000, 500.000000, -225.000000, 45.000000);

super.setStyleAiguille(1, 0.150000, 0.850000, 0xFF, 1);

super.setStyleFond("", "", 0xE1E1E1);

super.setStyleGraduations(1.000000, creerPolice_GEN("Roboto", -5.000000, 0), 0x222222, 0x222222, 0xE1E1E1, 0x30033);

super.setStyleSupportAiguille(0.100000, 0xBFBFBF, "");

super.setStyleLCD(0.065000, WDDegradeFactory.creerDegrade_GEN(new int[]{0x33FFAE, 0x99FF, 0x33FF}, 90, new int[]{50}));

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
public GWDJAUGE_JaugeLCD mWD_JAUGE_JaugeLCD;

/**
 * LIB_Chrono
 */
class GWDLIB_Chrono extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Entrainement.LIB_Chrono
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436104634256603149l);

super.setChecksum("576390567");

super.setNom("LIB_Chrono");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(125, 236);

super.setTailleInitiale(149, 56);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -19.000000, 0), 3, 0, 0x222222, 0);

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
public GWDLIB_Chrono mWD_LIB_Chrono;

/**
 * BTN_On_Off
 */
class GWDBTN_On_Off extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Entrainement.BTN_On_Off
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436113585002385916l);

super.setChecksum("610331010");

super.setNom("BTN_On_Off");

super.setType(4);

super.setBulle("");

super.setLibelle("On Off");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(195, 460);

super.setTailleInitiale(147, 102);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(true);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

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
 * Traitement: Initialisation de BTN_On_Off
 */
public void init()
//  Version 1
//  Description 
//  Bouton à 2 états du type On/Off
{
super.init();

// // Version 1


// MoiMême..Libellé="PAUSE"
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_LIBELLE,"PAUSE");

}




/**
 * Traitement: Clic sur BTN_On_Off
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// MoiMême..Libellé=(MoiMême..Enfoncé? "REPRENDRE" sinon "PAUSE")


// MoiMême..Libellé=(MoiMême..Enfoncé? "REPRENDRE" sinon "PAUSE")
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_LIBELLE,(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_ENFONCE).getBoolean() ? (WDObjet)new WDChaineU("REPRENDRE") : (WDObjet)new WDChaineU("PAUSE")));

// gbPause				= NOT gbPause;
vWD_gbPause.setValeur((!vWD_gbPause.getBoolean()));

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
public GWDBTN_On_Off mWD_BTN_On_Off;

/**
 * LIB_Nom_Exercice
 */
class GWDLIB_Nom_Exercice extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Entrainement.LIB_Nom_Exercice
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436145084385458296l);

super.setChecksum("703261404");

super.setNom("LIB_Nom_Exercice");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(28, 48);

super.setTailleInitiale(159, 37);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -13.000000, 1), 3, 0, 0x222222, 0);

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
public GWDLIB_Nom_Exercice mWD_LIB_Nom_Exercice;

/**
 * BTN_Stop
 */
class GWDBTN_Stop extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Entrainement.BTN_Stop
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2436151114444531451l);

super.setChecksum("628252835");

super.setNom("BTN_Stop");

super.setType(4);

super.setBulle("");

super.setLibelle("STOP");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(21, 460);

super.setTailleInitiale(141, 102);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

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
 * Traitement: Clic sur BTN_Stop
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Si OKAnnuler("Voulez vous arrêter ?") ALORS


// Si OKAnnuler("Voulez vous arrêter ?") ALORS
if(WDAPIDialogue.okAnnuler("Voulez vous arrêter ?").getBoolean())
{
// 	Ferme(FEN_Entrainement, Valeur renvoyée);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement);

}

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
public GWDBTN_Stop mWD_BTN_Stop;

/**
 * LIB_SUIVANT
 */
class GWDLIB_SUIVANT extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Entrainement.LIB_SUIVANT
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437027429459903664l);

super.setChecksum("581523857");

super.setNom("LIB_SUIVANT");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Suivant:");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(38, 412);

super.setTailleInitiale(66, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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
public GWDLIB_SUIVANT mWD_LIB_SUIVANT;

/**
 * LIB_item_suivant
 */
class GWDLIB_item_suivant extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Entrainement.LIB_item_suivant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437027554015289577l);

super.setChecksum("582858215");

super.setNom("LIB_item_suivant");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(120, 412);

super.setTailleInitiale(190, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

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
public GWDLIB_item_suivant mWD_LIB_item_suivant;

/**
 * IMG_Eclair
 */
class GWDIMG_Eclair extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Entrainement.IMG_Eclair
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437278324283147264l);

super.setChecksum("595265017");

super.setNom("IMG_Eclair");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(26, 100);

super.setTailleInitiale(42, 54);

super.setValeurInitiale("Z:\\PTUT-BikeAtHome\\BikeAtHome\\eclair.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

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
public GWDIMG_Eclair mWD_IMG_Eclair;

/**
 * LIB_Puissance
 */
class GWDLIB_Puissance extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Entrainement.LIB_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437278607753479367l);

super.setChecksum("597753370");

super.setNom("LIB_Puissance");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(68, 109);

super.setTailleInitiale(79, 36);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -16.000000, 0), 3, 0, 0x222222, 0);

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
public GWDLIB_Puissance mWD_LIB_Puissance;

/**
 * IMG_Frequence
 */
class GWDIMG_Frequence extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Entrainement.IMG_Frequence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437280398762336733l);

super.setChecksum("605251001");

super.setNom("IMG_Frequence");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(195, 105);

super.setTailleInitiale(68, 45);

super.setValeurInitiale("Z:\\PTUT-BikeAtHome\\BikeAtHome\\frequence.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

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
public GWDIMG_Frequence mWD_IMG_Frequence;

/**
 * LIB_Frequence
 */
class GWDLIB_Frequence extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Entrainement.LIB_Frequence
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2437280716590973318l);

super.setChecksum("606305476");

super.setNom("LIB_Frequence");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(268, 106);

super.setTailleInitiale(69, 43);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -16.000000, 0), 3, 0, 0x222222, 0);

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
public GWDLIB_Frequence mWD_LIB_Frequence;

/**
 * LIB_temps_restant
 */
class GWDLIB_temps_restant extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Entrainement.LIB_temps_restant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2459990107048043312l);

super.setChecksum("599166080");

super.setNom("LIB_temps_restant");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("-");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(207, 0);

super.setTailleInitiale(68, 32);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0x808080, creerPolice_GEN("Roboto", -11.000000, 1), 3, 0, 0x222222, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xE1E1E1, 0x616161, 0x808080, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


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
public GWDLIB_temps_restant mWD_LIB_temps_restant;

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Entrainement.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2459992580971736540l);

super.setChecksum("621697388");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Temps total restant:");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-1, -1);

super.setTailleInitiale(208, 33);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0x808080, creerPolice_GEN("Roboto", -11.000000, 1), 3, 0, 0x222222, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xE1E1E1, 0x616161, 0x808080, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


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
public GWDLIB_SansNom1 mWD_LIB_SansNom1;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Entrainement
////////////////////////////////////////////////////////////////////////////
public void fWD_chronoUpdate()
{
// PROCÉDURE ChronoUpdate()
initExecProcLocale("ChronoUpdate");


try
{
// SI (gstEncours.duSec.EnSecondes <= 0) OU (gstEncours.duSecMAX.EnSecondes <= 0) ALORS //Si le temps de l'exercice actuel est écoulé
if((vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opInfEgal(0) | vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSecMAX.getProp(EWDPropriete.PROP_ENSECONDES).opInfEgal(0)))
{
// 	Dépile(gPItems, gstEncours); //on dépile le prochain exercice
WDAPICollection.depile(vWD_gPItems,vWD_gstEncours);

// 	SI gstEncours.duSec.EnSecondes = -1 OU gstEncours.duSec.EnSecondes = 0 ALORS //Si on attend le dernier exercice
if((vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opEgal(-1, 0) | vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opEgal(0, 0)))
{
// 		Info("Fin de la séance !");
WDAPIDialogue.info("Fin de la séance !");

// 		Ferme(FEN_Entrainement);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement);

}

}

// SI (gbPause = Faux) ALORS //Si il n'y à pas de pause
if(vWD_gbPause.opEgal(false, 0))
{
// 	LIB_Chrono = DuréeVersChaîne(gstEncours.duSec, "MM:SS");
mWD_LIB_Chrono.setValeur(WDAPIDate.dureeVersChaine(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec,new WDChaineU("MM:SS")));

// 	LIB_temps_restant = DuréeVersChaîne(gduDureeTotale, "MM:SS");
mWD_LIB_temps_restant.setValeur(WDAPIDate.dureeVersChaine(vWD_gduDureeTotale,new WDChaineU("MM:SS")));

// 	JAUGE_JaugeLCD = gstEncours.duSec.EnSecondes*100/gstEncours.duSecMAX.EnSecondes; //calcul du pourcentage de la jauge
mWD_JAUGE_JaugeLCD.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opMult(100).opDiv(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSecMAX.getProp(EWDPropriete.PROP_ENSECONDES)));

// 	LIB_Nom_Exercice = gstEncours.sNom;
mWD_LIB_Nom_Exercice.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_sNom);

// 	LIB_Puissance = gstEncours.nPuissance;
mWD_LIB_Puissance.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_nPuissance);

// 	LIB_Frequence = gstEncours.nFrequence;
mWD_LIB_Frequence.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_nFrequence);

// 	IF gstEncours.nPuissance < 200 ALORS
if(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_nPuissance.opInf(200))
{
// 		LIB_Nom_Exercice.Couleur = BleuClair;
mWD_LIB_Nom_Exercice.setProp(EWDPropriete.PROP_COULEUR,16711680);

}
else if((vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_nPuissance.opSup(200) & vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_nPuissance.opInf(300)))
{
// 		LIB_Nom_Exercice.Couleur = JauneFoncé;
mWD_LIB_Nom_Exercice.setProp(EWDPropriete.PROP_COULEUR,32896);

}
else
{
// 		LIB_Nom_Exercice.Couleur = RougeClair;
mWD_LIB_Nom_Exercice.setProp(EWDPropriete.PROP_COULEUR,255);

}

// 	tmpP est une Pile de STPItem = gPItems;
WDObjet vWD_tmpP = WDVarNonAllouee.ref;
vWD_tmpP = new WDPile(new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCSTPItem();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCSTPItem.class;}		});
vWD_tmpP.setValeur(vWD_gPItems);


// 	tmp est un STPItem;
WDObjet vWD_tmp = WDVarNonAllouee.ref;
vWD_tmp = new GWDCSTPItem();


// 	Dépile(tmpP,tmp)
WDAPICollection.depile(vWD_tmpP,vWD_tmp);

// 	IF (tmp.nPuissance = 0 ET tmp.nFrequence = 0) THEN
if((vWD_tmp.checkType(GWDCSTPItem.class).mWD_nPuissance.opEgal(0, 0) & vWD_tmp.checkType(GWDCSTPItem.class).mWD_nFrequence.opEgal(0, 0)))
{
// 		LIB_item_suivant = "... Fin de la séance ..."
mWD_LIB_item_suivant.setValeur("... Fin de la séance ...");

}
else
{
// 		LIB_item_suivant = tmp.sNom + " (" + tmp.nPuissance + "W" + ", " + tmp.nFrequence + "tr/m)";
mWD_LIB_item_suivant.setValeur(vWD_tmp.checkType(GWDCSTPItem.class).mWD_sNom.opPlus(" (").opPlus(vWD_tmp.checkType(GWDCSTPItem.class).mWD_nPuissance).opPlus("W").opPlus(", ").opPlus(vWD_tmp.checkType(GWDCSTPItem.class).mWD_nFrequence).opPlus("tr/m)"));

}

// 	gduDureeTotale.Seconde -= 1;
vWD_gduDureeTotale.opDecProp(EWDPropriete.PROP_SECONDE,new WDEntier4(1));

// 	gstEncours.duSec.Seconde -= 1; //Une seconde s'est écoulée
vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.opDecProp(EWDPropriete.PROP_SECONDE,new WDEntier4(1));

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
// Déclaration des champs du fils n°1 de FEN_Entrainement.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0x0, 0xB5513F, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_Entrainement
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre(id_session)
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_id_session = WD_tabParam[0];
}
else { vWD_id_session = null; }
super.ajouterVariableGlobale("id_session",vWD_id_session);



// STPItem est une Structure

// gbPause est un booléen;
vWD_gbPause = new WDBooleen();

super.ajouterVariableGlobale("gbPause",vWD_gbPause);



// gbPause = Faux;
vWD_gbPause.setValeur(false);

// gduDureeTotale est une Durée;
vWD_gduDureeTotale = new WDDuree();

super.ajouterVariableGlobale("gduDureeTotale",vWD_gduDureeTotale);



// gduDureeTotale.Seconde = 0;
vWD_gduDureeTotale.setProp(EWDPropriete.PROP_SECONDE,0);

// MaFenêtre..Titre = Session.Nom
WDContexte.getMaFenetre().setProp(EWDPropriete.PROP_TITRE,WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom"));

// SI Session.Difficultee = 1 ALORS // la couleur de la barre d'état change en fonction de la difficulté de la séance
if(WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("difficultee").opEgal(1, 0))
{
// 	ACTB_ActionBar.CouleurFond = VertClair;
mWD_ACTB_ActionBar.setProp(EWDPropriete.PROP_COULEURFOND,65280);

}
else if(WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("difficultee").opEgal(2, 0))
{
// 	ACTB_ActionBar.CouleurFond = JauneOr;
mWD_ACTB_ActionBar.setProp(EWDPropriete.PROP_COULEURFOND,55295);

}
else
{
// 	ACTB_ActionBar.CouleurFond = RougeClair;
mWD_ACTB_ActionBar.setProp(EWDPropriete.PROP_COULEURFOND,255);

}

// gPItems est une Pile de STPItem;
vWD_gPItems = new WDPile(new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCSTPItem();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCSTPItem.class;}		});
super.ajouterVariableGlobale("gPItems",vWD_gPItems);



// HExécuteRequête(REQ_ListeIdItem,hRequêteDéfaut,id_session); //récupère la liste des items 
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_listeiditem"),new WDEntier4(0),new WDObjet[] {vWD_id_session} );

// POUR TOUT REQ_ListeIdItem 
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getRequeteSansCasseNiAccent("req_listeiditem"), null, true);
while(parcours1.testParcours())
{
// 	i est un STPItem;
vWD_i = new GWDCSTPItem();

super.ajouterVariableGlobale("i",vWD_i);



// 	i.duSec.Seconde = REQ_ListeIdItem.Duree;
vWD_i.checkType(GWDCSTPItem.class).mWD_duSec.setProp(EWDPropriete.PROP_SECONDE,WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("duree"));

// 	i.duSecMAX.Seconde = REQ_ListeIdItem.Duree;
vWD_i.checkType(GWDCSTPItem.class).mWD_duSecMAX.setProp(EWDPropriete.PROP_SECONDE,WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("duree"));

// 	gduDureeTotale.Seconde += REQ_ListeIdItem.Duree;
vWD_gduDureeTotale.opIncProp(EWDPropriete.PROP_SECONDE,WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("duree"));

// 	i.sNom = REQ_ListeIdItem.Nom;
vWD_i.checkType(GWDCSTPItem.class).mWD_sNom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("nom"));

// 	i.nPuissance = REQ_ListeIdItem.PuissanceI;
vWD_i.checkType(GWDCSTPItem.class).mWD_nPuissance.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("puissancei"));

// 	i.nFrequence = REQ_ListeIdItem.Frequence;
vWD_i.checkType(GWDCSTPItem.class).mWD_nFrequence.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("frequence"));

// 	gPItems.Empile(i);
WDAPICollection.empile(vWD_gPItems,vWD_i);

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// gstTamp est un STPItem;
vWD_gstTamp = new GWDCSTPItem();

super.ajouterVariableGlobale("gstTamp",vWD_gstTamp);



// gstTamp.sNom = "Fin de la séance";
vWD_gstTamp.checkType(GWDCSTPItem.class).mWD_sNom.setValeur("Fin de la séance");

// gstTamp.duSec = -1; 
vWD_gstTamp.checkType(GWDCSTPItem.class).mWD_duSec.setValeur(-1);

// gPItems.Empile(gstTamp); 
WDAPICollection.empile(vWD_gPItems,vWD_gstTamp);

// SI (PAS HLitPremier(REQ_ListeIdItem)) ALORS
if((!WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_listeiditem")).getBoolean()))
{
// 	Erreur("Veuillez ajouter des Exercices avant de commencer l'entrainement");
WDAPIDialogue.erreur("Veuillez ajouter des Exercices avant de commencer l'entrainement");

// 	Ferme(FEN_Entrainement);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement);

}

// gstEncours est un STPItem; //premier élément de la pile
vWD_gstEncours = new GWDCSTPItem();

super.ajouterVariableGlobale("gstEncours",vWD_gstEncours);



// Dépile(gPItems, gstEncours);
WDAPICollection.depile(vWD_gPItems,vWD_gstEncours);

}




/**
 * Traitement: Fin d'initialisation de FEN_Entrainement
 */
public void init()
{
super.init();

// TimerSys("ChronoUpdate", 100, 1);


// TimerSys("ChronoUpdate", 100, 1);
WDAPITimer.timerSys(new WDChaineU("ChronoUpdate"),new WDEntier4(100),(long)1);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_id_session = WDVarNonAllouee.ref;
 public WDObjet vWD_gbPause = WDVarNonAllouee.ref;
 public WDObjet vWD_gduDureeTotale = WDVarNonAllouee.ref;
 public WDObjet vWD_gPItems = WDVarNonAllouee.ref;
 public WDObjet vWD_i = WDVarNonAllouee.ref;
 public WDObjet vWD_gstTamp = WDVarNonAllouee.ref;
 public WDObjet vWD_gstEncours = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Entrainement
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_JAUGE_JaugeLCD = new GWDJAUGE_JaugeLCD();
mWD_LIB_Chrono = new GWDLIB_Chrono();
mWD_BTN_On_Off = new GWDBTN_On_Off();
mWD_LIB_Nom_Exercice = new GWDLIB_Nom_Exercice();
mWD_BTN_Stop = new GWDBTN_Stop();
mWD_LIB_SUIVANT = new GWDLIB_SUIVANT();
mWD_LIB_item_suivant = new GWDLIB_item_suivant();
mWD_IMG_Eclair = new GWDIMG_Eclair();
mWD_LIB_Puissance = new GWDLIB_Puissance();
mWD_IMG_Frequence = new GWDIMG_Frequence();
mWD_LIB_Frequence = new GWDLIB_Frequence();
mWD_LIB_temps_restant = new GWDLIB_temps_restant();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Entrainement
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2435923614361301710l);

super.setChecksum("673800134");

super.setNom("FEN_Entrainement");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 577);

super.setTitre("Entrainement");

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
// Initialisation des champs de FEN_Entrainement
////////////////////////////////////////////////////////////////////////////
mWD_JAUGE_JaugeLCD.initialiserObjet();
super.ajouter("JAUGE_JaugeLCD", mWD_JAUGE_JaugeLCD);
mWD_LIB_Chrono.initialiserObjet();
super.ajouter("LIB_Chrono", mWD_LIB_Chrono);
mWD_BTN_On_Off.initialiserObjet();
super.ajouter("BTN_On_Off", mWD_BTN_On_Off);
mWD_LIB_Nom_Exercice.initialiserObjet();
super.ajouter("LIB_Nom_Exercice", mWD_LIB_Nom_Exercice);
mWD_BTN_Stop.initialiserObjet();
super.ajouter("BTN_Stop", mWD_BTN_Stop);
mWD_LIB_SUIVANT.initialiserObjet();
super.ajouter("LIB_SUIVANT", mWD_LIB_SUIVANT);
mWD_LIB_item_suivant.initialiserObjet();
super.ajouter("LIB_item_suivant", mWD_LIB_item_suivant);
mWD_IMG_Eclair.initialiserObjet();
super.ajouter("IMG_Eclair", mWD_IMG_Eclair);
mWD_LIB_Puissance.initialiserObjet();
super.ajouter("LIB_Puissance", mWD_LIB_Puissance);
mWD_IMG_Frequence.initialiserObjet();
super.ajouter("IMG_Frequence", mWD_IMG_Frequence);
mWD_LIB_Frequence.initialiserObjet();
super.ajouter("LIB_Frequence", mWD_LIB_Frequence);
mWD_LIB_temps_restant.initialiserObjet();
super.ajouter("LIB_temps_restant", mWD_LIB_temps_restant);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

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
return GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement;
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
