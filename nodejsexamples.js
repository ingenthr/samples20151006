// Get Document
bucket.get(key, function (err, resRead) {});

// Insert
var key = "nodeDevguideExampleRetrieve";
bucket.insert(key, {test:"Some Test Value"},function(err, res) {});

// Upsert

// Replace


// Query Document
var N1qlQuery = couchbase.N1qlQuery;
var query = N1qlQuery.fromString("SELECT airportname, city, country FROM `travel-sample` " +
"WHERE type='airport' AND city='Reno' ");
bucket.query(query,function(err,result){});
