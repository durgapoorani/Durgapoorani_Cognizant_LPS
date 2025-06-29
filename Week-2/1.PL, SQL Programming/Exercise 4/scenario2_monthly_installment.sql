CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_loan_amount IN NUMBER,
    p_annual_rate IN NUMBER,
    p_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate NUMBER := p_annual_rate / 12 / 100;
    v_months NUMBER := p_years * 12;
    v_installment NUMBER;
BEGIN
    v_installment := (p_loan_amount * v_monthly_rate) /
                     (1 - POWER(1 + v_monthly_rate, -v_months));
    RETURN ROUND(v_installment, 2);
END;
/
