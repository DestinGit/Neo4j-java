/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neo4jPackage;

import org.neo4j.driver.v1.*;

/**
 *
 * @author yemei
 */
public class SelectOne {

    public static void main(String[] args) {
        int id = 24;
        String query = "MATCH (f:Formateur {prenom:'Meadow'}) WHERE ID(f) = "+ id +" RETURN n ";
        
        try {
            Config noSSL = Config.build().withEncryptionLevel(Config.EncryptionLevel.NONE).toConfig();

            Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "pascal"), noSSL); // <password>

            Session session = driver.session();
            
            // Renvoie un curseur (0, 1 ou n enregistrements)
            StatementResult cursor = session.run(query);
//            Record record;
//            if(cursor.next()) {
//                Record record = cursor.next();
                //System.out.println("Enregistrement : " + record.toString());
//            }
            
            
        }catch(Exception ex) {
            System.out.println("Rater LOL : ");
        }
    }
}
