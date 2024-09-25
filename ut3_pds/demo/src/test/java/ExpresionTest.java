
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ut3_pd9.Expresion;

public class ExpresionTest {
  @Test
  void dadaExpresionCorrecta_entoncesTrue() {
    // given
    char[] expresion =  {'{', '{','}', '{', '}', '}'};

    // when
    boolean resultado = Expresion.controlCorchetes(expresion);

    // then 
    assertTrue(resultado);
  }

  @Test
  void dadaExpresionIncorrecta_entoncesFalse() {
    // given
    char[] expresion =  {'{','}', '{', '}', '}'};

    // when
    boolean resultado = Expresion.controlCorchetes(expresion);

    // then 
    assertFalse(resultado);
  }

  @Test
  void dadaExpresionVacia_entoncesFalse() {
    // given
    char[] expresion =  {};

    // when
    boolean resultado = Expresion.controlCorchetes(expresion);

    // then 
    assertFalse(resultado);
  }
}
