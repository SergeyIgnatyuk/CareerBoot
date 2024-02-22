CREATE TABLE users
(
    id         BIGSERIAL PRIMARY KEY,
    email      VARCHAR(255)  NOT NULL,
    password   VARCHAR(2048) NOT NULL,
    role       VARCHAR(32) DEFAULT 'USER',
    enabled    BOOLEAN     DEFAULT TRUE,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    user_passport_first_name VARCHAR(64),
    user_passport_last_name  VARCHAR(64),
    user_passport_serial VARCHAR(16) UNIQUE,
    user_passport_private VARCHAR(32) UNIQUE,
    user_passport_service VARCHAR(255),
    user_passport_date TIMESTAMP,
    user_address_country VARCHAR(16),
    user_address_city VARCHAR(32),
    user_address_street VARCHAR (64),
    user_address_home VARCHAR(8),
    user_address_apartment VARCHAR (8),
    phone VARCHAR(16)
);