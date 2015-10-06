// Read

// Get
  _,err = bucket.Get(key,&retValue)

// Write

// Insert
   _,err = bucket.Upsert(key,&val, 0)

// Upsert

// Replace


// Query

// Simple
  myQuery := gocb.NewN1qlQuery("SELECT name FROM `travel-sample` AS Airline WHERE id = 5209")
  rows,err := bucket.ExecuteN1qlQuery(myQuery,nil)