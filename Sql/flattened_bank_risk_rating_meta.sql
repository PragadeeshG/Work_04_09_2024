create table if not exists flattened_bank_risk_rating_meta(
country_code varchar(255) not null,
risk_rating_meta varchar(255) null,
origin varchar(255) null,
template varchar(255) null,
model_partition_type char null,
risk_rating_system Integer null,
flat_risk_rating_type char null,
flat_risk_rating_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint flattened_bank_risk_rating_meta_pk primary key(country_code));