/* Generated By:JJTree: Do not edit this line. ASTSequenceExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package computeparser;

public
class ASTSequenceExpression extends SimpleNode {
	
	public enum SequenceOps {
		AFTER,
		BEFORE
	}
	private SequenceOps sequenceOp; ;
	
  public ASTSequenceExpression(int id) {
    super(id);
  }

  public ASTSequenceExpression(ComputeGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ComputeGrammarVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }


	public void setOp(String image) {
		if ("after".equals(image)) {
			sequenceOp=SequenceOps.AFTER;
		} else {
			sequenceOp = SequenceOps.BEFORE;
		}
		
	}
	public SequenceOps getSequenceOp() {
		return sequenceOp;
	}

}
/* JavaCC - OriginalChecksum=41fd9dbf5d21333d7052e4830df3267d (do not edit this line) */
