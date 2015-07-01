
/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Apr 07 14:46:37 CEST 2014
 * @generated */
public class DependencyTree_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      @Override
	public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DependencyTree_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DependencyTree_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DependencyTree(addr, DependencyTree_Type.this);
  			   DependencyTree_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DependencyTree(addr, DependencyTree_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DependencyTree.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("it.unitn.limosine.types.syntax.DependencyTree");
 
  /** @generated */
  final Feature casFeat_rawParse;
  /** @generated */
  final int     casFeatCode_rawParse;
  /** @generated */ 
  public String getRawParse(int addr) {
        if (featOkTst && casFeat_rawParse == null)
      jcas.throwFeatMissing("rawParse", "it.unitn.limosine.types.syntax.DependencyTree");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rawParse);
  }
  /** @generated */    
  public void setRawParse(int addr, String v) {
        if (featOkTst && casFeat_rawParse == null)
      jcas.throwFeatMissing("rawParse", "it.unitn.limosine.types.syntax.DependencyTree");
    ll_cas.ll_setStringValue(addr, casFeatCode_rawParse, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotatorId;
  /** @generated */
  final int     casFeatCode_annotatorId;
  /** @generated */ 
  public String getAnnotatorId(int addr) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.syntax.DependencyTree");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotatorId);
  }
  /** @generated */    
  public void setAnnotatorId(int addr, String v) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.syntax.DependencyTree");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotatorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "it.unitn.limosine.types.syntax.DependencyTree");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "it.unitn.limosine.types.syntax.DependencyTree");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DependencyTree_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rawParse = jcas.getRequiredFeatureDE(casType, "rawParse", "uima.cas.String", featOkTst);
    casFeatCode_rawParse  = (null == casFeat_rawParse) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rawParse).getCode();

 
    casFeat_annotatorId = jcas.getRequiredFeatureDE(casType, "annotatorId", "uima.cas.String", featOkTst);
    casFeatCode_annotatorId  = (null == casFeat_annotatorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatorId).getCode();

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "it.unitn.limosine.types.segmentation.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

  }
}



    