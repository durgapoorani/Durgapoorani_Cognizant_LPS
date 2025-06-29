CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_acc_id IN NUMBER,
  p_to_acc_id IN NUMBER,
  p_amount IN NUMBER
)
AS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_acc_id;

  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient balance in account ' || p_from_acc_id);
  ELSE
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_acc_id;
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_acc_id;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
  END IF;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error occurred: Insufficient Funds' || SQLERRM);
END;
/
