package domain.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperandTest {
    @DisplayName("String 피연산자가 Operand로 변환실패")
    @CsvSource({"+", "/", "123/", "a", "1b23", "000/"})
    @ParameterizedTest
    void StringToOperand(String input) {
        assertThatThrownBy(() -> new Operand(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}