-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME 
from ANIMAL_INS
WHERE NAME LIKE '%el%' and ANIMAL_TYPE like 'Dog'
order by NAME;