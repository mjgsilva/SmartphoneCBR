/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartCBR;

import de.dfki.mycbr.core.DefaultCaseBase;
import de.dfki.mycbr.core.casebase.Instance;
import de.dfki.mycbr.core.model.AttributeDesc;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.FloatDesc;
import de.dfki.mycbr.core.model.IntegerDesc;
import de.dfki.mycbr.core.model.StringDesc;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.retrieval.Retrieval;
import de.dfki.mycbr.core.retrieval.Retrieval.RetrievalMethod;
import de.dfki.mycbr.core.similarity.AmalgamationFct;
import de.dfki.mycbr.core.similarity.Similarity;
import de.dfki.mycbr.util.Pair;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mario
 */
public class QueryManager {
    
    private final Concept concept;
    private final DefaultCaseBase caseBase;
    
    public QueryManager(Concept concept, DefaultCaseBase caseBase) {
        this.concept = concept;
        this.caseBase = caseBase;
    }
    
    public String doQuery(
        String OS,
        String vendor, 
        String sdCard,
        String stylus,
        float cpuFreq,
        float gpuGflops, 
        float displaySize, 
        float cameraPx,
        int cpuCores, 
        int ram, 
        int intStorage, 
        int talkTime, 
        int standbyTime, 
        int price,
        AmalgamationFct profile
    ) {
        Retrieval retrieval = new Retrieval(concept, caseBase);
        retrieval.setRetrievalMethod(RetrievalMethod.RETRIEVE_K);
        concept.setActiveAmalgamFct(profile);
        Instance query = retrieval.getQueryInstance();
        
        SymbolDesc sdOS = (SymbolDesc) concept.getAllAttributeDescs().get("OS");
        query.addAttribute(sdOS, sdOS.getAttribute(OS));
        SymbolDesc sdVendor = (SymbolDesc) concept.getAllAttributeDescs().get("Vendor");
        query.addAttribute(sdVendor, sdVendor.getAttribute(vendor));
        SymbolDesc sdSdCard = (SymbolDesc) concept.getAllAttributeDescs().get("SDCard");
        query.addAttribute(sdSdCard, sdSdCard.getAttribute(sdCard));
        SymbolDesc sdStylus = (SymbolDesc) concept.getAllAttributeDescs().get("Stylus");
        query.addAttribute(sdStylus, sdStylus.getAttribute(stylus));
        
        FloatDesc sdCpuFreq = (FloatDesc) concept.getAllAttributeDescs().get("CPUFreq");
        try {
            query.addAttribute(sdCpuFreq, sdCpuFreq.getAttribute(cpuFreq));
        } catch (ParseException e) {
            e.printStackTrace();
        }
            
        FloatDesc sdGpuGflops = (FloatDesc) concept.getAllAttributeDescs().get("GraphicsGlops");
        try {
            query.addAttribute(sdGpuGflops, sdGpuGflops.getAttribute(gpuGflops));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        try {
            FloatDesc sdDisplaySize = (FloatDesc) concept.getAllAttributeDescs().get("DisplaySize");
            query.addAttribute(sdDisplaySize, sdDisplaySize.getAttribute(displaySize));
        } catch (ParseException e) {
            e.printStackTrace();
        }
            
        FloatDesc sdCameraPx = (FloatDesc) concept.getAllAttributeDescs().get("CameraPx");
        try {
            query.addAttribute(sdCameraPx, sdCameraPx.getAttribute(cameraPx));
        } catch (ParseException e) {
            e.printStackTrace();
        }
  
        IntegerDesc sdCpuCores = (IntegerDesc) concept.getAllAttributeDescs().get("CPUCores");
        try {
            query.addAttribute(sdCpuCores, sdCpuCores.getAttribute(cpuCores));
        } catch (ParseException e) {
            e.printStackTrace();
        }
                    
        IntegerDesc sdRam = (IntegerDesc) concept.getAllAttributeDescs().get("RAM");
        try {
            query.addAttribute(sdRam, sdRam.getAttribute(ram));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        IntegerDesc sdIntStorage = (IntegerDesc) concept.getAllAttributeDescs().get("InternalStorage");
        try {
            query.addAttribute(sdIntStorage, sdIntStorage.getAttribute(intStorage));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        IntegerDesc sdTalkTime = (IntegerDesc) concept.getAllAttributeDescs().get("TalkTime");
        try {
            query.addAttribute(sdTalkTime, sdTalkTime.getAttribute(talkTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        IntegerDesc sdStandbyTime = (IntegerDesc) concept.getAllAttributeDescs().get("StandbyTime");    
        try {
            query.addAttribute(sdStandbyTime, sdStandbyTime.getAttribute(standbyTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        IntegerDesc sdPrice = (IntegerDesc) concept.getAllAttributeDescs().get("Price");
        try {
            query.addAttribute(sdPrice, sdPrice.getAttribute(price));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        retrieval.start();
        List<Pair<Instance, Similarity>> result = retrieval.getResult();
        double similarity = result.get(0).getSecond().getValue();
        return "Model: " + getModel(result) + " \tSimilarity: " + similarity;
    }
    
    private String getModel(List<Pair<Instance, Similarity>> result) {
        StringDesc sdModel = (StringDesc) concept.getAllAttributeDescs().get("Model");
        return result.get(0).getFirst().getAttForDesc(sdModel).toString();
    }

}
