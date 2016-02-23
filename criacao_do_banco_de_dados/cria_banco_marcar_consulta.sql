create database agendamedica;

create table tb_especialidade (
id_especialidade serial primary key,
nome text
);


create table tb_medico (
id_medico serial primary key,
crm integer,
id_especialidade integer references tb_especialidade(id_especialidade),
nome text
);

create table tb_usuario (
id_usuario serial primary key,
login text,
senha text,
perfil text,
email text
);

create table tb_local_atendimento (
id_local_atendimento serial primary key,
nome text,
endereco text
);

create table tb_agenda_medico (
id_agenda_medico serial primary key,
id_medico integer references tb_medico(id_medico),
data_agenda date,
id_local_atendimento integer references tb_local_atendimento(id_local_atendimento),
situacao text
);

create table tb_consulta_marcada (
id_consulta_marcada serial primary key,
id_agenda_medico integer references tb_agenda_medico(id_agenda_medico),
id_usuario integer references tb_usuario(id_usuario),
data_marcacao_consulta date,
situacao text,
data_cancelamento date
);

insert into tb_usuario values(1,'admin','admin', 'A', 'marcelo_.aguiar@hotmail.com.br');
insert into tb_usuario values(2,'user','user', 'U', 'masasp29@gmail.com');

insert into tb_especialidade values(1, 'Cirurgiao');
insert into tb_especialidade values(2, 'Pediatra');
insert into tb_especialidade values(3, 'Clinica Geral');
-- insert into tb_especialidade values(1, 'Nutricao');

insert into tb_medico values(1, 12345, 1, 'Jose Carlos');
insert into tb_medico values(2, 54321, 2, 'Maria Agripina');
insert into tb_medico values(3, 12345, 3, 'Gustavo Mendes');
insert into tb_medico values(4, 12345, 1, 'Antonio Francisco');

insert into tb_local_atendimento values(1, 'Hospital Sao Carlos', 'Avenida Pontes Vieira 2531 Fortaleza');
insert into tb_local_atendimento values(2, 'Hospital de Messejana', 'Avenida Frei Cirilo 3480 Fortaleza');
insert into tb_local_atendimento values(3, 'Hospital Sao Mateus', 'Avenida Santos Dumont 5633 Fortaleza');
insert into tb_local_atendimento(nome, endereco) values('Teste', 'ie ie');

insert into tb_agenda_medico values(1, 1, '2015-10-15', 1, 'D');
insert into tb_agenda_medico values(2, 2, '2015-10-05', 1, 'D');
insert into tb_agenda_medico values(3, 3, '2015-10-05', 1, 'D');
insert into tb_agenda_medico values(4, 1, '2015-10-10', 2, 'D');
insert into tb_agenda_medico values(5, 2, '2015-10-05', 2, 'D');
insert into tb_agenda_medico values(6, 3, '2015-10-05', 2, 'D');
insert into tb_agenda_medico values(7, 1, '2015-10-07', 3, 'D');
insert into tb_agenda_medico values(8, 2, '2015-10-06', 3, 'D');
insert into tb_agenda_medico values(9, 3, '2015-10-05', 3, 'D');

select * from tb_local_atendimento;
select * from tb_usuario;
select * from tb_especialidade;
select * from tb_medico;
select * from tb_agenda_medico;