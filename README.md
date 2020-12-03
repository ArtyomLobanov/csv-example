Небольшой проект, показывающий пример парсинга csv файлов с помощью библиотеки [OpenCSV](https://www.baeldung.com/opencsv)

Обратите внимание на файл build.gradle.
В нём в пункте dependencies необходимо прописывать все внешние зависимости проекта.
```gradle
dependencies {

    // Add OpenCSV lib as dependency
    // https://mvnrepository.com/artifact/com.opencsv/opencsv
    compile group: 'com.opencsv', name: 'opencsv', version: '3.7'

    testCompile group: 'junit', name: 'junit', version: '4.12'
}
```


Также я отдельно создал задачу jar, чтобы можно было удобно запускать проект из консоли. 
Делается это так:
```bash
git clone https://github.com/ArtyomLobanov/csv-example.git
cd csv-example
gradlew build
java -jar build/libs/csv-example-1.0-SNAPSHOT.jar
```