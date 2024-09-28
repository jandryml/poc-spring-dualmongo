### Insert Data into Core Database

```shell
curl -X POST \
  http://localhost:8080/core/save \
  -H 'Content-Type: application/json' \
  -d '{"data": "Core database example data"}'
```

### Fetch Data from Core Database

```shell
curl http://localhost:8080/core/all
```

### Insert Data into Support Database

```shell
curl -X POST \
  http://localhost:8080/support/save \
  -H 'Content-Type: application/json' \
  -d '{"info": "Support database example data"}'
```

### Fetch Data from Support Database

```shell
curl http://localhost:8080/support/all
```