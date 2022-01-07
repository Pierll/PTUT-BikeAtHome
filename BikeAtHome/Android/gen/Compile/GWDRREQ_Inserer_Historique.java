/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_Inserer_Historique
 * Date : 05/01/2022 00:06:02
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.equipefitness.bikeathome.wdgen;


import com.equipefitness.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_Inserer_Historique extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_Inserer_Historique";
}
public String getCodeSQLOriginal()
{
return " INSERT INTO Historique (  DateH,\t IDListe ) VALUES (  {ParamDateH#0},\t {ParamIDListe#1}  )";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_Historique = new Fichier();
fic_Historique.setNom("Historique");
fic_Historique.setAlias("Historique");
Requete varReqInsert = new Requete(4);
varReqInsert.ajouterClause(fic_Historique);
Set varSet = new Set();
Rubrique rub_DateH = new Rubrique();
rub_DateH.setNom("Historique.DateH");
rub_DateH.setAlias("DateH");
rub_DateH.setNomFichier("Historique");
rub_DateH.setAliasFichier("Historique");
Parametre param_ParamDateH = new Parametre();
param_ParamDateH.setNom("ParamDateH");
varSet.ajouterElement(rub_DateH);
varSet.ajouterElement(param_ParamDateH);
Rubrique rub_IDListe = new Rubrique();
rub_IDListe.setNom("Historique.IDListe");
rub_IDListe.setAlias("IDListe");
rub_IDListe.setNomFichier("Historique");
rub_IDListe.setAliasFichier("Historique");
Parametre param_ParamIDListe = new Parametre();
param_ParamIDListe.setNom("ParamIDListe");
varSet.ajouterElement(rub_IDListe);
varSet.ajouterElement(param_ParamIDListe);
varReqInsert.ajouterClause(varSet);
return varReqInsert;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Historique";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Historique";
default: return null;
}
}


public int getIdWDR()
{
return com.equipefitness.bikeathome.R.raw.req_inserer_historique;
}
public String getNomFichierWDR()
{
return "req_inserer_historique";
}
}
