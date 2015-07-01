

/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import it.unitn.limosine.types.segmentation.Sentence;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Apr 07 14:46:37 CEST 2014
 * XML source: ../desc/Limosine/types/RelationExtractionTypeSystem.xml
 * @generated */
public class DependencyTree extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DependencyTree.class);
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
  protected DependencyTree() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DependencyTree(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DependencyTree(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DependencyTree(JCas jcas, int begin, int end) {
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
  //* Feature: rawParse

  /** getter for rawParse - gets as output by parser
   * @generated */
  public String getRawParse() {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_rawParse == null)
      jcasType.jcas.throwFeatMissing("rawParse", "it.unitn.limosine.types.syntax.DependencyTree");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_rawParse);}
    
  /** setter for rawParse - sets as output by parser 
   * @generated */
  public void setRawParse(String v) {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_rawParse == null)
      jcasType.jcas.throwFeatMissing("rawParse", "it.unitn.limosine.types.syntax.DependencyTree");
    jcasType.ll_cas.ll_setStringValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_rawParse, v);}    
   
    
  //*--------------*
  //* Feature: annotatorId

  /** getter for annotatorId - gets 
   * @generated */
  public String getAnnotatorId() {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.syntax.DependencyTree");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_annotatorId);}
    
  /** setter for annotatorId - sets  
   * @generated */
  public void setAnnotatorId(String v) {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_annotatorId == null)
      jcasType.jcas.throwFeatMissing("annotatorId", "it.unitn.limosine.types.syntax.DependencyTree");
    jcasType.ll_cas.ll_setStringValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_annotatorId, v);}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets 
   * @generated */
  public Sentence getSentence() {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "it.unitn.limosine.types.syntax.DependencyTree");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets  
   * @generated */
  public void setSentence(Sentence v) {
    if (DependencyTree_Type.featOkTst && ((DependencyTree_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "it.unitn.limosine.types.syntax.DependencyTree");
    jcasType.ll_cas.ll_setRefValue(addr, ((DependencyTree_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    