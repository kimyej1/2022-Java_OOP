  CREATE TABLE BBS_TBL(
        IDX NUMBER PRIMARY KEY,
        SUBJECT VARCHAR2(50),
        CONTENT VARCHAR2(1000),
        WRITER VARCHAR(50),
        REGDATE DATE,
       CNT      NUMBER
               
  );
  
  INSERT INTO BBS_TBL VALUES(1, '화이팅', '뻥이야', 'ADMIN', SYSDATE, 0);
  INSERT INTO BBS_TBL VALUES(2, '수료식', '뻥이야', 'ADMIN', SYSDATE, 0);
  INSERT INTO BBS_TBL VALUES(3, '휴가일정', '뻥이야', 'ADMIN', SYSDATE, 0);
  
  SELECT * FROM BBS_TBL;
  
  -- 저장할 땐 .sql 파일로 저장해야 다음에 불러오기 편함!