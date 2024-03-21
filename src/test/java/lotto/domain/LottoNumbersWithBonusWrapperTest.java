package lotto.domain;

import lotto.data.LottoNumberVO;
import lotto.data.LottoWinInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoNumbersWithBonusWrapperTest {

    @DisplayName("5개가 맞았을 때, 보너스점수 까지 맞으면 WIN_FIRST_WITH_BONUS 이다.")
    @Test
    void enumWinFirstWithBonusWhenMatchedFiveWithBonusNumber() {
        // given
        LottoNumbers mySelect = new LottoNumbers(List.of(1, 2, 3, 4, 5, 6));
        LottoNumbers winningNumber = new LottoNumbers(List.of(1, 2, 3, 4, 5, 7));
        LottoNumberVO bonusNumber = LottoNumberVO.selectLottoBall(6);

        // when
        LottoNumbersWithBonusWrapper lottoNumbersWithBonusWrapper = new LottoNumbersWithBonusWrapper(
                mySelect,
                bonusNumber
        );

        // then
        LottoWinInfo lottoWinInfo = lottoNumbersWithBonusWrapper.countMatchWithWinningLottoNumbersWithBonusNumber(
                winningNumber
        );
        assertThat(lottoWinInfo).isEqualTo(LottoWinInfo.WIN_FIRST_WITH_BONUS);
    }

    @DisplayName("5개가 맞았을 때, 보너스점수가 맞지 않으면 WIN_SECOND이다.")
    @Test
    void enumWinSecondWhenMatchedFiveWithoutBonusNumber() {
        // given
        LottoNumbers mySelect = new LottoNumbers(List.of(1, 2, 3, 4, 5, 6));
        LottoNumbers winningNumber = new LottoNumbers(List.of(1, 2, 3, 4, 5, 7));
        LottoNumberVO bonusNumber = LottoNumberVO.selectLottoBall(10);

        // when
        LottoNumbersWithBonusWrapper lottoNumbersWithBonusWrapper = new LottoNumbersWithBonusWrapper(
                mySelect,
                bonusNumber
        );

        // then
        LottoWinInfo lottoWinInfo = lottoNumbersWithBonusWrapper.countMatchWithWinningLottoNumbersWithBonusNumber(
                winningNumber
        );
        assertThat(lottoWinInfo).isEqualTo(LottoWinInfo.WIN_SECOND);
    }
}
