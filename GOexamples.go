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
  myQuery := gocb.NewN1qlQuery("SELECT airportname, city, country FROM `travel-sample` " +
    "WHERE type='airport' AND city='Reno' ")
  rows,err := bucket.ExecuteN1qlQuery(myQuery,nil)