
package com.tocea.course.cleancode.module2;



public class Page
{
    
    
    private int      id;
    
    private PageName name;
    
    
    
    public Page() {
    
    
        super();
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
    
    
        return id;
    }
    
    
    /**
     * @return the name
     */
    public PageName getName() {
    
    
        return name;
    }
    
    
    /**
     * @param _id
     *            the id to set
     */
    public void setId(final int _id) {
    
    
        id = _id;
    }
    
    
    /**
     * @param _name
     *            the name to set
     */
    public void setName(final PageName _name) {
    
    
        name = _name;
    }
    
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    
    
        return "Page [id=" + id + ", name=" + name + "]";
    }
    
    
}
