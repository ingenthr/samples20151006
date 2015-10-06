// Read

// Get (sync)
JsonDocument found = bucket.get("notexisting").toBlocking().singleOrDefault(null); // sync

// Get (async)
Observable loadedFromId = bucket.get("id"); // async using RxJava

// Write
// Insert (sync)
// Insert (async)
// Upsert
// Replace (async)
JsonDocument found = bucket.get("notexisting").toBlocking().singleOrDefault(null); //

// Query (Simple)
Statement fluentStatement =
            Select.select("airportname", "city", "country")
                .from(i("travel-sample"))
                .where(x("type").eq(s("airport"))
                                .and(x("city").eq(s("Reno")))
                );

// Query (DSL)