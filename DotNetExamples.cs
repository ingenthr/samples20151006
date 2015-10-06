// Read

// Get (synchronous)
var result = bucket.GetDocument("airline_5209");

// Write

// Insert (synchronous)
var passenger = new Document<string>() {
  Firstname = "Walter",
  Lastname = "White"
};
bucket.Insert(passenger);

// Upsert (synchronous)
var passenger = new Document<string>() {
  Firstname = "Walter",
  Lastname = "White"
};
bucket.Upsert(passenger);

// Replace (synchronous)
var passenger = new Document<string>() {
  Firstname = "Walter",
  Lastname = "White"
};
bucket.Replace(doc);

// Query
var query = new QueryRequest("SELECT name FROM `travel-sample` AS Airline WHERE id = 5209");

// Query using LINQ
var airlinesQuerySyntax
                = (from fromAirport in ClusterHelper.GetBucket(CouchbaseConfigHelper.Instance.Bucket).Queryable<Airport>()
                   where fromAirport.Airportname == @from
                   select new { fromAirport = fromAirport.Faa, geo = fromAirport.Geo })
                            .ToList() // need to execute the first part of the select before call to Union
                           .Union<dynamic>(
                                    from toAirport in ClusterHelper.GetBucket(CouchbaseConfigHelper.Instance.Bucket).Queryable<Airport>()
                                    where toAirport.Airportname == to
                                    select new { toAirport = toAirport.Faa, geo = toAirport.Geo });