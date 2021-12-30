/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Fenêtre
 * Classe Android : FEN_Accueil
 * Date : 30/12/2021 21:28:30
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.masociete.wm_todo_list.wdgen;


import com.masociete.wm_todo_list.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Accueil extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Accueil
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Listes
 */
class GWDZR_Listes extends WDZoneRepeteeFichierEnMemoire
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ZR_Listes
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_ID
 */
class GWDATT_ID extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ZR_Listes.ATT_ID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_ID");

super.setLiaisonFichier("session", "idliste");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Accueil.ZR_Listes.ATT_ID

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_ID mWD_ATT_ID = new GWDATT_ID();

/**
 * LIB_Nom
 */
class GWDLIB_Nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ZR_Listes.LIB_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2351846760427503738l);

super.setChecksum("571651581");

super.setNom("LIB_Nom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(75, 14);

super.setTailleInitiale(187, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setLiaisonFichier("session", "nom");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(32768);

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
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Accueil.ZR_Listes.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435080739879564985l);

super.setChecksum("632677089");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(25, 3);

super.setTailleInitiale(42, 43);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Pict_Detail_16_5@dpi1x.png", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xB5513F, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xB5513F, 0x350000, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 8, 8, 8, 8);

super.setImageFond("Z:\\PTUT-BikeAtHome\\BikeAtHome\\Gabarits\\WM\\210 Material Design Indigo\\Material Design Indigo_Btn_Brw@dpi1x.png?E5_3NP_8_8_8_8", 1, 0, 1, 1);

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
public GWDBTN_Flottant mWD_BTN_Flottant = new GWDBTN_Flottant();
/**
 * Initialise tous les champs de FEN_Accueil.ZR_Listes
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ZR_Listes
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_ID.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_ID);
mWD_LIB_Nom.initialiserObjet();
super.ajouterChamp("LIB_Nom",mWD_LIB_Nom);
mWD_BTN_Flottant.initialiserObjet();
super.ajouterChamp("BTN_Flottant",mWD_BTN_Flottant);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(5,5,278,48);
super.setQuid(2351846760427438202l);

super.setChecksum("571598933");

super.setNom("ZR_Listes");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuel(mWD_MENU_ZR);

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 16);

super.setTailleInitiale(288, 380);

super.setValeurInitiale("");

super.setPlan(0);

super.setSourceRemplissage("session", "positionzr", "", true, "", false);

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

super.setParamAffichage(0, 0, 1, 278, 48);

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
 * Traitement: Affichage d'une ligne de ZR_Listes
 */
public void affichageLigne()
{
super.affichageLigne();

// 


// LIB_Aucun..Visible = faux
mWD_LIB_Aucun.setProp(EWDPropriete.PROP_VISIBLE,false);

}




/**
 * Traitement: A chaque modification de ZR_Listes
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
public GWDZR_Listes mWD_ZR_Listes;

/**
 * LIB_Aucun
 */
class GWDLIB_Aucun extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.LIB_Aucun
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2351926066986615727l);

super.setChecksum("559661395");

super.setNom("LIB_Aucun");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Aucune liste créée pour l'instant");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(39, 195);

super.setTailleInitiale(242, 21);

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
// Déclaration des champs du fils n°3 de FEN_Accueil.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2435076586628379970l);

super.setChecksum("614866339");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(133, 299);

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

super.setImage("", 0, 1, 1, null, null, null);

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

// TableauRetour est un tableau de 2 chaînes;



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_TableauRetour = WDVarNonAllouee.ref;


// TableauRetour est un tableau de 2 chaînes;
vWD_TableauRetour = new WDTableauSimple(1, new int[]{2}, 0, 16);

// TableauRetour = Ouvre(FEN_Saisie_Seance);
vWD_TableauRetour.setValeur(WDAPIFenetre.ouvre(GWDPBikeAtHome.getInstance().mWD_FEN_Saisie_Seance));

// si TableauRetour[2] = "ERREUR" ALORS
if(vWD_TableauRetour.get(2).opEgal("ERREUR", 0))
{
}
else if(vWD_TableauRetour.get(2).opEgal(-1, 0))
{
// 	erreur("Choisissez une difficutee");
WDAPIDialogue.erreur("Choisissez une difficutee");

}
else
{
// 	HRAZ(Session)
WDAPIHF.hRaz(WDAPIHF.getFichierSansCasseNiAccent("session"));

// 	Session.Nom			= TableauRetour[1]
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom").setValeur(vWD_TableauRetour.get(1));

// 	Session.PositionZR	= ZR_Listes..Occurrence + 1
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("positionzr").setValeur(mWD_ZR_Listes.getProp(EWDPropriete.PROP_OCCURRENCE).opPlus(1));

// 	HAjoute(Session)	
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("session"));

// 	RafraîchitListes();
fWD_rafraichitListes();

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
public GWDBTN_Flottant mWD_BTN_Flottant;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Accueil
////////////////////////////////////////////////////////////////////////////
//  Résumé : Crée une nouvelle liste
// 
public void fWD_nouvelleListe()
{
// PROCEDURE NouvelleListe()
initExecProcLocale("NouvelleListe");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sNom = new WDChaineU();



// sNom est une chaîne


// SELON Saisie("Nom de la liste :",sNom )
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON Saisie("Nom de la liste :",sNom )
WDObjet _WDExpSelon0 = WDAPIDialogue.saisie(0,vWD_sNom);
if(_WDExpSelon0.opEgal(1, 0))
{
// 		SI sNom <> "" ALORS
if(vWD_sNom.opDiff(""))
{
// 			HLitRecherche(Session,Nom,sNom)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("session"),WDAPIHF.getRubriqueSansCasseNiAccent("nom"),vWD_sNom);

// 			Si pas htrouve(Session) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("session")).getBoolean()))
{
// 				HRAZ(Session)
WDAPIHF.hRaz(WDAPIHF.getFichierSansCasseNiAccent("session"));

// 				Session.Nom = sNom
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom").setValeur(vWD_sNom);

// 				Session.PositionZR = ZR_Listes..Occurrence + 1
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("positionzr").setValeur(mWD_ZR_Listes.getProp(EWDPropriete.PROP_OCCURRENCE).opPlus(1));

// 				HAjoute(Session)	
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("session"));

// 				ouvrefenetremobile(FEN_Liste,Session.IDListe)
WDAPIFenetre.ouvreFille(GWDPBikeAtHome.getInstance().mWD_FEN_Liste,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("idliste")} );

}
else
{
// 				Erreur("Une liste avec le même nom existe déjà.")
WDAPIDialogue.erreur("Une liste avec le même nom existe déjà.");

// 				retour	
return;

}

}
else
{
// 			Erreur("Veuillez entrer un nom pour la liste.")
WDAPIDialogue.erreur("Veuillez entrer un nom pour la liste.");

}

}
else if(_WDExpSelon0.opEgal(2, 0))
{
}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Edite une liste
// 
public void fWD_editeListe()
{
// PROCEDURE EditeListe()
initExecProcLocale("EditeListe");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sNom = new WDChaineU();



// sNom est une chaîne


// HLitRecherche(Session,IDListe,ZR_Listes[ZR_Listes].ATT_ID)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("session"),WDAPIHF.getRubriqueSansCasseNiAccent("idliste"),mWD_ZR_Listes.get(mWD_ZR_Listes).get("ATT_ID"));

// sNom = Session.Nom
vWD_sNom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom"));

// SELON Saisie("Nom de la liste :",sNom )
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON Saisie("Nom de la liste :",sNom )
WDObjet _WDExpSelon0 = WDAPIDialogue.saisie(0,vWD_sNom);
if(_WDExpSelon0.opEgal(1, 0))
{
// 		SI sNom <> "" ALORS
if(vWD_sNom.opDiff(""))
{
// 			Session.Nom = sNom
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("nom").setValeur(vWD_sNom);

// 			HModifie(Session)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("session"));

// 			ZoneRépétéeAffiche(ZR_Listes)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Listes);

}
else
{
// 			Erreur("Veuillez entrer un nom pour la liste.")
WDAPIDialogue.erreur("Veuillez entrer un nom pour la liste.");

}

}
else if(_WDExpSelon0.opEgal(2, 0))
{
}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Sauve les positions des listes dans la base en fonction de la ZR
//  
public void fWD_sauvePositions()
{
// PROCEDURE SauvePositions()
initExecProcLocale("SauvePositions");


try
{
// POUR i = 1 _a_ ZR_Listes..Occurrence
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier8(mWD_ZR_Listes.getProp(EWDPropriete.PROP_OCCURRENCE));
// POUR i = 1 _a_ ZR_Listes..Occurrence
for(WDObjet vWD_i = new WDEntier8(1);vWD_i.opInfEgal(_WDExpBorneMax0);vWD_i.opInc())
{
// 	HLitRecherche(Session,IDListe,ZR_Listes[i].ATT_ID)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("session"),WDAPIHF.getRubriqueSansCasseNiAccent("idliste"),mWD_ZR_Listes.get(vWD_i).get("ATT_ID"));

// 	SI HTrouve(Session) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("session")).getBoolean())
{
// 		Session.PositionZR = i
WDAPIHF.getFichierSansCasseNiAccent("session").getRubriqueSansCasseNiAccent("positionzr").setValeur(vWD_i);

// 		HModifie(Session)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("session"));

}

}
}

// ZoneRépétéeAffiche(ZR_Listes)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Listes);

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Rafraîchit la ZR des listes
// 
public void fWD_rafraichitListes()
{
// PROCEDURE RafraîchitListes()
initExecProcLocale("RafraîchitListes");


try
{
// SauvePositions()
fWD_sauvePositions();

// ZoneRépétéeAffiche(ZR_Listes,taRéExecuteRequete)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Listes,new WDChaineU("Reexecute"));

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
// Déclaration des champs du fils n°1 de FEN_Accueil.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(false, 0, "", "");

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

class GWDMOPT_NouvelleListe extends WDOptionMenu
{
public GWDMOPT_NouvelleListe(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2351850209313915701l);

super.setNom("OPT_NouvelleListe");

super.setType(40001);

super.setLibelle("Nouvelle liste");

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


// NouvelleListe()
fWD_nouvelleListe();

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_NouvelleListe mWD_OPT_NouvelleListe = new GWDMOPT_NouvelleListe(true);

public void initialiserSousObjets()
{
mWD_OPT_NouvelleListe.initialiserObjet();
super.ajouterMenu(mWD_OPT_NouvelleListe);
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



class GWDMMENU_ZR extends WDMenuContextuel
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
super.setConteneurMenu(GWDMMENU_ZR.this);
super.setQuid(2351930078502404739l);

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


// EditeListe()
fWD_editeListe();

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Renommer mWD_OPT_Renommer = new GWDMOPT_Renommer(true);


class GWDMOPT_Editer extends WDOptionMenu
{
public GWDMOPT_Editer(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_ZR.this);
super.setQuid(2435907379296994262l);

super.setNom("OPT_Editer");

super.setType(40001);

super.setLibelle("Editer");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(4);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// OuvreFenêtreMobile(FEN_Liste,ATT_ID)


// OuvreFenêtreMobile(FEN_Liste,ATT_ID)
WDAPIFenetre.ouvreFille(GWDPBikeAtHome.getInstance().mWD_FEN_Liste,new WDObjet[] {mWD_ZR_Listes.mWD_ATT_ID} );

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Editer mWD_OPT_Editer = new GWDMOPT_Editer(true);

public void initialiserSousObjets()
{
mWD_OPT_Renommer.initialiserObjet();
super.ajouterMenu(mWD_OPT_Renommer);
mWD_OPT_Editer.initialiserObjet();
super.ajouterMenu(mWD_OPT_Editer);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2351930078502339203l);

super.setNom("MENU_ZR");

super.setType(40001);

super.setTitreMenu("");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return true;
}
}
public GWDMMENU_ZR mWD_MENU_ZR;



/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_Accueil
 */
public void fermetureFenetreFille()
//  Rafraîchit les listes
{
super.fermetureFenetreFille();

// 


// RafraîchitListes()
fWD_rafraichitListes();

}




/**
 * Traitement: Fermeture de FEN_Accueil
 */
public void fermetureFenetre()
//  Sauve la position des listes
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
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Accueil
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Listes = new GWDZR_Listes();
mWD_LIB_Aucun = new GWDLIB_Aucun();
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();
mWD_MENU_ZR = new GWDMMENU_ZR();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Accueil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2351846760427307130l);

super.setChecksum("575843614");

super.setNom("FEN_Accueil");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5E5);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("BikeAtHome");

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
// Initialisation des champs de FEN_Accueil
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Listes.initialiserObjet();
super.ajouter("ZR_Listes", mWD_ZR_Listes);
mWD_LIB_Aucun.initialiserObjet();
super.ajouter("LIB_Aucun", mWD_LIB_Aucun);
mWD_BTN_Flottant.initialiserObjet();
super.ajouter("BTN_Flottant", mWD_BTN_Flottant);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);
mWD_MENU_ZR.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_ZR);

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
return GWDPBikeAtHome.getInstance().mWD_FEN_Accueil;
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
