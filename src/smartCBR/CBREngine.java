/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartCBR;

import de.dfki.mycbr.core.DefaultCaseBase;
import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.io.CSVImporter;

/**
 *
 * @author mario
 */
public class CBREngine {
    
    private final String basepath = System.getProperty("user.dir") + "/proj/";
    private final String projectName = "smartp.prj";
    private final String smartphoneCases = "CB_csvImport";
    private final String conceptName = "smartphone";
    private Project project;
    private Concept concept;
    private DefaultCaseBase caseBase;
    
    public CBREngine() {
        createProject();
    }
    
    public void createProject() {
                
        try {    
            project = new Project(basepath+projectName);
            concept = project.getConceptByID(conceptName);
            caseBase = (DefaultCaseBase)project.getCaseBases().get(smartphoneCases);
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
   
   public DefaultCaseBase getCaseBase() {
       return caseBase;
   }
}
