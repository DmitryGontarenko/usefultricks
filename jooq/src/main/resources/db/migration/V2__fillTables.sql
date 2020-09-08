insert into AUTHOR (ID, FIRST_NAME, LAST_NAME) values (1, 'Margaret', 'Mitchell');
insert into AUTHOR (ID, FIRST_NAME, LAST_NAME) values (2, 'Franklin', 'Herbert');
insert into AUTHOR (ID, FIRST_NAME, LAST_NAME) values (3, 'James', 'Clavell');

insert into BOOK (ID, TITLE) values (1, 'Gone with the Wind');
insert into BOOK (ID, TITLE) values (2, 'Dune');
insert into BOOK (ID, TITLE) values (3, 'Shōgun');

insert into AUTHOR_BOOK_CRS (ID, AUTHOR_ID, BOOK_ID) values (nextval('AUTHOR_BOOK_CRS_SEQ'), 1, 1);
insert into AUTHOR_BOOK_CRS (ID, AUTHOR_ID, BOOK_ID) values (nextval('AUTHOR_BOOK_CRS_SEQ'), 2, 2);
insert into AUTHOR_BOOK_CRS (ID, AUTHOR_ID, BOOK_ID) values (nextval('AUTHOR_BOOK_CRS_SEQ'), 3, 3);