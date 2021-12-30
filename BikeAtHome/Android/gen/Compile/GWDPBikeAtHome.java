/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Projet
 * Classe Android : BikeAtHome
 * Date : 30/12/2021 21:28:30
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.masociete.wm_todo_list.wdgen;


import com.masociete.wm_todo_list.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPBikeAtHome extends WDProjet
{
private static GWDPBikeAtHome ms_instance = null;
/**
 * Accès au projet: BikeAtHome
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPBikeAtHome.getInstance()
 */
public static GWDPBikeAtHome getInstance()
{
return (GWDPBikeAtHome) ms_instance;
}

 // FEN_Liste
public GWDFFEN_Liste mWD_FEN_Liste = new GWDFFEN_Liste();
 // accesseur de FEN_Liste
public GWDFFEN_Liste getFEN_Liste()
{
mWD_FEN_Liste.checkOuverture();
return mWD_FEN_Liste;
}

 // FEN_Accueil
public GWDFFEN_Accueil mWD_FEN_Accueil = new GWDFFEN_Accueil();
 // accesseur de FEN_Accueil
public GWDFFEN_Accueil getFEN_Accueil()
{
mWD_FEN_Accueil.checkOuverture();
return mWD_FEN_Accueil;
}

 // FEN_Saisie_Seance
public GWDFFEN_Saisie_Seance mWD_FEN_Saisie_Seance = new GWDFFEN_Saisie_Seance();
 // accesseur de FEN_Saisie_Seance
public GWDFFEN_Saisie_Seance getFEN_Saisie_Seance()
{
mWD_FEN_Saisie_Seance.checkOuverture();
return mWD_FEN_Saisie_Seance;
}


 // Constructeur de la classe GWDPBikeAtHome
public GWDPBikeAtHome()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("FEN_Liste", mWD_FEN_Liste);
ajouterFenetre("FEN_Accueil", mWD_FEN_Accueil);
ajouterFenetre("FEN_Saisie_Seance", mWD_FEN_Saisie_Seance);



}

// Code de déclaration de BikeAtHome
public void trtInitProjet()
{
// 


// HCréationSiInexistant("*")
WDAPIHF.hCreationSiInexistant(new WDChaineU("*"));

}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "1.0.9.0";}
public String getNomSociete(){ return "PC SOFT";}
public String getNomAPK(){ return "WM ToDo List";}
public int getIdNomApplication(){return com.masociete.wm_todo_list.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.wm_todo_list";}
public int getIdIconeApplication(){ return com.masociete.wm_todo_list.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 650;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "BikeAtHome";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "wm_todo_list";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\ACTIVANDROID 4-HOLOLIGHT_BREAK.GIF",com.masociete.wm_todo_list.R.drawable.activandroid_4_hololight_break_4, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\ACTIVANDROID 4-HOLOLIGHT_ROLLOVER.PNG",com.masociete.wm_todo_list.R.drawable.activandroid_4_hololight_rollover_5, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\ACTIVANDROID 4-HOLOLIGHT_SELECT.PNG?E5_3NP_4_4_4_4",com.masociete.wm_todo_list.R.drawable.activandroid_4_hololight_select_6_np3_4_4_4_4_selector, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\GABARITS\\WM\\210 MATERIAL DESIGN INDIGO\\MATERIAL DESIGN INDIGO_BTN_BRW.PNG?E5_3NP_8_8_8_8",com.masociete.wm_todo_list.R.drawable.material_design_indigo_btn_brw_7_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\GABARITS\\WM\\210 MATERIAL DESIGN INDIGO\\MATERIAL DESIGN INDIGO_PICT_DETAIL_16_5.PNG",com.masociete.wm_todo_list.R.drawable.material_design_indigo_pict_detail_16_5_8, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\IMAGES\\BG.PNG?_3NP_15_4_7_7",com.masociete.wm_todo_list.R.drawable.bg_9_np3_15_4_7_7, "");
super.ajouterFichierAssocie("Z:\\PTUT-BIKEATHOME\\BIKEATHOME\\GABARITS\\WM\\210 MATERIAL DESIGN INDIGO\\MATERIAL DESIGN INDIGO_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.wm_todo_list.R.drawable.material_design_indigo_edt_11_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("Z:\\PTUT-BikeAtHome\\BikeAtHome\\GABARITS\\WM\\210 MATERIAL DESIGN INDIGO\\MATERIAL DESIGN INDIGO_BTN_STD.PNG?E5_3NP_10_10_10_10",com.masociete.wm_todo_list.R.drawable.material_design_indigo_btn_std_13_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("Z:\\PTUT-BikeAtHome\\BikeAtHome\\GABARITS\\WM\\210 MATERIAL DESIGN INDIGO\\MATERIAL DESIGN INDIGO_COMBO.PNG?E5_3NP_32_6_42_6",com.masociete.wm_todo_list.R.drawable.material_design_indigo_combo_14_np3_32_6_42_6_selector, "");
}

////////////////////////////////////////////////////////////////////////////
// Dialogues avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherDialogue(int nIdQuestion, WDCallback callback, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.dialogue("Nom de la liste :", new String[] {"OK", "Annuler"} , new int[] {1, 2} , 0, 1, 1, "", 0, com.masociete.wm_todo_list.R.raw.question_1199005146486084846_1_10, callback, params);
case 1 : return WDAPIDialogue.dialogue("Nom de la tâche :", new String[] {"OK", "Annuler"} , new int[] {1, 2} , 0, 1, 1, "", 0, com.masociete.wm_todo_list.R.raw.question_1199286325110721416_1_12, callback, params);

default: return super.afficherDialogue(nIdQuestion, callback, params);
}
}

////////////////////////////////////////////////////////////////////////////
// Saisies avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherSaisie(int nIdQuestion, WDObjet variable, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.saisie("Nom de la liste :", new String[] {"OK", "Annuler"} , new int[] {1, 2} , 0, 1, 1, "", 0, com.masociete.wm_todo_list.R.raw.question_1199005146486084846_1_10, variable, params);
case 1 : return WDAPIDialogue.saisie("Nom de la tâche :", new String[] {"OK", "Annuler"} , new int[] {1, 2} , 0, 1, 1, "", 0, com.masociete.wm_todo_list.R.raw.question_1199286325110721416_1_12, variable, params);

default: return super.afficherSaisie(nIdQuestion, variable, params);
}
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPBikeAtHome.class;
}
}
}
