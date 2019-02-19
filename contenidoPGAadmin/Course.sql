CREATE SEQUENCE public.course_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.course_seq
    OWNER TO postgres;


-- Table: public.course

-- DROP TABLE public.course;

CREATE TABLE public.course
(
    id integer NOT NULL DEFAULT nextval('course_seq'::regclass),
    name character varying(48) COLLATE pg_catalog."default" NOT NULL,
    description character varying(512) COLLATE pg_catalog."default" NOT NULL,
    duration integer NOT NULL,
    limit_person integer NOT NULL,
    CONSTRAINT "COURSE_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.course
    OWNER to postgres;