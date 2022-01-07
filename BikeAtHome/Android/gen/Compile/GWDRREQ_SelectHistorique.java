/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_SelectHistorique
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



public class GWDRREQ_SelectHistorique extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_SelectHistorique";
}
public String getCodeSQLOriginal()
{
return "SELECT Historique.DateH, Session.Nom FRom Historique, Session WHERE Historique.IDListe = Session.IdListe\r\nORDER BY Historique.DateH DESC;\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_DateH = new Rubrique();
rub_DateH.setNom("DateH");
rub_DateH.setAlias("DateH");
rub_DateH.setNomFichier("Historique");
rub_DateH.setAliasFichier("Historique");
varSelect.ajouterElement(rub_DateH);
Rubrique rub_Nom = new Rubrique();
rub_Nom.setNom("Nom");
rub_Nom.setAlias("Nom");
rub_Nom.setNomFichier("Session");
rub_Nom.setAliasFichier("Session");
varSelect.ajouterElement(rub_Nom);
From varFrom = new From();
Fichier fic_Historique = new Fichier();
fic_Historique.setNom("Historique");
fic_Historique.setAlias("Historique");
varFrom.ajouterElement(fic_Historique);
Fichier fic_Session = new Fichier();
fic_Session.setNom("Session");
fic_Session.setAlias("Session");
varFrom.ajouterElement(fic_Session);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "Historique.IDListe = Session.IdListe");
Rubrique rub_IDListe = new Rubrique();
rub_IDListe.setNom("Historique.IDListe");
rub_IDListe.setAlias("IDListe");
rub_IDListe.setNomFichier("Historique");
rub_IDListe.setAliasFichier("Historique");
expr__.ajouterElement(rub_IDListe);
Rubrique rub_IdListe = new Rubrique();
rub_IdListe.setNom("Session.IdListe");
rub_IdListe.setAlias("IdListe");
rub_IdListe.setNomFichier("Session");
rub_IdListe.setAliasFichier("Session");
expr__.ajouterElement(rub_IdListe);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_DateH_1 = new Rubrique();
rub_DateH_1.setNom("DateH");
rub_DateH_1.setAlias("DateH");
rub_DateH_1.setNomFichier("Historique");
rub_DateH_1.setAliasFichier("Historique");
rub_DateH_1.ajouterOption(EWDOptionRequete.TRI, "1");
rub_DateH_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "0");
varOrderBy.ajouterElement(rub_DateH_1);
varReqSelect.ajouterClause(varOrderBy);
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
case 0 : return "Historique";
case 1 : return "Session";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Historique";
case 1 : return "Session";
default: return null;
}
}


public int getIdWDR()
{
return com.equipefitness.bikeathome.R.raw.req_selecthistorique;
}
public String getNomFichierWDR()
{
return "req_selecthistorique";
}
}
