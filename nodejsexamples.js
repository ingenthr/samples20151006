// Setup a Document and store in the bucket.
var key = "nodeDevguideExampleRetrieve";
bucket.insert(key, {test:"Some Test Value"},function(err, res) {});

// Get Document
bucket.get(key, function (err, resRead) {});

// Query Document
var N1qlQuery = couchbase.N1qlQuery;
var query = N1qlQuery.fromString("SELECT airportname, city, country FROM `travel-sample` " +
"WHERE type='airport' AND city='Reno' ");
bucket.query(query,function(err,result){});
