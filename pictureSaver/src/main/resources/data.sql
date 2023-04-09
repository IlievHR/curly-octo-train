INSERT INTO roles (id, role)
values
    (1, 'ADMIN'),
    (2, 'USER');

INSERT INTO users (id, email, first_name, last_name, is_active, password)
VALUES
    (1, 'admin@example.com', 'Admin', 'Adminov', 1, '$2a$10$XC2cHc.XT8nW7xv791j3zOIZ6lL1mRO9T/UjfwVqnlVFgMB923t/.');


-- password is test12345

INSERT INTO users_roles (user_id, role_id)
VALUES
    (1, 1),
    (1, 2);
