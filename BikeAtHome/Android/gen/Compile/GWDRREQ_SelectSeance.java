/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_SelectSeance
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



public class GWDRREQ_SelectSeance extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_SelectSeance";
}
public String getCodeSQLOriginal()
{
return "SELECT * FROM Session;\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_IDListe = new Rubrique();
rub_IDListe.setNom("IDListe");
rub_IDListe.setAlias("IDListe");
rub_IDListe.setNomFichier("Session");
rub_IDListe.setAliasFichier("Session");
varSelect.ajouterElement(rub_IDListe);
Rubrique rub_Nom = new Rubrique();
rub_Nom.setNom("Nom");
rub_Nom.setAlias("Nom");
rub_Nom.setNomFichier("Session");
rub_Nom.setAliasFichier("Session");
varSelect.ajouterElement(rub_Nom);
Rubrique rub_PositionZR = new Rubrique();
rub_PositionZR.setNom("PositionZR");
rub_PositionZR.setAlias("PositionZR");
rub_PositionZR.setNomFichier("Session");
rub_PositionZR.setAliasFichier("Session");
varSelect.ajouterElement(rub_PositionZR);
Rubrique rub_Difficultee = new Rubrique();
rub_Difficultee.setNom("Difficultee");
rub_Difficultee.setAlias("Difficultee");
rub_Difficultee.setNomFichier("Session");
rub_Difficultee.setAliasFichier("Session");
varSelect.ajouterElement(rub_Difficultee);
From varFrom = new From();
Fichier fic_Session = new Fichier();
fic_Session.setNom("Session");
fic_Session.setAlias("Session");
varFrom.ajouterElement(fic_Session);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Limit varLimit = new Limit();
varLimit.setType(0);
varLimit.setNbEnregs(0);
varLimit.setOffset(0);
varReqSelect.ajouterClause(varLimit);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Session";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Session";
default: return null;
}
}


public int getIdWDR()
{
return com.equipefitness.bikeathome.R.raw.req_selectseance;
}
public String getNomFichierWDR()
{
return "req_selectseance";
}
}
