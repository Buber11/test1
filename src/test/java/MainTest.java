import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    File file;

    @Before
    public void initialize(){
        file = new File("słowa.txt");
    }

    @Test
    public void mainTest(){

        assertThat(file).exists();


    }


}