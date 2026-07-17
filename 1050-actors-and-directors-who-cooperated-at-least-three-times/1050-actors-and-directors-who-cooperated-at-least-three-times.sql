-- # Write your MySQL query statement below
-- SELECT actor_id,director_id (SELECT actor_id,director_id FROM ActorDirector GROUP BY actor_id AND director_id HAVING COUNT(*) >= 3) FROM ActorDirector;  
SELECT actor_id,director_id FROM ActorDirector GROUP BY actor_id,director_id HAVING COUNT(*) >= 3