
/* First created by JCasGen Mon Apr 07 14:46:38 CEST 2014 */
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
 * Updated by JCasGen Mon Apr 07 14:46:38 CEST 2014
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      @Override
	public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("it.unitn.limosine.types.segmentation.Sentence");
 
  /** @generated */
  final Feature casFeat_sentenceId;
  /** @generated */
  final int     casFeatCode_sentenceId;
  /** @generated */ 
  public int getSentenceId(int addr) {
        if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "it.unitn.limosine.types.segmentation.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentenceId);
  }
  /** @generated */    
  public void setSentenceId(int addr, int v) {
        if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "it.unitn.limosine.types.segmentation.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentenceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenizedSentence;
  /** @generated */
  final int     casFeatCode_tokenizedSentence;
  /** @generated */ 
  public String getTokenizedSentence(int addr) {
        if (featOkTst && casFeat_tokenizedSentence == null)
      jcas.throwFeatMissing("tokenizedSentence", "it.unitn.limosine.types.segmentation.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenizedSentence);
  }
  /** @generated */    
  public void setTokenizedSentence(int addr, String v) {
        if (featOkTst && casFeat_tokenizedSentence == null)
      jcas.throwFeatMissing("tokenizedSentence", "it.unitn.limosine.types.segmentation.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenizedSentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotatorId;
  /** @generated */
  final int     casFeatCode_annotatorId;
  /** @generated */ 
  public String getAnnotatorId(int addr) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotatorId);
  }
  /** @generated */    
  public void setAnnotatorId(int addr, String v) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotatorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startToken;
  /** @generated */
  final int     casFeatCode_startToken;
  /** @generated */ 
  public int getStartToken(int addr) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "it.unitn.limosine.types.segmentation.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startToken);
  }
  /** @generated */    
  public void setStartToken(int addr, int v) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "it.unitn.limosine.types.segmentation.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_startToken, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endToken;
  /** @generated */
  final int     casFeatCode_endToken;
  /** @generated */ 
  public int getEndToken(int addr) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "it.unitn.limosine.types.segmentation.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endToken);
  }
  /** @generated */    
  public void setEndToken(int addr, int v) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "it.unitn.limosine.types.segmentation.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_endToken, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceId = jcas.getRequiredFeatureDE(casType, "sentenceId", "uima.cas.Integer", featOkTst);
    casFeatCode_sentenceId  = (null == casFeat_sentenceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceId).getCode();

 
    casFeat_tokenizedSentence = jcas.getRequiredFeatureDE(casType, "tokenizedSentence", "uima.cas.String", featOkTst);
    casFeatCode_tokenizedSentence  = (null == casFeat_tokenizedSentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizedSentence).getCode();

 
    casFeat_annotatorId = jcas.getRequiredFeatureDE(casType, "annotatorId", "uima.cas.String", featOkTst);
    casFeatCode_annotatorId  = (null == casFeat_annotatorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatorId).getCode();

 
    casFeat_startToken = jcas.getRequiredFeatureDE(casType, "startToken", "it.unitn.limosine.types.segmentation.Token", featOkTst);
    casFeatCode_startToken  = (null == casFeat_startToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startToken).getCode();

 
    casFeat_endToken = jcas.getRequiredFeatureDE(casType, "endToken", "it.unitn.limosine.types.segmentation.Token", featOkTst);
    casFeatCode_endToken  = (null == casFeat_endToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endToken).getCode();

  }
}



    