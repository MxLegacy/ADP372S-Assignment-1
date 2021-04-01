package za.ac.cput.repertory;

import static org.junit.jupiter.api.Assertions.*;


    import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;


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
            conctact4 = conctact2;
        }
        /*
         * Methods TestIndetity
         * */
        @Test
        public void testConctactIdentity () {
            assertSame(conctact1,conctact3);
        }
        /*
         * Methods TestEquality
         * */
        @Test
        public void testContactEquality (){
            assertEquals(conctact2,conctact4);
        } /*
         * Methods to test the failure
         */
        @Test
        public void testConctactFails() {
            fail("The test that coded was meant to faill");
            String excpectedName = "Joseph";
            String output = conctact1.getContactName();
            assertEquals(excpectedName, output);
        }
        @Test
        public void testimeOut (){
            assertTimeout(Duration.ofSeconds(40), () -> {
            });

            //assertTimeout (ofMinutes(2),()) -> {

        }


        // }
        @Disabled
        @Test
        public void testDisable () {
            assertEquals(conctact2, conctact4);
        }

    }

