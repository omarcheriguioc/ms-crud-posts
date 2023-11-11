-- Insert Posts with Explicit IDs
INSERT INTO post (id, title, content) VALUES
  (1, 'Post 1', 'Content for Post 1'),
  (2, 'Post 2', 'Content for Post 2'),
  (3, 'Post 3', 'Content for Post 3'),
  (4, 'Post 4', 'Content for Post 4'),
  (5, 'Post 5', 'Content for Post 5');

INSERT INTO comment (post_id, text) VALUES
  (1, 'Comment 1 for Post 1'),
  (1, 'Comment 2 for Post 1'),
  (1, 'Comment 3 for Post 1'),
  (1, 'Comment 4 for Post 1'),
  (1, 'Comment 5 for Post 1');

INSERT INTO comment (post_id, text) VALUES
  (2, 'Comment 1 for Post 2'),
  (2, 'Comment 2 for Post 2'),
  (2, 'Comment 3 for Post 2'),
  (2, 'Comment 4 for Post 2'),
  (2, 'Comment 5 for Post 2');

INSERT INTO comment (post_id, text) VALUES
  (3, 'Comment 1 for Post 3'),
  (3, 'Comment 2 for Post 3'),
  (3, 'Comment 3 for Post 3'),
  (3, 'Comment 4 for Post 3'),
  (3, 'Comment 5 for Post 3');

INSERT INTO comment (post_id, text) VALUES
  (4, 'Comment 1 for Post 4'),
  (4, 'Comment 2 for Post 4'),
  (4, 'Comment 3 for Post 4'),
  (4, 'Comment 4 for Post 4'),
  (4, 'Comment 5 for Post 4');

INSERT INTO comment (post_id, text) VALUES
  (5, 'Comment 1 for Post 5'),
  (5, 'Comment 2 for Post 5'),
  (5, 'Comment 3 for Post 5'),
  (5, 'Comment 4 for Post 5'),
  (5, 'Comment 5 for Post 5');