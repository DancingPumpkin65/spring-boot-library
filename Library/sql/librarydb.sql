
-- 1. Create the database
CREATE DATABASE IF NOT EXISTS librarydb
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
USE librarydb;

-- 2. Create the category table
CREATE TABLE IF NOT EXISTS category (
  id   BIGINT       NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;
