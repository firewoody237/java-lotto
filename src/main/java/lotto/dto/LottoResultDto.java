package lotto.dto;

public class LottoResultDto {

    private final int matchThreeNumbers;
    private final int matchFourNumbers;
    private final int matchFiveNumbers;
    private final int matchSixNumbersIncludeBonus;
    private final int matchSixNumbers;
    private final double earnRate;

    public LottoResultDto(
            int matchThreeNumbers,
            int matchFourNumbers,
            int matchFiveNumbers,
            int matchSixNumbersIncludeBonus,
            int matchSixNumbers,
            double earnRate
    ) {
        this.matchThreeNumbers = matchThreeNumbers;
        this.matchFourNumbers = matchFourNumbers;
        this.matchFiveNumbers = matchFiveNumbers;
        this.matchSixNumbersIncludeBonus = matchSixNumbersIncludeBonus;
        this.matchSixNumbers = matchSixNumbers;
        this.earnRate = earnRate;
    }

    public int getMatchThreeNumbers() {
        return matchThreeNumbers;
    }

    public int getMatchFourNumbers() {
        return matchFourNumbers;
    }

    public int getMatchFiveNumbers() {
        return matchFiveNumbers;
    }

    public int getMatchSixNumbersIncludeBonus() {
        return matchSixNumbersIncludeBonus;
    }

    public int getMatchSixNumbers() {
        return matchSixNumbers;
    }

    public double getEarnRate() {
        return earnRate;
    }
}
