

/* First created by JCasGen Mon Apr 07 14:46:38 CEST 2014 */
package it.unitn.limosine.types.segmentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Apr 07 14:46:38 CEST 2014
 * XML source: ../desc/Limosine/types/SentenceTokenTypeSystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenId

  /** getter for tokenId - gets 
   * @generated */
  public int getTokenId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenId == null)
      jcasType.jcas.throwFeatMissing("tokenId", "it.unitn.limosine.types.segmentation.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenId);}
    
  /** setter for tokenId - sets  
   * @generated */
  public void setTokenId(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenId == null)
      jcasType.jcas.throwFeatMissing("tokenId", "it.unitn.limosine.types.segmentation.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenId, v);}    
   
    
  //*--------------*
  //* Feature: tokenSentId

  /** getter for tokenSentId - gets sentence-level tokenID
   * @generated */
  public int getTokenSentId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenSentId == null)
      jcasType.jcas.throwFeatMissing("tokenSentId", "it.unitn.limosine.types.segmentation.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenSentId);}
    
  /** setter for tokenSentId - sets sentence-level tokenID 
   * @generated */
  public void setTokenSentId(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenSentId == null)
      jcasType.jcas.throwFeatMissing("tokenSentId", "it.unitn.limosine.types.segmentation.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenSentId, v);}    
   
    
  //*--------------*
  //* Feature: annotatorId

  /** getter for annotatorId - gets Name of the module that created this element
   * @generated */
  public String getAnnotatorId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_annotatorId);}
    
  /** setter for annotatorId - sets Name of the module that created this element 
   * @generated */
  public void setAnnotatorId(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_annotatorId, v);}    
   
    
  //*--------------*
  //* Feature: NormalizedText

  /** getter for NormalizedText - gets Normalized surface form (escaped, -LRB-, -RRB-) -- see StanfordToken class toXML()
   * @generated */
  public String getNormalizedText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_NormalizedText == null)
      jcasType.jcas.throwFeatMissing("NormalizedText", "it.unitn.limosine.types.segmentation.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_NormalizedText);}
    
  /** setter for NormalizedText - sets Normalized surface form (escaped, -LRB-, -RRB-) -- see StanfordToken class toXML() 
   * @generated */
  public void setNormalizedText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_NormalizedText == null)
      jcasType.jcas.throwFeatMissing("NormalizedText", "it.unitn.limosine.types.segmentation.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_NormalizedText, v);}    
   
    
  //*--------------*
  //* Feature: StanfordNormalizedText

  /** getter for StanfordNormalizedText - gets Normalized surface form as obtained from Stanford coreLab.value() -- might be different from NormalizedText
   * @generated */
  public String getStanfordNormalizedText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StanfordNormalizedText == null)
      jcasType.jcas.throwFeatMissing("StanfordNormalizedText", "it.unitn.limosine.types.segmentation.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_StanfordNormalizedText);}
    
  /** setter for StanfordNormalizedText - sets Normalized surface form as obtained from Stanford coreLab.value() -- might be different from NormalizedText 
   * @generated */
  public void setStanfordNormalizedText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StanfordNormalizedText == null)
      jcasType.jcas.throwFeatMissing("StanfordNormalizedText", "it.unitn.limosine.types.segmentation.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_StanfordNormalizedText, v);}    
  }

    