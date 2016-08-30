package com.ontotext.gate.vr;

/**Additional interface to be impelmented by the nodes of the tree view.
 * @author Miroslav Goranov*/

import java.util.*;




public interface IFolder
{



  public int getIndexOfChild(Object child);

  public Iterator getChildren();

  public Vector children();

  public String toString();

  public int getChildCount();

  public IFolder getChild(int index);

}


























































































































































































































































































































































































































































