  CREATE TABLE BBS_TBL(
        IDX NUMBER PRIMARY KEY,
        SUBJECT VARCHAR2(50),
        CONTENT VARCHAR2(1000),
        WRITER VARCHAR(50),
        REGDATE DATE,
       CNT      NUMBER
               
  );
  
  INSERT INTO BBS_TBL VALUES(1, 'ȭ����', '���̾�', 'ADMIN', SYSDATE, 0);
  INSERT INTO BBS_TBL VALUES(2, '�����', '���̾�', 'ADMIN', SYSDATE, 0);
  INSERT INTO BBS_TBL VALUES(3, '�ް�����', '���̾�', 'ADMIN', SYSDATE, 0);
  
  SELECT * FROM BBS_TBL;
  
  -- ������ �� .sql ���Ϸ� �����ؾ� ������ �ҷ����� ����!