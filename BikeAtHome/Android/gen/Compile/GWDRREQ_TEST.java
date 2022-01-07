/**
 * Code généré par WINDEV - NE PAS MODIFIER !
 * Objet WINDEV : Requête
 * Classe Android : REQ_TEST
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



public class GWDRREQ_TEST extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_TEST";
}
public String getCodeSQLOriginal()
{
return "DELETE FROM Historique;";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_Historique = new Fichier();
fic_Historique.setNom("Historique");
fic_Historique.setAlias("Historique");
Requete varReqDelete = new Requete(5);
varReqDelete.ajouterClause(fic_Historique);
return varReqDelete;
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
return com.equipefitness.bikeathome.R.raw.req_test;
}
public String getNomFichierWDR()
{
return "req_test";
}
}
