USE sakila;
-- CONSULTA 01 --
SELECT city.city_id ,city.city, customer.first_name, customer.last_name, customer.email, address.address, address.city_id
FROM customer
JOIN address ON customer.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
WHERE address.city_id = "312";
-- CONSULTA 02 --
SELECT film. film_id, film.title, film.description, film.release_year, film.rating, film.special_features, category.name AS genre
FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = "Comedy";
-- CONSULTA 03 --
SELECT film_actor.actor_id, CONCAT(actor.first_name," ",actor.last_name) AS actor_name, film.film_id, film.title, film.description, film.release_year
FROM actor
JOIN film_actor ON film_actor.actor_id = actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.actor_id='5';
-- CONSULTA 04 --
SELECT customer.store_id, address.city_id, customer.first_name, customer.last_name, customer.email, address.address
FROM customer
JOIN address ON address.address_id = customer.address_id
JOIN city ON address.city_id = city.city_id
WHERE customer.store_id = '1' AND address.city_id IN ('1', '42', '312', '459');
-- CONSULTA 05 --
SELECT film.title, film.description, film.release_year, film.rating, film.special_features
FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
WHERE rating = "G" AND actor_id = "15" AND special_features LIKE '%Behind the Scenes%';
-- CONSULTA 06 --
SELECT film.film_id, film.title, actor.actor_id, CONCAT(actor.first_name," ", actor.last_name) AS actor_name
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE film_actor.film_id = "369";
-- CONSULTA 07 --
SELECT film.film_id, film.title, film.description, film.release_year, film.rating, film.special_features, category.name AS genre, film.rental_rate
FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE film.rental_rate = "2.99";
-- CONSULTA 08 --
SELECT actor.actor_id, CONCAT(actor.first_name," ",actor.last_name) AS actor_name, film.film_id, film.title, film.description, film.release_year, film.rating, film.special_features, category.name AS genre
FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.actor_id = "23" AND category.name = "Action" ;