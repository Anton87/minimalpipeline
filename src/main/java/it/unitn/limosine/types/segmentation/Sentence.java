

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
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: sentenceId

  /** getter for sentenceId - gets 
   * @generated */
  public int getSentenceId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "it.unitn.limosine.types.segmentation.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets  
   * @generated */
  public void setSentenceId(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "it.unitn.limosine.types.segmentation.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceId, v);}    
   
    
  //*--------------*
  //* Feature: tokenizedSentence

  /** getter for tokenizedSentence - gets 
   * @generated */
  public String getTokenizedSentence() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenizedSentence == null)
      jcasType.jcas.throwFeatMissing("tokenizedSentence", "it.unitn.limosine.types.segmentation.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenizedSentence);}
    
  /** setter for tokenizedSentence - sets  
   * @generated */
  public void setTokenizedSentence(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenizedSentence == null)
      jcasType.jcas.throwFeatMissing("tokenizedSentence", "it.unitn.limosine.types.segmentation.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenizedSentence, v);}    
   
    
  //*--------------*
  //* Feature: annotatorId

  /** getter for annotatorId - gets Name of the module that created this element
   * @generated */
  public String getAnnotatorId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_annotatorId);}
    
  /** setter for annotatorId - sets Name of the module that created this element 
   * @generated */
  public void setAnnotatorId(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_annotatorId, v);}    
   
    
  //*--------------*
  //* Feature: startToken

  /** getter for startToken - gets 
   * @generated */
  public Token getStartToken() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "it.unitn.limosine.types.segmentation.Sentence");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_startToken)));}
    
  /** setter for startToken - sets  
   * @generated */
  public void setStartToken(Token v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "it.unitn.limosine.types.segmentation.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_startToken, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endToken

  /** getter for endToken - gets 
   * @generated */
  public Token getEndToken() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "it.unitn.limosine.types.segmentation.Sentence");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_endToken)));}
    
  /** setter for endToken - sets  
   * @generated */
  public void setEndToken(Token v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "it.unitn.limosine.types.segmentation.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_endToken, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    