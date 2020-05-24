/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author XPC
 */
public class ForCommand extends Command {
    
    public ForCommand (Command c1AST, Expression eAST, Command c2AST,
                    SourcePosition thePosition) {
    super (thePosition);
    C1 = c1AST;
    E = eAST;
    C2 = c2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Expression E;
  public Command C1, C2;
}
