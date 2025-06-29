DECLARE
    CURSOR trans_cursor IS
        SELECT a.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Transactions t
        JOIN Accounts a ON t.AccountID = a.AccountID
        JOIN Customers c ON a.CustomerID = c.CustomerID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);
BEGIN
    FOR rec IN trans_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.Name || 
                             ', Date: ' || TO_CHAR(rec.TransactionDate, 'DD-MON-YYYY') ||
                             ', Type: ' || rec.TransactionType ||
                             ', Amount: ' || rec.Amount);
    END LOOP;
END;
/
