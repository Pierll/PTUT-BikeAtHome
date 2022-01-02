/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Entrainement
 * Date : 31/12/2021 15:07:53
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.fitdev.bikeathome.wdgen;


import com.fitdev.bikeathome.*;
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
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.types.collection.*;
import fr.pcsoft.wdjava.core.allocation.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCSTPItem extends WDStructure
{
public WDObjet mWD_duSec = new WDDuree();
public WDObjet mWD_duSecMAX = new WDDuree();
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
if(sNomMembre.equals("snom")) return mWD_sNom;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_duSec; membre.m_strNomMembre = "mWD_duSec"; membre.m_bStatique = false; membre.m_strNomMembreWL = "duSec"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 1 : membre.m_refMembre = mWD_duSecMAX; membre.m_strNomMembre = "mWD_duSecMAX"; membre.m_bStatique = false; membre.m_strNomMembreWL = "duSecMAX"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;
case 2 : membre.m_refMembre = mWD_sNom; membre.m_strNomMembre = "mWD_sNom"; membre.m_bStatique = false; membre.m_strNomMembreWL = "sNom"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; membre.m_bAssocie = false; return true;

default: return super.getMembreByIndex(nIndice - 3, membre);
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

super.setPositionInitiale(55, 139);

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

super.setPositionInitiale(125, 232);

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

super.setPositionInitiale(98, 47);

super.setTailleInitiale(159, 28);

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

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -11.000000, 1), 3, 0, 0x222222, 0);

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


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Entrainement
////////////////////////////////////////////////////////////////////////////
public void fWD_chronoUpdate()
{
// procédure ChronoUpdate()
initExecProcLocale("ChronoUpdate");


try
{
// SI (gstEncours.duSec.EnSecondes <= 0) OU (gstEncours.duSecMAX.EnSecondes <= 0) ALORS
if((vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opInfEgal(0) | vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSecMAX.getProp(EWDPropriete.PROP_ENSECONDES).opInfEgal(0)))
{
// 	Dépile(gPItems, gstEncours);
WDAPICollection.depile(vWD_gPItems,vWD_gstEncours);

// 	Trace(gstEncours.duSec.EnSecondes);
WDAPITrace.trace(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES));

// 	Si gstEncours.duSec.EnSecondes = -1 OU gstEncours.duSec.EnSecondes = 0 ALORS
if((vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opEgal(-1, 0) | vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opEgal(0, 0)))
{
// 		Info("Fin de la séance !");
WDAPIDialogue.info("Fin de la séance !");

// 		Ferme(FEN_Entrainement);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement);

}

}

// SI (gbPause = Faux) ALORS
if(vWD_gbPause.opEgal(false, 0))
{
// 	LIB_Chrono = DuréeVersChaîne(gstEncours.duSec, "MM:SS");
mWD_LIB_Chrono.setValeur(WDAPIDate.dureeVersChaine(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec,new WDChaineU("MM:SS")));

// 	JAUGE_JaugeLCD = gstEncours.duSec.EnSecondes*100/gstEncours.duSecMAX.EnSecondes;
mWD_JAUGE_JaugeLCD.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSec.getProp(EWDPropriete.PROP_ENSECONDES).opMult(100).opDiv(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_duSecMAX.getProp(EWDPropriete.PROP_ENSECONDES)));

// 	LIB_Nom_Exercice = gstEncours.sNom;
mWD_LIB_Nom_Exercice.setValeur(vWD_gstEncours.checkType(GWDCSTPItem.class).mWD_sNom);

// 	gstEncours.duSec.Seconde -= 1;
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

super.setStyleActionBar(0xFFFFFF, 0xB5513F, true);

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
// PROCEDURE MaFenêtre(id_session)
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



// STPItem est une structure

// gbPause est un booléen;
vWD_gbPause = new WDBooleen();

super.ajouterVariableGlobale("gbPause",vWD_gbPause);



// gbPause = Faux;
vWD_gbPause.setValeur(false);

// MaFenêtre..Titre = Session.Nom
WDContexte.getMaFenetre().setProp(EWDPropriete.PROP_TITRE,WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom"));

// gPItems est une pile de STPItem;
vWD_gPItems = new WDPile(new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCSTPItem();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCSTPItem.class;}		});
super.ajouterVariableGlobale("gPItems",vWD_gPItems);



// HExécuteRequête(REQ_ListeIdItem,hRequêteDéfaut,id_session);
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

// 	i.sNom = REQ_ListeIdItem.Nom;
vWD_i.checkType(GWDCSTPItem.class).mWD_sNom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listeiditem").getRubriqueSansCasseNiAccent("nom"));

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



// gstTamp.duSec = -1;
vWD_gstTamp.checkType(GWDCSTPItem.class).mWD_duSec.setValeur(-1);

// gPItems.Empile(gstTamp); //pour indiquer la fin
WDAPICollection.empile(vWD_gPItems,vWD_gstTamp);

// SI (PAS HLitPremier(REQ_ListeIdItem)) ALORS
if((!WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_listeiditem")).getBoolean()))
{
// 	erreur("Veuillez ajouter des Exercices avant de commencer l'entrainement");
WDAPIDialogue.erreur("Veuillez ajouter des Exercices avant de commencer l'entrainement");

// 	Ferme(FEN_Entrainement);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Entrainement);

}

// gstEncours est un STPItem;
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

// ChronoDébut(1)


// ChronoDébut(1)
WDAPIVM.chronoDebut(1);

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
