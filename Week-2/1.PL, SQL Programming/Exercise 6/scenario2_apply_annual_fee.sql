DECLARE
    CURSOR acc_cursor IS
        SELECT AccountID, Balance FROM Accounts;
BEGIN
    FOR rec IN acc_cursor LOOP
        UPDATE Accounts
        SET Balance = Balance - 100,
            LastModified = SYSDATE
        WHERE AccountID = rec.AccountID;
    END LOOP;
    COMMIT;
END;
/
