// Read

// Get (sync)
JsonDocument myAirline = bucket.get("airline_5209");

// Get (async)
Observable<JsonDocument> myAirline = bucket.async().get("airline_5209"); // async using RxJava Observables!

// Write

// Insert (synchronous)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
JsonDocument stored = bucket.upsert(JsonDocument.create("walter", passenger));

// Insert (async)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
Observable<JsonDocument> stored = bucket.async().upsert(JsonDocument.create("walter", passenger));


// Upsert (synchronous)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
JsonDocument stored = bucket.upsert(JsonDocument.create("walter", passenger));

// Upsert (asynchronous)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
Observable<JsonDocument> stored = bucket.upsert(JsonDocument.create("walter", passenger));

// Replace (synchronous)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
JsonDocument replaced = bucket.replace(JsonDocument.create("walter", passenger));

// Replace (async)
JsonObject passenger = JsonObject.empty()
.put("firstname", "Walter")
.put("lastname", "White");
Observable<JsonDocument> walter2 = bucket.async().replace(JsonDocument.create("walter", passenger));

// Query simple string
Observable<AsyncN1qlQueryResult> theAirline = bucket
                                            .query(N1qlQuery
                                                .simple("SELECT name FROM `travel-sample` AS Airline WHERE id = 5209"));


// Query fluent API
Observable<AsyncN1qlQueryResult> theAirline = bucket
                                            .async()
                                            .query(N1qlQuery.simple(
                                                select("name")
                                                    .from("travel-sample")
                                                    .as("Airline")
                                                    .where(x("id")
                                                    .eq(5209))));
