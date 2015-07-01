
/* First created by JCasGen Mon Apr 07 14:46:37 CEST 2014 */
package it.unitn.limosine.types.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Mon Apr 07 14:46:37 CEST 2014
 * @generated */
public class CoNLL2008DependencyTree_Type extends DependencyTree_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      @Override
	public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CoNLL2008DependencyTree_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CoNLL2008DependencyTree_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CoNLL2008DependencyTree(addr, CoNLL2008DependencyTree_Type.this);
  			   CoNLL2008DependencyTree_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CoNLL2008DependencyTree(addr, CoNLL2008DependencyTree_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CoNLL2008DependencyTree.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("it.unitn.limosine.types.syntax.CoNLL2008DependencyTree");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public CoNLL2008DependencyTree_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    