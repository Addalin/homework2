
package homework2;

import java.util.Iterator;

/**
 * A Graph holds a collection of nodes along with the list of connections those nodes have.
 * A node can be any object. A connection (Edge) is defined by a starting Node ("from") 
 * and an ending Node ("to")
 * * note that an edge has a single direction - addEdge(a,b) is different than addEdge(b,a) *
 */
public interface Graph<N> {
	
	
	/**
	 * @requires: none
	 * @modifies: n becomes a node in the graph (if n is already a node - nothing is changed)
	 * @effects: returns True if n was added (or already exist) 
	 * 					 False otherwise
	 */
	public boolean addNode(N n);
	
	
	/**
	 * @requires: none
	 * @modifies: if "from" and "to" are both nodes in the graph - an edge connecting "from" to "to" is
	 * 			 	added to the graph (if it does not already exist).
	 * @effects:  True is returned for a successful addition (or when the edge already exist)
	 * 			  False is returned if the edge could not be added.
	 */
	public boolean addEdge(N from, N to);
	
	
	/**
	 * @requires: none
	 * @modifies: none
	 * @effects: returns an iterator to all of the graph's nodes
	 */
	public Iterator<N> listNodes();
	
	
	/**
	 * @requires: none
	 * @modifies: none
	 * @effects: returns an iterator to all of n's children. 
	 * 				If n is not a node in graph - an empty iterator is returned.
	 */
	public Iterator<N> listChildren(N n);
}
