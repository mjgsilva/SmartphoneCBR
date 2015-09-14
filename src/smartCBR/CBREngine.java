/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartCBR;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.io.CSVImporter;

/**
 *
 * @author mario
 */
public class CBREngine {
    
    private String basepath = System.getProperty("user.dir") + "/proj/";
    private String csvFile = "smartp.csv";
    private String projectName = "smartp.prj";
    private String smartphoneCases = "CB_csvImport";
    private String conceptName = "smartphone";
    private String columnSep = ";";
    private Project project;
    private Concept concept;
    private CSVImporter csvImporter;
    
    public CBREngine() {
        createProject();
    }
    
    public void createProject() {
                
        try {
    
            project = new Project(basepath+projectName);
            concept = project.getConceptByID(conceptName);
            /*csvImporter = new CSVImporter(basepath+csvFile,concept); 
            //CSV Importer operations
            csvImporter.readData();
            csvImporter.checkData();
            csvImporter.addMissingValues();
            csvImporter.addMissingDescriptions();
            csvImporter.doImport(); */
        
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public Concept getConcept() {
        return concept;
    }
   
   public String getConceptName() {
       return conceptName;
   } 
}
