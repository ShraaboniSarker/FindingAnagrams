/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import findinganagrams.FindingAnagrams;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @Test
    public void isAmagram() {
        Assert.assertThat(FindingAnagrams.areAnagram("peek", "keep"), equalTo(true));
        Assert.assertThat(FindingAnagrams.areAnagram("mary", "army"), equalTo(true));
        Assert.assertThat(FindingAnagrams.areAnagram("dart", "mart"), equalTo(false));
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
