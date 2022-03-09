import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class calculadoraTeste {


    internal class calculadoraTeste {


        @Test
        fun somaTeste() {

            assertEquals(3, calculadoraTeste.soma(1, 2))

        }

        @Test
        fun subtracaoTeste() {

            assertEquals(1, calculadoraTeste.subtra(3, 2))

        }

        @Test
        fun multpTeste() {

            assertEquals(6, calculadoraTeste.multp(2, 3))
        }

        @Test
        fun divisaoTeste() {

            assertEquals(2, calculadoraTeste.divisao(4, 2))


        }
    }
}