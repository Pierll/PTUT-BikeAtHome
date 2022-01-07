/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_DureeTotaleSession
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



public class GWDRREQ_DureeTotaleSession extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_DureeTotaleSession";
}
public String getCodeSQLOriginal()
{
return "SELECT SUM(Item.Duree) as DureeS FROM Item, Session where Session.IDListe = Item.IDListe AND Session.IDListe = {paramSession#0};\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Expression varExprAgregat = new Expression(28, "SUM", "SUM(Item.Duree)");
varExprAgregat.ajouterOption(EWDOptionRequete.SELECT, "1");
Rubrique rub_Duree = new Rubrique();
rub_Duree.setNom("Item.Duree");
rub_Duree.setAlias("Duree");
rub_Duree.setNomFichier("Item");
rub_Duree.setAliasFichier("Item");
varExprAgregat.setAlias("DureeS");
varExprAgregat.ajouterElement(rub_Duree);
varSelect.ajouterElement(varExprAgregat);
From varFrom = new From();
Fichier fic_Item = new Fichier();
fic_Item.setNom("Item");
fic_Item.setAlias("Item");
varFrom.ajouterElement(fic_Item);
Fichier fic_Session = new Fichier();
fic_Session.setNom("Session");
fic_Session.setAlias("Session");
varFrom.ajouterElement(fic_Session);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr_AND = new Expression(24, "AND", "Session.IDListe = Item.IDListe AND Session.IDListe = {paramSession}");
Expression expr__ = new Expression(9, "=", "Session.IDListe = Item.IDListe");
Rubrique rub_IDListe = new Rubrique();
rub_IDListe.setNom("Session.IDListe");
rub_IDListe.setAlias("IDListe");
rub_IDListe.setNomFichier("Session");
rub_IDListe.setAliasFichier("Session");
expr__.ajouterElement(rub_IDListe);
Rubrique rub_IDListe_1 = new Rubrique();
rub_IDListe_1.setNom("Item.IDListe");
rub_IDListe_1.setAlias("IDListe");
rub_IDListe_1.setNomFichier("Item");
rub_IDListe_1.setAliasFichier("Item");
expr__.ajouterElement(rub_IDListe_1);
expr_AND.ajouterElement(expr__);
Expression expr___1 = new Expression(9, "=", "Session.IDListe = {paramSession}");
Rubrique rub_IDListe_2 = new Rubrique();
rub_IDListe_2.setNom("Session.IDListe");
rub_IDListe_2.setAlias("IDListe");
rub_IDListe_2.setNomFichier("Session");
rub_IDListe_2.setAliasFichier("Session");
expr___1.ajouterElement(rub_IDListe_2);
Parametre param_paramSession = new Parametre();
param_paramSession.setNom("paramSession");
expr___1.ajouterElement(param_paramSession);
expr_AND.ajouterElement(expr___1);
Where varWhere = new Where();
varWhere.ajouterElement(expr_AND);
varReqSelect.ajouterClause(varWhere);
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
case 0 : return "Item";
case 1 : return "Session";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Item";
case 1 : return "Session";
default: return null;
}
}


public int getIdWDR()
{
return com.equipefitness.bikeathome.R.raw.req_dureetotalesession;
}
public String getNomFichierWDR()
{
return "req_dureetotalesession";
}
}
