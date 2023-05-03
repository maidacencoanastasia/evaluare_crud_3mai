Fie dată următoarea informație despre produs (product):

id

denumire (name)

descriere (description)

preț (price)



Creați tabelul ce păstreaza informația despre produse. Inserați min 3 înregistrări.

Creați o aplicație folosind Spring Boot pentru gestionarea datelor. Configurați proiectul pentru a interacționa cu baza de date.

Creați entitatea Product cu specificarea tipurilor de date corespunzătoare.

Folosind modelul MVC creați un REST API care are endpoint:

pentru afișarea datelor
Verificați endpointul creat folosind Postman.

Creați repository pentru proiect.




For DATABASE
CREATE TABLE products (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL
);


INSERT INTO products (name, description, price)
VALUES
    ('Laptop Dell XPS 13', 'Laptop cu ecran de 13 inci și procesor Intel Core i7', 5499.99),
    ('Telefon mobil Samsung Galaxy S21', 'Telefon mobil cu cameră de 64 MP și procesor Exynos 2100', 3899.00),
    ('Televizor Smart LG OLED CX', 'Televizor OLED de 55 inci cu rezoluție 4K și suport pentru HDR', 6999.99);




POSTMAN


