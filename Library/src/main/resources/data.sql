
-- Publishers
INSERT INTO publishers (id, name, address, phone_no) VALUES
  (1, 'Acme Publishing',   '123 Main St',   '555-0100'),
  (2, 'Beta Books',        '456 Elm Rd',    '555-0200');

-- Librarians
INSERT INTO librarians (id, name, publisher_id) VALUES
  (1, 'Alice Johnson', 1),
  (2, 'Bob Smith',     2);

-- Users
INSERT INTO users (user_id, user_name, user_address, phone_no, librarian_id) VALUES
  (1, 'Charlie Brown', '789 Oak Ave', '555-0300', 1),
  (2, 'Dana White',    '321 Pine Ln','555-0400', 2);

-- Books
INSERT INTO books (book_id, book_name, book_author, year_of_pub, price, status, user_id, librarian_id) VALUES
  (1, 'Spring in Action',    'Craig Walls',      '2018', 39.99, 'available',    NULL, 1),
  (2, 'Effective Java',      'Joshua Bloch',     '2017', 45.00, 'checked-out',  1,    1),
  (3, 'Clean Code',          'Robert C. Martin', '2008', 42.50, 'available',    NULL, 2),
  (4, 'Domain-Driven Design','Eric Evans',       '2003', 54.99, 'available',    NULL, 2);
