
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
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      @Override
	public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("it.unitn.limosine.types.segmentation.Token");
 
  /** @generated */
  final Feature casFeat_tokenId;
  /** @generated */
  final int     casFeatCode_tokenId;
  /** @generated */ 
  public int getTokenId(int addr) {
        if (featOkTst && casFeat_tokenId == null)
      jcas.throwFeatMissing("tokenId", "it.unitn.limosine.types.segmentation.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokenId);
  }
  /** @generated */    
  public void setTokenId(int addr, int v) {
        if (featOkTst && casFeat_tokenId == null)
      jcas.throwFeatMissing("tokenId", "it.unitn.limosine.types.segmentation.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokenId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenSentId;
  /** @generated */
  final int     casFeatCode_tokenSentId;
  /** @generated */ 
  public int getTokenSentId(int addr) {
        if (featOkTst && casFeat_tokenSentId == null)
      jcas.throwFeatMissing("tokenSentId", "it.unitn.limosine.types.segmentation.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokenSentId);
  }
  /** @generated */    
  public void setTokenSentId(int addr, int v) {
        if (featOkTst && casFeat_tokenSentId == null)
      jcas.throwFeatMissing("tokenSentId", "it.unitn.limosine.types.segmentation.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokenSentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotatorId;
  /** @generated */
  final int     casFeatCode_annotatorId;
  /** @generated */ 
  public String getAnnotatorId(int addr) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotatorId);
  }
  /** @generated */    
  public void setAnnotatorId(int addr, String v) {
        if (featOkTst && casFeat_annotatorId == null)
      jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotatorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NormalizedText;
  /** @generated */
  final int     casFeatCode_NormalizedText;
  /** @generated */ 
  public String getNormalizedText(int addr) {
        if (featOkTst && casFeat_NormalizedText == null)
      jcas.throwFeatMissing("NormalizedText", "it.unitn.limosine.types.segmentation.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NormalizedText);
  }
  /** @generated */    
  public void setNormalizedText(int addr, String v) {
        if (featOkTst && casFeat_NormalizedText == null)
      jcas.throwFeatMissing("NormalizedText", "it.unitn.limosine.types.segmentation.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_NormalizedText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StanfordNormalizedText;
  /** @generated */
  final int     casFeatCode_StanfordNormalizedText;
  /** @generated */ 
  public String getStanfordNormalizedText(int addr) {
        if (featOkTst && casFeat_StanfordNormalizedText == null)
      jcas.throwFeatMissing("StanfordNormalizedText", "it.unitn.limosine.types.segmentation.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_StanfordNormalizedText);
  }
  /** @generated */    
  public void setStanfordNormalizedText(int addr, String v) {
        if (featOkTst && casFeat_StanfordNormalizedText == null)
      jcas.throwFeatMissing("StanfordNormalizedText", "it.unitn.limosine.types.segmentation.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_StanfordNormalizedText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenId = jcas.getRequiredFeatureDE(casType, "tokenId", "uima.cas.Integer", featOkTst);
    casFeatCode_tokenId  = (null == casFeat_tokenId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenId).getCode();

 
    casFeat_tokenSentId = jcas.getRequiredFeatureDE(casType, "tokenSentId", "uima.cas.Integer", featOkTst);
    casFeatCode_tokenSentId  = (null == casFeat_tokenSentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenSentId).getCode();

 
    casFeat_annotatorId = jcas.getRequiredFeatureDE(casType, "annotatorId", "uima.cas.String", featOkTst);
    casFeatCode_annotatorId  = (null == casFeat_annotatorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatorId).getCode();

 
    casFeat_NormalizedText = jcas.getRequiredFeatureDE(casType, "NormalizedText", "uima.cas.String", featOkTst);
    casFeatCode_NormalizedText  = (null == casFeat_NormalizedText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NormalizedText).getCode();

 
    casFeat_StanfordNormalizedText = jcas.getRequiredFeatureDE(casType, "StanfordNormalizedText", "uima.cas.String", featOkTst);
    casFeatCode_StanfordNormalizedText  = (null == casFeat_StanfordNormalizedText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StanfordNormalizedText).getCode();

  }
}



    