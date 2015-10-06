// Read
Observable loadedFromId = bucket.get("id"); // async using RxJava
JsonDocument found = bucket.get("notexisting").toBlocking().singleOrDefault(null); // sync

// Write
JsonDocument found = bucket.get("notexisting").toBlocking().singleOrDefault(null); //

// Query
Statement fluentStatement =
            Select.select("airportname", "city", "country")
                .from(i("travel-sample"))
                .where(x("type").eq(s("airport"))
                                .and(x("city").eq(s("Reno")))
                );
