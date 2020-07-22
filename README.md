# Timezone

Ez az alkalmazás a JTechLog (<http://jtechlog.hu>) blog "Időzónák használata" posztjához készült példaprogram.
Háromrétegű Spring Boot alkalmazás, Spring Data JPA perzisztens réteggel, REST API-val. 
A letöltést követően Mavennel, az `mvn package` paranccsal buildelhető,
és a létrejött jar állomány azonnal futtatható. Fejlesztőeszközben a `TimezoneAppApplication`
osztály futtatásával indítható.

PostgreSQL adatbázis kell neki, mely Dockerrel a következőképp futtatható:

```
docker run --name timezone-postgres -e POSTGRES_PASSWORD=timezone -d -p 5432:5432 postgres
```

viczian.istvan a gmail-en



