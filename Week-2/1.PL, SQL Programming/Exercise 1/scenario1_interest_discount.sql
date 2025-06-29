BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.InterestRate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) > 60
  )
  LOOP
    UPDATE Loans
    SET InterestRate = rec.InterestRate - 1
    WHERE LoanID = rec.LoanID;
  END LOOP;
END;
/
