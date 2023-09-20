INSERT INTO sm.people(username, email, password, role, created_at, disabled_at)
VALUES ('test_username', 'test@mail.ru', 'test_password', 'USER', now(), null);

INSERT INTO sm.posts(person_id, image_link, text, created_at, updated_at, disabled_at)
VALUES ((SELECT p.id FROM sm.people p WHERE p.username = 'test_username'), 'test', 'test', now(), now(), null),
       ((SELECT p.id FROM sm.people p WHERE p.username = 'test_username'), 'test2', 'test2', now(), now(), null),
       ((SELECT p.id FROM sm.people p WHERE p.username = 'test_username'), 'test3', 'test3', now(), now(), now());