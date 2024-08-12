/*오라클 기준 sql*/
CREATE TABLE 회원 (
    회원아이디 VARCHAR2(20) NOT NULL,
    비밀번호 VARCHAR2(20) NOT NULL,
    성명 VARCHAR2(20) NOT NULL,
    신용카드 NUMBER NOT NULL,
    이메일주소 VARCHAR2(30) NOT NULL,
    휴대전화번호 NUMBER NOT NULL,
    PRIMARY KEY (회원아이디)
);

CREATE TABLE 신용카드 (
    회원아이디 VARCHAR2(20) NOT NULL,
    신용카드번호 NUMBER NOT NULL,
    유효기간 DATE,
    PRIMARY KEY (신용카드번호),
    FOREIGN KEY (회원아이디) REFERENCES 회원 (회원아이디)
);

CREATE TABLE 마일리지 (
    회원아이디 VARCHAR2(20) NOT NULL,
    마일리지번호 NUMBER NOT NULL,
    누적마일리지 NUMBER DEFAULT 0,
    사용한마일리지 NUMBER DEFAULT 0,
    PRIMARY KEY (마일리지번호),
    FOREIGN KEY (회원아이디) REFERENCES 회원 (회원아이디)
);

CREATE TABLE 비행기 (
    비행기번호 NUMBER NOT NULL,
    출발시간 TIMESTAMP,
    출발날짜 DATE,
    PRIMARY KEY (비행기번호)
);

CREATE TABLE 좌석 (
    좌석번호 NUMBER NOT NULL,
    비행기번호 NUMBER NOT NULL,
    등급 NUMBER NOT NULL,
    회원아이디 VARCHAR2(20),
    PRIMARY KEY (좌석번호, 비행기번호),
    FOREIGN KEY (비행기번호) REFERENCES 비행기 (비행기번호),
    FOREIGN KEY (회원아이디) REFERENCES 회원 (회원아이디)
);