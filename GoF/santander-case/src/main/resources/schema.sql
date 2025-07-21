CREATE TABLE tb_account (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  number VARCHAR(20),
  agency VARCHAR(20),
  balance DOUBLE,
  limit DOUBLE
);
