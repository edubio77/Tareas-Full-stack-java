USE lead_gen_business;
SELECT *
FROM billing;
-- CONSULTA O1 --
SELECT MONTHNAME(charged_datetime) AS "mes", SUM(billing.amount) AS total_ingreso
FROM billing 
WHERE charged_datetime >= "2012/03/01" AND charged_datetime < "2012/03/31";
-- CONSULTA O2 --
SELECT billing.client_id, SUM(billing.amount) AS total_ingreso
FROM billing 
WHERE client_id = '2';
-- CONSULTA O3 --
SELECT domain_name, client_id
FROM sites
WHERE client_id=10;
-- CONSULTA O4 --
SELECT client_id, COUNT(domain_name) AS numero_sitios, MONTHNAME(created_datetime) AS mes, YEAR(created_datetime) AS anio
FROM sites
WHERE client_id = 1 OR client_id = 20
GROUP BY MONTH(sites.created_datetime)
ORDER BY sites.created_datetime DESC;

-- CONSULTA O5 --
SELECT domain_name as dominio, count(leads.leads_id) AS numero_clientes, date_format(registered_datetime,"%M %d %Y") AS fecha_creacion
FROM sites
JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >= "2011/01/01" AND registered_datetime < "2011/02/16"
GROUP BY sites.domain_name;
-- CONSULTA O6 --
SELECT CONCAT(clients.first_name," ", clients.last_name) AS nombre_cliente , count(leads.leads_id) AS numero_clientes
FROM clients
JOIN sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >= "2011/01/01" AND registered_datetime < "2011/12/31"
GROUP BY clients.client_id;
-- CONSULTA O7 --
SELECT CONCAT(clients.first_name," ", clients.last_name) AS nombre_cliente, count(leads_id) AS poten_cliente 
FROM clients
JOIN sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >= "2011/01/01" AND registered_datetime < "2011/06/30"
GROUP BY registered_datetime;
-- CONSULTA O8 --

-- CONSULTA O9 --
SELECT CONCAT(clients.first_name," ", clients.last_name) AS nombre_cliente, sum(billing.amount) AS ingresos, date_format(charged_datetime,"%M") AS mes, date_format(charged_datetime,"%Y") AS anio
FROM billing
JOIN clients ON billing.client_id = clients.client_id
GROUP BY billing.charged_datetime
ORDER BY clients.client_id;
-- CONSULTA 10 --
SELECT CONCAT(clients.first_name," ", clients.last_name) AS nombre, GROUP_CONCAT(" ", domain_name) AS dominios
FROM sites
JOIN clients ON clients.client_id = sites.client_id
GROUP BY clients.client_id