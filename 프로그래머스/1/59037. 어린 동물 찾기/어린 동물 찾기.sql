-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION not like "Aged"
order by ANIMAL_ID;