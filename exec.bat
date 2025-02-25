@echo off
echo Source files are compiling...
javac -d .\out\ .\src\*.java

if %errorlevel% neq 0 (
    echo CompileError!
    pause
    exit /b
)

echo Program Starting...
java -cp out Main
pause