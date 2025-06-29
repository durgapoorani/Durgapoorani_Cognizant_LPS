DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, LoanAmount, InterestRate FROM Loans;
BEGIN
    FOR rec IN loan_cursor LOOP
        IF rec.LoanAmount < 5000 THEN
            UPDATE Loans
            SET InterestRate = rec.InterestRate + 1
            WHERE LoanID = rec.LoanID;
        ELSIF rec.LoanAmount > 10000 THEN
            UPDATE Loans
            SET InterestRate = rec.InterestRate - 0.5
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
