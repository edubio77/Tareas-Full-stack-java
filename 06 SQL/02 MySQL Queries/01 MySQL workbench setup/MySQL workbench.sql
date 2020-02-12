USE twitter;
-- comando select--
SELECT * 
FROM faves;
-- comando insert
INSERT INTO faves (user_id, tweet_id, created_at, updated_at)
VALUES(3, 10, NOW(), NOW());
-- comando update--
UPDATE faves SET 
tweet_id = 3 
WHERE id=5;
-- comando delete--
DELETE FROM faves 
WHERE tweet_id = 10;
