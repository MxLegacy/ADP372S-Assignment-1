package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepertoryTest {
    private Repertory conctact1;
    private Repertory conctact2;
    private Repertory conctact3;
    private Repertory conctact4;
    @BeforeEach
    void setUp() {
        conctact1 = new Repertory("Joseph","umba",9876, "Jos@gmail.com");
        conctact2 = new Repertory("plamedie","bitota",1234,"bit@gmail.com");
        conctact3 = conctact1;
    }
    @Test
    public void testConctactIdentity () {


    }
}