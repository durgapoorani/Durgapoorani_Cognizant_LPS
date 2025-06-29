CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_acc_id IN NUMBER,
    p_to_acc_id IN NUMBER,
    p_amount IN NUMBER
)
AS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_acc_id;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
  END IF;

  UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_acc_id;
  UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_acc_id;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from_acc_id || ' to ' || p_to_acc_id);
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in Account 1 ' || SQLERRM);
    ROLLBACK;
END;
/
