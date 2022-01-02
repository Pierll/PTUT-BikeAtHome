/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_ListeIdItem
 * Date : 31/12/2021 15:07:53
 * Version de wdjava.dll  : 26.0.228.3
 */


package com.fitdev.bikeathome.wdgen;


import com.fitdev.bikeathome.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_ListeIdItem extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_ListeIdItem";
}
public String getCodeSQLOriginal()
{
return "SELECT Duree, Nom\r\nFROM Item\r\nWHERE Item.IDListe = {paramIdListe#0};\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_Duree = new Rubrique();
rub_Duree.setNom("Duree");
rub_Duree.setAlias("Duree");
rub_Duree.setNomFichier("Item");
rub_Duree.setAliasFichier("Item");
varSelect.ajouterElement(rub_Duree);
Rubrique rub_Nom = new Rubrique();
rub_Nom.setNom("Nom");
rub_Nom.setAlias("Nom");
rub_Nom.setNomFichier("Item");
rub_Nom.setAliasFichier("Item");
varSelect.ajouterElement(rub_Nom);
From varFrom = new From();
Fichier fic_Item = new Fichier();
fic_Item.setNom("Item");
fic_Item.setAlias("Item");
varFrom.ajouterElement(fic_Item);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "Item.IDListe = {paramIdListe}");
Rubrique rub_IDListe = new Rubrique();
rub_IDListe.setNom("Item.IDListe");
rub_IDListe.setAlias("IDListe");
rub_IDListe.setNomFichier("Item");
rub_IDListe.setAliasFichier("Item");
expr__.ajouterElement(rub_IDListe);
Parametre param_paramIdListe = new Parametre();
param_paramIdListe.setNom("paramIdListe");
expr__.ajouterElement(param_paramIdListe);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
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
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Item";
default: return null;
}
}


public int getIdWDR()
{
return com.fitdev.bikeathome.R.raw.req_listeiditem;
}
public String getNomFichierWDR()
{
return "req_listeiditem";
}
}
