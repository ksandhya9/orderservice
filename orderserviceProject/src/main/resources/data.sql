DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS shipping;
DROP TABLE IF EXISTS billings;
DROP TABLE IF EXISTS payments;
DROP TABLE IF EXISTS orders;

CREATE TABLE IF NOT EXISTS orders (
	order_id serial PRIMARY KEY,
	order_customer_id INT,
	order_status VARCHAR ( 50 ) NOT NULL,
	order_subtotal numeric,
	order_tax numeric,
	order_shipping_charges numeric,
	order_total numeric,
	create_date TIMESTAMP,
	modified_date TIMESTAMP
);

CREATE TABLE IF NOT EXISTS items (
	item_id serial PRIMARY KEY,
	order_id INT,
	item_name VARCHAR ( 50 ) NOT NULL,
	item_qty INT NOT NULL,
	item_subtotal numeric,
	returnBy TIMESTAMP,
     CONSTRAINT fk_order
      FOREIGN KEY(order_id)
	  REFERENCES orders(order_id)
);

CREATE TABLE IF NOT EXISTS shipping (
	order_id INT,
	shipping_id serial PRIMARY KEY,
	shipping_addressline1 VARCHAR ( 255 ) NOT NULL,
	shipping_addressline2 VARCHAR ( 255 ),
	order_shipping_city VARCHAR ( 255 ) NOT NULL,
	order_shipping_state VARCHAR( 50) NOT NULL,
	order_shipping_zip VARCHAR( 50) NOT NULL,
	shipping_type VARCHAR( 50) NOT NULL,
	vendor_name VARCHAR( 50) NOT NULL,
	 CONSTRAINT fk_order
      FOREIGN KEY(order_id)
	  REFERENCES orders(order_id)
);

CREATE TABLE IF NOT EXISTS payments(
	order_id INT,
	payment_id serial PRIMARY KEY,
	payment_method VARCHAR ( 255 ) NOT NULL,
	payment_details VARCHAR ( 255 ) NOT NULL,
	payment_date VARCHAR ( 255 ),
	payment_confirmation_number VARCHAR ( 255 ) NOT NULL,
	 CONSTRAINT fk_order
      FOREIGN KEY(order_id)
	  REFERENCES orders(order_id)
);

CREATE TABLE IF NOT EXISTS billings(
	payment_id INT,
	billing_id serial PRIMARY KEY,
	billing_addressline1 VARCHAR ( 255 ) NOT NULL,
	billing_addressline2 VARCHAR ( 255 ) NOT NULL,
    billing_shipping_city VARCHAR ( 255 ) NOT NULL,
	billing_shipping_zip VARCHAR( 50) NOT NULL,
	 CONSTRAINT fk_payment
      FOREIGN KEY(payment_id)
	  REFERENCES payments(payment_id)
);

