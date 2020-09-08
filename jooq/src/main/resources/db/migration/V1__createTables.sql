create sequence AUTHOR_SEQ START 101;
create table AUTHOR (
    ID bigint not null,
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255) not null,

    constraint PK_AUTHOR_ID primary key (id)
);
comment on table AUTHOR is 'Таблица авторов';
comment on column AUTHOR.ID is 'Идентификатор автора';
comment on column AUTHOR.FIRST_NAME is 'Имя';
comment on column AUTHOR.LAST_NAME is 'Фамилия';

create sequence BOOK_SEQ START 101;
create table BOOK (
    ID bigint not null,
    TITLE varchar(255) not null,

    constraint PK_BOOK_ID primary key(id)
);
comment on table BOOK is 'Таблица книг';
comment on column BOOK.ID is 'Идентификатор книги';
comment on column BOOK.TITLE is 'Наименование книги';

create sequence AUTHOR_BOOK_CRS_SEQ START 101;
create table AUTHOR_BOOK_CRS (
    ID bigint not null,
    AUTHOR_ID bigint not null,
    BOOK_ID bigint not null,

    constraint PK_AUTHOR_BOOK_CRS_ID primary key (id),
    constraint FK_AUTHOR_BOOK_CRS_AUTHOR foreign key (AUTHOR_ID) references AUTHOR (ID),
    constraint FK_AUTHOR_BOOK_CRS_BOOK foreign key (BOOK_ID) references BOOK (ID)
);
comment on table AUTHOR_BOOK_CRS is 'Кросс таблица: авторы-книги';
comment on column AUTHOR_BOOK_CRS.AUTHOR_ID is 'Идентификатор автора';
comment on column AUTHOR_BOOK_CRS.BOOK_ID is 'Идентификатор книги';