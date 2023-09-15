INSERT INTO sm.users(username, email, password, created_at, disabled_at)
VALUES ('test_username', 'test@mail.ru', 'test_password', now(), null);

INSERT INTO sm.posts(user_id, image_link, text, created_at, updated_at, disabled_at)
VALUES ((SELECT u.id FROM sm.users u WHERE u.username = 'test_username'), 'test', 'test', now(), now(), null),
       ((SELECT u.id FROM sm.users u WHERE u.username = 'test_username'), 'test2', 'test', now(), now(), null);