
/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.segmentation;

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
public class Lemma_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      @Override
	public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Lemma_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Lemma_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Lemma(addr, Lemma_Type.this);
  			   Lemma_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Lemma(addr, Lemma_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Lemma.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("it.unitn.limosine.types.segmentation.Lemma");
 
  /** @generated */
  final Feature casFeat_lemma;
  /** @generated */
  final int     casFeatCode_lemma;
  /** @generated */ 
  public String getLemma(int addr) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "it.unitn.limosine.types.segmentation.Lemma");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lemma);
  }
  /** @generated */    
  public void setLemma(int addr, String v) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "it.unitn.limosine.types.segmentation.Lemma");
    ll_cas.ll_setStringValue(addr, casFeatCode_lemma, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotatorId;
  /** @generated */
  final int     casFeatCode_annotatorId;
  /** @generated */ 
  public String getAnnotatorId(int addr) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Lemma");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotatorId);
  }
  /** @generated */    
  public void setAnnotatorId(int addr, String v) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Lemma");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotatorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token;
  /** @generated */
  final int     casFeatCode_token;
  /** @generated */ 
  public int getToken(int addr) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "it.unitn.limosine.types.segmentation.Lemma");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token);
  }
  /** @generated */    
  public void setToken(int addr, int v) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "it.unitn.limosine.types.segmentation.Lemma");
    ll_cas.ll_setRefValue(addr, casFeatCode_token, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Lemma_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lemma = jcas.getRequiredFeatureDE(casType, "lemma", "uima.cas.String", featOkTst);
    casFeatCode_lemma  = (null == casFeat_lemma) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lemma).getCode();

 
    casFeat_annotatorId = jcas.getRequiredFeatureDE(casType, "annotatorId", "uima.cas.String", featOkTst);
    casFeatCode_annotatorId  = (null == casFeat_annotatorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatorId).getCode();

 
    casFeat_token = jcas.getRequiredFeatureDE(casType, "token", "it.unitn.limosine.types.segmentation.Token", featOkTst);
    casFeatCode_token  = (null == casFeat_token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token).getCode();

  }
}



    