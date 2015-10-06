// Read
  _,err = bucket.Get(key,&retValue)

// Write
   _,err = bucket.Upsert(key,&val, 0)

// Query
  myQuery := gocb.NewN1qlQuery("SELECT airportname, city, country FROM `travel-sample` " +
    "WHERE type='airport' AND city='Reno' ")
  rows,err := bucket.ExecuteN1qlQuery(myQuery,nil)