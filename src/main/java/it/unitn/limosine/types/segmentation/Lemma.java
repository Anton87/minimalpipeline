

/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.segmentation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Apr 07 14:46:37 CEST 2014
 * XML source: ../desc/Limosine/types/RelationExtractionTypeSystem.xml
 * @generated */
public class Lemma extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Lemma.class);
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
  protected Lemma() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Lemma(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Lemma(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Lemma(JCas jcas, int begin, int end) {
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
  //* Feature: lemma

  /** getter for lemma - gets 
   * @generated */
  public String getLemma() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "it.unitn.limosine.types.segmentation.Lemma");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_lemma);}
    
  /** setter for lemma - sets  
   * @generated */
  public void setLemma(String v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "it.unitn.limosine.types.segmentation.Lemma");
    jcasType.ll_cas.ll_setStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_lemma, v);}    
   
    
  //*--------------*
  //* Feature: annotatorId

  /** getter for annotatorId - gets 
   * @generated */
  public String getAnnotatorId() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Lemma");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_annotatorId);}
    
  /** setter for annotatorId - sets  
   * @generated */
  public void setAnnotatorId(String v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.segmentation.Lemma");
    jcasType.ll_cas.ll_setStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_annotatorId, v);}    
   
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets 
   * @generated */
  public Token getToken() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "it.unitn.limosine.types.segmentation.Lemma");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Lemma_Type)jcasType).casFeatCode_token)));}
    
  /** setter for token - sets  
   * @generated */
  public void setToken(Token v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "it.unitn.limosine.types.segmentation.Lemma");
    jcasType.ll_cas.ll_setRefValue(addr, ((Lemma_Type)jcasType).casFeatCode_token, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    