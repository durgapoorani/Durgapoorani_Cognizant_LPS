SET SERVEROUTPUT ON;

DECLARE
  v_age NUMBER;
BEGIN
  FOR rec IN (
    SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID
  )
  LOOP
    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
    IF v_age > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = rec.LoanID;

      DBMS_OUTPUT.PUT_LINE('Applied 1% discount to LoanID ' || rec.LoanID);
    END IF;
  END LOOP;
END;
/
