@ECHO OFF
REM Setting initial variables
set PATH="C:\Program Files\WinRAR";C:\mongodb2_4;%PATH%
d:
cd D:\mestrado\avaliacao\dumps


for /F "tokens=1-4 delims=/ " %%A in ('date/t') do (
	set DateDay=%%A
	set DateMonth=%%B
	set DateYear=%%C
)

for /f "tokens=1-2 delims=/:" %%a in ('time /t') do (
	set MyTime=%%a.%%b
)

set CurrentDateTime=%DateYear%%DateMonth%%DateDay%-%MyTime%
set BackupDir="%CurrentDateTime%"

REM Criando pasta de trabalho
md "%CurrentDateTime%"

REM iniciando backup
mongodump -h ds051437.mongolab.com:51437 -d dyevc -u ccesario -p 6H2FyApjogErJP001LzX -o %BackupDir%

REM backup finalizado. Compactando pasta de trabalho
rar a -r %CurrentDateTime%.rar %BackupDir%
@ping 127.0.0.1 -n 2 -w 1000 > nul

REM Compactacao concluida. Eliminando pasta de trabalho
rm -r %BackupDir%