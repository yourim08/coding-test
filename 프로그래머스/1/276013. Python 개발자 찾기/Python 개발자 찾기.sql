-- 코드를 작성해주세요
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPER_INFOS
where SKILL_1 like 'Python' or SKILL_2 like 'Python' or SKILL_3 like 'Python'
order by ID