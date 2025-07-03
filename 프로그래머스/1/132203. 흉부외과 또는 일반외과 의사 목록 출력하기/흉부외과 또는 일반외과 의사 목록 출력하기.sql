-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(hire_ymd, '%Y-%m-%d') hire_ymd
from DOCTOR
where MCDP_CD like 'CS' or MCDP_CD like 'GS'
order by HIRE_YMD desc, DR_NAME;