SET SERVEROUTPUT ON;

BEGIN
  FOR rec IN (SELECT Name, Balance FROM Customers)
  LOOP
    IF rec.Balance > 10000 THEN
      DBMS_OUTPUT.PUT_LINE(rec.Name || ' is eligible for VIP status.');
    END IF;
  END LOOP;
END;
/
