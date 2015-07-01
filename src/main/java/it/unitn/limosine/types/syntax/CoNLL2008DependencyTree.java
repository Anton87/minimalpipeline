

/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Apr 07 14:46:37 CEST 2014
 * XML source: ../desc/Limosine/types/RelationExtractionTypeSystem.xml
 * @generated */
public class CoNLL2008DependencyTree extends DependencyTree {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CoNLL2008DependencyTree.class);
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
  protected CoNLL2008DependencyTree() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public CoNLL2008DependencyTree(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public CoNLL2008DependencyTree(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public CoNLL2008DependencyTree(JCas jcas, int begin, int end) {
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
     
}

    