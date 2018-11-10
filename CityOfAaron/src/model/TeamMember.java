/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author German D. De Marco
 */
import java.io.Serializable;

/**
 *
 * @author jaryger
 */
public  enum TeamMember implements Serializable{
    
    /**
     *
     */
    memberOne("German", "De Marco"),

    /**
     *
     */
    memberTwo("Nefi", "Verduga"),

    /**
     *
     */
    memberThree("Amosu", "Omoniyi");
    
 TeamMember(String name, String title) {
      this.name = name;
      this.title = title;
    }
    
    private String name;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }
    private String title;
    
    
    
}
