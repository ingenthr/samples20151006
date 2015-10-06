// Get Document
bucket.get("walter", function (err, resRead) {/* handle results */});

// Insert
var key = "walter";
bucket.insert(key, {firstname: "Walter", lastname: "White"},function(err, res) {/* handle results */});

// Upsert
var key = "walter";
bucket.upsert(key, {firstname: "Walter", lastname: "White"},function(err, res) {/* handle results */});

// Replace
var key = "walter";
bucket.replace(key, {firstname: "Walter", lastname: "White"},function(err, res) {/* handle results */});

// Query Document
var N1qlQuery = couchbase.N1qlQuery;
var query = N1qlQuery.fromString("SELECT name FROM `travel-sample` AS Airline WHERE id = 5209");
bucket.query(query,function(err,result){/* handle results */});
