USE world;
-- CONSULTA 01 --
SELECT country_code, language, percentage
FROM languages
WHERE language LIKE "Slovene"
ORDER BY percentage DESC;
-- CONSULTA 02 --
SELECT country_code, 
       COUNT(*) AS Count 
FROM   cities 
GROUP  BY country_id
ORDER BY Count DESC;
-- CONSULTA 03 --
SELECT *
FROM cities
WHERE country_code ="MEX" AND population >500000
ORDER BY population DESC;
-- CONSULTA 04 --
SELECT *
FROM languages
WHERE percentage >89
ORDER BY percentage DESC;
-- CONSULTA 05 --
SELECT *
FROM countries
WHERE surface_area<501 AND population >100000;
-- CONSULTA 06 --
SELECT *
FROM countries
WHERE capital>200 AND life_expectancy>75 AND government_form="Constitutional Monarchy";
-- CONSULTA 07 --
SELECT country_code, name, district, population
FROM cities
WHERE country_code="ARG" AND district="Buenos Aires" AND population>500000;
-- CONSULTA 08 --
SELECT id, region,
       COUNT(*) AS Count 
FROM   countries 
GROUP  BY region
ORDER BY Count DESC;
