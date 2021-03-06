CREATE DATABASE dora;
use dora;

-- 崩溃信息表
CREATE TABLE crash_info(
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  versionName VARCHAR(16) NOT NULL,
  versionCode INT DEFAULT 0 NOT NULL,
  sdkVersion INT DEFAULT 0 NOT NULL,
  androidVersion VARCHAR(16) NOT NULL,
  model VARCHAR(16) NOT NULL,
  brand VARCHAR(16) NOT NULL,
  androidException VARCHAR(8192) NOT NULL
) CHARACTER SET = utf8;
