/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Saisie_Seance
 * Date : 05/01/2022 00:06:02
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.equipefitness.bikeathome.wdgen;


import com.equipefitness.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Saisie_Seance extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Saisie_Seance
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Seance
 */
class GWDSAI_Seance extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Saisie_Seance.SAI_Seance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,96,32);
super.setRectCompPrincipal(96,2,140,32);
super.setQuid(2435069852097840733l);

super.setChecksum("593044750");

super.setNom("SAI_Seance");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 16);

super.setTailleInitiale(236, 36);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

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

/**
 * Traitement: A chaque modification de SAI_Seance
 */
public void modification()
{
super.modification();

// SI SAI_Seance = "" ALORS


// SI SAI_Seance = "" ALORS
if(this.opEgal("", 0))
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
public GWDSAI_Seance mWD_SAI_Seance;

/**
 * COMBO_Difficultee
 */
class GWDCOMBO_Difficultee extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Saisie_Seance.COMBO_Difficultee
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,89,40);
super.setRectCompPrincipal(89,2,174,40);
super.setQuid(2435070135567124619l);

super.setChecksum("596412646");

super.setNom("COMBO_Difficultee");

super.setType(10002);

super.setBulle("");

super.setLibelle("Difficulte");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 60);

super.setTailleInitiale(263, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Combo@dpi1x.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 48);

super.setStyleSelection(0x222222, 0xE2E2E2, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

super.setParamSaisieInvalide(true, "Veuillez saisir une difficulte", "", true, false, false);

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
public GWDCOMBO_Difficultee mWD_COMBO_Difficultee;

/**
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Saisie_Seance.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435071235084514028l);

super.setChecksum("600249967");

super.setNom("BTN_Valider");

super.setType(4);

super.setBulle("");

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(218, 112);

super.setTailleInitiale(125, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

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

// BTN_Valider.Etat = Grisé;


// BTN_Valider.Etat = Grisé;
this.setProp(EWDPropriete.PROP_ETAT,4);

}




/**
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Si SAI_Seance = "" ALORS


// Si SAI_Seance = "" ALORS
if(mWD_SAI_Seance.opEgal("", 0))
{
// 	BTN_Valider.Etat = Grisé;
this.setProp(EWDPropriete.PROP_ETAT,4);

}
else
{
// 	BTN_Valider.Etat = Actif;
this.setProp(EWDPropriete.PROP_ETAT,0);

}

// HLitRecherche(Session,Nom,SAI_Seance)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("session"),WDAPIHF.getRubriqueSansCasseNiAccent("nom"),mWD_SAI_Seance);

// SI PAS HTrouve(Session) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("session")).getBoolean()))
{
// 	NomDifficulte est un tableau de 2 chaînes;
WDObjet vWD_NomDifficulte = WDVarNonAllouee.ref;
vWD_NomDifficulte = new WDTableauSimple(1, new int[]{2}, 0, 16);

// 	NomDifficulte[1] = SAI_Seance;
vWD_NomDifficulte.get(1).setValeur(mWD_SAI_Seance);

// 	NomDifficulte[2] = COMBO_Difficultee;
vWD_NomDifficulte.get(2).setValeur(mWD_COMBO_Difficultee);

// 	trace(COMBO_Difficultee, Informations complémentaires 1, Informations complémentaires N);
WDAPITrace.trace(mWD_COMBO_Difficultee);

// 	Ferme(FEN_Saisie_Seance, NomDifficulte);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Seance,vWD_NomDifficulte);

}
else
{
// 	Erreur("Une séance avec le même nom existe déjà.")	
WDAPIDialogue.erreur("Une séance avec le même nom existe déjà.");

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
public GWDBTN_Valider mWD_BTN_Valider;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Saisie_Seance.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435071295214201151l);

super.setChecksum("600394960");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setBulle("");

super.setLibelle("Annuler");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 112);

super.setTailleInitiale(110, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

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

// NomDifficulte est un tableau de 2 chaînes;



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_NomDifficulte = WDVarNonAllouee.ref;


// NomDifficulte est un tableau de 2 chaînes;
vWD_NomDifficulte = new WDTableauSimple(1, new int[]{2}, 0, 16);

// NomDifficulte[2] = "ERREUR";
vWD_NomDifficulte.get(2).setValeur("ERREUR");

// Ferme(FEN_Saisie_Seance, NomDifficulte);
WDAPIFenetre.ferme(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Seance,vWD_NomDifficulte);

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
 * Traitement: Déclarations globales de FEN_Saisie_Seance
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



// ListeAjoute(COMBO_Difficultee,"Facile");
WDAPIListe.listeAjoute(mWD_COMBO_Difficultee,"Facile");

// ListeAjoute(COMBO_Difficultee,"Moyen");
WDAPIListe.listeAjoute(mWD_COMBO_Difficultee,"Moyen");

// ListeAjoute(COMBO_Difficultee,"Difficile");
WDAPIListe.listeAjoute(mWD_COMBO_Difficultee,"Difficile");

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Saisie_Seance
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Seance = new GWDSAI_Seance();
mWD_COMBO_Difficultee = new GWDCOMBO_Difficultee();
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Saisie_Seance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2435069731836762647l);

super.setChecksum("593086021");

super.setNom("FEN_Saisie_Seance");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 172);

super.setTitre("Saisie_Seance");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(5);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Saisie_Seance
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Seance.initialiserObjet();
super.ajouter("SAI_Seance", mWD_SAI_Seance);
mWD_COMBO_Difficultee.initialiserObjet();
super.ajouter("COMBO_Difficultee", mWD_COMBO_Difficultee);
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);

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
return false;
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
return true;
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
return GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Seance;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "150 ACTIVANDROID 2#WM";
}
}
