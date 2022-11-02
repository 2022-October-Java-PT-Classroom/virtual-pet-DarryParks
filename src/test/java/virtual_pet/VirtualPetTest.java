package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet("Oscar", 50, 50, 50, 50 );

    @Test
    public void shouldHaveValue50(){
        int hunger = underTest.getHunger();
        assertEquals(50,hunger);
    }
    @Test
    public void shouldHaveValue100(){
        int thirst = underTest.getThirst();
        assertEquals(100,thirst);
    }
    @Test
    public void shouldHaveValue75(){
        int boredom = underTest.getBoredom();
        assertEquals(75,boredom);
    }
    @Test
    public void shouldHaveValue65(){
        int tiredness = underTest.getTiredness();
        assertEquals( 65, tiredness);
    }





    //@Test
    //public void shouldHaveAValueOf100(){
        //int thirst = underTest.getThirst();
        //assertEquals(100, thirst);
    }






