/**
 * @author Zhiqiang Ren 
 * date: Feb. 4th. 2012
 * 
 */


public class Connection {
    
    public Connection(Node from, Node to, double weight) {
        m_from = from;
        m_to = to;
        m_weight = weight;
        m_deltaw = 0;
    }
    
    public Node getFromNode() {
        return m_from;
    }
    
    public Node getToNode() {
        return m_to;
    }
    
    public double getWeight() {
        return m_weight;
    }
    
    public void setWeight(double new_weight){
    	m_weight = new_weight;
    }
    
    public double getDeltaWeight(){
    	return m_deltaw;
    }
    
    public void setDeltaWeight(double new_delta){
    	m_deltaw = new_delta;
    }
    
    private double m_weight;
    private double m_deltaw;

    private Node m_from;
    private Node m_to;

}
